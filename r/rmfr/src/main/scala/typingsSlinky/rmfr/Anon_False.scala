package typingsSlinky.rmfr

import typingsSlinky.glob.globMod.IOptions
import typingsSlinky.rmfr.rmfrNumbers.`false`
import typingsSlinky.rmfr.rmfrNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var glob: js.UndefOr[IOptions | `false` | `true`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(glob: IOptions | `false` | `true` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

