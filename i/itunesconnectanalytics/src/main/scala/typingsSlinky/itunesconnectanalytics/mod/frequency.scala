package typingsSlinky.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait frequency extends StObject
@JSImport("itunesconnectanalytics", "frequency")
@js.native
object frequency extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[frequency with String] = js.native
  
  @js.native
  sealed trait days extends frequency
  /* "DAY" */ val days: typingsSlinky.itunesconnectanalytics.mod.frequency.days with String = js.native
  
  @js.native
  sealed trait months extends frequency
  /* "MONTH" */ val months: typingsSlinky.itunesconnectanalytics.mod.frequency.months with String = js.native
  
  @js.native
  sealed trait weeks extends frequency
  /* "WEEK" */ val weeks: typingsSlinky.itunesconnectanalytics.mod.frequency.weeks with String = js.native
}
