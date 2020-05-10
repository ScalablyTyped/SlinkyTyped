package typingsSlinky.bson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeWithBufferAndIndexOptions extends CommonSerializeOptions {
  /** {default:0}, the index in the buffer where we wish to start serializing into. */
  var index: js.UndefOr[scala.Double] = js.native
}

object SerializeWithBufferAndIndexOptions {
  @scala.inline
  def apply(): SerializeWithBufferAndIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeWithBufferAndIndexOptions]
  }
  @scala.inline
  implicit class SerializeWithBufferAndIndexOptionsOps[Self <: SerializeWithBufferAndIndexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

