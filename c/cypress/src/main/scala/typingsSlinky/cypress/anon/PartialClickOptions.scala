package typingsSlinky.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ClickOptions> */
trait PartialClickOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialClickOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): PartialClickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClickOptions]
  }
}

