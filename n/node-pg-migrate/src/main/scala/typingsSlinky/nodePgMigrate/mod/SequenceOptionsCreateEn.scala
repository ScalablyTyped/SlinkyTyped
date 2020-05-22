package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceOptionsCreateEn extends js.Object {
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
  var temporary: js.UndefOr[Boolean] = js.undefined
}

object SequenceOptionsCreateEn {
  @scala.inline
  def apply(ifNotExists: js.UndefOr[Boolean] = js.undefined, temporary: js.UndefOr[Boolean] = js.undefined): SequenceOptionsCreateEn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.get.asInstanceOf[js.Any])
    if (!js.isUndefined(temporary)) __obj.updateDynamic("temporary")(temporary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceOptionsCreateEn]
  }
}

