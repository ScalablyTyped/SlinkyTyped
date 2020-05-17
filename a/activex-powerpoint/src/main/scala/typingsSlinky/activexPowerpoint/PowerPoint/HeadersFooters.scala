package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadersFooters extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val DateAndTime: HeaderFooter = js.native
  var DisplayOnTitleSlide: MsoTriState = js.native
  val Footer: HeaderFooter = js.native
  val Header: HeaderFooter = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.HeadersFooters_typekey")
  var PowerPointDotHeadersFooters_typekey: HeadersFooters = js.native
  val SlideNumber: HeaderFooter = js.native
  def Clear(): Unit = js.native
}

object HeadersFooters {
  @scala.inline
  def apply(
    Application: Application,
    Clear: () => Unit,
    DateAndTime: HeaderFooter,
    DisplayOnTitleSlide: MsoTriState,
    Footer: HeaderFooter,
    Header: HeaderFooter,
    Parent: js.Any,
    PowerPointDotHeadersFooters_typekey: HeadersFooters,
    SlideNumber: HeaderFooter
  ): HeadersFooters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), DateAndTime = DateAndTime.asInstanceOf[js.Any], DisplayOnTitleSlide = DisplayOnTitleSlide.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideNumber = SlideNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.HeadersFooters_typekey")(PowerPointDotHeadersFooters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersFooters]
  }
  @scala.inline
  implicit class HeadersFootersOps[Self <: HeadersFooters] (val x: Self) extends AnyVal {
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
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDateAndTime(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateAndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayOnTitleSlide(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayOnTitleSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotHeadersFooters_typekey(value: HeadersFooters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.HeadersFooters_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideNumber(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

