package typingsSlinky.materialUiCore.anon

import typingsSlinky.materialUiCore.withStylesMod.ClassNameMap
import typingsSlinky.materialUiCore.withStylesMod.StyleRules
import typingsSlinky.materialUiCore.withStylesMod.StyleRulesCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classes[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */] extends js.Object {
  
  var classes: ClassNameMap[_ | T] = js.native
}
object Classes {
  
  @scala.inline
  def apply[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */](classes: ClassNameMap[_ | T]): Classes[T] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[T]]
  }
  
  @scala.inline
  implicit class ClassesOps[Self <: Classes[_], T /* <: String | StyleRules[String] | StyleRulesCallback[String] */] (val x: Self with Classes[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClasses(value: ClassNameMap[_ | T]): Self = this.set("classes", value.asInstanceOf[js.Any])
  }
}
