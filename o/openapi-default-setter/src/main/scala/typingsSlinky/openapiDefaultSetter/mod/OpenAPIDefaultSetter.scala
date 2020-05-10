package typingsSlinky.openapiDefaultSetter.mod

import typingsSlinky.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIDefaultSetter extends IOpenAPIDefaultSetter {
  var headersDefaults: js.Any = js.native
  var queryDefaults: js.Any = js.native
}

object OpenAPIDefaultSetter {
  @scala.inline
  def apply(handle: Request => Unit, headersDefaults: js.Any, queryDefaults: js.Any): OpenAPIDefaultSetter = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), headersDefaults = headersDefaults.asInstanceOf[js.Any], queryDefaults = queryDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIDefaultSetter]
  }
  @scala.inline
  implicit class OpenAPIDefaultSetterOps[Self <: OpenAPIDefaultSetter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadersDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDefaults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

