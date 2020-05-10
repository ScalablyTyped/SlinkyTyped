package typingsSlinky.jose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptOptions[komplet] extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  var complete: js.UndefOr[komplet] = js.native
  var crit: js.UndefOr[js.Array[String]] = js.native
}

object DecryptOptions {
  @scala.inline
  def apply[komplet](): DecryptOptions[komplet] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptOptions[komplet]]
  }
  @scala.inline
  implicit class DecryptOptionsOps[Self[komplet_] <: DecryptOptions[komplet_], komplet] (val x: Self[komplet]) extends AnyVal {
    @scala.inline
    def duplicate: Self[komplet] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[komplet]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[komplet] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[komplet] with Other]
    @scala.inline
    def withAlgorithms(value: js.Array[String]): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithms: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: komplet): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withCrit(value: js.Array[String]): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrit: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(js.undefined)
        ret
    }
  }
  
}

