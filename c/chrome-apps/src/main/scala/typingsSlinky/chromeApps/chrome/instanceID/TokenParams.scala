package typingsSlinky.chromeApps.chrome.instanceID

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenParams extends js.Object {
  /**
    * Identifies the entity that is authorized to access resources associated with this Instance ID.
    * It can be a project ID from Google developer console.
    */
  var authorizedEntity: String = js.native
  /**
    * Allows including a small number of string key/value pairs that will
    * be associated with the token and may be used in processing the request.
    */
  var options: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Identifies authorized actions that the authorized entity can take.
    * E.g. for sending GCM messages, GCM scope should be used.
    */
  var scope: String = js.native
}

object TokenParams {
  @scala.inline
  def apply(authorizedEntity: String, scope: String): TokenParams = {
    val __obj = js.Dynamic.literal(authorizedEntity = authorizedEntity.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenParams]
  }
  @scala.inline
  implicit class TokenParamsOps[Self <: TokenParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizedEntity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

