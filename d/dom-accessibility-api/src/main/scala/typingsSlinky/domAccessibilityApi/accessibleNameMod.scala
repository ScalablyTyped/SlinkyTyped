package typingsSlinky.domAccessibilityApi

import org.scalajs.dom.raw.Element
import typingsSlinky.domAccessibilityApi.accessibleNameAndDescriptionMod.ComputeTextAlternativeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dom-accessibility-api/dist/accessible-name", JSImport.Namespace)
@js.native
object accessibleNameMod extends js.Object {
  
  def computeAccessibleName(root: Element): String = js.native
  def computeAccessibleName(root: Element, options: ComputeTextAlternativeOptions): String = js.native
}
