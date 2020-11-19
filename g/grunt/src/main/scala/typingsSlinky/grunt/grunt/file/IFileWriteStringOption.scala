package typingsSlinky.grunt.grunt.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see IFileWriteOptions
  */
@js.native
trait IFileWriteStringOption extends IFileWriteOptions {
  
  /**
    * The source file contents, source file path, and destination file path
    * are passed into this function, whose return value will be used as the
    * destination file's contents.  
    * If this function returns 'false', the file copy will be aborted.
    * @example
    ```ts
  const copyOptions: grunt.file.IFileWriteStringOption = {
    encoding: options.encoding,
    process: (contents: string, srcpath: string, destpath: string): string | boolean => {
    // some other code
    // return the content to be written or return false to cancel
    return contents;
    },
    noProcess: options.noProcess,
  };
    ```
    */
  var process: js.UndefOr[
    js.Function3[/* contents */ String, /* srcpath */ String, /* destpath */ String, String | Boolean]
  ] = js.native
}
object IFileWriteStringOption {
  
  @scala.inline
  def apply(encoding: String): IFileWriteStringOption = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileWriteStringOption]
  }
  
  @scala.inline
  implicit class IFileWriteStringOptionOps[Self <: IFileWriteStringOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProcess(value: (/* contents */ String, /* srcpath */ String, /* destpath */ String) => String | Boolean): Self = this.set("process", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
  }
}
