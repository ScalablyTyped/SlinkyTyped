package typingsSlinky.ftpd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var flags: js.UndefOr[String] = js.native
  var string: js.UndefOr[String] = js.native
}

object Encoding {
  @scala.inline
  def apply(): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encoding]
  }
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
  }
  
}

