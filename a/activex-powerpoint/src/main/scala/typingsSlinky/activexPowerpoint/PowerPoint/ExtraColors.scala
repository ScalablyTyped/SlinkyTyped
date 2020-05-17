package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoRGBType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraColors extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ExtraColors_typekey")
  var PowerPointDotExtraColors_typekey: ExtraColors = js.native
  def Add(Type: MsoRGBType): Unit = js.native
  def Clear(): Unit = js.native
  def Item(Index: Double): MsoRGBType = js.native
}

object ExtraColors {
  @scala.inline
  def apply(
    Add: MsoRGBType => Unit,
    Application: Application,
    Clear: () => Unit,
    Count: Double,
    Item: Double => MsoRGBType,
    Parent: js.Any,
    PowerPointDotExtraColors_typekey: ExtraColors
  ): ExtraColors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ExtraColors_typekey")(PowerPointDotExtraColors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraColors]
  }
  @scala.inline
  implicit class ExtraColorsOps[Self <: ExtraColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: MsoRGBType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Double => MsoRGBType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotExtraColors_typekey(value: ExtraColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.ExtraColors_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

