package typingsSlinky.raygun.mod.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunOptions extends js.Object {
  var apiKey: String = js.native
  var filters: js.UndefOr[js.Array[String]] = js.native
  var groupingKey: js.UndefOr[String | GroupingKey] = js.native
  var host: js.UndefOr[String] = js.native
  var innerErrorFieldName: js.UndefOr[String] = js.native
  var isOffline: js.UndefOr[Boolean] = js.native
  var offlineStorage: js.UndefOr[RaygunOfflineStorageProvider[RaygunPayload, String]] = js.native
  var offlineStorageOptions: js.UndefOr[js.Any] = js.native
  var onBeforeSend: js.UndefOr[OnBeforeSend] = js.native
  var port: js.UndefOr[Double] = js.native
  var reportColumnNumbers: js.UndefOr[Boolean] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var useSSL: js.UndefOr[Boolean] = js.native
  var userHumanStringForObject: js.UndefOr[Boolean] = js.native
}

object RaygunOptions {
  @scala.inline
  def apply(apiKey: String): RaygunOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunOptions]
  }
  @scala.inline
  implicit class RaygunOptionsOps[Self <: RaygunOptions] (val x: Self) extends AnyVal {
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
    def withFilters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingKeyFunction5(
      value: (/* payload */ RaygunPayload, /* exception */ js.Error, /* customData */ KeyValueObject, /* request */ RaygunRequest, /* tags */ js.Array[String]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingKey")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withGroupingKey(value: String | GroupingKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerErrorFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerErrorFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerErrorFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerErrorFieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOffline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOffline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOffline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOffline")(js.undefined)
        ret
    }
    @scala.inline
    def withOfflineStorage(value: RaygunOfflineStorageProvider[RaygunPayload, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withOfflineStorageOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineStorageOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineStorageOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineStorageOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeSend(
      value: (/* payload */ RaygunPayload, /* exception */ js.Error, /* customData */ KeyValueObject, /* request */ RaygunRequest, /* tags */ js.Array[String]) => Boolean | RaygunPayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSend")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withReportColumnNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportColumnNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportColumnNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportColumnNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSSL")(js.undefined)
        ret
    }
    @scala.inline
    def withUserHumanStringForObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userHumanStringForObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserHumanStringForObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userHumanStringForObject")(js.undefined)
        ret
    }
  }
  
}

