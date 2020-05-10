package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OCRReadPara extends js.Object {
  var AjaxFunctionUrl: String = js.native
  var AryZone: js.Array[Double] = js.native
  var FileNames: String = js.native
  var FunctionName: String = js.native
  var ImageIndex: Double = js.native
  var JsonString: String = js.native
  var STWAIN: WebTwain = js.native
  var Type: String = js.native
  def OnFailure(): Unit = js.native
  def OnSuccess(): Unit = js.native
}

object OCRReadPara {
  @scala.inline
  def apply(
    AjaxFunctionUrl: String,
    AryZone: js.Array[Double],
    FileNames: String,
    FunctionName: String,
    ImageIndex: Double,
    JsonString: String,
    OnFailure: () => Unit,
    OnSuccess: () => Unit,
    STWAIN: WebTwain,
    Type: String
  ): OCRReadPara = {
    val __obj = js.Dynamic.literal(AjaxFunctionUrl = AjaxFunctionUrl.asInstanceOf[js.Any], AryZone = AryZone.asInstanceOf[js.Any], FileNames = FileNames.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], ImageIndex = ImageIndex.asInstanceOf[js.Any], JsonString = JsonString.asInstanceOf[js.Any], OnFailure = js.Any.fromFunction0(OnFailure), OnSuccess = js.Any.fromFunction0(OnSuccess), STWAIN = STWAIN.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCRReadPara]
  }
  @scala.inline
  implicit class OCRReadParaOps[Self <: OCRReadPara] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxFunctionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AjaxFunctionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAryZone(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AryZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFailure(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnFailure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSTWAIN(value: WebTwain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STWAIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

