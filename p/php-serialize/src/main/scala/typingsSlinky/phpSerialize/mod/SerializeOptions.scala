package typingsSlinky.phpSerialize.mod

import typingsSlinky.phpSerialize.phpSerializeStrings.binary
import typingsSlinky.phpSerialize.phpSerializeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeOptions extends js.Object {
  /** @default 'utf8' */
  val encoding: js.UndefOr[utf8 | binary] = js.native
}

object SerializeOptions {
  @scala.inline
  def apply(): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeOptions]
  }
  @scala.inline
  implicit class SerializeOptionsOps[Self <: SerializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: utf8 | binary): Self = {
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
  }
  
}

