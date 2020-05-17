package typingsSlinky.node.anon

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.nodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithFileTypes extends js.Object {
  var encoding: BufferEncoding | Null = js.native
  var withFileTypes: js.UndefOr[`false`] = js.native
}

object WithFileTypes {
  @scala.inline
  def apply(): WithFileTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithFileTypes]
  }
  @scala.inline
  implicit class WithFileTypesOps[Self <: WithFileTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: BufferEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(null)
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

