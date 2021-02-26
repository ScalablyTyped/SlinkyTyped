package typingsSlinky.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLScriptElement
import typingsSlinky.firebaseAnalytics.anon.GtagCore
import typingsSlinky.firebaseAnalyticsTypes.mod.DataLayer
import typingsSlinky.firebaseAnalyticsTypes.mod.DynamicConfig
import typingsSlinky.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@firebase/analytics/dist/src/helpers", "findGtagScriptOnPage")
  @js.native
  def findGtagScriptOnPage(): HTMLScriptElement | Null = js.native
  
  @JSImport("@firebase/analytics/dist/src/helpers", "getOrCreateDataLayer")
  @js.native
  def getOrCreateDataLayer(dataLayerName: String): DataLayer = js.native
  
  @JSImport("@firebase/analytics/dist/src/helpers", "insertScriptTag")
  @js.native
  def insertScriptTag(dataLayerName: String): Unit = js.native
  
  @JSImport("@firebase/analytics/dist/src/helpers", "wrapOrCreateGtag")
  @js.native
  def wrapOrCreateGtag(
    initializationPromisesMap: StringDictionary[js.Promise[String]],
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    measurementIdToAppId: StringDictionary[String],
    dataLayerName: String,
    gtagFunctionName: String
  ): GtagCore = js.native
}
