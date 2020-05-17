package typingsSlinky.reactAutosuggest.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactAutosuggest.anon.PartialRecordThemeKeystri
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Record[java.lang.String, java.lang.String | typingsSlinky.react.mod.CSSProperties]
  - typingsSlinky.reactAutosuggest.anon.PartialRecordThemeKeystri
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  implicit def apply(value: PartialRecordThemeKeystri): Theme = value.asInstanceOf[Theme]
  @scala.inline
  implicit def apply(value: Record[String, String | CSSProperties]): Theme = value.asInstanceOf[Theme]
}

