package typingsSlinky.materialGridList

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialGridList.foundationMod.MDCGridListFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/grid-list/component", "MDCGridList")
  @js.native
  class MDCGridList protected () extends MDCComponent[MDCGridListFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCGridListFoundation, args: js.Any*) = this()
  }
  /* static members */
  object MDCGridList {
    
    @JSImport("@material/grid-list/component", "MDCGridList.attachTo")
    @js.native
    def attachTo(root: Element): MDCGridList = js.native
  }
}
