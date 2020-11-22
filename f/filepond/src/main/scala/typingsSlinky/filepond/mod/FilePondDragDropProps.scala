package typingsSlinky.filepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondDragDropProps extends js.Object {
  
  /**
    * Require drop on the FilePond element itself to catch the file.
    * @default true
    */
  var dropOnElement: js.UndefOr[Boolean] = js.native
  
  /**
    * FilePond will catch all files dropped on the webpage.
    * @default false
    */
  var dropOnPage: js.UndefOr[Boolean] = js.native
  
  /**
    * When enabled, files are validated before they are dropped.
    * A file is not added when it’s invalid.
    * @default false
    */
  var dropValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * Ignored file names when handling dropped directories.
    * Dropping directories is not supported on all browsers.
    * @default ['.ds_store', 'thumbs.db', 'desktop.ini']
    */
  var ignoredFiles: js.UndefOr[js.Array[String]] = js.native
}
object FilePondDragDropProps {
  
  @scala.inline
  def apply(): FilePondDragDropProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondDragDropProps]
  }
  
  @scala.inline
  implicit class FilePondDragDropPropsOps[Self <: FilePondDragDropProps] (val x: Self) extends AnyVal {
    
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
    def setDropOnElement(value: Boolean): Self = this.set("dropOnElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropOnElement: Self = this.set("dropOnElement", js.undefined)
    
    @scala.inline
    def setDropOnPage(value: Boolean): Self = this.set("dropOnPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropOnPage: Self = this.set("dropOnPage", js.undefined)
    
    @scala.inline
    def setDropValidation(value: Boolean): Self = this.set("dropValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropValidation: Self = this.set("dropValidation", js.undefined)
    
    @scala.inline
    def setIgnoredFilesVarargs(value: String*): Self = this.set("ignoredFiles", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredFiles(value: js.Array[String]): Self = this.set("ignoredFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoredFiles: Self = this.set("ignoredFiles", js.undefined)
  }
}
