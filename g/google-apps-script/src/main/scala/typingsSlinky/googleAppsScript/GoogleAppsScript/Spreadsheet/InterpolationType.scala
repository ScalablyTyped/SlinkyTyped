package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InterpolationType extends StObject
/**
  * An enumeration representing the interpolation options for calculating a value to be used in a
  * GradientCondition in a ConditionalFormatRule.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.InterpolationType")
@js.native
object InterpolationType extends StObject {
  
  @js.native
  sealed trait MAX extends InterpolationType
  
  @js.native
  sealed trait MIN extends InterpolationType
  
  @js.native
  sealed trait NUMBER extends InterpolationType
  
  @js.native
  sealed trait PERCENT extends InterpolationType
  
  @js.native
  sealed trait PERCENTILE extends InterpolationType
}
