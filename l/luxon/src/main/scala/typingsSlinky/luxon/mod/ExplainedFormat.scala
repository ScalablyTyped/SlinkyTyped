package typingsSlinky.luxon.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.luxon.anon.Literal
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplainedFormat extends js.Object {
  var input: String = js.native
  var invalidReason: js.UndefOr[String] = js.native
  var matches: js.UndefOr[StringDictionary[js.Any]] = js.native
  var rawMatches: js.UndefOr[RegExpMatchArray | Null] = js.native
  var regex: js.UndefOr[js.RegExp] = js.native
  var result: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  var tokens: js.Array[Literal] = js.native
  var zone: js.UndefOr[Zone | Null] = js.native
}

object ExplainedFormat {
  @scala.inline
  def apply(input: String, tokens: js.Array[Literal]): ExplainedFormat = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainedFormat]
  }
  @scala.inline
  implicit class ExplainedFormatOps[Self <: ExplainedFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[Literal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidReason")(js.undefined)
        ret
    }
    @scala.inline
    def withMatches(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
    @scala.inline
    def withRawMatches(value: RegExpMatchArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withRawMatchesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawMatches")(null)
        ret
    }
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withResultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(null)
        ret
    }
    @scala.inline
    def withZone(value: Zone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(null)
        ret
    }
  }
  
}

