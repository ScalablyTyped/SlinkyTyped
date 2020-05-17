package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pane extends js.Object {
  val Active: MsoTriState = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Pane_typekey")
  var PowerPointDotPane_typekey: Pane = js.native
  val ViewType: PpViewType = js.native
  def Activate(): Unit = js.native
}

object Pane {
  @scala.inline
  def apply(
    Activate: () => Unit,
    Active: MsoTriState,
    Application: Application,
    Parent: js.Any,
    PowerPointDotPane_typekey: Pane,
    ViewType: PpViewType
  ): Pane = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Pane_typekey")(PowerPointDotPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
  @scala.inline
  implicit class PaneOps[Self <: Pane] (val x: Self) extends AnyVal {
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
    def withActive(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotPane_typekey(value: Pane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Pane_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewType(value: PpViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

