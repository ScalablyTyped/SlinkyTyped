package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedProperty extends js.Object {
  
  var booleanValue: js.UndefOr[Boolean] = js.native
  
  var dateValues: js.UndefOr[DateValues] = js.native
  
  var doubleValues: js.UndefOr[DoubleValues] = js.native
  
  var enumValues: js.UndefOr[EnumValues] = js.native
  
  var htmlValues: js.UndefOr[HtmlValues] = js.native
  
  var integerValues: js.UndefOr[IntegerValues] = js.native
  
  /**
    * The name of the property. This name should correspond to the name of the property that was registered for object definition in the schema. The maximum allowable length for this
    * property is 256 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  var objectValues: js.UndefOr[ObjectValues] = js.native
  
  var textValues: js.UndefOr[TextValues] = js.native
  
  var timestampValues: js.UndefOr[TimestampValues] = js.native
}
object NamedProperty {
  
  @scala.inline
  def apply(): NamedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedProperty]
  }
  
  @scala.inline
  implicit class NamedPropertyOps[Self <: NamedProperty] (val x: Self) extends AnyVal {
    
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
    def setBooleanValue(value: Boolean): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanValue: Self = this.set("booleanValue", js.undefined)
    
    @scala.inline
    def setDateValues(value: DateValues): Self = this.set("dateValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateValues: Self = this.set("dateValues", js.undefined)
    
    @scala.inline
    def setDoubleValues(value: DoubleValues): Self = this.set("doubleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValues: Self = this.set("doubleValues", js.undefined)
    
    @scala.inline
    def setEnumValues(value: EnumValues): Self = this.set("enumValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumValues: Self = this.set("enumValues", js.undefined)
    
    @scala.inline
    def setHtmlValues(value: HtmlValues): Self = this.set("htmlValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlValues: Self = this.set("htmlValues", js.undefined)
    
    @scala.inline
    def setIntegerValues(value: IntegerValues): Self = this.set("integerValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValues: Self = this.set("integerValues", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setObjectValues(value: ObjectValues): Self = this.set("objectValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectValues: Self = this.set("objectValues", js.undefined)
    
    @scala.inline
    def setTextValues(value: TextValues): Self = this.set("textValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextValues: Self = this.set("textValues", js.undefined)
    
    @scala.inline
    def setTimestampValues(value: TimestampValues): Self = this.set("timestampValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampValues: Self = this.set("timestampValues", js.undefined)
  }
}
