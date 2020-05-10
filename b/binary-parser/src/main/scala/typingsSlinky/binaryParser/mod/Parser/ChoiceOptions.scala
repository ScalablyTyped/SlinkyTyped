package typingsSlinky.binaryParser.mod.Parser

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChoiceOptions extends Options {
  var choices: NumberDictionary[typingsSlinky.binaryParser.mod.Parser[_] | String] = js.native
  var defaultChoice: js.UndefOr[typingsSlinky.binaryParser.mod.Parser[_] | String] = js.native
  var tag: String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double]) = js.native
}

object ChoiceOptions {
  @scala.inline
  def apply(
    choices: NumberDictionary[typingsSlinky.binaryParser.mod.Parser[_] | String],
    tag: String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double])
  ): ChoiceOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceOptions]
  }
  @scala.inline
  implicit class ChoiceOptionsOps[Self <: ChoiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChoices(value: NumberDictionary[typingsSlinky.binaryParser.mod.Parser[_] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String | (js.ThisFunction0[/* this */ typingsSlinky.binaryParser.mod.Parser[_], Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultChoice(value: typingsSlinky.binaryParser.mod.Parser[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultChoice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChoice")(js.undefined)
        ret
    }
  }
  
}

