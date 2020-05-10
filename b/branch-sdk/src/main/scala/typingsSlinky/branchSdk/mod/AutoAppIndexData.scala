package typingsSlinky.branchSdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoAppIndexData extends js.Object {
  var androidPackageName: js.UndefOr[String] = js.native
  var androidURL: js.UndefOr[String] = js.native
  var data: js.UndefOr[StringDictionary[CustomLinkData]] = js.native
  var iosAppId: js.UndefOr[String] = js.native
  var iosURL: js.UndefOr[String] = js.native
}

object AutoAppIndexData {
  @scala.inline
  def apply(): AutoAppIndexData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoAppIndexData]
  }
  @scala.inline
  implicit class AutoAppIndexDataOps[Self <: AutoAppIndexData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidPackageName")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidURL")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[CustomLinkData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withIosAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosAppId")(js.undefined)
        ret
    }
    @scala.inline
    def withIosURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosURL")(js.undefined)
        ret
    }
  }
  
}

