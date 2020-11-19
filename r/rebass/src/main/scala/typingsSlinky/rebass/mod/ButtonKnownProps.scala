package typingsSlinky.rebass.mod

import typingsSlinky.rebass.rebassStrings.fontWeights
import typingsSlinky.styledSystem.mod.FontWeightProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.styledSystem.mod.ButtonStyleProps because var conflicts: variant. Inlined  */ @js.native
trait ButtonKnownProps
  extends BoxKnownProps
     with FontWeightProps[RequiredTheme, ThemeValue[fontWeights, RequiredTheme, js.Any]]
object ButtonKnownProps {
  
  @scala.inline
  def apply(): ButtonKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonKnownProps]
  }
}
