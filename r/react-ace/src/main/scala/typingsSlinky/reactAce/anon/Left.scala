package typingsSlinky.reactAce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Left extends js.Object {
  
  var left: js.Array[_] = js.native
  
  var right: js.Array[_] = js.native
}
object Left {
  
  @scala.inline
  def apply(left: js.Array[_], right: js.Array[_]): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit class LeftOps[Self <: Left] (val x: Self) extends AnyVal {
    
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
    def setLeftVarargs(value: js.Any*): Self = this.set("left", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: js.Array[_]): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightVarargs(value: js.Any*): Self = this.set("right", js.Array(value :_*))
    
    @scala.inline
    def setRight(value: js.Array[_]): Self = this.set("right", value.asInstanceOf[js.Any])
  }
}
