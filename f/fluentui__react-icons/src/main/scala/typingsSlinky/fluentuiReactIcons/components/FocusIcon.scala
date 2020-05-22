package typingsSlinky.fluentuiReactIcons.components

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.fluentuiReactIcons.svgIconTypesMod.ISvgIconProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FocusIcon {
  @JSImport("@fluentui/react-icons/lib/components/FocusIcon", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: HTMLAttributes[HTMLSpanElement] with ISvgIconProps): SharedBuilder_HTMLAttributesISvgIconProps1057284334 = new SharedBuilder_HTMLAttributesISvgIconProps1057284334(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FocusIcon.type): SharedBuilder_HTMLAttributesISvgIconProps1057284334 = new SharedBuilder_HTMLAttributesISvgIconProps1057284334(js.Array(this.component, js.Dictionary.empty))()
}

