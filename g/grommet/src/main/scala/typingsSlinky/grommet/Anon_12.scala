package typingsSlinky.grommet

import typingsSlinky.grommet.grommetStrings.`1/2`
import typingsSlinky.grommet.grommetStrings.`1/3`
import typingsSlinky.grommet.grommetStrings.`1/4`
import typingsSlinky.grommet.grommetStrings.`2/3`
import typingsSlinky.grommet.grommetStrings.`2/4`
import typingsSlinky.grommet.grommetStrings.`3/4`
import typingsSlinky.grommet.grommetStrings.auto
import typingsSlinky.grommet.grommetStrings.fill
import typingsSlinky.grommet.grommetStrings.fit
import typingsSlinky.grommet.grommetStrings.flex
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_12 extends js.Object {
  var count: js.UndefOr[fit | fill | Double] = js.undefined
  var size: js.UndefOr[
    xsmall | small | medium | large | xlarge | full | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | flex | auto | String | js.Array[String]
  ] = js.undefined
}

object Anon_12 {
  @scala.inline
  def apply(
    count: fit | fill | Double = null,
    size: xsmall | small | medium | large | xlarge | full | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | flex | auto | String | js.Array[String] = null
  ): Anon_12 = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_12]
  }
}

