package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.ClassNameMap
import typingsSlinky.materialUiCore.withStylesMod.StyleRules
import typingsSlinky.materialUiCore.withStylesMod.StyleRulesCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */] extends js.Object {
  var classes: ClassNameMap[_ | T] = js.native
}

object Classes {
  @scala.inline
  def apply[T](classes: ClassNameMap[_ | T]): Classes[T] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[T]]
  }
}

