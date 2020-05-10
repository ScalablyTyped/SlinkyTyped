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

@js.native
trait AnonType extends js.Object {
  /**
    * Set custom spline interpolation
    */
  var `type`: js.UndefOr[
    linear | `linear-closed` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
  ] = js.native
}

object AnonType {
  @scala.inline
  def apply(): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonType]
  }
  @scala.inline
  implicit class AnonTypeOps[Self <: AnonType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(
      value: linear | `linear-closed` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

