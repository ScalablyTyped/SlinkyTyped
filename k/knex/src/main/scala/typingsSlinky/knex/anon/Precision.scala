package typingsSlinky.knex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Precision extends js.Object {
  var precision: js.UndefOr[Double] = js.undefined
  var useTz: js.UndefOr[Boolean] = js.undefined
}

object Precision {
  @scala.inline
  def apply(precision: js.UndefOr[Double] = js.undefined, useTz: js.UndefOr[Boolean] = js.undefined): Precision = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTz)) __obj.updateDynamic("useTz")(useTz.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Precision]
  }
}

