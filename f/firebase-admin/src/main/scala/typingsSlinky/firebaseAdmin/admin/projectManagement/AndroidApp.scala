package typingsSlinky.firebaseAdmin.admin.projectManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a Firebase Android app.
  *
  * Do not call this constructor directly. Instead, use
  * [`projectManagement.androidApp()`](admin.projectManagement.ProjectManagement#androidApp).
  */
@js.native
trait AndroidApp extends js.Object {
  var appId: String = js.native
  /**
    * Adds the given SHA certificate to this Android app.
    *
    * @param certificateToAdd The SHA certificate to add.
    *
    * @return A promise that resolves when the given certificate
    *     has been added to the Android app.
    */
  def addShaCertificate(certificateToAdd: ShaCertificate): js.Promise[Unit] = js.native
  /**
    * Deletes the specified SHA certificate from this Android app.
    *
    * @param  certificateToDelete The SHA certificate to delete.
    *
    * @return A promise that resolves when the specified
    *     certificate has been removed from the Android app.
    */
  def deleteShaCertificate(certificateToRemove: ShaCertificate): js.Promise[Unit] = js.native
  /**
    * Gets the configuration artifact associated with this app.
    *
    * @return A promise that resolves to the Android app's
    *     Firebase config file, in UTF-8 string format. This string is typically
    *     intended to be written to a JSON file that gets shipped with your Android
    *     app.
    */
  def getConfig(): js.Promise[String] = js.native
  /**
    * Retrieves metadata about this Android app.
    *
    * @return A promise that resolves to the retrieved metadata about this Android app.
    */
  def getMetadata(): js.Promise[AndroidAppMetadata] = js.native
  /**
    * Gets the list of SHA certificates associated with this Android app in Firebase.
    *
    * @return The list of SHA-1 and SHA-256 certificates associated with this Android app in
    *     Firebase.
    */
  def getShaCertificates(): js.Promise[js.Array[ShaCertificate]] = js.native
  /**
    * Sets the optional user-assigned display name of the app.
    *
    * @param newDisplayName The new display name to set.
    *
    * @return A promise that resolves when the display name has been set.
    */
  def setDisplayName(newDisplayName: String): js.Promise[Unit] = js.native
}

object AndroidApp {
  @scala.inline
  def apply(
    addShaCertificate: ShaCertificate => js.Promise[Unit],
    appId: String,
    deleteShaCertificate: ShaCertificate => js.Promise[Unit],
    getConfig: () => js.Promise[String],
    getMetadata: () => js.Promise[AndroidAppMetadata],
    getShaCertificates: () => js.Promise[js.Array[ShaCertificate]],
    setDisplayName: String => js.Promise[Unit]
  ): AndroidApp = {
    val __obj = js.Dynamic.literal(addShaCertificate = js.Any.fromFunction1(addShaCertificate), appId = appId.asInstanceOf[js.Any], deleteShaCertificate = js.Any.fromFunction1(deleteShaCertificate), getConfig = js.Any.fromFunction0(getConfig), getMetadata = js.Any.fromFunction0(getMetadata), getShaCertificates = js.Any.fromFunction0(getShaCertificates), setDisplayName = js.Any.fromFunction1(setDisplayName))
    __obj.asInstanceOf[AndroidApp]
  }
  @scala.inline
  implicit class AndroidAppOps[Self <: AndroidApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddShaCertificate(value: ShaCertificate => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addShaCertificate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteShaCertificate(value: ShaCertificate => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteShaCertificate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetConfig(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetadata(value: () => js.Promise[AndroidAppMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetShaCertificates(value: () => js.Promise[js.Array[ShaCertificate]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShaCertificates")(js.Any.fromFunction0(value))
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

