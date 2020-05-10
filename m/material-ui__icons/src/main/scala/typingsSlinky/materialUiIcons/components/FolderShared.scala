package typingsSlinky.materialUiIcons.components

import typingsSlinky.materialUiCore.svgIconSvgIconMod.SvgIconProps
import typingsSlinky.materialUiIcons.folderSharedMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FolderShared {
  @JSImport("@material-ui/icons/FolderShared", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps_1164301990[default] = new SharedBuilder_SvgIconProps_1164301990[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FolderShared.type): SharedBuilder_SvgIconProps_1164301990[default] = new SharedBuilder_SvgIconProps_1164301990[default](js.Array(this.component, js.Dictionary.empty))()
}

