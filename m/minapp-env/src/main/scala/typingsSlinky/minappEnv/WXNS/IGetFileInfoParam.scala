package typingsSlinky.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetFileInfoParam extends IAPIParam[IGetFileInfoSuccessResult] {
  var digestAlgorithm: js.UndefOr[String] = js.native
  var filePath: String = js.native
}

object IGetFileInfoParam {
  @scala.inline
  def apply(filePath: String): IGetFileInfoParam = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetFileInfoParam]
  }
  @scala.inline
  implicit class IGetFileInfoParamOps[Self <: IGetFileInfoParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigestAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigestAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(js.undefined)
        ret
    }
  }
  
}

