package typingsSlinky.grommet.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.grommet.boxMod.BoxTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("grommet/es6", "Header")
  @js.native
  object component extends js.Object
  
  def withProps(p: BoxTypes): SharedBuilder_BoxTypes_1397625506[HTMLDivElement] = new SharedBuilder_BoxTypes_1397625506[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Header.type): SharedBuilder_BoxTypes_1397625506[HTMLDivElement] = new SharedBuilder_BoxTypes_1397625506[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
}
