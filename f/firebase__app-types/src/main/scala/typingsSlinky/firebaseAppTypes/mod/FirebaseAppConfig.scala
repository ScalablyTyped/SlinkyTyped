package typingsSlinky.firebaseAppTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseAppConfig extends js.Object {
  var automaticDataCollectionEnabled: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
}

object FirebaseAppConfig {
  @scala.inline
  def apply(): FirebaseAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseAppConfig]
  }
  @scala.inline
  implicit class FirebaseAppConfigOps[Self <: FirebaseAppConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticDataCollectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticDataCollectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticDataCollectionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticDataCollectionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

