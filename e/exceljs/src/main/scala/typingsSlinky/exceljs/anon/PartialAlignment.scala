package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.exceljsStrings.bottom
import typingsSlinky.exceljs.exceljsStrings.center
import typingsSlinky.exceljs.exceljsStrings.centerContinuous
import typingsSlinky.exceljs.exceljsStrings.distributed
import typingsSlinky.exceljs.exceljsStrings.fill
import typingsSlinky.exceljs.exceljsStrings.justify
import typingsSlinky.exceljs.exceljsStrings.left
import typingsSlinky.exceljs.exceljsStrings.ltr
import typingsSlinky.exceljs.exceljsStrings.middle
import typingsSlinky.exceljs.exceljsStrings.right
import typingsSlinky.exceljs.exceljsStrings.rtl
import typingsSlinky.exceljs.exceljsStrings.top
import typingsSlinky.exceljs.exceljsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Alignment> */
trait PartialAlignment extends js.Object {
  var horizontal: js.UndefOr[left | center | right | fill | justify | centerContinuous | distributed] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var readingOrder: js.UndefOr[rtl | ltr] = js.undefined
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  var textRotation: js.UndefOr[Double | vertical] = js.undefined
  var vertical: js.UndefOr[top | middle | bottom | distributed | justify] = js.undefined
  var wrapText: js.UndefOr[Boolean] = js.undefined
}

object PartialAlignment {
  @scala.inline
  def apply(
    horizontal: left | center | right | fill | justify | centerContinuous | distributed = null,
    indent: js.UndefOr[Double] = js.undefined,
    readingOrder: rtl | ltr = null,
    shrinkToFit: js.UndefOr[Boolean] = js.undefined,
    textRotation: Double | vertical = null,
    vertical: top | middle | bottom | distributed | justify = null,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): PartialAlignment = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit.get.asInstanceOf[js.Any])
    if (textRotation != null) __obj.updateDynamic("textRotation")(textRotation.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAlignment]
  }
}

