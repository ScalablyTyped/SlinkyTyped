package typingsSlinky.reactNativeScrollableTabView.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeTabProperties extends js.Object {
  
  // previousPage
  var from: Double = js.native
  
  // currentPage
  var i: Double = js.native
  
  // currentPage object
  var ref: ReactElement = js.native
}
object ChangeTabProperties {
  
  @scala.inline
  def apply(from: Double, i: Double, ref: ReactElement): ChangeTabProperties = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTabProperties]
  }
  
  @scala.inline
  implicit class ChangeTabPropertiesOps[Self <: ChangeTabProperties] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI(value: Double): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: ReactElement): Self = this.set("ref", value.asInstanceOf[js.Any])
  }
}
