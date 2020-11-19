package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalloutContentBase {
  
  @JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: ICalloutProps): SharedBuilder_ICalloutProps988608940[typingsSlinky.officeUiFabricReact.calloutContentBaseMod.CalloutContentBase] = new SharedBuilder_ICalloutProps988608940[typingsSlinky.officeUiFabricReact.calloutContentBaseMod.CalloutContentBase](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CalloutContentBase.type): SharedBuilder_ICalloutProps988608940[typingsSlinky.officeUiFabricReact.calloutContentBaseMod.CalloutContentBase] = new SharedBuilder_ICalloutProps988608940[typingsSlinky.officeUiFabricReact.calloutContentBaseMod.CalloutContentBase](js.Array(this.component, js.Dictionary.empty))()
}
