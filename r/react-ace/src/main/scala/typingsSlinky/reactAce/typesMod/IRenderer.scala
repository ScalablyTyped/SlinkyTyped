package typingsSlinky.reactAce.typesMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.aceBuilds.mod.Ace.VirtualRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRenderer extends VirtualRenderer {
  
  var placeholderNode: js.UndefOr[HTMLDivElement] = js.native
  
  var scroller: js.UndefOr[HTMLDivElement] = js.native
}
