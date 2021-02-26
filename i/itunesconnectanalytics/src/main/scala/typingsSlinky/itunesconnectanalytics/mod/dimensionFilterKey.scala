package typingsSlinky.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dimensionFilterKey extends StObject
@JSImport("itunesconnectanalytics", "dimensionFilterKey")
@js.native
object dimensionFilterKey extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dimensionFilterKey with String] = js.native
  
  @js.native
  sealed trait appPurchaseWeek extends dimensionFilterKey
  /* "apppurchaseWeek" */ val appPurchaseWeek: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.appPurchaseWeek with String = js.native
  
  @js.native
  sealed trait appVersion extends dimensionFilterKey
  /* "appVersion" */ val appVersion: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.appVersion with String = js.native
  
  @js.native
  sealed trait apppurchaseDay extends dimensionFilterKey
  /* "apppurchaseDay" */ val apppurchaseDay: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.apppurchaseDay with String = js.native
  
  @js.native
  sealed trait apppurchaseMonth extends dimensionFilterKey
  /* "apppurchaseMonth" */ val apppurchaseMonth: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.apppurchaseMonth with String = js.native
  
  @js.native
  sealed trait campaigns extends dimensionFilterKey
  /* "campaignId" */ val campaigns: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.campaigns with String = js.native
  
  @js.native
  sealed trait device extends dimensionFilterKey
  /* "platform" */ val device: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.device with String = js.native
  
  @js.native
  sealed trait platformVersion extends dimensionFilterKey
  /* "platformVersion" */ val platformVersion: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.platformVersion with String = js.native
  
  @js.native
  sealed trait region extends dimensionFilterKey
  /* "region" */ val region: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.region with String = js.native
  
  @js.native
  sealed trait territory extends dimensionFilterKey
  /* "storefront" */ val territory: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.territory with String = js.native
  
  @js.native
  sealed trait websites extends dimensionFilterKey
  /* "domainReferrer" */ val websites: typingsSlinky.itunesconnectanalytics.mod.dimensionFilterKey.websites with String = js.native
}
