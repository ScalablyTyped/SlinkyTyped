package typingsSlinky.materialToolbar

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialToolbar.foundationMod.MDCToolbarFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/toolbar/component", "MDCToolbar")
  @js.native
  class MDCToolbar protected () extends MDCComponent[MDCToolbarFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCToolbarFoundation, args: js.Any*) = this()
    
    var fixedAdjustElement: HTMLElement | Null = js.native
    
    def initialize(): Unit = js.native
    
    var root_ : HTMLElement = js.native
  }
  /* static members */
  object MDCToolbar {
    
    @JSImport("@material/toolbar/component", "MDCToolbar.attachTo")
    @js.native
    def attachTo(root: Element): MDCToolbar = js.native
  }
}
