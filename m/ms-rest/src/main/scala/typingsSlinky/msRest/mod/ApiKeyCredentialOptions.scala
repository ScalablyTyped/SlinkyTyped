package typingsSlinky.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyCredentialOptions extends js.Object {
  /**
    * @property {object} [inHeader]  A key value pair of the header parameters that need to be applied to the request.
    */
  var inHeader: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * @property {object} [inQuery]   A key value pair of the query parameters that need to be applied to the request.
    */
  var inQuery: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object ApiKeyCredentialOptions {
  @scala.inline
  def apply(): ApiKeyCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyCredentialOptions]
  }
  @scala.inline
  implicit class ApiKeyCredentialOptionsOps[Self <: ApiKeyCredentialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInHeader(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withInQuery(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inQuery")(js.undefined)
        ret
    }
  }
  
}

