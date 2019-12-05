package typingsSlinky.loaderDashUtils.loaderDashUtilsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolateOption extends js.Object {
  var content: js.UndefOr[String | Buffer] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var regExp: js.UndefOr[String | js.RegExp] = js.undefined
}

object InterpolateOption {
  @scala.inline
  def apply(content: String | Buffer = null, context: String = null, regExp: String | js.RegExp = null): InterpolateOption = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolateOption]
  }
}

