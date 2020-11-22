package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedGenericResource extends GenericResource {
  
  var Kind: js.UndefOr[String] = js.native
  
  var Value: js.UndefOr[String] = js.native
}
object NamedGenericResource {
  
  @scala.inline
  def apply(): NamedGenericResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedGenericResource]
  }
  
  @scala.inline
  implicit class NamedGenericResourceOps[Self <: NamedGenericResource] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("Kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("Kind", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
