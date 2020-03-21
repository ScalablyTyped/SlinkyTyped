package typingsSlinky.elliptic.mod.ec

import typingsSlinky.elliptic.mod.BNInput
import typingsSlinky.elliptic.mod._SignatureInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureOptions extends _SignatureInput {
  var r: BNInput
  var recoveryParam: js.UndefOr[Double] = js.undefined
  var s: BNInput
}

object SignatureOptions {
  @scala.inline
  def apply(r: BNInput, s: BNInput, recoveryParam: Int | Double = null): SignatureOptions = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    if (recoveryParam != null) __obj.updateDynamic("recoveryParam")(recoveryParam.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureOptions]
  }
}

