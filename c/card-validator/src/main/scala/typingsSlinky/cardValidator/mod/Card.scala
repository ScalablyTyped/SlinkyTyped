package typingsSlinky.cardValidator.mod

import typingsSlinky.cardValidator.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card extends js.Object {
  var code: Name = js.native
  var gaps: js.Array[Double] = js.native
  var isAmex: Boolean = js.native
  var lengths: js.Array[Double] = js.native
  var niceType: String = js.native
  var pattern: String = js.native
  var `type`: String = js.native
}

object Card {
  @scala.inline
  def apply(
    code: Name,
    gaps: js.Array[Double],
    isAmex: Boolean,
    lengths: js.Array[Double],
    niceType: String,
    pattern: String,
    `type`: String
  ): Card = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], isAmex = isAmex.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  @scala.inline
  implicit class CardOps[Self <: Card] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGaps(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAmex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAmex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLengths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNiceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("niceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

