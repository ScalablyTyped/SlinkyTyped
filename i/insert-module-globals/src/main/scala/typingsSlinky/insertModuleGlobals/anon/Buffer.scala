package typingsSlinky.insertModuleGlobals.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer extends js.Object {
  def Buffer(): String = js.native
  @JSName("Buffer.isBuffer")
  def BufferDotisBuffer(file: String): String = js.native
  def __dirname(file: String, basedir: String): String = js.native
  def __filename(file: String, basedir: String): String = js.native
  def global(): String = js.native
  def process(file: String): String = js.native
}

object Buffer {
  @scala.inline
  def apply(
    Buffer: () => String,
    BufferDotisBuffer: String => String,
    __dirname: (String, String) => String,
    __filename: (String, String) => String,
    global: () => String,
    process: String => String
  ): Buffer = {
    val __obj = js.Dynamic.literal(Buffer = js.Any.fromFunction0(Buffer), __dirname = js.Any.fromFunction2(__dirname), __filename = js.Any.fromFunction2(__filename), global = js.Any.fromFunction0(global), process = js.Any.fromFunction1(process))
    __obj.updateDynamic("Buffer.isBuffer")(js.Any.fromFunction1(BufferDotisBuffer))
    __obj.asInstanceOf[Buffer]
  }
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBufferDotisBuffer(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buffer.isBuffer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with__dirname(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__dirname")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with__filename(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__filename")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGlobal(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProcess(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

