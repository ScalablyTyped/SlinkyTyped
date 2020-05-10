package typingsSlinky.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenInfo extends js.Object {
  var ref: Double | String = js.native
  var tf: Double = js.native
}

object TokenInfo {
  @scala.inline
  def apply(ref: Double | String, tf: Double): TokenInfo = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], tf = tf.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
  @scala.inline
  implicit class TokenInfoOps[Self <: TokenInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRef(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

