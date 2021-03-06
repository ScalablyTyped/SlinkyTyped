package typingsSlinky.fb

import typingsSlinky.fb.FB.LoginStatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FBSDK extends js.Object {
  var Canvas: FBSDKCanvas = js.native
  var Error: FBError = js.native
  var Event: FBSDKEvents = js.native
  var XFBML: FBSDKXFBML = js.native
  /* This method lets you make calls to the Graph API. */
  def api(path: String, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def api(path: String, method: ApiMethod, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def api(
    path: String,
    method: ApiMethod,
    params: js.Any,
    callback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def api(path: String, params: js.Any, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  /* Synchronous accessor for the current authResponse. */
  def getAuthResponse(): js.Object = js.native
  /* Allows you to determine if a user is logged in to Facebook and has authenticated your app */
  def getLoginStatus(handler: js.Function1[/* fbResponseObject */ LoginStatusResponse, _]): Unit = js.native
  def getLoginStatus(handler: js.Function1[/* fbResponseObject */ LoginStatusResponse, _], force: Boolean): Unit = js.native
  /* This method is used to initialize and setup the SDK. */
  def init(fbInitObject: FBInitParams): Unit = js.native
  /* Calling FB.login prompts the user to authenticate your application using the Login Dialog. */
  def login(handler: js.Function1[/* fbResponseObject */ LoginStatusResponse, _]): Unit = js.native
  def login(handler: js.Function1[/* fbResponseObject */ LoginStatusResponse, _], params: FBLoginOptions): Unit = js.native
  /* Log the user out of your site and Facebook */
  def logout(handler: js.Function1[/* fbResponseObject */ js.Object, _]): Unit = js.native
  def ui(params: FeedDialogParams, handler: js.Function1[/* fbResponseObject */ js.Object, _]): Unit = js.native
  def ui(params: LiveDialogParams, handler: js.Function1[/* fbResponseObject */ LiveDialogResponse, _]): Unit = js.native
  def ui(params: PageTabDialogParams, handler: js.Function1[/* fbResponseObject */ js.Object, _]): Unit = js.native
  def ui(params: PayDialogParams, handler: js.Function1[/* fbResponseObject */ js.Object, _]): Unit = js.native
  def ui(params: RequestsDialogParams, handler: js.Function1[/* fbResponseObject */ js.Object, _]): Unit = js.native
  def ui(params: SendDialogParams, handler: js.Function1[/* fbResponseObject */ js.Object, _]): Unit = js.native
  /* These methods are used to trigger different forms of Facebook-created UI dialogs. */
  def ui(params: ShareDialogParams, handler: js.Function1[/* fbResponseObject */ js.Object, _]): Unit = js.native
}

