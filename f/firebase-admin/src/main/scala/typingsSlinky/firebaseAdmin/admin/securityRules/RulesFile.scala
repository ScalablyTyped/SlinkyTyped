package typingsSlinky.firebaseAdmin.admin.securityRules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A source file containing some Firebase security rules. The content includes raw
  * source code including text formatting, indentation and comments. Use the
  * [`securityRules.createRulesFileFromSource()`](admin.securityRules.SecurityRules#createRulesFileFromSource)
  * method to create new instances of this type.
  */
@js.native
trait RulesFile extends js.Object {
  val content: String = js.native
  val name: String = js.native
}

object RulesFile {
  @scala.inline
  def apply(content: String, name: String): RulesFile = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesFile]
  }
  @scala.inline
  implicit class RulesFileOps[Self <: RulesFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

