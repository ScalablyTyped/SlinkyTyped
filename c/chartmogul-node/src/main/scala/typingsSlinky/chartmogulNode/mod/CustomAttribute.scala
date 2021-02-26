package typingsSlinky.chartmogulNode.mod

import typingsSlinky.chartmogulNode.anon.Custom
import typingsSlinky.chartmogulNode.anon.CustomArray
import typingsSlinky.chartmogulNode.anon.CustomStrings
import typingsSlinky.chartmogulNode.commonMod.Entries
import typingsSlinky.chartmogulNode.commonMod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomAttribute {
  
  @JSImport("chartmogul-node", "CustomAttribute.add")
  @js.native
  def add(config: Config, uuid: String, data: Custom): js.Promise[Entries[typingsSlinky.chartmogulNode.mod.Customer.Customer]] = js.native
  @JSImport("chartmogul-node", "CustomAttribute.add")
  @js.native
  def add(config: Config, uuid: String, data: CustomArray): js.Promise[CustomAttributes] = js.native
  
  @JSImport("chartmogul-node", "CustomAttribute.remove")
  @js.native
  def remove(config: Config, uuid: String, data: CustomStrings): js.Promise[CustomAttributes] = js.native
  
  @JSImport("chartmogul-node", "CustomAttribute.update")
  @js.native
  def update(config: Config, uuid: String, data: CustomAttributes): js.Promise[CustomAttributes] = js.native
  
  @js.native
  trait CustomAttributes extends StObject {
    
    var custom: Map = js.native
  }
  object CustomAttributes {
    
    @scala.inline
    def apply(custom: Map): CustomAttributes = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAttributes]
    }
    
    @scala.inline
    implicit class CustomAttributesMutableBuilder[Self <: CustomAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: Map): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    }
  }
}
