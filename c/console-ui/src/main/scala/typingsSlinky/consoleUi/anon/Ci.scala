package typingsSlinky.consoleUi.anon

import typingsSlinky.consoleUi.mod.WriteLevel
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ci extends js.Object {
  var ci: js.UndefOr[Boolean] = js.native
  var errorStream: js.UndefOr[WritableStream] = js.native
  var inputStream: js.UndefOr[ReadableStream] = js.native
  var outputStream: js.UndefOr[WritableStream] = js.native
  var writeLevel: js.UndefOr[WriteLevel] = js.native
}

object Ci {
  @scala.inline
  def apply(): Ci = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ci]
  }
  @scala.inline
  implicit class CiOps[Self <: Ci] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStream")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStream(value: ReadableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStream")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStream")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteLevel(value: WriteLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeLevel")(js.undefined)
        ret
    }
  }
  
}

