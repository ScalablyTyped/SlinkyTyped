package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borders extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Borders_typekey")
  var PowerPointDotBorders_typekey: Borders = js.native
  def Item(BorderType: PpBorderType): LineFormat = js.native
}

object Borders {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: PpBorderType => LineFormat,
    Parent: js.Any,
    PowerPointDotBorders_typekey: Borders
  ): Borders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Borders_typekey")(PowerPointDotBorders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  @scala.inline
  implicit class BordersOps[Self <: Borders] (val x: Self) extends AnyVal {
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
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: PpBorderType => LineFormat): Self = {
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
    def withPowerPointDotBorders_typekey(value: Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Borders_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

