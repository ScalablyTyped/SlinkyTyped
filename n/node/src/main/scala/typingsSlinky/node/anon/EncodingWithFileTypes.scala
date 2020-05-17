package typingsSlinky.node.anon

import typingsSlinky.node.nodeBooleans.`false`
import typingsSlinky.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingWithFileTypes extends js.Object {
  var encoding: buffer_ = js.native
  var withFileTypes: js.UndefOr[`false`] = js.native
}

object EncodingWithFileTypes {
  @scala.inline
  def apply(encoding: buffer_): EncodingWithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingWithFileTypes]
  }
  @scala.inline
  implicit class EncodingWithFileTypesOps[Self <: EncodingWithFileTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: buffer_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithFileTypes(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withFileTypes")(js.undefined)
        ret
    }
  }
  
}

