package typingsSlinky.reactOnclickoutside.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleClickOutside[T] extends js.Object {
  
  var handleClickOutside: MouseEventHandler[T] = js.native
}
object HandleClickOutside {
  
  @scala.inline
  def apply[T](handleClickOutside: SyntheticMouseEvent[T] => Unit): HandleClickOutside[T] = {
    val __obj = js.Dynamic.literal(handleClickOutside = js.Any.fromFunction1(handleClickOutside))
    __obj.asInstanceOf[HandleClickOutside[T]]
  }
  
  @scala.inline
  implicit class HandleClickOutsideOps[Self <: HandleClickOutside[_], T] (val x: Self with HandleClickOutside[T]) extends AnyVal {
    
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
    def setHandleClickOutside(value: SyntheticMouseEvent[T] => Unit): Self = this.set("handleClickOutside", js.Any.fromFunction1(value))
  }
}
