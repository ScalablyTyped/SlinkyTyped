package typingsSlinky.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationActivityType extends js.Object
@JSImport("expo-location", "LocationActivityType")
@js.native
object LocationActivityType extends js.Object {
  
  @js.native
  sealed trait Airborne extends LocationActivityType
  
  @js.native
  sealed trait AutomotiveNavigation extends LocationActivityType
  
  @js.native
  sealed trait Fitness extends LocationActivityType
  
  @js.native
  sealed trait Other extends LocationActivityType
  
  @js.native
  sealed trait OtherNavigation extends LocationActivityType
}
