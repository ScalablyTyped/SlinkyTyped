package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.monacoEditor.mod.languages.Location
  - js.Array[
typingsSlinky.monacoEditor.mod.languages.Location | typingsSlinky.monacoEditor.mod.languages.LocationLink]
*/
trait Definition extends js.Object

object Definition {
  @scala.inline
  implicit def apply(value: js.Array[Location | LocationLink]): Definition = value.asInstanceOf[Definition]
  @scala.inline
  implicit def apply(value: Location): Definition = value.asInstanceOf[Definition]
}

