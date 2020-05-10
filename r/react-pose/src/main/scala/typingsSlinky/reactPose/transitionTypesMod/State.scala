package typingsSlinky.reactPose.transitionTypesMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var displayedChildren: js.Array[ReactElement] = js.native
  var finishedLeaving: StringDictionary[Boolean] = js.native
  var hasInitialized: Boolean = js.native
  var indexedChildren: StringDictionary[ReactElement] = js.native
  def scheduleChildRemoval(key: String): Unit = js.native
}

object State {
  @scala.inline
  def apply(
    displayedChildren: js.Array[ReactElement],
    finishedLeaving: StringDictionary[Boolean],
    hasInitialized: Boolean,
    indexedChildren: StringDictionary[ReactElement],
    scheduleChildRemoval: String => Unit
  ): State = {
    val __obj = js.Dynamic.literal(displayedChildren = displayedChildren.asInstanceOf[js.Any], finishedLeaving = finishedLeaving.asInstanceOf[js.Any], hasInitialized = hasInitialized.asInstanceOf[js.Any], indexedChildren = indexedChildren.asInstanceOf[js.Any], scheduleChildRemoval = js.Any.fromFunction1(scheduleChildRemoval))
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayedChildren(value: js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishedLeaving(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedLeaving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasInitialized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInitialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexedChildren(value: StringDictionary[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduleChildRemoval(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleChildRemoval")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

