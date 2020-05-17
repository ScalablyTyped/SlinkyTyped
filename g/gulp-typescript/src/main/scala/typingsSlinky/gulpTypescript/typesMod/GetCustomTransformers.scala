package typingsSlinky.gulpTypescript.typesMod

import typingsSlinky.typescript.mod.CustomTransformers
import typingsSlinky.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[
/ * program * / js.UndefOr[typingsSlinky.typescript.mod.Program], 
js.UndefOr[typingsSlinky.typescript.mod.CustomTransformers]]
*/
trait GetCustomTransformers extends js.Object

object GetCustomTransformers {
  @scala.inline
  implicit def apply(value: js.Function1[/* program */ js.UndefOr[Program], js.UndefOr[CustomTransformers]]): GetCustomTransformers = value.asInstanceOf[GetCustomTransformers]
  @scala.inline
  implicit def apply(value: String): GetCustomTransformers = value.asInstanceOf[GetCustomTransformers]
}

