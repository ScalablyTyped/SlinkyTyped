package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityError extends js.Object {
  var entity: Entity = js.native
  var errorMessage: String = js.native
  var errorName: String = js.native
  var isServerError: Boolean = js.native
  var propertyName: String = js.native
}

object EntityError {
  @scala.inline
  def apply(
    entity: Entity,
    errorMessage: String,
    errorName: String,
    isServerError: Boolean,
    propertyName: String
  ): EntityError = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], errorName = errorName.asInstanceOf[js.Any], isServerError = isServerError.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityError]
  }
  @scala.inline
  implicit class EntityErrorOps[Self <: EntityError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsServerError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServerError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

