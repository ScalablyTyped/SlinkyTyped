package typingsSlinky.reactNativeFirebaseApp.ReactNativeFirebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseAppOptions
  extends /* name */ StringDictionary[js.Any] {
  /**
    * iOS only - The Android client ID used in Google AppInvite when an iOS app has its Android version, for
    * example "12345.apps.googleusercontent.com".
    */
  var androidClientId: js.UndefOr[String] = js.native
  /**
    * An API key used for authenticating requests from your app, e.g.
    * "AIzaSyDdVgKwhZl0sTTTLZ7iTmt1r3N2cJLnaDk", used to identify your app to Google servers.
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * The Google App ID that is used to uniquely identify an instance of an app.
    */
  var appId: String = js.native
  /**
    * iOS only - The OAuth2 client ID for iOS application used to authenticate Google users, for example
    * "12345.apps.googleusercontent.com", used for signing in with Google.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The database root URL, e.g. "http://abc-xyz-123.firebaseio.com".
    */
  var databaseURL: js.UndefOr[String] = js.native
  /**
    * iOS only - The URL scheme used to set up Durable Deep Link service.
    */
  var deepLinkURLScheme: js.UndefOr[String] = js.native
  /**
    * The tracking ID for Google Analytics, e.g. "UA-12345678-1", used to configure Google Analytics.
    */
  var gaTrackingId: js.UndefOr[String] = js.native
  /**
    * The Project Number from the Google Developer's console, for example "012345678901", used to
    * configure Google Cloud Messaging.
    */
  var messagingSenderId: js.UndefOr[String] = js.native
  /**
    * The Project ID from the Firebase console, for example "abc-xyz-123".
    */
  var projectId: String = js.native
  /**
    * The Google Cloud Storage bucket name, e.g. "abc-xyz-123.storage.firebase.com".
    */
  var storageBucket: js.UndefOr[String] = js.native
}

object FirebaseAppOptions {
  @scala.inline
  def apply(appId: String, projectId: String): FirebaseAppOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseAppOptions]
  }
  @scala.inline
  implicit class FirebaseAppOptionsOps[Self <: FirebaseAppOptions] (val x: Self) extends AnyVal {
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
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseURL")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepLinkURLScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLinkURLScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepLinkURLScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLinkURLScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withGaTrackingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaTrackingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaTrackingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaTrackingId")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagingSenderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagingSenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagingSenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagingSenderId")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageBucket")(js.undefined)
        ret
    }
  }
  
}

