package typingsSlinky.materialUiIcons.components

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.materialUiCore.svgIconSvgIconMod.SvgIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FlagSharp {
  @JSImport("@material-ui/icons", "FlagSharp")
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps144760471[SVGSVGElement] = new SharedBuilder_SvgIconProps144760471[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FlagSharp.type): SharedBuilder_SvgIconProps144760471[SVGSVGElement] = new SharedBuilder_SvgIconProps144760471[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
}

