package typingsSlinky.openGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlternate extends js.Object {
  /** An array of other locales this page is available in. */
  var alternate: js.UndefOr[String | js.Array[String]] = js.native
}

object AnonAlternate {
  @scala.inline
  def apply(): AnonAlternate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAlternate]
  }
  @scala.inline
  implicit class AnonAlternateOps[Self <: AnonAlternate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(js.undefined)
        ret
    }
  }
  
}

