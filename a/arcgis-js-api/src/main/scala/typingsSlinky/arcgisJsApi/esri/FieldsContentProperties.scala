package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsContentProperties extends ContentProperties {
  
  /**
    * Array of [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#fieldInfos)
    */
  var fieldInfos: js.UndefOr[js.Array[FieldInfoProperties]] = js.native
}
object FieldsContentProperties {
  
  @scala.inline
  def apply(): FieldsContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsContentProperties]
  }
  
  @scala.inline
  implicit class FieldsContentPropertiesOps[Self <: FieldsContentProperties] (val x: Self) extends AnyVal {
    
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
    def setFieldInfosVarargs(value: FieldInfoProperties*): Self = this.set("fieldInfos", js.Array(value :_*))
    
    @scala.inline
    def setFieldInfos(value: js.Array[FieldInfoProperties]): Self = this.set("fieldInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldInfos: Self = this.set("fieldInfos", js.undefined)
  }
}
