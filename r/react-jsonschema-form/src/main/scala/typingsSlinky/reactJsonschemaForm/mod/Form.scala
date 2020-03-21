package typingsSlinky.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.react.mod.Component
import typingsSlinky.reactJsonschemaForm.AnonErrorSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form[T]
  extends Component[FormProps[T], js.Object, js.Any] {
  def onBlur(id: String): Unit = js.native
  def onBlur(id: String, value: String): Unit = js.native
  def onBlur(id: String, value: Boolean): Unit = js.native
  def onBlur(id: String, value: Double): Unit = js.native
  def onChange(formData: T, newErrorSchema: ErrorSchema): Unit = js.native
  def submit(): Unit = js.native
  def validate(formData: T): AnonErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6): AnonErrorSchema = js.native
  def validate(
    formData: T,
    schema: JSONSchema6,
    additionalMetaSchemas: js.UndefOr[scala.Nothing],
    customFormats: StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
  ): AnonErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6, additionalMetaSchemas: js.Array[js.Object]): AnonErrorSchema = js.native
  def validate(
    formData: T,
    schema: JSONSchema6,
    additionalMetaSchemas: js.Array[js.Object],
    customFormats: StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
  ): AnonErrorSchema = js.native
}

