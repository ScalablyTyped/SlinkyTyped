package typingsSlinky.materialUiIcons.components

import typingsSlinky.materialUiCore.svgIconSvgIconMod.SvgIconProps
import typingsSlinky.materialUiIcons.androidRoundedMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AndroidRounded {
  @JSImport("@material-ui/icons/AndroidRounded", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps_1164301990[default] = new SharedBuilder_SvgIconProps_1164301990[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AndroidRounded.type): SharedBuilder_SvgIconProps_1164301990[default] = new SharedBuilder_SvgIconProps_1164301990[default](js.Array(this.component, js.Dictionary.empty))()
}

