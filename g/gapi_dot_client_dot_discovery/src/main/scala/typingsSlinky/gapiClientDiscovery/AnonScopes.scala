package typingsSlinky.gapiClientDiscovery

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScopes extends js.Object {
  /** Available OAuth 2.0 scopes. */
  var scopes: js.UndefOr[Record[String, AnonDescriptionString]] = js.native
}

object AnonScopes {
  @scala.inline
  def apply(): AnonScopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonScopes]
  }
  @scala.inline
  implicit class AnonScopesOps[Self <: AnonScopes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopes(value: Record[String, AnonDescriptionString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
  }
  
}

