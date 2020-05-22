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

trait DeserializerOptions extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var keyForAttribute: js.UndefOr[
    `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute
  ] = js.undefined
  var pluralizeType: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[Transform] = js.undefined
  var typeAsAttribute: js.UndefOr[Boolean] = js.undefined
}

object DeserializerOptions {
  @scala.inline
  def apply(
    id: String = null,
    keyForAttribute: `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute = null,
    pluralizeType: js.UndefOr[Boolean] = js.undefined,
    transform: /* record */ js.Any => js.Any = null,
    typeAsAttribute: js.UndefOr[Boolean] = js.undefined
  ): DeserializerOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyForAttribute != null) __obj.updateDynamic("keyForAttribute")(keyForAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(pluralizeType)) __obj.updateDynamic("pluralizeType")(pluralizeType.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(typeAsAttribute)) __obj.updateDynamic("typeAsAttribute")(typeAsAttribute.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializerOptions]
  }
}

