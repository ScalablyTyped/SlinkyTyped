package typingsSlinky.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait measures extends StObject
@JSImport("itunesconnectanalytics", "measures")
@js.native
object measures extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[measures with String] = js.native
  
  @js.native
  sealed trait activeDevices extends measures
  /* "activeDevices" */ val activeDevices: typingsSlinky.itunesconnectanalytics.mod.measures.activeDevices with String = js.native
  
  @js.native
  sealed trait activeLast30days extends measures
  /* "rollingActiveDevices" */ val activeLast30days: typingsSlinky.itunesconnectanalytics.mod.measures.activeLast30days with String = js.native
  
  @js.native
  sealed trait crashes extends measures
  /* "crashes" */ val crashes: typingsSlinky.itunesconnectanalytics.mod.measures.crashes with String = js.native
  
  @js.native
  sealed trait iap extends measures
  /* "iap" */ val iap: typingsSlinky.itunesconnectanalytics.mod.measures.iap with String = js.native
  
  @js.native
  sealed trait impressions extends measures
  /* "impressionsTotal" */ val impressions: typingsSlinky.itunesconnectanalytics.mod.measures.impressions with String = js.native
  
  @js.native
  sealed trait impressionsUnique extends measures
  /* "impressionsTotalUnique" */ val impressionsUnique: typingsSlinky.itunesconnectanalytics.mod.measures.impressionsUnique with String = js.native
  
  @js.native
  sealed trait installs extends measures
  /* "installs" */ val installs: typingsSlinky.itunesconnectanalytics.mod.measures.installs with String = js.native
  
  @js.native
  sealed trait pageViewUnique extends measures
  /* "pageViewUnique" */ val pageViewUnique: typingsSlinky.itunesconnectanalytics.mod.measures.pageViewUnique with String = js.native
  
  @js.native
  sealed trait pageViews extends measures
  /* "pageViewCount" */ val pageViews: typingsSlinky.itunesconnectanalytics.mod.measures.pageViews with String = js.native
  
  @js.native
  sealed trait payingUsers extends measures
  /* "payingUsers" */ val payingUsers: typingsSlinky.itunesconnectanalytics.mod.measures.payingUsers with String = js.native
  
  @js.native
  sealed trait sales extends measures
  /* "sales" */ val sales: typingsSlinky.itunesconnectanalytics.mod.measures.sales with String = js.native
  
  @js.native
  sealed trait sessions extends measures
  /* "sessions" */ val sessions: typingsSlinky.itunesconnectanalytics.mod.measures.sessions with String = js.native
  
  @js.native
  sealed trait uninstalls extends measures
  /* "uninstalls" */ val uninstalls: typingsSlinky.itunesconnectanalytics.mod.measures.uninstalls with String = js.native
  
  @js.native
  sealed trait units extends measures
  /* "units" */ val units: typingsSlinky.itunesconnectanalytics.mod.measures.units with String = js.native
}
