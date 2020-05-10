package typingsSlinky.openapiRequestCoercer.mod

import typingsSlinky.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpenAPIRequestCoercer extends js.Object {
  def coerce(request: Request): Unit = js.native
}

object IOpenAPIRequestCoercer {
  @scala.inline
  def apply(coerce: Request => Unit): IOpenAPIRequestCoercer = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
    __obj.asInstanceOf[IOpenAPIRequestCoercer]
  }
  @scala.inline
  implicit class IOpenAPIRequestCoercerOps[Self <: IOpenAPIRequestCoercer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoerce(value: Request => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

