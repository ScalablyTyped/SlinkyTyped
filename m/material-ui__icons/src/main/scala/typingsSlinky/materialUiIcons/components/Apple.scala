package typingsSlinky.materialUiIcons.components

import typingsSlinky.materialUiCore.svgIconSvgIconMod.SvgIconProps
import typingsSlinky.materialUiIcons.appleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Apple {
  @JSImport("@material-ui/icons/Apple", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps_1164301990[default] = new SharedBuilder_SvgIconProps_1164301990[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Apple.type): SharedBuilder_SvgIconProps_1164301990[default] = new SharedBuilder_SvgIconProps_1164301990[default](js.Array(this.component, js.Dictionary.empty))()
}

