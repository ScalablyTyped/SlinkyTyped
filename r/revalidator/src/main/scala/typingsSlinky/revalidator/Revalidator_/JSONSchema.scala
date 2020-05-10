package typingsSlinky.revalidator.Revalidator_

import typingsSlinky.revalidator.revalidatorStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema[T] extends js.Object {
  var patternProperties: js.UndefOr[ISchemas[T]] = js.native
  var properties: js.UndefOr[ISchemas[T]] = js.native
  var `type`: js.UndefOr[`object`] = js.native
}

object JSONSchema {
  @scala.inline
  def apply[T](): JSONSchema[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchema[T]]
  }
  @scala.inline
  implicit class JSONSchemaOps[Self[t] <: JSONSchema[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPatternProperties(value: ISchemas[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatternProperties: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: ISchemas[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: `object`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

