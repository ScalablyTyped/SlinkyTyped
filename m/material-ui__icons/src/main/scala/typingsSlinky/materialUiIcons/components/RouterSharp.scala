package typingsSlinky.materialUiIcons.components

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.materialUiCore.svgIconSvgIconMod.SvgIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouterSharp {
  
  @JSImport("@material-ui/icons", "RouterSharp")
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps144760471[SVGSVGElement] = new SharedBuilder_SvgIconProps144760471[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RouterSharp.type): SharedBuilder_SvgIconProps144760471[SVGSVGElement] = new SharedBuilder_SvgIconProps144760471[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
}
