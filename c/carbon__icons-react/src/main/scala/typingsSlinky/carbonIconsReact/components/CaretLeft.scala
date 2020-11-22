package typingsSlinky.carbonIconsReact.components

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.carbonIconsReact.mod.CarbonIconProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CaretLeft {
  
  @JSImport("@carbon/icons-react/lib/caret--left", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CarbonIconProps with RefAttributes[SVGSVGElement]): SharedBuilder_CarbonIconPropsRefAttributes1348591536[SVGSVGElement] = new SharedBuilder_CarbonIconPropsRefAttributes1348591536[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CaretLeft.type): SharedBuilder_CarbonIconPropsRefAttributes1348591536[SVGSVGElement] = new SharedBuilder_CarbonIconPropsRefAttributes1348591536[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
}
