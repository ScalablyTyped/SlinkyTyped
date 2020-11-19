package typingsSlinky.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sorted extends js.Object {
  
  var sorted: js.UndefOr[Boolean] = js.native
}
object Sorted {
  
  @scala.inline
  def apply(): Sorted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sorted]
  }
  
  @scala.inline
  implicit class SortedOps[Self <: Sorted] (val x: Self) extends AnyVal {
    
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
    def setSorted(value: Boolean): Self = this.set("sorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorted: Self = this.set("sorted", js.undefined)
  }
}
