package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogPattern extends js.Object {
  /**
    * A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters, and it cannot be empty.
    */
  var Pattern: js.UndefOr[LogPatternRegex] = js.native
  /**
    * The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
    */
  var PatternName: js.UndefOr[LogPatternName] = js.native
  /**
    * The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
    */
  var PatternSetName: js.UndefOr[LogPatternSetName] = js.native
  /**
    * Rank of the log pattern.
    */
  var Rank: js.UndefOr[LogPatternRank] = js.native
}

object LogPattern {
  @scala.inline
  def apply(): LogPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPattern]
  }
  @scala.inline
  implicit class LogPatternOps[Self <: LogPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPattern(value: LogPatternRegex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternName(value: LogPatternName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatternName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternName")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternSetName(value: LogPatternSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatternSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatternSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: LogPatternRank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rank")(js.undefined)
        ret
    }
  }
  
}

