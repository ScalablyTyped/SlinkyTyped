package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxVectorMapAnnotationConfig extends dxVectorMapCommonAnnotationConfig {
  
  /**
    * [descr:dxVectorMapAnnotationConfig.name]
    */
  var name: js.UndefOr[String] = js.native
}
object dxVectorMapAnnotationConfig {
  
  @scala.inline
  def apply(): dxVectorMapAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapAnnotationConfig]
  }
  
  @scala.inline
  implicit class dxVectorMapAnnotationConfigOps[Self <: dxVectorMapAnnotationConfig] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
