package typingsSlinky.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.react.mod.Component
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
  def validate(formData: T): typingsSlinky.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(
    formData: T,
    schema: js.UndefOr[scala.Nothing],
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]]
  ): typingsSlinky.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(
    formData: T,
    schema: js.UndefOr[scala.Nothing],
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]],
    customFormats: js.UndefOr[
      StringDictionary[(js.Function1[/* data */ String, Boolean]) | js.RegExp | String]
    ]
  ): typingsSlinky.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6): typingsSlinky.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6, additionalMetaSchemas: js.UndefOr[js.Array[js.Object]]): typingsSlinky.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(
    formData: T,
    schema: JSONSchema6,
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]],
    customFormats: js.UndefOr[
      StringDictionary[(js.Function1[/* data */ String, Boolean]) | js.RegExp | String]
    ]
  ): typingsSlinky.reactJsonschemaForm.anon.ErrorSchema = js.native
}

