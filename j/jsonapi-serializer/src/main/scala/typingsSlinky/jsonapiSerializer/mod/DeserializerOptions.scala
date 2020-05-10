package typingsSlinky.jsonapiSerializer.mod

import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.CamelCase
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.`dash-case`
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.`kebab-case`
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.`lisp-case`
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.`spinal-case`
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.camelCase_
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.snake_case
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.underscore_case
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeserializerOptions extends js.Object {
  var id: js.UndefOr[String] = js.native
  var keyForAttribute: js.UndefOr[
    `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute
  ] = js.native
  var pluralizeType: js.UndefOr[Boolean] = js.native
  var transform: js.UndefOr[Transform] = js.native
  var typeAsAttribute: js.UndefOr[Boolean] = js.native
}

object DeserializerOptions {
  @scala.inline
  def apply(): DeserializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeserializerOptions]
  }
  @scala.inline
  implicit class DeserializerOptionsOps[Self <: DeserializerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyForAttributeFunction1(value: /* attribute */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyForAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyForAttribute(
      value: `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyForAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyForAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyForAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withPluralizeType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluralizeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralizeType")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* record */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAsAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAsAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAsAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAsAttribute")(js.undefined)
        ret
    }
  }
  
}

