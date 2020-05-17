package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cell extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Borders: typingsSlinky.activexPowerpoint.PowerPoint.Borders = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Cell_typekey")
  var PowerPointDotCell_typekey: Cell = js.native
  val Selected: Boolean = js.native
  val Shape: typingsSlinky.activexPowerpoint.PowerPoint.Shape = js.native
  def Merge(MergeTo: Cell): Unit = js.native
  def Select(): Unit = js.native
  def Split(NumRows: Double, NumColumns: Double): Unit = js.native
}

object Cell {
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Merge: Cell => Unit,
    Parent: js.Any,
    PowerPointDotCell_typekey: Cell,
    Select: () => Unit,
    Selected: Boolean,
    Shape: Shape,
    Split: (Double, Double) => Unit
  ): Cell = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Merge = js.Any.fromFunction1(Merge), Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Selected = Selected.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], Split = js.Any.fromFunction2(Split))
    __obj.updateDynamic("PowerPoint.Cell_typekey")(PowerPointDotCell_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
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
    def withBorders(value: Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge(value: Cell => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Merge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotCell_typekey(value: Cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Cell_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Split")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

