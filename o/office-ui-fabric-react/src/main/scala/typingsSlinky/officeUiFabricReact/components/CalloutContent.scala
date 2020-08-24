package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalloutContent {
  @JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent", "CalloutContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: ICalloutProps): SharedBuilder_ICalloutProps988608940[js.Object] = new SharedBuilder_ICalloutProps988608940[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CalloutContent.type): SharedBuilder_ICalloutProps988608940[js.Object] = new SharedBuilder_ICalloutProps988608940[js.Object](js.Array(this.component, js.Dictionary.empty))()
}

