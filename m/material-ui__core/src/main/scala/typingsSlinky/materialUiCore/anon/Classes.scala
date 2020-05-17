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
  @scala.inline
  implicit class ClassesOps[Self[t] <: Classes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClasses(value: ClassNameMap[_ | T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

