package typingsSlinky.carbonPictogramsReact.components

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.carbonPictogramsReact.mod.CarbonPictogramProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overcast {
  
  @JSImport("@carbon/pictograms-react", "Overcast")
  @js.native
  object component extends js.Object
  
  def withProps(p: CarbonPictogramProps with RefAttributes[SVGSVGElement]): SharedBuilder_CarbonPictogramPropsRefAttributes_989792279[SVGSVGElement] = new SharedBuilder_CarbonPictogramPropsRefAttributes_989792279[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Overcast.type): SharedBuilder_CarbonPictogramPropsRefAttributes_989792279[SVGSVGElement] = new SharedBuilder_CarbonPictogramPropsRefAttributes_989792279[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
}
