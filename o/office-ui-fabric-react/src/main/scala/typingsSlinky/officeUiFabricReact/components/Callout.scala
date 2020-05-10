package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Callout {
  @JSImport("office-ui-fabric-react", "Callout")
  @js.native
  object component extends js.Object
  
  def withProps(p: ICalloutProps): SharedBuilder_ICalloutProps988608940[typingsSlinky.officeUiFabricReact.mod.Callout] = new SharedBuilder_ICalloutProps988608940[typingsSlinky.officeUiFabricReact.mod.Callout](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Callout.type): SharedBuilder_ICalloutProps988608940[typingsSlinky.officeUiFabricReact.mod.Callout] = new SharedBuilder_ICalloutProps988608940[typingsSlinky.officeUiFabricReact.mod.Callout](js.Array(this.component, js.Dictionary.empty))()
}

