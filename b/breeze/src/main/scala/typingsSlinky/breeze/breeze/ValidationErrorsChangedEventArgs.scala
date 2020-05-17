package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationErrorsChangedEventArgs extends js.Object {
  var added: js.Array[ValidationError] = js.native
  var entity: Entity = js.native
  var removed: js.Array[ValidationError] = js.native
}

object ValidationErrorsChangedEventArgs {
  @scala.inline
  def apply(added: js.Array[ValidationError], entity: Entity, removed: js.Array[ValidationError]): ValidationErrorsChangedEventArgs = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationErrorsChangedEventArgs]
  }
  @scala.inline
  implicit class ValidationErrorsChangedEventArgsOps[Self <: ValidationErrorsChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: js.Array[ValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntity(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[ValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

