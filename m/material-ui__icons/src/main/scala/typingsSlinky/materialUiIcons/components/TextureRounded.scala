package typingsSlinky.materialUiIcons.components

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.materialUiCore.svgIconSvgIconMod.SvgIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextureRounded {
  
  @JSImport("@material-ui/icons", "TextureRounded")
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps144760471[SVGSVGElement] = new SharedBuilder_SvgIconProps144760471[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TextureRounded.type): SharedBuilder_SvgIconProps144760471[SVGSVGElement] = new SharedBuilder_SvgIconProps144760471[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
}
