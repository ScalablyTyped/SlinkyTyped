package typingsSlinky.nodeJose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyOptions extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  var allowEmbeddedKey: js.UndefOr[Boolean] = js.native
  var handlers: typingsSlinky.nodeJose.anon.Exp = js.native
}

object VerifyOptions {
  @scala.inline
  def apply(handlers: typingsSlinky.nodeJose.anon.Exp): VerifyOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlers(value: typingsSlinky.nodeJose.anon.Exp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEmbeddedKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmbeddedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmbeddedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmbeddedKey")(js.undefined)
        ret
    }
  }
  
}

