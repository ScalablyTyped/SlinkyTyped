package typingsSlinky.openapiDefaultSetter.mod

import typingsSlinky.openapiTypes.mod.OpenAPI.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOpenAPIDefaultSetter extends js.Object {
  def handle(request: Request): Unit = js.native
}

object IOpenAPIDefaultSetter {
  @scala.inline
  def apply(handle: Request => Unit): IOpenAPIDefaultSetter = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[IOpenAPIDefaultSetter]
  }
  @scala.inline
  implicit class IOpenAPIDefaultSetterOps[Self <: IOpenAPIDefaultSetter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandle(value: Request => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

