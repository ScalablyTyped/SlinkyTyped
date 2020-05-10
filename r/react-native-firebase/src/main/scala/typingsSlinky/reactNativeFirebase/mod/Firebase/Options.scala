package typingsSlinky.reactNativeFirebase.mod.Firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var apiKey: String = js.native
  var appId: String = js.native
  var databaseURL: String = js.native
  var messagingSenderId: String = js.native
  var projectId: String = js.native
  var storageBucket: String = js.native
}

object Options {
  @scala.inline
  def apply(
    apiKey: String,
    appId: String,
    databaseURL: String,
    messagingSenderId: String,
    projectId: String,
    storageBucket: String
  ): Options = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], databaseURL = databaseURL.asInstanceOf[js.Any], messagingSenderId = messagingSenderId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], storageBucket = storageBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessagingSenderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagingSenderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageBucket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

