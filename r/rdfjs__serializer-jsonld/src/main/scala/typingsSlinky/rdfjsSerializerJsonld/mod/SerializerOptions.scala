package typingsSlinky.rdfjsSerializerJsonld.mod

import typingsSlinky.rdfjsSerializerJsonld.rdfjsSerializerJsonldStrings.`object`
import typingsSlinky.rdfjsSerializerJsonld.rdfjsSerializerJsonldStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializerOptions extends js.Object {
  var encoding: js.UndefOr[string | `object`] = js.native
}

object SerializerOptions {
  @scala.inline
  def apply(): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializerOptions]
  }
  @scala.inline
  implicit class SerializerOptionsOps[Self <: SerializerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: string | `object`): Self = {
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

