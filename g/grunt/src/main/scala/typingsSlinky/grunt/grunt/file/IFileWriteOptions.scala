package typingsSlinky.grunt.grunt.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.file#grunt.file.copy}
  *
  * @see IFileWriteBufferOption
  * @see IFileWriteStringOption
  */
@js.native
trait IFileWriteOptions extends IFileEncodedOption {
  /**
    * These optional globbing patterns will be matched against the filepath
    * (not the filename) using grunt.file.isMatch. If any specified globbing
    * pattern matches, the file won't be processed via the `process` function.
    * If `true` is specified, processing will be prevented.
    */
  // noProcess?: string[]
  // noProcess?: boolean
  var noProcess: js.UndefOr[js.Any] = js.native
}

object IFileWriteOptions {
  @scala.inline
  def apply(encoding: String): IFileWriteOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileWriteOptions]
  }
  @scala.inline
  implicit class IFileWriteOptionsOps[Self <: IFileWriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoProcess(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noProcess")(js.undefined)
        ret
    }
  }
  
}

