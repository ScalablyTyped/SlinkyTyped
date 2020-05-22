package typingsSlinky.globalize.currencyMod.globalizeDistGlobalizeAugmentingMod

import typingsSlinky.globalize.globalizeMod.CommonNumberFormatterOptions
import typingsSlinky.globalize.globalizeStrings.accounting
import typingsSlinky.globalize.globalizeStrings.ceil
import typingsSlinky.globalize.globalizeStrings.code
import typingsSlinky.globalize.globalizeStrings.floor
import typingsSlinky.globalize.globalizeStrings.long
import typingsSlinky.globalize.globalizeStrings.name
import typingsSlinky.globalize.globalizeStrings.round
import typingsSlinky.globalize.globalizeStrings.short
import typingsSlinky.globalize.globalizeStrings.symbol
import typingsSlinky.globalize.globalizeStrings.truncate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyFormatterOptions extends CommonNumberFormatterOptions {
  /**
    * symbol (default), accounting, code or name.
    */
  var style: js.UndefOr[symbol | accounting | code | name] = js.undefined
}

object CurrencyFormatterOptions {
  @scala.inline
  def apply(
    compact: short | long = null,
    maximumFractionDigits: js.UndefOr[Double] = js.undefined,
    maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
    minimumFractionDigits: js.UndefOr[Double] = js.undefined,
    minimumIntegerDigits: js.UndefOr[Double] = js.undefined,
    minimumSignificantDigits: js.UndefOr[Double] = js.undefined,
    round: ceil | floor | round | truncate = null,
    style: symbol | accounting | code | name = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): CurrencyFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFractionDigits)) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFractionDigits)) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumIntegerDigits)) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.get.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyFormatterOptions]
  }
}

