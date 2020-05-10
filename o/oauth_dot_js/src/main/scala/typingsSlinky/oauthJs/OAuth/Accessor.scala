package typingsSlinky.oauthJs.OAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SignatureMethod expects an accessor object to be like this:
  *   {tokenSecret: "lakjsdflkj...", consumerSecret: "QOUEWRI..", accessorSecret: "xcmvzc..."}
  * The accessorSecret property is optional.
  */
@js.native
trait Accessor extends js.Object {
  var accessorSecret: js.UndefOr[String] = js.native
  var consumerKey: String = js.native
  var consumerSecret: String = js.native
  var token: String = js.native
  var tokenSecret: String = js.native
}

object Accessor {
  @scala.inline
  def apply(consumerKey: String, consumerSecret: String, token: String, tokenSecret: String): Accessor = {
    val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenSecret = tokenSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessor]
  }
  @scala.inline
  implicit class AccessorOps[Self <: Accessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumerSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessorSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessorSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessorSecret")(js.undefined)
        ret
    }
  }
  
}

