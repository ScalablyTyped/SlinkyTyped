package typingsSlinky.algoliasearch.mod.Places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface use in HitInterface for some key of highlightResult.
  */
@js.native
trait highlightResultValueInterface extends js.Object {
  var fullyHighlighted: js.UndefOr[Boolean] = js.native
  var matchLevel: String = js.native
  var matchedWords: js.Array[String] = js.native
  var value: String = js.native
}

object highlightResultValueInterface {
  @scala.inline
  def apply(matchLevel: String, matchedWords: js.Array[String], value: String): highlightResultValueInterface = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], matchedWords = matchedWords.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[highlightResultValueInterface]
  }
  @scala.inline
  implicit class highlightResultValueInterfaceOps[Self <: highlightResultValueInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchedWords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullyHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullyHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyHighlighted")(js.undefined)
        ret
    }
  }
  
}

