package typingsSlinky.grommet

import typingsSlinky.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var opacity: js.UndefOr[OpacityType] = js.undefined
}

object Anon2 {
  @scala.inline
  def apply(opacity: OpacityType = null): Anon2 = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

