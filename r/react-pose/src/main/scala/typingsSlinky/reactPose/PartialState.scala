package typingsSlinky.reactPose

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-pose.react-pose/lib/components/Transition/types.State> */
@js.native
trait PartialState extends js.Object {
  var displayedChildren: js.UndefOr[js.Array[ReactElement]] = js.native
  var finishedLeaving: js.UndefOr[StringDictionary[Boolean]] = js.native
  var hasInitialized: js.UndefOr[Boolean] = js.native
  var indexedChildren: js.UndefOr[StringDictionary[ReactElement]] = js.native
  var scheduleChildRemoval: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
}

object PartialState {
  @scala.inline
  def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  @scala.inline
  implicit class PartialStateOps[Self <: PartialState] (val x: Self) extends AnyVal {
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
    def withoutDisplayedChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishedLeaving(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedLeaving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishedLeaving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedLeaving")(js.undefined)
        ret
    }
    @scala.inline
    def withHasInitialized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInitialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexedChildren(value: StringDictionary[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexedChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleChildRemoval(value: /* key */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleChildRemoval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScheduleChildRemoval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleChildRemoval")(js.undefined)
        ret
    }
  }
  
}

