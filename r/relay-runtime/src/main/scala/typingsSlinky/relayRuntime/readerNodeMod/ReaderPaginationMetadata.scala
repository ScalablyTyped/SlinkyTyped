package typingsSlinky.relayRuntime.readerNodeMod

import typingsSlinky.relayRuntime.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderPaginationMetadata extends js.Object {
  val backward: Count | Null = js.native
  val forward: Count | Null = js.native
  val path: js.Array[String] = js.native
}

object ReaderPaginationMetadata {
  @scala.inline
  def apply(path: js.Array[String]): ReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderPaginationMetadata]
  }
  @scala.inline
  implicit class ReaderPaginationMetadataOps[Self <: ReaderPaginationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackward(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackwardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backward")(null)
        ret
    }
    @scala.inline
    def withForward(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(null)
        ret
    }
  }
  
}

