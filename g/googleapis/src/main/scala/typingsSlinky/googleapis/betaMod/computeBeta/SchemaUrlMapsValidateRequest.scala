package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrlMapsValidateRequest extends js.Object {
  /**
    * Content of the UrlMap to be validated.
    */
  var resource: js.UndefOr[SchemaUrlMap] = js.native
}

object SchemaUrlMapsValidateRequest {
  @scala.inline
  def apply(): SchemaUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsValidateRequest]
  }
  @scala.inline
  implicit class SchemaUrlMapsValidateRequestOps[Self <: SchemaUrlMapsValidateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: SchemaUrlMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

