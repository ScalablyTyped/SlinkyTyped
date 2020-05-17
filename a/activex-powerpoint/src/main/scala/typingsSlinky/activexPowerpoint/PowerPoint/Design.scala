package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Design extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val HasTitleMaster: MsoTriState = js.native
  val Index: Double = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Design_typekey")
  var PowerPointDotDesign_typekey: Design = js.native
  var Preserved: MsoTriState = js.native
  val SlideMaster: Master = js.native
  val TitleMaster: Master = js.native
  def AddTitleMaster(): Master = js.native
  def Delete(): Unit = js.native
  def MoveTo(toPos: Double): Unit = js.native
}

object Design {
  @scala.inline
  def apply(
    AddTitleMaster: () => Master,
    Application: Application,
    Delete: () => Unit,
    HasTitleMaster: MsoTriState,
    Index: Double,
    MoveTo: Double => Unit,
    Name: String,
    Parent: js.Any,
    PowerPointDotDesign_typekey: Design,
    Preserved: MsoTriState,
    SlideMaster: Master,
    TitleMaster: Master
  ): Design = {
    val __obj = js.Dynamic.literal(AddTitleMaster = js.Any.fromFunction0(AddTitleMaster), Application = Application.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HasTitleMaster = HasTitleMaster.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MoveTo = js.Any.fromFunction1(MoveTo), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Preserved = Preserved.asInstanceOf[js.Any], SlideMaster = SlideMaster.asInstanceOf[js.Any], TitleMaster = TitleMaster.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Design_typekey")(PowerPointDotDesign_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Design]
  }
  @scala.inline
  implicit class DesignOps[Self <: Design] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTitleMaster(value: () => Master): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddTitleMaster")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasTitleMaster(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasTitleMaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveTo(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotDesign_typekey(value: Design): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Design_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserved(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideMaster(value: Master): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideMaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleMaster(value: Master): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TitleMaster")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

