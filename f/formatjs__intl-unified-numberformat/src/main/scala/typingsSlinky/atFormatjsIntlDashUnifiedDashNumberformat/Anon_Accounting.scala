package typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat

import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.accounting
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.always
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.auto
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.code
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.compact
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.currency
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.decimal
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.engineering
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.exceptZero
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.long
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.name
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.narrow
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.narrowSymbol
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.never
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.percent
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.scientific
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.short
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.standard
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.symbol
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.unit
import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.libUnitsDashConstantsMod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accounting extends js.Object {
  var compactDisplay: js.UndefOr[short | long] = js.undefined
  var currencyDisplay: js.UndefOr[symbol | code | name | narrowSymbol] = js.undefined
  var currencySign: js.UndefOr[standard | accounting] = js.undefined
  var notation: js.UndefOr[standard | scientific | engineering | compact] = js.undefined
  var signDisplay: js.UndefOr[auto | always | never | exceptZero] = js.undefined
  var style: js.UndefOr[decimal | percent | currency | unit] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
  var unitDisplay: js.UndefOr[long | short | narrow] = js.undefined
}

object Anon_Accounting {
  @scala.inline
  def apply(
    compactDisplay: short | long = null,
    currencyDisplay: symbol | code | name | narrowSymbol = null,
    currencySign: standard | accounting = null,
    notation: standard | scientific | engineering | compact = null,
    signDisplay: auto | always | never | exceptZero = null,
    style: decimal | percent | currency | unit = null,
    unit: Unit = null,
    unitDisplay: long | short | narrow = null
  ): Anon_Accounting = {
    val __obj = js.Dynamic.literal()
    if (compactDisplay != null) __obj.updateDynamic("compactDisplay")(compactDisplay.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitDisplay != null) __obj.updateDynamic("unitDisplay")(unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accounting]
  }
}

