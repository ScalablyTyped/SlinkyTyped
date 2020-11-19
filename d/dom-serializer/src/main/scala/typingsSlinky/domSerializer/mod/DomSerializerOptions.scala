package typingsSlinky.domSerializer.mod

import typingsSlinky.domSerializer.domSerializerStrings.foreign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomSerializerOptions extends js.Object {
  
  var decodeEntities: js.UndefOr[Boolean] = js.native
  
  var xmlMode: js.UndefOr[Boolean | foreign] = js.native
}
object DomSerializerOptions {
  
  @scala.inline
  def apply(): DomSerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomSerializerOptions]
  }
  
  @scala.inline
  implicit class DomSerializerOptionsOps[Self <: DomSerializerOptions] (val x: Self) extends AnyVal {
    
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
    def setDecodeEntities(value: Boolean): Self = this.set("decodeEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeEntities: Self = this.set("decodeEntities", js.undefined)
    
    @scala.inline
    def setXmlMode(value: Boolean | foreign): Self = this.set("xmlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlMode: Self = this.set("xmlMode", js.undefined)
  }
}
