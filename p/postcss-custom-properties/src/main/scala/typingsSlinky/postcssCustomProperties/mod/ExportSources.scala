package typingsSlinky.postcssCustomProperties.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sources where Custom Properties can be imported from or export to,
  * which might be CSS, JS, and JSON files, functions, and directly passed objects
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject
  - js.Function1[
/ * customProperties * / typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject, 
js.Any]
  - js.Promise[typingsSlinky.postcssCustomProperties.mod.CustomPropertiesObject]
*/
trait ExportSources extends js.Object

object ExportSources {
  @scala.inline
  implicit def apply(value: CustomPropertiesObject): ExportSources = value.asInstanceOf[ExportSources]
  @scala.inline
  implicit def apply(value: js.Function1[/* customProperties */ CustomPropertiesObject, js.Any]): ExportSources = value.asInstanceOf[ExportSources]
  @scala.inline
  implicit def apply(value: js.Promise[CustomPropertiesObject]): ExportSources = value.asInstanceOf[ExportSources]
  @scala.inline
  implicit def apply(value: String): ExportSources = value.asInstanceOf[ExportSources]
}

