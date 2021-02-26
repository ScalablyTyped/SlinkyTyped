package typingsSlinky.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dimension extends StObject
@JSImport("itunesconnectanalytics", "dimension")
@js.native
object dimension extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dimension with String] = js.native
  
  @js.native
  sealed trait appVersion extends dimension
  /* "appVersion" */ val appVersion: typingsSlinky.itunesconnectanalytics.mod.dimension.appVersion with String = js.native
  
  @js.native
  sealed trait apps extends dimension
  /* "appReferrer" */ val apps: typingsSlinky.itunesconnectanalytics.mod.dimension.apps with String = js.native
  
  @js.native
  sealed trait campaigns extends dimension
  /* "campaignId" */ val campaigns: typingsSlinky.itunesconnectanalytics.mod.dimension.campaigns with String = js.native
  
  @js.native
  sealed trait device extends dimension
  /* "platform" */ val device: typingsSlinky.itunesconnectanalytics.mod.dimension.device with String = js.native
  
  @js.native
  sealed trait platformVersion extends dimension
  /* "platformVersion" */ val platformVersion: typingsSlinky.itunesconnectanalytics.mod.dimension.platformVersion with String = js.native
  
  @js.native
  sealed trait region extends dimension
  /* "region" */ val region: typingsSlinky.itunesconnectanalytics.mod.dimension.region with String = js.native
  
  @js.native
  sealed trait sourceType extends dimension
  /* "source" */ val sourceType: typingsSlinky.itunesconnectanalytics.mod.dimension.sourceType with String = js.native
  
  @js.native
  sealed trait territory extends dimension
  /* "storefront" */ val territory: typingsSlinky.itunesconnectanalytics.mod.dimension.territory with String = js.native
  
  @js.native
  sealed trait websites extends dimension
  /* "domainReferrer" */ val websites: typingsSlinky.itunesconnectanalytics.mod.dimension.websites with String = js.native
}
