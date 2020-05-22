package typingsSlinky.chance.anon

import typingsSlinky.chance.chanceStrings.all
import typingsSlinky.chance.chanceStrings.female
import typingsSlinky.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.PrefixOptions> */
trait PartialPrefixOptions extends js.Object {
  var full: js.UndefOr[Boolean] = js.undefined
  var gender: js.UndefOr[male | female | all] = js.undefined
}

object PartialPrefixOptions {
  @scala.inline
  def apply(full: js.UndefOr[Boolean] = js.undefined, gender: male | female | all = null): PartialPrefixOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.get.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPrefixOptions]
  }
}

