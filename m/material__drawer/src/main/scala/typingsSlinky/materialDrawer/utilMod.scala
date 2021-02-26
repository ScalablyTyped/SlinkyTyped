package typingsSlinky.materialDrawer

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialDom.focusTrapMod.FocusOptions
import typingsSlinky.materialDom.focusTrapMod.FocusTrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/drawer/util", "createFocusTrapInstance")
  @js.native
  def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDrawerFocusTrapFactory): FocusTrap = js.native
  
  type MDCDrawerFocusTrapFactory = js.Function2[/* element */ HTMLElement, /* options */ FocusOptions, FocusTrap]
}
