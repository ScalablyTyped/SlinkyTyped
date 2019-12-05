package typingsSlinky.reactDashCssDashModules.reactDashCssDashModulesMod

import typingsSlinky.reactDashCssDashModules.reactDashCssDashModulesStrings.`throw`
import typingsSlinky.reactDashCssDashModules.reactDashCssDashModulesStrings.ignore
import typingsSlinky.reactDashCssDashModules.reactDashCssDashModulesStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeOptions extends js.Object {
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  var handleNotFoundStyleName: js.UndefOr[`throw` | log | ignore] = js.undefined
}

object TypeOptions {
  @scala.inline
  def apply(
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    handleNotFoundStyleName: `throw` | log | ignore = null
  ): TypeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.asInstanceOf[js.Any])
    if (handleNotFoundStyleName != null) __obj.updateDynamic("handleNotFoundStyleName")(handleNotFoundStyleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOptions]
  }
}

