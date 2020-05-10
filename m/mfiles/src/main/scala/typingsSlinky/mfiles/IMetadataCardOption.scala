package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardOption extends js.Object {
  val Events: IEvents = js.native
  def GetExplanation(): String = js.native
  def GetName(): String = js.native
  def GetOptionValue(): js.Any = js.native
  def IsEnabled(): Boolean = js.native
  def IsVisible(): Boolean = js.native
  def SetOptionValue(value: js.Any): Unit = js.native
}

object IMetadataCardOption {
  @scala.inline
  def apply(
    Events: IEvents,
    GetExplanation: () => String,
    GetName: () => String,
    GetOptionValue: () => js.Any,
    IsEnabled: () => Boolean,
    IsVisible: () => Boolean,
    SetOptionValue: js.Any => Unit
  ): IMetadataCardOption = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], GetExplanation = js.Any.fromFunction0(GetExplanation), GetName = js.Any.fromFunction0(GetName), GetOptionValue = js.Any.fromFunction0(GetOptionValue), IsEnabled = js.Any.fromFunction0(IsEnabled), IsVisible = js.Any.fromFunction0(IsVisible), SetOptionValue = js.Any.fromFunction1(SetOptionValue))
    __obj.asInstanceOf[IMetadataCardOption]
  }
  @scala.inline
  implicit class IMetadataCardOptionOps[Self <: IMetadataCardOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: IEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetExplanation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetExplanation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOptionValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetOptionValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetOptionValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetOptionValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

