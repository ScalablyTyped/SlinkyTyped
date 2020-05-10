package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrillPOSTagger extends js.Object {
  var lexicon: Lexicon = js.native
  var ruleSet: RuleSet = js.native
  def tag(sentence: js.Array[String]): js.Array[js.Array[String]] = js.native
}

object BrillPOSTagger {
  @scala.inline
  def apply(lexicon: Lexicon, ruleSet: RuleSet, tag: js.Array[String] => js.Array[js.Array[String]]): BrillPOSTagger = {
    val __obj = js.Dynamic.literal(lexicon = lexicon.asInstanceOf[js.Any], ruleSet = ruleSet.asInstanceOf[js.Any], tag = js.Any.fromFunction1(tag))
    __obj.asInstanceOf[BrillPOSTagger]
  }
  @scala.inline
  implicit class BrillPOSTaggerOps[Self <: BrillPOSTagger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLexicon(value: Lexicon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lexicon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleSet(value: RuleSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: js.Array[String] => js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

