package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLEControl extends js.Object {
  var AltHTML: String = js.native
  val Automation: js.Any = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  var Name: String = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  @JSName("Word.OLEControl_typekey")
  var WordDotOLEControl_typekey: OLEControl = js.native
  def Activate(): Unit = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object OLEControl {
  @scala.inline
  def apply(
    Activate: () => Unit,
    AltHTML: String,
    Automation: js.Any,
    Copy: () => Unit,
    Cut: () => Unit,
    Delete: () => Unit,
    Height: Double,
    Left: Double,
    Name: String,
    Select: () => Unit,
    Top: Double,
    Width: Double,
    WordDotOLEControl_typekey: OLEControl
  ): OLEControl = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), AltHTML = AltHTML.asInstanceOf[js.Any], Automation = Automation.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OLEControl_typekey")(WordDotOLEControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEControl]
  }
  @scala.inline
  implicit class OLEControlOps[Self <: OLEControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAltHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AltHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Automation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotOLEControl_typekey(value: OLEControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.OLEControl_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

