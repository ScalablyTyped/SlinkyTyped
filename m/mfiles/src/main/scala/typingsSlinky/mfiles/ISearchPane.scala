package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchPane extends js.Object {
  val Available: Boolean = js.native
  val Events: ISearchPaneEvents = js.native
  var Visible: Boolean = js.native
  def SetTheme(theme: ITheme): Unit = js.native
}

object ISearchPane {
  @scala.inline
  def apply(Available: Boolean, Events: ISearchPaneEvents, SetTheme: ITheme => Unit, Visible: Boolean): ISearchPane = {
    val __obj = js.Dynamic.literal(Available = Available.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], SetTheme = js.Any.fromFunction1(SetTheme), Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPane]
  }
  @scala.inline
  implicit class ISearchPaneOps[Self <: ISearchPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: ISearchPaneEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetTheme(value: ITheme => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetTheme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

