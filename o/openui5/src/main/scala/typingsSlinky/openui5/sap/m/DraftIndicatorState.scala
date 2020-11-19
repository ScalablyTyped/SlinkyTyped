package typingsSlinky.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DraftIndicatorState extends js.Object
/**
  * Enum for the state of sap.m.DraftIndicator control.
  */
@JSGlobal("sap.m.DraftIndicatorState")
@js.native
object DraftIndicatorState extends js.Object {
  
  @js.native
  sealed trait Clear extends DraftIndicatorState
  
  @js.native
  sealed trait Saved extends DraftIndicatorState
  
  @js.native
  sealed trait Saving extends DraftIndicatorState
}
