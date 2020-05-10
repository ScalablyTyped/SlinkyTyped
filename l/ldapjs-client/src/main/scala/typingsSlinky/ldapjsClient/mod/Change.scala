package typingsSlinky.ldapjsClient.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ldapjsClient.ldapjsClientStrings.add
import typingsSlinky.ldapjsClient.ldapjsClientStrings.delete
import typingsSlinky.ldapjsClient.ldapjsClientStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  var modification: StringDictionary[js.Any] = js.native
  var operation: add | delete | replace = js.native
}

object Change {
  @scala.inline
  def apply(modification: StringDictionary[js.Any], operation: add | delete | replace): Change = {
    val __obj = js.Dynamic.literal(modification = modification.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModification(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: add | delete | replace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

