package typingsSlinky.pako

import typingsSlinky.pako.mod.StrategyValues
import typingsSlinky.pako.pakoNumbers.`-1`
import typingsSlinky.pako.pakoNumbers.`0`
import typingsSlinky.pako.pakoNumbers.`1`
import typingsSlinky.pako.pakoNumbers.`2`
import typingsSlinky.pako.pakoNumbers.`3`
import typingsSlinky.pako.pakoNumbers.`4`
import typingsSlinky.pako.pakoNumbers.`5`
import typingsSlinky.pako.pakoNumbers.`6`
import typingsSlinky.pako.pakoNumbers.`7`
import typingsSlinky.pako.pakoNumbers.`8`
import typingsSlinky.pako.pakoNumbers.`9`
import typingsSlinky.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined pako.pako.DeflateFunctionOptions & {  to  :'string'} */
@js.native
trait DeflateFunctionOptionstos extends js.Object {
  var dictionary: js.UndefOr[js.Any] = js.native
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  var memLevel: js.UndefOr[Double] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var strategy: js.UndefOr[StrategyValues] = js.native
  var to: js.UndefOr[string] = js.native
  var windowBits: js.UndefOr[Double] = js.native
}

object DeflateFunctionOptionstos {
  @scala.inline
  def apply(): DeflateFunctionOptionstos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeflateFunctionOptionstos]
  }
  @scala.inline
  implicit class DeflateFunctionOptionstosOps[Self <: DeflateFunctionOptionstos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDictionary(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMemLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: StrategyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBits")(js.undefined)
        ret
    }
  }
  
}

