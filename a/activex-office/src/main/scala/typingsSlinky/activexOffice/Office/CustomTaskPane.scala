package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTaskPane extends js.Object {
  val Application: js.Any = js.native
  val ContentControl: js.Any = js.native
  var DockPosition: MsoCTPDockPosition = js.native
  var DockPositionRestrict: MsoCTPDockPositionRestrict = js.native
  var Height: Double = js.native
  @JSName("Office.CustomTaskPane_typekey")
  var OfficeDotCustomTaskPane_typekey: CustomTaskPane = js.native
  val Title: String = js.native
  var Visible: Boolean = js.native
  var Width: Double = js.native
  val Window: js.Any = js.native
  def Delete(): Unit = js.native
}

object CustomTaskPane {
  @scala.inline
  def apply(
    Application: js.Any,
    ContentControl: js.Any,
    Delete: () => Unit,
    DockPosition: MsoCTPDockPosition,
    DockPositionRestrict: MsoCTPDockPositionRestrict,
    Height: Double,
    OfficeDotCustomTaskPane_typekey: CustomTaskPane,
    Title: String,
    Visible: Boolean,
    Width: Double,
    Window: js.Any
  ): CustomTaskPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DockPosition = DockPosition.asInstanceOf[js.Any], DockPositionRestrict = DockPositionRestrict.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CustomTaskPane_typekey")(OfficeDotCustomTaskPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTaskPane]
  }
  @scala.inline
  implicit class CustomTaskPaneOps[Self <: CustomTaskPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDockPosition(value: MsoCTPDockPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DockPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDockPositionRestrict(value: MsoCTPDockPositionRestrict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DockPositionRestrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotCustomTaskPane_typekey(value: CustomTaskPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.CustomTaskPane_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

