package typingsSlinky.jestDiff.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptions extends js.Object {
  var aAnnotation: js.UndefOr[String] = js.undefined
  var bAnnotation: js.UndefOr[String] = js.undefined
  var contextLines: js.UndefOr[Double] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
}

object DiffOptions {
  @scala.inline
  def apply(
    aAnnotation: String = null,
    bAnnotation: String = null,
    contextLines: js.UndefOr[Double] = js.undefined,
    expand: js.UndefOr[Boolean] = js.undefined
  ): DiffOptions = {
    val __obj = js.Dynamic.literal()
    if (aAnnotation != null) __obj.updateDynamic("aAnnotation")(aAnnotation.asInstanceOf[js.Any])
    if (bAnnotation != null) __obj.updateDynamic("bAnnotation")(bAnnotation.asInstanceOf[js.Any])
    if (!js.isUndefined(contextLines)) __obj.updateDynamic("contextLines")(contextLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOptions]
  }
}

