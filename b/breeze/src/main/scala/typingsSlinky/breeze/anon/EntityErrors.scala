package typingsSlinky.breeze.anon

import typingsSlinky.breeze.breeze.EntityError
import typingsSlinky.breeze.breeze.HttpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityErrors extends js.Object {
  var entityErrors: js.Array[EntityError] = js.native
  var httpResponse: HttpResponse = js.native
  var message: String = js.native
  var stack: js.UndefOr[String] = js.native
  var status: js.UndefOr[Double] = js.native
}

object EntityErrors {
  @scala.inline
  def apply(entityErrors: js.Array[EntityError], httpResponse: HttpResponse, message: String): EntityErrors = {
    val __obj = js.Dynamic.literal(entityErrors = entityErrors.asInstanceOf[js.Any], httpResponse = httpResponse.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityErrors]
  }
  @scala.inline
  implicit class EntityErrorsOps[Self <: EntityErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityErrors(value: js.Array[EntityError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpResponse(value: HttpResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

