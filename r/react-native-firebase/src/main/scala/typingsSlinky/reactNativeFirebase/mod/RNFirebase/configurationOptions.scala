package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pass custom options by passing an object with configuration options.
  * The configuration object will be generated first by the native configuration object, if set and then will be overridden if passed in JS.
  * That is, all of the following key/value pairs are optional if the native configuration is set.
  */
@js.native
trait configurationOptions extends js.Object {
  /**
    * default ""
    * The secret iOS API key used for authenticating requests from our app
    */
  var APIKey: js.UndefOr[String] = js.native
  /**
    * default  ""
    * The Project number from the Google Developer's console used to configure Google Cloud Messaging
    */
  var GCMSenderID: js.UndefOr[String] = js.native
  /**
    * default ""
    * The Android client ID used in Google AppInvite when an iOS app has it's android version
    */
  var androidClientID: js.UndefOr[String] = js.native
  /**
    * Default from app [NSBundle mainBundle]  The bundle ID for the app to be bundled with
    */
  var bundleID: js.UndefOr[String] = js.native
  /**
    * default ""
    * The OAuth2 client ID for iOS application used to authenticate Google Users for signing in with Google
    */
  var clientID: js.UndefOr[String] = js.native
  /**
    * default ""
    * The database root (i.e. https://my-app.firebaseio.com)
    */
  var databaseURL: js.UndefOr[String] = js.native
  /**
    *  default false
    *  When set to true, RNFirebase will log messages to the console and fire debug events we can listen to in js
    * @usage
    * firebase.on('debug', msg => console.log('Received debug message', msg))
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * default ""
    * URL scheme to set up durable deep link service
    */
  var deepLinkURLScheme: js.UndefOr[String] = js.native
  /**
    * default ""
    * The Google App ID that is used to uniquely identify an instance of an app.
    */
  var googleAppID: js.UndefOr[String] = js.native
  /**
    * default false
    * When set to true, database persistence will be enabled.
    */
  var persistence: js.UndefOr[Boolean] = js.native
  /**
    * default ""
    * The Google Cloud storage bucket name
    */
  var storageBucket: js.UndefOr[String] = js.native
  /**
    * default ""
    * The tracking ID for Google Analytics
    */
  var trackingID: js.UndefOr[String] = js.native
}

object configurationOptions {
  @scala.inline
  def apply(): configurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[configurationOptions]
  }
  @scala.inline
  implicit class configurationOptionsOps[Self <: configurationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPIKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAPIKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGCMSenderID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GCMSenderID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGCMSenderID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GCMSenderID")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidClientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidClientID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidClientID")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleID")(js.undefined)
        ret
    }
    @scala.inline
    def withClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientID")(js.undefined)
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
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
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
    def withGoogleAppID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAppID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleAppID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAppID")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence")(js.undefined)
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
    @scala.inline
    def withTrackingID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingID")(js.undefined)
        ret
    }
  }
  
}

