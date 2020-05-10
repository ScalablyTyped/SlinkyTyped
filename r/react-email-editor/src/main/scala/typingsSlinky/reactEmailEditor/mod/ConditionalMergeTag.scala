package typingsSlinky.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalMergeTag extends MergeTag {
  val mergeTags: js.UndefOr[js.Array[SimpleMergeTag]] = js.native
  val name: String = js.native
  val rules: js.Array[ConditionalMergeTagRule] = js.native
}

object ConditionalMergeTag {
  @scala.inline
  def apply(name: String, rules: js.Array[ConditionalMergeTagRule]): ConditionalMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalMergeTag]
  }
  @scala.inline
  implicit class ConditionalMergeTagOps[Self <: ConditionalMergeTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: js.Array[ConditionalMergeTagRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeTags(value: js.Array[SimpleMergeTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeTags")(js.undefined)
        ret
    }
  }
  
}

