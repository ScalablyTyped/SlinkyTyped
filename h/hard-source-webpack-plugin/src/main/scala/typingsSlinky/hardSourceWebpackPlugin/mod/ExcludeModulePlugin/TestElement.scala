package typingsSlinky.hardSourceWebpackPlugin.mod.ExcludeModulePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.RegExp
  - java.lang.String
  - js.Function1[/ * source * / java.lang.String, scala.Boolean]
  - js.Array[typingsSlinky.hardSourceWebpackPlugin.mod.ExcludeModulePlugin.Option]
*/
trait TestElement extends js.Object

object TestElement {
  @scala.inline
  implicit def apply(value: js.Array[Option]): TestElement = value.asInstanceOf[TestElement]
  @scala.inline
  implicit def apply(value: js.Function1[/* source */ String, Boolean]): TestElement = value.asInstanceOf[TestElement]
  @scala.inline
  implicit def apply(value: js.RegExp): TestElement = value.asInstanceOf[TestElement]
  @scala.inline
  implicit def apply(value: String): TestElement = value.asInstanceOf[TestElement]
}

