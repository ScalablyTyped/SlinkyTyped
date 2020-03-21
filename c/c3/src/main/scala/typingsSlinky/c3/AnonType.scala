package typingsSlinky.c3

import typingsSlinky.c3.c3Strings.`basis-closed`
import typingsSlinky.c3.c3Strings.`basis-open`
import typingsSlinky.c3.c3Strings.`cardinal-closed`
import typingsSlinky.c3.c3Strings.`cardinal-open`
import typingsSlinky.c3.c3Strings.`linear-closed`
import typingsSlinky.c3.c3Strings.basis
import typingsSlinky.c3.c3Strings.bundle
import typingsSlinky.c3.c3Strings.cardinal
import typingsSlinky.c3.c3Strings.linear
import typingsSlinky.c3.c3Strings.monotone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  /**
    * Set custom spline interpolation
    */
  var `type`: js.UndefOr[
    linear | `linear-closed` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
  ] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(
    `type`: linear | `linear-closed` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone = null
  ): AnonType = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

