package typingsSlinky.fluentuiReactIcons.components

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.fluentuiReactIcons.svgIconTypesMod.ISvgIconProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProductIcon {
  
  @JSImport("@fluentui/react-icons", "ProductIcon")
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLAttributes[HTMLSpanElement] with ISvgIconProps): SharedBuilder_HTMLAttributesISvgIconProps1057284334 = new SharedBuilder_HTMLAttributesISvgIconProps1057284334(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ProductIcon.type): SharedBuilder_HTMLAttributesISvgIconProps1057284334 = new SharedBuilder_HTMLAttributesISvgIconProps1057284334(js.Array(this.component, js.Dictionary.empty))()
}
