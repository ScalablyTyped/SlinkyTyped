package typingsSlinky.mysticateaSpy.mod.Spy_

import typingsSlinky.mysticateaSpy.mod.This
import typingsSlinky.mysticateaSpy.mysticateaSpyStrings.`return`
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information for each returned call. */
@js.native
trait ReturnedCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
  
  var arguments: Parameters[T] = js.native
  
  var `return`: ReturnType[T] = js.native
  
  var `this`: This[T] = js.native
  
  var `type`: `return` = js.native
}
object ReturnedCall {
  
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `return`: ReturnType[T], `type`: `return`): ReturnedCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnedCall[T]]
  }
  
  @scala.inline
  implicit class ReturnedCallOps[Self <: ReturnedCall[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with ReturnedCall[T]) extends AnyVal {
    
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
    def setArguments(value: Parameters[T]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn(value: ReturnType[T]): Self = this.set("return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `return`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThis(value: This[T]): Self = this.set("this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThis: Self = this.set("this", js.undefined)
  }
}
