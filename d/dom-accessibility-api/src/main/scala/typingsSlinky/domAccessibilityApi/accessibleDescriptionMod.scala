package typingsSlinky.domAccessibilityApi

import org.scalajs.dom.raw.Element
import typingsSlinky.domAccessibilityApi.accessibleNameAndDescriptionMod.ComputeTextAlternativeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dom-accessibility-api/dist/accessible-description", JSImport.Namespace)
@js.native
object accessibleDescriptionMod extends js.Object {
  
  def computeAccessibleDescription(root: Element): String = js.native
  def computeAccessibleDescription(root: Element, options: ComputeTextAlternativeOptions): String = js.native
}
