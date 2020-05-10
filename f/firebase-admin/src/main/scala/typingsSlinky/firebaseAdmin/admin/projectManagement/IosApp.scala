package typingsSlinky.firebaseAdmin.admin.projectManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a Firebase iOS app.
  *
  * Do not call this constructor directly. Instead, use
  * [`projectManagement.iosApp()`](admin.projectManagement.ProjectManagement#iosApp).
  */
@js.native
trait IosApp extends js.Object {
  var appId: String = js.native
  /**
    * Gets the configuration artifact associated with this app.
    *
    * @return A promise that resolves to the iOS app's Firebase
    *     config file, in UTF-8 string format. This string is typically intended to
    *     be written to a plist file that gets shipped with your iOS app.
    */
  def getConfig(): js.Promise[String] = js.native
  /**
    * Retrieves metadata about this iOS app.
    *
    * @return {!Promise<admin.projectManagement.IosAppMetadata>} A promise that
    *     resolves to the retrieved metadata about this iOS app.
    */
  def getMetadata(): js.Promise[IosAppMetadata] = js.native
  /**
    * Sets the optional user-assigned display name of the app.
    *
    * @param newDisplayName The new display name to set.
    *
    * @return A promise that resolves when the display name has
    *     been set.
    */
  def setDisplayName(newDisplayName: String): js.Promise[Unit] = js.native
}

object IosApp {
  @scala.inline
  def apply(
    appId: String,
    getConfig: () => js.Promise[String],
    getMetadata: () => js.Promise[IosAppMetadata],
    setDisplayName: String => js.Promise[Unit]
  ): IosApp = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), getMetadata = js.Any.fromFunction0(getMetadata), setDisplayName = js.Any.fromFunction1(setDisplayName))
    __obj.asInstanceOf[IosApp]
  }
  @scala.inline
  implicit class IosAppOps[Self <: IosApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetConfig(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetadata(value: () => js.Promise[IosAppMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDisplayName(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

