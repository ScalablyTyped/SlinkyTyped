package typingsSlinky.colorNamer.anon

import typingsSlinky.colorNamer.mod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Omit[T /* <: Palette */] extends js.Object {
  
  var omit: js.Array[T] = js.native
}
object Omit {
  
  @scala.inline
  def apply[T /* <: Palette */](omit: js.Array[T]): Omit[T] = {
    val __obj = js.Dynamic.literal(omit = omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Omit[T]]
  }
  
  @scala.inline
  implicit class OmitOps[Self <: Omit[_], T /* <: Palette */] (val x: Self with Omit[T]) extends AnyVal {
    
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
    def setOmitVarargs(value: T*): Self = this.set("omit", js.Array(value :_*))
    
    @scala.inline
    def setOmit(value: js.Array[T]): Self = this.set("omit", value.asInstanceOf[js.Any])
  }
}
