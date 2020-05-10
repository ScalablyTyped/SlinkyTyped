package typingsSlinky.activexWord.Word.EventHelperTypes

import typingsSlinky.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationEPostageInsertExParameter extends js.Object {
  val Doc: Document = js.native
  val bstrPaperFeed: String = js.native
  val bstrPrinterName: String = js.native
  val cpDeliveryAddrEnd: Double = js.native
  val cpDeliveryAddrStart: Double = js.native
  val cpReturnAddrEnd: Double = js.native
  val cpReturnAddrStart: Double = js.native
  var fCancel: Boolean = js.native
  val fPrint: Boolean = js.native
  val xaWidth: Double = js.native
  val yaHeight: Double = js.native
}

object ApplicationEPostageInsertExParameter {
  @scala.inline
  def apply(
    Doc: Document,
    bstrPaperFeed: String,
    bstrPrinterName: String,
    cpDeliveryAddrEnd: Double,
    cpDeliveryAddrStart: Double,
    cpReturnAddrEnd: Double,
    cpReturnAddrStart: Double,
    fCancel: Boolean,
    fPrint: Boolean,
    xaWidth: Double,
    yaHeight: Double
  ): ApplicationEPostageInsertExParameter = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], bstrPaperFeed = bstrPaperFeed.asInstanceOf[js.Any], bstrPrinterName = bstrPrinterName.asInstanceOf[js.Any], cpDeliveryAddrEnd = cpDeliveryAddrEnd.asInstanceOf[js.Any], cpDeliveryAddrStart = cpDeliveryAddrStart.asInstanceOf[js.Any], cpReturnAddrEnd = cpReturnAddrEnd.asInstanceOf[js.Any], cpReturnAddrStart = cpReturnAddrStart.asInstanceOf[js.Any], fCancel = fCancel.asInstanceOf[js.Any], fPrint = fPrint.asInstanceOf[js.Any], xaWidth = xaWidth.asInstanceOf[js.Any], yaHeight = yaHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEPostageInsertExParameter]
  }
  @scala.inline
  implicit class ApplicationEPostageInsertExParameterOps[Self <: ApplicationEPostageInsertExParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBstrPaperFeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrPaperFeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBstrPrinterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrPrinterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpDeliveryAddrEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpDeliveryAddrEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpDeliveryAddrStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpDeliveryAddrStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpReturnAddrEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpReturnAddrEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpReturnAddrStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpReturnAddrStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXaWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

