package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fonts extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Fonts_typekey")
  var PowerPointDotFonts_typekey: Fonts = js.native
  def Item(Index: js.Any): Font = js.native
  def Replace(Original: String, Replacement: String): Unit = js.native
}

object Fonts {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: js.Any => Font,
    Parent: js.Any,
    PowerPointDotFonts_typekey: Fonts,
    Replace: (String, String) => Unit
  ): Fonts = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Replace = js.Any.fromFunction2(Replace))
    __obj.updateDynamic("PowerPoint.Fonts_typekey")(PowerPointDotFonts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fonts]
  }
  @scala.inline
  implicit class FontsOps[Self <: Fonts] (val x: Self) extends AnyVal {
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
    def withItem(value: js.Any => Font): Self = {
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
    def withPowerPointDotFonts_typekey(value: Fonts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Fonts_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplace(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replace")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

