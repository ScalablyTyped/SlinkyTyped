package typingsSlinky.execa.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncOptions[EncodingType] extends CommonOptions[EncodingType] {
  /**
  		Write some input to the `stdin` of your binary.
  		*/
  val input: js.UndefOr[String | Buffer] = js.native
}

object SyncOptions {
  @scala.inline
  def apply[EncodingType](): SyncOptions[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions[EncodingType]]
  }
  @scala.inline
  implicit class SyncOptionsOps[Self[encodingtype] <: SyncOptions[encodingtype], EncodingType] (val x: Self[EncodingType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EncodingType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EncodingType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EncodingType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EncodingType] with Other]
    @scala.inline
    def withInput(value: String | Buffer): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
  }
  
}

