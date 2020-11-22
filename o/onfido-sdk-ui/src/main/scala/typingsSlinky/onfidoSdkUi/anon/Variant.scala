package typingsSlinky.onfidoSdkUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variant extends js.Object {
  
  var id: String = js.native
  
  var variant: String = js.native
}
object Variant {
  
  @scala.inline
  def apply(id: String, variant: String): Variant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variant]
  }
  
  @scala.inline
  implicit class VariantOps[Self <: Variant] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
  }
}
