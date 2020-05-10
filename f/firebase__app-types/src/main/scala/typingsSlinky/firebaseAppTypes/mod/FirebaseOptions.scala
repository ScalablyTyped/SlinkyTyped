package typingsSlinky.firebaseAppTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseOptions extends js.Object {
  var apiKey: js.UndefOr[String] = js.native
  var appId: js.UndefOr[String] = js.native
  var authDomain: js.UndefOr[String] = js.native
  var databaseURL: js.UndefOr[String] = js.native
  var measurementId: js.UndefOr[String] = js.native
  var messagingSenderId: js.UndefOr[String] = js.native
  var projectId: js.UndefOr[String] = js.native
  var storageBucket: js.UndefOr[String] = js.native
}

object FirebaseOptions {
  @scala.inline
  def apply(): FirebaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseOptions]
  }
  @scala.inline
  implicit class FirebaseOptionsOps[Self <: FirebaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authDomain")(js.undefined)
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
    def withMeasurementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasurementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementId")(js.undefined)
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
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
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

