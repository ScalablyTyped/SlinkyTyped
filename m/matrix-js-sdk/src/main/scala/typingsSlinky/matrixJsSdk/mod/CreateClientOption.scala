package typingsSlinky.matrixJsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.matrixJsSdk.AnonGetAccessToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClientOption extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var cryptoCallbacks: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]] = js.native
  var cryptoStore: js.UndefOr[js.Any] = js.native
  var deviceId: js.UndefOr[String] = js.native
  var deviceToImport: js.UndefOr[js.Any] = js.native
  var fallbackICEServerAllowed: js.UndefOr[Boolean] = js.native
  var forceTURN: js.UndefOr[Boolean] = js.native
  var idBaseUrl: js.UndefOr[String] = js.native
  var identityServer: js.UndefOr[AnonGetAccessToken] = js.native
  var localTimeoutMs: js.UndefOr[Double] = js.native
  var queryParams: js.UndefOr[js.Any] = js.native
  var request: js.UndefOr[js.Any] = js.native
  var scheduler: js.UndefOr[MatrixScheduler] = js.native
  var store: js.UndefOr[MatrixStore] = js.native
  var timelineSupport: js.UndefOr[Boolean] = js.native
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.native
  var useAuthorizationHeader: js.UndefOr[Boolean] = js.native
  var userId: js.UndefOr[String] = js.native
  var verificationMethods: js.UndefOr[js.Array[String]] = js.native
}

object CreateClientOption {
  @scala.inline
  def apply(): CreateClientOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientOption]
  }
  @scala.inline
  implicit class CreateClientOptionOps[Self <: CreateClientOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCryptoCallbacks(value: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoCallbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withCryptoStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoStore")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceToImport(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceToImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceToImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceToImport")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackICEServerAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackICEServerAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackICEServerAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackICEServerAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withForceTURN(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceTURN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceTURN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceTURN")(js.undefined)
        ret
    }
    @scala.inline
    def withIdBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityServer(value: AnonGetAccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityServer")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalTimeoutMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTimeoutMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalTimeoutMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTimeoutMs")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduler(value: MatrixScheduler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: MatrixStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withTimelineSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimelineSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withUnstableClientRelationAggregation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstableClientRelationAggregation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnstableClientRelationAggregation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstableClientRelationAggregation")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAuthorizationHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAuthorizationHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAuthorizationHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAuthorizationHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationMethods")(js.undefined)
        ret
    }
  }
  
}

