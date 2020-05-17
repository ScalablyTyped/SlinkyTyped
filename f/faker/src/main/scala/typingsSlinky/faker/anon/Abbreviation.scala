package typingsSlinky.faker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abbreviation extends js.Object {
  def abbreviation(): String = js.native
  def adjective(): String = js.native
  def ingverb(): String = js.native
  def noun(): String = js.native
  def phrase(): String = js.native
  def verb(): String = js.native
}

object Abbreviation {
  @scala.inline
  def apply(
    abbreviation: () => String,
    adjective: () => String,
    ingverb: () => String,
    noun: () => String,
    phrase: () => String,
    verb: () => String
  ): Abbreviation = {
    val __obj = js.Dynamic.literal(abbreviation = js.Any.fromFunction0(abbreviation), adjective = js.Any.fromFunction0(adjective), ingverb = js.Any.fromFunction0(ingverb), noun = js.Any.fromFunction0(noun), phrase = js.Any.fromFunction0(phrase), verb = js.Any.fromFunction0(verb))
    __obj.asInstanceOf[Abbreviation]
  }
  @scala.inline
  implicit class AbbreviationOps[Self <: Abbreviation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbbreviation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAdjective(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjective")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIngverb(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingverb")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNoun(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noun")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPhrase(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrase")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVerb(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

