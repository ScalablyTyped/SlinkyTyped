package typingsSlinky.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WeekDay extends StObject
@JSImport("@angular/common", "WeekDay")
@js.native
object WeekDay extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDay with Double] = js.native
  
  @js.native
  sealed trait Friday extends WeekDay
  /* 5 */ val Friday: typingsSlinky.angularCommon.mod.WeekDay.Friday with Double = js.native
  
  @js.native
  sealed trait Monday extends WeekDay
  /* 1 */ val Monday: typingsSlinky.angularCommon.mod.WeekDay.Monday with Double = js.native
  
  @js.native
  sealed trait Saturday extends WeekDay
  /* 6 */ val Saturday: typingsSlinky.angularCommon.mod.WeekDay.Saturday with Double = js.native
  
  @js.native
  sealed trait Sunday extends WeekDay
  /* 0 */ val Sunday: typingsSlinky.angularCommon.mod.WeekDay.Sunday with Double = js.native
  
  @js.native
  sealed trait Thursday extends WeekDay
  /* 4 */ val Thursday: typingsSlinky.angularCommon.mod.WeekDay.Thursday with Double = js.native
  
  @js.native
  sealed trait Tuesday extends WeekDay
  /* 2 */ val Tuesday: typingsSlinky.angularCommon.mod.WeekDay.Tuesday with Double = js.native
  
  @js.native
  sealed trait Wednesday extends WeekDay
  /* 3 */ val Wednesday: typingsSlinky.angularCommon.mod.WeekDay.Wednesday with Double = js.native
}
