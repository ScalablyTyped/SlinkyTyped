package typingsSlinky.nodeDashHorseman

import typingsSlinky.nodeDashHorseman.nodeDashHorsemanStrings.A3
import typingsSlinky.nodeDashHorseman.nodeDashHorsemanStrings.A4
import typingsSlinky.nodeDashHorseman.nodeDashHorsemanStrings.A5
import typingsSlinky.nodeDashHorseman.nodeDashHorsemanStrings.Legal
import typingsSlinky.nodeDashHorseman.nodeDashHorsemanStrings.Letter
import typingsSlinky.nodeDashHorseman.nodeDashHorsemanStrings.Tabloid
import typingsSlinky.nodeDashHorseman.nodeDashHorsemanStrings.landscape
import typingsSlinky.nodeDashHorseman.nodeDashHorsemanStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A3 extends js.Object {
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
  var margin: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
}

object Anon_A3 {
  @scala.inline
  def apply(
    format: A3 | A4 | A5 | Legal | Letter | Tabloid = null,
    margin: String = null,
    orientation: portrait | landscape = null
  ): Anon_A3 = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_A3]
  }
}

