package typingsSlinky.expo

import typingsSlinky.expo.anon.EventListener
import typingsSlinky.expo.expoBooleans.`true`
import typingsSlinky.expo.updatesMod.UpdateCheckResult
import typingsSlinky.expo.updatesMod.UpdateFetchResult
import typingsSlinky.expoLinking.anon.Key
import typingsSlinky.expoLinking.linkingTypesMod.ParsedURL
import typingsSlinky.expoLinking.linkingTypesMod.QueryParams
import typingsSlinky.expoLinking.linkingTypesMod.URLListener
import typingsSlinky.fbemitter.mod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/deprecated.web", JSImport.Namespace)
@js.native
object deprecatedWebMod extends js.Object {
  @js.native
  object Linking extends js.Object {
    def addEventListener(`type`: String, handler: URLListener): Unit = js.native
    def canOpenURL(url: String): js.Promise[Boolean] = js.native
    def getInitialURL(): js.Promise[String | Null] = js.native
    def makeUrl(): String = js.native
    def makeUrl(path: js.UndefOr[scala.Nothing], queryParams: QueryParams): String = js.native
    def makeUrl(path: String): String = js.native
    def makeUrl(path: String, queryParams: QueryParams): String = js.native
    def openSettings(): js.Promise[Unit] = js.native
    def openURL(url: String): js.Promise[`true`] = js.native
    def parse(url: String): ParsedURL = js.native
    def parseInitialURLAsync(): js.Promise[ParsedURL] = js.native
    def removeEventListener(`type`: String, handler: URLListener): Unit = js.native
    def sendIntent(action: String): js.Promise[Unit] = js.native
    def sendIntent(action: String, extras: js.Array[Key]): js.Promise[Unit] = js.native
    def useUrl(): String | Null = js.native
  }
  
  @js.native
  object Updates extends js.Object {
    def addListener(listener: js.Function): EventSubscription = js.native
    def checkForUpdateAsync(): js.Promise[UpdateCheckResult] = js.native
    def clearUpdateCacheExperimentalAsync(abiVersion: String): js.Promise[Unit] = js.native
    def fetchUpdateAsync(): js.Promise[UpdateFetchResult] = js.native
    def fetchUpdateAsync(hasEventListener: EventListener): js.Promise[UpdateFetchResult] = js.native
    def reload(): js.Promise[Unit] = js.native
    def reloadFromCache(): js.Promise[Unit] = js.native
    @js.native
    object EventType extends js.Object {
      var DOWNLOAD_FINISHED: String = js.native
      var DOWNLOAD_PROGRESS: String = js.native
      var DOWNLOAD_STARTED: String = js.native
      var ERROR: String = js.native
      var NO_UPDATE_AVAILABLE: String = js.native
    }
    
  }
  
}

