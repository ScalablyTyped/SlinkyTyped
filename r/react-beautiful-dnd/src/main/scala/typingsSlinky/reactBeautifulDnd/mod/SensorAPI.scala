package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SensorAPI extends js.Object {
  var tryGetLock: TryGetLock = js.native
  def canGetLock(id: DraggableId): Boolean = js.native
  def findClosestDraggableId(event: Event_): DraggableId | Null = js.native
  def findOptionsForDraggable(id: DraggableId): DraggableOptions | Null = js.native
  def isLockClaimed(): Boolean = js.native
  def tryReleaseLock(): Unit = js.native
}

object SensorAPI {
  @scala.inline
  def apply(
    canGetLock: DraggableId => Boolean,
    findClosestDraggableId: Event_ => DraggableId | Null,
    findOptionsForDraggable: DraggableId => DraggableOptions | Null,
    isLockClaimed: () => Boolean,
    tryGetLock: (/* draggableId */ DraggableId, /* forceStop */ js.UndefOr[js.Function0[Unit]], /* options */ js.UndefOr[TryGetLockOptions]) => PreDragActions | Null,
    tryReleaseLock: () => Unit
  ): SensorAPI = {
    val __obj = js.Dynamic.literal(canGetLock = js.Any.fromFunction1(canGetLock), findClosestDraggableId = js.Any.fromFunction1(findClosestDraggableId), findOptionsForDraggable = js.Any.fromFunction1(findOptionsForDraggable), isLockClaimed = js.Any.fromFunction0(isLockClaimed), tryGetLock = js.Any.fromFunction3(tryGetLock), tryReleaseLock = js.Any.fromFunction0(tryReleaseLock))
    __obj.asInstanceOf[SensorAPI]
  }
  @scala.inline
  implicit class SensorAPIOps[Self <: SensorAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanGetLock(value: DraggableId => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canGetLock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindClosestDraggableId(value: Event_ => DraggableId | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findClosestDraggableId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindOptionsForDraggable(value: DraggableId => DraggableOptions | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findOptionsForDraggable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsLockClaimed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLockClaimed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTryGetLock(
      value: (/* draggableId */ DraggableId, /* forceStop */ js.UndefOr[js.Function0[Unit]], /* options */ js.UndefOr[TryGetLockOptions]) => PreDragActions | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetLock")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTryReleaseLock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryReleaseLock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

