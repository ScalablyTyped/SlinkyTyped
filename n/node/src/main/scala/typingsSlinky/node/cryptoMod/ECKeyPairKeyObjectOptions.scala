package typingsSlinky.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECKeyPairKeyObjectOptions extends js.Object {
  /**
    * Name of the curve to use.
    */
  var namedCurve: String = js.native
}

object ECKeyPairKeyObjectOptions {
  @scala.inline
  def apply(namedCurve: String): ECKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECKeyPairKeyObjectOptions]
  }
  @scala.inline
  implicit class ECKeyPairKeyObjectOptionsOps[Self <: ECKeyPairKeyObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedCurve(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedCurve")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

