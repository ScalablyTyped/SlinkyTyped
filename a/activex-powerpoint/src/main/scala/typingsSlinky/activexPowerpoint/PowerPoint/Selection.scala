package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.TextRange2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val ChildShapeRange: typingsSlinky.activexPowerpoint.PowerPoint.ShapeRange = js.native
  val HasChildShapeRange: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Selection_typekey")
  var PowerPointDotSelection_typekey: Selection = js.native
  val ShapeRange: typingsSlinky.activexPowerpoint.PowerPoint.ShapeRange = js.native
  val SlideRange: typingsSlinky.activexPowerpoint.PowerPoint.SlideRange = js.native
  val TextRange: typingsSlinky.activexPowerpoint.PowerPoint.TextRange = js.native
  val TextRange2: typingsSlinky.activexOffice.Office.TextRange2 = js.native
  val Type: PpSelectionType = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Unselect(): Unit = js.native
}

object Selection {
  @scala.inline
  def apply(
    Application: Application,
    ChildShapeRange: ShapeRange,
    Copy: () => Unit,
    Cut: () => Unit,
    Delete: () => Unit,
    HasChildShapeRange: Boolean,
    Parent: js.Any,
    PowerPointDotSelection_typekey: Selection,
    ShapeRange: ShapeRange,
    SlideRange: SlideRange,
    TextRange: TextRange,
    TextRange2: TextRange2,
    Type: PpSelectionType,
    Unselect: () => Unit
  ): Selection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ChildShapeRange = ChildShapeRange.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), HasChildShapeRange = HasChildShapeRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ShapeRange = ShapeRange.asInstanceOf[js.Any], SlideRange = SlideRange.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], TextRange2 = TextRange2.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unselect = js.Any.fromFunction0(Unselect))
    __obj.updateDynamic("PowerPoint.Selection_typekey")(PowerPointDotSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  implicit class SelectionOps[Self <: Selection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildShapeRange(value: ShapeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChildShapeRange")(value.asInstanceOf[js.Any])
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
    def withHasChildShapeRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasChildShapeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotSelection_typekey(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Selection_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeRange(value: ShapeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShapeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideRange(value: SlideRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextRange(value: TextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextRange2(value: TextRange2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextRange2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PpSelectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnselect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unselect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

