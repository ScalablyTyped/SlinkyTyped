package typingsSlinky.anyproxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleModule extends js.Object {
  /**
    * When receiving https request, AnyProxy will call beforeDealHttpsRequest with param requestDetail.
    * If configed with forceProxyHttps in launching, AnyProxy will skip calling this method.
    * Only by returning true, AnyProxy will try to replace the certificate and intercept the https request.
    */
  var beforeDealHttpsRequest: js.UndefOr[
    js.Function1[/* requestDetail */ BeforeDealHttpsRequestDetail, MaybePromise[Boolean]]
  ] = js.native
  /** Before sending request to server, AnyProxy will call beforeSendRequest with param requestDetail. */
  var beforeSendRequest: js.UndefOr[
    js.Function1[
      /* requestDetail */ RequestDetail, 
      MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]
    ]
  ] = js.native
  /** Before sending response to client, AnyProxy will call beforeSendResponse with param requestDetail responseDetail. */
  var beforeSendResponse: js.UndefOr[
    js.Function2[
      /* requestDetail */ RequestDetail, 
      /* responseDetail */ ResponseDetail, 
      MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ]
  ] = js.native
  /** AnyProxy will call this method when failed to connect target server in https request. */
  var onConnectError: js.UndefOr[
    js.Function2[
      /* requestDetail */ RequestDetail, 
      /* err */ js.Error, 
      MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ]
  ] = js.native
  /**
    * AnyProxy will call this method when an error happened in request handling.
    * Errors usually are issued during requesting, e.g. DNS failure, request timeout.
    */
  var onError: js.UndefOr[
    js.Function2[
      /* requestDetail */ RequestDetail, 
      /* err */ js.Error, 
      MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ]
  ] = js.native
  /** Introduction of this rule file. AnyProxy will read this field and give some tip to user. */
  var summary: js.UndefOr[String] = js.native
}

object RuleModule {
  @scala.inline
  def apply(): RuleModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleModule]
  }
  @scala.inline
  implicit class RuleModuleOps[Self <: RuleModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeDealHttpsRequest(value: /* requestDetail */ BeforeDealHttpsRequestDetail => MaybePromise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDealHttpsRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDealHttpsRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDealHttpsRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSendRequest(
      value: /* requestDetail */ RequestDetail => MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSendRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSendRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSendRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSendResponse(
      value: (/* requestDetail */ RequestDetail, /* responseDetail */ ResponseDetail) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSendResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSendResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSendResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnectError(
      value: (/* requestDetail */ RequestDetail, /* err */ js.Error) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnConnectError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnectError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(
      value: (/* requestDetail */ RequestDetail, /* err */ js.Error) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

