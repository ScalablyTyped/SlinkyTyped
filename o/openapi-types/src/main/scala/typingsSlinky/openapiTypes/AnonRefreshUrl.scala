package typingsSlinky.openapiTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRefreshUrl extends js.Object {
  var refreshUrl: js.UndefOr[String] = js.native
  var scopes: StringDictionary[String] = js.native
  var tokenUrl: String = js.native
}

object AnonRefreshUrl {
  @scala.inline
  def apply(scopes: StringDictionary[String], tokenUrl: String): AnonRefreshUrl = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRefreshUrl]
  }
  @scala.inline
  implicit class AnonRefreshUrlOps[Self <: AnonRefreshUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshUrl")(js.undefined)
        ret
    }
  }
  
}

