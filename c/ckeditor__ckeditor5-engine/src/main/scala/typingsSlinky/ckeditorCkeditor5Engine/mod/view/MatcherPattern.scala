package typingsSlinky.ckeditorCkeditor5Engine.mod.view

import typingsSlinky.ckeditorCkeditor5Engine.anon.Attribute
import typingsSlinky.ckeditorCkeditor5Engine.anon.Classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * element * / typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element, 
scala.Null | typingsSlinky.ckeditorCkeditor5Engine.anon.Attribute]
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.ckeditorCkeditor5Engine.anon.Classes
*/
trait MatcherPattern extends js.Object

object MatcherPattern {
  @scala.inline
  implicit def apply(value: Classes): MatcherPattern = value.asInstanceOf[MatcherPattern]
  @scala.inline
  implicit def apply(value: js.Function1[/* element */ Element, Null | Attribute]): MatcherPattern = value.asInstanceOf[MatcherPattern]
  @scala.inline
  implicit def apply(value: js.RegExp): MatcherPattern = value.asInstanceOf[MatcherPattern]
  @scala.inline
  implicit def apply(value: String): MatcherPattern = value.asInstanceOf[MatcherPattern]
}

