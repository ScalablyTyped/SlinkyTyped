package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The fill of the outline.
  */
@js.native
trait SchemaOutlineFill extends js.Object {
  
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.native
}
object SchemaOutlineFill {
  
  @scala.inline
  def apply(): SchemaOutlineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutlineFill]
  }
  
  @scala.inline
  implicit class SchemaOutlineFillOps[Self <: SchemaOutlineFill] (val x: Self) extends AnyVal {
    
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
    def setSolidFill(value: SchemaSolidFill): Self = this.set("solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolidFill: Self = this.set("solidFill", js.undefined)
  }
}
