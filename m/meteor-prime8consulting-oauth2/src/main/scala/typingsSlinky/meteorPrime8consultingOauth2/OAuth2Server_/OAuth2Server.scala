package typingsSlinky.meteorPrime8consultingOauth2.OAuth2Server_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Server extends js.Object {
  var callMethod: CallMethod = js.native
  var collections: Collections = js.native
  var methodNames: MethodNames = js.native
  var oauthserver: js.Any = js.native
  var pubSubNames: PubSubNames = js.native
  var subscribeTo: SubscribeTo = js.native
}

object OAuth2Server {
  @scala.inline
  def apply(
    callMethod: CallMethod,
    collections: Collections,
    methodNames: MethodNames,
    oauthserver: js.Any,
    pubSubNames: PubSubNames,
    subscribeTo: SubscribeTo
  ): OAuth2Server = {
    val __obj = js.Dynamic.literal(callMethod = callMethod.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], methodNames = methodNames.asInstanceOf[js.Any], oauthserver = oauthserver.asInstanceOf[js.Any], pubSubNames = pubSubNames.asInstanceOf[js.Any], subscribeTo = subscribeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Server]
  }
  @scala.inline
  implicit class OAuth2ServerOps[Self <: OAuth2Server] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallMethod(value: CallMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollections(value: Collections): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodNames(value: MethodNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOauthserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubSubNames(value: PubSubNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubSubNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribeTo(value: SubscribeTo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeTo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

