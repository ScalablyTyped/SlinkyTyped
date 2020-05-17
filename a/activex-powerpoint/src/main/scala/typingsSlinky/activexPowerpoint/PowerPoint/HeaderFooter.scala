package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderFooter extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var Format: PpDateTimeFormat = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.HeaderFooter_typekey")
  var PowerPointDotHeaderFooter_typekey: HeaderFooter = js.native
  var Text: String = js.native
  var UseFormat: MsoTriState = js.native
  var Visible: MsoTriState = js.native
}

object HeaderFooter {
  @scala.inline
  def apply(
    Application: Application,
    Format: PpDateTimeFormat,
    Parent: js.Any,
    PowerPointDotHeaderFooter_typekey: HeaderFooter,
    Text: String,
    UseFormat: MsoTriState,
    Visible: MsoTriState
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], UseFormat = UseFormat.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.HeaderFooter_typekey")(PowerPointDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  @scala.inline
  implicit class HeaderFooterOps[Self <: HeaderFooter] (val x: Self) extends AnyVal {
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
    def withFormat(value: PpDateTimeFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotHeaderFooter_typekey(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.HeaderFooter_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFormat(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

