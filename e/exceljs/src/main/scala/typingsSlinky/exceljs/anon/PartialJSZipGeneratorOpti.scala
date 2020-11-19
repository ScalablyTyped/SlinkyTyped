package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.exceljsStrings.DEFLATE
import typingsSlinky.exceljs.exceljsStrings.STORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.JSZipGeneratorOptions> */
@js.native
trait PartialJSZipGeneratorOpti extends js.Object {
  
  var compression: js.UndefOr[STORE | DEFLATE] = js.native
  
  var compressionOptions: js.UndefOr[Null | Level] = js.native
}
object PartialJSZipGeneratorOpti {
  
  @scala.inline
  def apply(): PartialJSZipGeneratorOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJSZipGeneratorOpti]
  }
  
  @scala.inline
  implicit class PartialJSZipGeneratorOptiOps[Self <: PartialJSZipGeneratorOpti] (val x: Self) extends AnyVal {
    
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
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setCompressionOptions(value: Level): Self = this.set("compressionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionOptions: Self = this.set("compressionOptions", js.undefined)
    
    @scala.inline
    def setCompressionOptionsNull: Self = this.set("compressionOptions", null)
  }
}
