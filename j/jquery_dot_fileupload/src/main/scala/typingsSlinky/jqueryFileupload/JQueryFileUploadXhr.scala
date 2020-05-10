package typingsSlinky.jqueryFileupload

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFileUploadXhr extends js.Object {
  var errorThrown: js.Any = js.native
  var headers: StringDictionary[js.Any] = js.native
  var jqXHR: JQueryXHR = js.native
  var result: js.Any = js.native
  var textStatus: String = js.native
}

object JQueryFileUploadXhr {
  @scala.inline
  def apply(
    errorThrown: js.Any,
    headers: StringDictionary[js.Any],
    jqXHR: JQueryXHR,
    result: js.Any,
    textStatus: String
  ): JQueryFileUploadXhr = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadXhr]
  }
  @scala.inline
  implicit class JQueryFileUploadXhrOps[Self <: JQueryFileUploadXhr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorThrown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorThrown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJqXHR(value: JQueryXHR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqXHR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

