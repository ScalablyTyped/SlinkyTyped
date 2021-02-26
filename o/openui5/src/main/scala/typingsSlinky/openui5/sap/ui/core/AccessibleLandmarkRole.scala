package typingsSlinky.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccessibleLandmarkRole extends StObject
/**
  * Defines the accessible landmark roles for ARIA support. This enumeration is used with the
  * AccessibleRole control property.For more information, goto "Roles for Accessible Rich Internet
  * Applications (WAI-ARIA Roles)" at the www.w3.org homepage.
  */
@JSGlobal("sap.ui.core.AccessibleLandmarkRole")
@js.native
object AccessibleLandmarkRole extends StObject {
  
  @js.native
  sealed trait Banner extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Complementary extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Main extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Navigation extends AccessibleLandmarkRole
  
  @js.native
  sealed trait None extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Region extends AccessibleLandmarkRole
  
  @js.native
  sealed trait Search extends AccessibleLandmarkRole
}
