package typingsSlinky.regeneratorRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelegatedIterator extends js.Object {
  
  var iterator: js.Iterator[_] = js.native
}
object DelegatedIterator {
  
  @scala.inline
  def apply(iterator: js.Iterator[_]): DelegatedIterator = {
    val __obj = js.Dynamic.literal(iterator = iterator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegatedIterator]
  }
  
  @scala.inline
  implicit class DelegatedIteratorOps[Self <: DelegatedIterator] (val x: Self) extends AnyVal {
    
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
    def setIterator(value: js.Iterator[_]): Self = this.set("iterator", value.asInstanceOf[js.Any])
  }
}
