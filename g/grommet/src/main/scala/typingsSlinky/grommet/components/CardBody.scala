package typingsSlinky.grommet.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.grommet.boxMod.BoxTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardBody {
  
  @JSImport("grommet", "CardBody")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CardBody.type): SharedBuilder_BoxTypes_1397625506[HTMLDivElement] = new SharedBuilder_BoxTypes_1397625506[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BoxTypes): SharedBuilder_BoxTypes_1397625506[HTMLDivElement] = new SharedBuilder_BoxTypes_1397625506[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
