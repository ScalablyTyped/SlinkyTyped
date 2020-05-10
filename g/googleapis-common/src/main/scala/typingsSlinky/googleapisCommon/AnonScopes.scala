package typingsSlinky.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScopes extends js.Object {
  var scopes: StringDictionary[AnonDescription] = js.native
}

object AnonScopes {
  @scala.inline
  def apply(scopes: StringDictionary[AnonDescription]): AnonScopes = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopes]
  }
  @scala.inline
  implicit class AnonScopesOps[Self <: AnonScopes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopes(value: StringDictionary[AnonDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

