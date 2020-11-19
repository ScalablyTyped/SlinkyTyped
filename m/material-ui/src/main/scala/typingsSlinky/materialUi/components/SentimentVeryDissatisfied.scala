package typingsSlinky.materialUi.components

import typingsSlinky.materialUi.MaterialUI.SvgIconProps
import typingsSlinky.materialUi.sentimentVeryDissatisfiedMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SentimentVeryDissatisfied {
  
  @JSImport("material-ui/svg-icons/social/sentiment-very-dissatisfied", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps_1073724525[default] = new SharedBuilder_SvgIconProps_1073724525[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SentimentVeryDissatisfied.type): SharedBuilder_SvgIconProps_1073724525[default] = new SharedBuilder_SvgIconProps_1073724525[default](js.Array(this.component, js.Dictionary.empty))()
}
