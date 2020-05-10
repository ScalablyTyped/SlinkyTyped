package typingsSlinky.grunt.grunt.file

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see IFileWriteOptions
  */
@js.native
trait IFileWriteBufferOption extends IFileWriteOptions {
  /**
    * The source file contents and file path are passed into this function,
    * whose return value will be used as the destination file's contents. If
    * this function returns `false`, the file copy will be aborted.
    */
  var process: js.UndefOr[js.Function1[/* buffer */ Buffer, Boolean]] = js.native
}

object IFileWriteBufferOption {
  @scala.inline
  def apply(encoding: String): IFileWriteBufferOption = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileWriteBufferOption]
  }
  @scala.inline
  implicit class IFileWriteBufferOptionOps[Self <: IFileWriteBufferOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcess(value: /* buffer */ Buffer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.undefined)
        ret
    }
  }
  
}

