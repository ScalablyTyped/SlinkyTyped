package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the Instance resource.
  */
@js.native
trait SchemaInstance extends js.Object {
  /**
    * URI which shows where a user can acquire this instance.
    */
  var acquisitionUri: js.UndefOr[String] = js.native
  /**
    * Platform dependent details for Android.
    */
  var androidInstance: js.UndefOr[SchemaInstanceAndroidDetails] = js.native
  /**
    * Platform dependent details for iOS.
    */
  var iosInstance: js.UndefOr[SchemaInstanceIosDetails] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instance.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Localized display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The platform type. Possible values are:   - &quot;ANDROID&quot; -
    * Instance is for Android.  - &quot;IOS&quot; - Instance is for iOS  -
    * &quot;WEB_APP&quot; - Instance is for Web App.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * Flag to show if this game instance supports realtime play.
    */
  var realtimePlay: js.UndefOr[Boolean] = js.native
  /**
    * Flag to show if this game instance supports turn based play.
    */
  var turnBasedPlay: js.UndefOr[Boolean] = js.native
  /**
    * Platform dependent details for Web.
    */
  var webInstance: js.UndefOr[SchemaInstanceWebDetails] = js.native
}

object SchemaInstance {
  @scala.inline
  def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  @scala.inline
  implicit class SchemaInstanceOps[Self <: SchemaInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquisitionUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquisitionUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquisitionUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquisitionUri")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidInstance(value: SchemaInstanceAndroidDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withIosInstance(value: SchemaInstanceIosDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    @scala.inline
    def withPlatformType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtimePlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtimePlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtimePlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtimePlay")(js.undefined)
        ret
    }
    @scala.inline
    def withTurnBasedPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("turnBasedPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTurnBasedPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("turnBasedPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withWebInstance(value: SchemaInstanceWebDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webInstance")(js.undefined)
        ret
    }
  }
  
}

