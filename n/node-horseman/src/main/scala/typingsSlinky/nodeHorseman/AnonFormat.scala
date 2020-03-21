package typingsSlinky.nodeHorseman

import typingsSlinky.nodeHorseman.nodeHorsemanStrings.A3
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.A4
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.A5
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.Legal
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.Letter
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.Tabloid
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.landscape
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
  var margin: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
}

object AnonFormat {
  @scala.inline
  def apply(
    format: A3 | A4 | A5 | Legal | Letter | Tabloid = null,
    margin: String = null,
    orientation: portrait | landscape = null
  ): AnonFormat = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

