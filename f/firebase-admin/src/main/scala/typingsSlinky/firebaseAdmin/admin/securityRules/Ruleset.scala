package typingsSlinky.firebaseAdmin.admin.securityRules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Firebase security rules.
  */
@js.native
trait Ruleset extends RulesetMetadata {
  val source: js.Array[RulesFile] = js.native
}

object Ruleset {
  @scala.inline
  def apply(createTime: String, name: String, source: js.Array[RulesFile]): Ruleset = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruleset]
  }
  @scala.inline
  implicit class RulesetOps[Self <: Ruleset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: js.Array[RulesFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

