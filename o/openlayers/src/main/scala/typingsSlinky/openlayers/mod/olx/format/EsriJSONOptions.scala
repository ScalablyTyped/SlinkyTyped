package typingsSlinky.openlayers.mod.olx.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EsriJSONOptions extends js.Object {
  
  var geometryName: js.UndefOr[String] = js.native
}
object EsriJSONOptions {
  
  @scala.inline
  def apply(): EsriJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsriJSONOptions]
  }
  
  @scala.inline
  implicit class EsriJSONOptionsOps[Self <: EsriJSONOptions] (val x: Self) extends AnyVal {
    
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
    def setGeometryName(value: String): Self = this.set("geometryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometryName: Self = this.set("geometryName", js.undefined)
  }
}
