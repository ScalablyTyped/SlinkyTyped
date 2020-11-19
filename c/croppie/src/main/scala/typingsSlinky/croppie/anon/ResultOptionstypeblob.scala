package typingsSlinky.croppie.anon

import typingsSlinky.croppie.croppieStrings.blob
import typingsSlinky.croppie.croppieStrings.original
import typingsSlinky.croppie.croppieStrings.viewport
import typingsSlinky.croppie.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined croppie.croppie.ResultOptions & {  type :'blob'} */
@js.native
trait ResultOptionstypeblob extends js.Object {
  
  var circle: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[Format] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[viewport | original | Height] = js.native
  
  var `type`: js.UndefOr[typingsSlinky.croppie.mod.Type] with blob = js.native
}
object ResultOptionstypeblob {
  
  @scala.inline
  def apply(`type`: js.UndefOr[typingsSlinky.croppie.mod.Type] with blob): ResultOptionstypeblob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultOptionstypeblob]
  }
  
  @scala.inline
  implicit class ResultOptionstypeblobOps[Self <: ResultOptionstypeblob] (val x: Self) extends AnyVal {
    
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
    def setType(value: js.UndefOr[typingsSlinky.croppie.mod.Type] with blob): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircle(value: Boolean): Self = this.set("circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    
    @scala.inline
    def setFormat(value: Format): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSize(value: viewport | original | Height): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
