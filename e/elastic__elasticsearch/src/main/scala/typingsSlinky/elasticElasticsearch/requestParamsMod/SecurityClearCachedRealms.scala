package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityClearCachedRealms extends Generic {
  var realms: String | js.Array[String] = js.native
  var usernames: js.UndefOr[String | js.Array[String]] = js.native
}

object SecurityClearCachedRealms {
  @scala.inline
  def apply(realms: String | js.Array[String]): SecurityClearCachedRealms = {
    val __obj = js.Dynamic.literal(realms = realms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedRealms]
  }
  @scala.inline
  implicit class SecurityClearCachedRealmsOps[Self <: SecurityClearCachedRealms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRealms(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsernames(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernames")(js.undefined)
        ret
    }
  }
  
}

