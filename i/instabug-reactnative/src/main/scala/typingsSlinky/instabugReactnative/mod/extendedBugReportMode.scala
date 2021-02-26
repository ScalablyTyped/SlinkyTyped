package typingsSlinky.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait extendedBugReportMode extends StObject
@JSImport("instabug-reactnative", "extendedBugReportMode")
@js.native
object extendedBugReportMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[extendedBugReportMode with Double] = js.native
  
  @js.native
  sealed trait disabled extends extendedBugReportMode
  /* 2 */ val disabled: typingsSlinky.instabugReactnative.mod.extendedBugReportMode.disabled with Double = js.native
  
  @js.native
  sealed trait enabledWithOptionalFields extends extendedBugReportMode
  /* 1 */ val enabledWithOptionalFields: typingsSlinky.instabugReactnative.mod.extendedBugReportMode.enabledWithOptionalFields with Double = js.native
  
  @js.native
  sealed trait enabledWithRequiredFields extends extendedBugReportMode
  /* 0 */ val enabledWithRequiredFields: typingsSlinky.instabugReactnative.mod.extendedBugReportMode.enabledWithRequiredFields with Double = js.native
}
