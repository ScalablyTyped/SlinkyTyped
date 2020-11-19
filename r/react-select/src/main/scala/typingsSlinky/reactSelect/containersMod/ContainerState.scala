package typingsSlinky.reactSelect.containersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerState extends js.Object {
  
  /** Whether the select is disabled. */
  var isDisabled: Boolean = js.native
  
  /** Whether the text in the select is indented from right to left. */
  var isRtl: Boolean = js.native
}
object ContainerState {
  
  @scala.inline
  def apply(isDisabled: Boolean, isRtl: Boolean): ContainerState = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerState]
  }
  
  @scala.inline
  implicit class ContainerStateOps[Self <: ContainerState] (val x: Self) extends AnyVal {
    
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
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRtl(value: Boolean): Self = this.set("isRtl", value.asInstanceOf[js.Any])
  }
}
