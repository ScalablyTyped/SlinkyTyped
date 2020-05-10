package typingsSlinky.antDesignReactNative

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAntLocale extends js.Object {
  var antLocale: Requireable[js.Object] = js.native
}

object AnonAntLocale {
  @scala.inline
  def apply(antLocale: Requireable[js.Object]): AnonAntLocale = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAntLocale]
  }
  @scala.inline
  implicit class AnonAntLocaleOps[Self <: AnonAntLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntLocale(value: Requireable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

