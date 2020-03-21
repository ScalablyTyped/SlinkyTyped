package typingsSlinky.ngFacebook

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.facebookJsSdk.facebook.AddPageTabDialogParams
import typingsSlinky.facebookJsSdk.facebook.CollectionAdsDialogParams
import typingsSlinky.facebookJsSdk.facebook.CreateOfferDialogParams
import typingsSlinky.facebookJsSdk.facebook.GameRequestDialogParams
import typingsSlinky.facebookJsSdk.facebook.InitParams
import typingsSlinky.facebookJsSdk.facebook.InstantExperiencesAdsDialogParams
import typingsSlinky.facebookJsSdk.facebook.InstantExperiencesPreviewDialogParams
import typingsSlinky.facebookJsSdk.facebook.LeadgenDialogParams
import typingsSlinky.facebookJsSdk.facebook.LiveDialogParams
import typingsSlinky.facebookJsSdk.facebook.PayDialogParams
import typingsSlinky.facebookJsSdk.facebook.PaymentsLiteDialogParams
import typingsSlinky.facebookJsSdk.facebook.SendDialogParams
import typingsSlinky.facebookJsSdk.facebook.ShareDialogParams
import typingsSlinky.facebookJsSdk.facebook.ShareOpenGraphDialogParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object ngFacebook extends js.Object {
    @js.native
    trait IFacebookProvider extends js.Object {
      def getAppId(): String = js.native
      def getCustomInit(): InitParams = js.native
      def getPermissions(): String = js.native
      def getVersion(): String = js.native
      def setAppId(appId: String): IFacebookProvider = js.native
      def setCustomInit(customInit: PartialInitParams): IFacebookProvider = js.native
      def setPermissions(permissions: String): IFacebookProvider = js.native
      def setPermissions(permissions: js.Array[String]): IFacebookProvider = js.native
      def setVersion(version: String): IFacebookProvider = js.native
    }
    
    @js.native
    trait IFacebookService extends js.Object {
      def api(path: String): IPromise[js.Object] = js.native
      def api(path: String, method: String): IPromise[js.Object] = js.native
      def api(path: String, method: String, params: js.Object): IPromise[js.Object] = js.native
      def api(path: String, params: js.Object): IPromise[js.Object] = js.native
      def cachedApi(path: String): IPromise[_] = js.native
      def clearCache(): Unit = js.native
      def config[T /* <: String | Double | InitParams */](property: String): T = js.native
      def getAuthResponse(): js.Object = js.native
      def getCache[T](attr: String): T = js.native
      def getLoginStatus(): IPromise[js.Object] = js.native
      def getLoginStatus(force: Boolean): IPromise[js.Object] = js.native
      def init(): Unit = js.native
      def isConnected(): Boolean = js.native
      def login(): IPromise[js.Object] = js.native
      def login(permissions: String): IPromise[js.Object] = js.native
      def login(permissions: String, rerequest: Boolean): IPromise[js.Object] = js.native
      def logout(): IPromise[Unit] = js.native
      def setCache[T](attr: String, `val`: T): Unit = js.native
      def ui(params: FBUIParams): IPromise[_] = js.native
    }
    
    type FBUIParams = ShareDialogParams | ShareOpenGraphDialogParams | AddPageTabDialogParams | GameRequestDialogParams | SendDialogParams | PayDialogParams | PaymentsLiteDialogParams | LiveDialogParams | CreateOfferDialogParams | LeadgenDialogParams | InstantExperiencesAdsDialogParams | InstantExperiencesPreviewDialogParams | CollectionAdsDialogParams
  }
  
}

