package typingsSlinky.reactReconciler.mod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The following attributes are only used by interaction tracing builds.
// They enable interactions to be associated with their async work,
// And expose interaction metadata to the React DevTools Profiler plugin.
// Note that these attributes are only defined when the enableSchedulerTracing flag is enabled.
@js.native
trait ProfilingOnlyFiberRootProperties extends js.Object {
  var interactionThreadID: Double = js.native
  var memoizedInteractions: Set[Interaction] = js.native
  var pendingInteractionMap: PendingInteractionMap = js.native
}

object ProfilingOnlyFiberRootProperties {
  @scala.inline
  def apply(
    interactionThreadID: Double,
    memoizedInteractions: Set[Interaction],
    pendingInteractionMap: PendingInteractionMap
  ): ProfilingOnlyFiberRootProperties = {
    val __obj = js.Dynamic.literal(interactionThreadID = interactionThreadID.asInstanceOf[js.Any], memoizedInteractions = memoizedInteractions.asInstanceOf[js.Any], pendingInteractionMap = pendingInteractionMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingOnlyFiberRootProperties]
  }
  @scala.inline
  implicit class ProfilingOnlyFiberRootPropertiesOps[Self <: ProfilingOnlyFiberRootProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteractionThreadID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionThreadID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemoizedInteractions(value: Set[Interaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizedInteractions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingInteractionMap(value: PendingInteractionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingInteractionMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

