package typingsSlinky.domAccessibilityApi

import org.scalajs.dom.raw.Element
import typingsSlinky.domAccessibilityApi.accessibleNameAndDescriptionMod.ComputeTextAlternativeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dom-accessibility-api/dist", "computeAccessibleDescription")
  @js.native
  def computeAccessibleDescription(root: Element): String = js.native
  @JSImport("dom-accessibility-api/dist", "computeAccessibleDescription")
  @js.native
  def computeAccessibleDescription(root: Element, options: ComputeTextAlternativeOptions): String = js.native
  
  @JSImport("dom-accessibility-api/dist", "computeAccessibleName")
  @js.native
  def computeAccessibleName(root: Element): String = js.native
  @JSImport("dom-accessibility-api/dist", "computeAccessibleName")
  @js.native
  def computeAccessibleName(root: Element, options: ComputeTextAlternativeOptions): String = js.native
  
  @JSImport("dom-accessibility-api/dist", "getRole")
  @js.native
  def getRole(element: Element): String | Null = js.native
}
