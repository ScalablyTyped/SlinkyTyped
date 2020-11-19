package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.Level
import typingsSlinky.exceljs.exceljsStrings.DEFLATE
import typingsSlinky.exceljs.exceljsStrings.STORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSZipGeneratorOptions extends js.Object {
  
  /**
  	 * @default DEFLATE
  	 */
  var compression: STORE | DEFLATE = js.native
  
  var compressionOptions: Null | Level = js.native
}
object JSZipGeneratorOptions {
  
  @scala.inline
  def apply(compression: STORE | DEFLATE): JSZipGeneratorOptions = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipGeneratorOptions]
  }
  
  @scala.inline
  implicit class JSZipGeneratorOptionsOps[Self <: JSZipGeneratorOptions] (val x: Self) extends AnyVal {
    
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
    def setCompression(value: STORE | DEFLATE): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionOptions(value: Level): Self = this.set("compressionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionOptionsNull: Self = this.set("compressionOptions", null)
  }
}
