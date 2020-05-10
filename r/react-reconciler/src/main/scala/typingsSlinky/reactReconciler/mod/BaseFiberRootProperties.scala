package typingsSlinky.reactReconciler.mod

import typingsSlinky.std.Map
import typingsSlinky.std.Set
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseFiberRootProperties extends js.Object {
  // Any additional information from the host associated with this root.
  var containerInfo: js.Any = js.native
  // Top context object, used by renderSubtreeIntoContainer
  var context: js.Object | Null = js.native
  // The currently active root fiber. This is the mutable root of the tree.
  var current: Fiber = js.native
  // If an error is thrown, and there are no more updates in the queue, we try
  // rendering from the root one more time, synchronously, before handling
  // the error.
  var didError: Boolean = js.native
  // The earliest and latest priority levels that are not known to be suspended.
  var earliestPendingTime: ExpirationTime = js.native
  // The following priority levels are used to distinguish between 1)
  // uncommitted work, 2) uncommitted work that is suspended, and 3) uncommitted
  // work that may be unsuspended. We choose not to track each individual
  // pending level, trading granularity for performance.
  //
  // The earliest and latest priority levels that are suspended from committing.
  var earliestSuspendedTime: ExpirationTime = js.native
  var expirationTime: ExpirationTime = js.native
  // A finished work-in-progress HostRoot that's ready to be committed.
  var finishedWork: Fiber | Null = js.native
  // List of top-level batches. This list indicates whether a commit should be
  // deferred. Also contains completion callbacks.
  // TODO: Lift this into the renderer
  var firstBatch: Batch | Null = js.native
  // Determines if we should attempt to hydrate on the initial mount
  val hydrate: Boolean = js.native
  var latestPendingTime: ExpirationTime = js.native
  // The latest priority level that was pinged by a resolved promise and can
  // be retried.
  var latestPingedTime: ExpirationTime = js.native
  var latestSuspendedTime: ExpirationTime = js.native
  // Remaining expiration time on this root.
  // TODO: Lift this into the renderer
  var nextExpirationTimeToWorkOn: ExpirationTime = js.native
  // Linked-list of roots
  var nextScheduledRoot: FiberRoot | Null = js.native
  // Used only by persistent updates.
  var pendingChildren: js.Any = js.native
  var pendingCommitExpirationTime: ExpirationTime = js.native
  var pendingContext: js.Object | Null = js.native
  var pingCache: (WeakMap[Thenable, Set[ExpirationTime]]) | (Map[Thenable, Set[ExpirationTime]]) | Null = js.native
  // Timeout handle returned by setTimeout. Used to cancel a pending timeout, if
  // it's superseded by a new one.
  var timeoutHandle: js.Any = js.native
}

object BaseFiberRootProperties {
  @scala.inline
  def apply(
    containerInfo: js.Any,
    current: Fiber,
    didError: Boolean,
    earliestPendingTime: ExpirationTime,
    earliestSuspendedTime: ExpirationTime,
    expirationTime: ExpirationTime,
    hydrate: Boolean,
    latestPendingTime: ExpirationTime,
    latestPingedTime: ExpirationTime,
    latestSuspendedTime: ExpirationTime,
    nextExpirationTimeToWorkOn: ExpirationTime,
    pendingChildren: js.Any,
    pendingCommitExpirationTime: ExpirationTime,
    timeoutHandle: js.Any
  ): BaseFiberRootProperties = {
    val __obj = js.Dynamic.literal(containerInfo = containerInfo.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], didError = didError.asInstanceOf[js.Any], earliestPendingTime = earliestPendingTime.asInstanceOf[js.Any], earliestSuspendedTime = earliestSuspendedTime.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], hydrate = hydrate.asInstanceOf[js.Any], latestPendingTime = latestPendingTime.asInstanceOf[js.Any], latestPingedTime = latestPingedTime.asInstanceOf[js.Any], latestSuspendedTime = latestSuspendedTime.asInstanceOf[js.Any], nextExpirationTimeToWorkOn = nextExpirationTimeToWorkOn.asInstanceOf[js.Any], pendingChildren = pendingChildren.asInstanceOf[js.Any], pendingCommitExpirationTime = pendingCommitExpirationTime.asInstanceOf[js.Any], timeoutHandle = timeoutHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFiberRootProperties]
  }
  @scala.inline
  implicit class BaseFiberRootPropertiesOps[Self <: BaseFiberRootProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDidError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEarliestPendingTime(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earliestPendingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEarliestSuspendedTime(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earliestSuspendedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationTime(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHydrate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestPendingTime(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestPendingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestPingedTime(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestPingedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestSuspendedTime(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestSuspendedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextExpirationTimeToWorkOn(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextExpirationTimeToWorkOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingCommitExpirationTime(value: ExpirationTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingCommitExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutHandle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(null)
        ret
    }
    @scala.inline
    def withFinishedWork(value: Fiber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedWork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishedWorkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedWork")(null)
        ret
    }
    @scala.inline
    def withFirstBatch(value: Batch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstBatchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstBatch")(null)
        ret
    }
    @scala.inline
    def withNextScheduledRoot(value: FiberRoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScheduledRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextScheduledRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScheduledRoot")(null)
        ret
    }
    @scala.inline
    def withPendingContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingContext")(null)
        ret
    }
    @scala.inline
    def withPingCache(value: (WeakMap[Thenable, Set[ExpirationTime]]) | (Map[Thenable, Set[ExpirationTime]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPingCacheNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingCache")(null)
        ret
    }
  }
  
}

