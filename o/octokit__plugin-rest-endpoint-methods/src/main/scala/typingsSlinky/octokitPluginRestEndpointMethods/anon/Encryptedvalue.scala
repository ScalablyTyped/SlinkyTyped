package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryptedvalue extends js.Object {
  var encrypted_value: Type
  var key_id: Type
  var name: Required
  var owner: Required
  var repo: Required
}

object Encryptedvalue {
  @scala.inline
  def apply(encrypted_value: Type, key_id: Type, name: Required, owner: Required, repo: Required): Encryptedvalue = {
    val __obj = js.Dynamic.literal(encrypted_value = encrypted_value.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryptedvalue]
  }
}

