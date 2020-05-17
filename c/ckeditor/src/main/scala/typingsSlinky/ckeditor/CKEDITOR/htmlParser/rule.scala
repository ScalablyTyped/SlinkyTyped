package typingsSlinky.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * value * / typingsSlinky.ckeditor.CKEDITOR.htmlParser.node | typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment | java.lang.String, 
scala.Boolean]
  - js.Tuple2[java.lang.String, java.lang.String]
*/
trait rule extends js.Object

object rule {
  @scala.inline
  implicit def apply(value: js.Function1[/* value */ node | fragment | String, Boolean]): rule = value.asInstanceOf[rule]
  @scala.inline
  implicit def apply(value: js.Tuple2[String, String]): rule = value.asInstanceOf[rule]
}

