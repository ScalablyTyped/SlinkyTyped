package typingsSlinky.materialUi.components

import typingsSlinky.materialUi.MaterialUI.SvgIconProps
import typingsSlinky.materialUi.looks4Mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Looks4 {
  
  @JSImport("material-ui/svg-icons/image/looks-4", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps_1073724525[default] = new SharedBuilder_SvgIconProps_1073724525[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Looks4.type): SharedBuilder_SvgIconProps_1073724525[default] = new SharedBuilder_SvgIconProps_1073724525[default](js.Array(this.component, js.Dictionary.empty))()
}
