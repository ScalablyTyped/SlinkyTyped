package typingsSlinky.jose.mod.JWS

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyOptions[komplet, parse] extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  var complete: js.UndefOr[komplet] = js.native
  var crit: js.UndefOr[js.Array[String]] = js.native
  var encoding: js.UndefOr[BufferEncoding] = js.native
  var parse: js.UndefOr[parse] = js.native
}

object VerifyOptions {
  @scala.inline
  def apply[komplet, parse](): VerifyOptions[komplet, parse] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions[komplet, parse]]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self[komplet_, parse_] <: VerifyOptions[komplet_, parse_], komplet, parse] (val x: Self[komplet, parse]) extends AnyVal {
    @scala.inline
    def duplicate: Self[komplet, parse] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[komplet, parse]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[komplet, parse]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[komplet, parse]) with Other]
    @scala.inline
    def withAlgorithms(value: js.Array[String]): Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithms: Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: komplet): Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withCrit(value: js.Array[String]): Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrit: Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crit")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: BufferEncoding): Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: parse): Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self[komplet, parse] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
  }
  
}

