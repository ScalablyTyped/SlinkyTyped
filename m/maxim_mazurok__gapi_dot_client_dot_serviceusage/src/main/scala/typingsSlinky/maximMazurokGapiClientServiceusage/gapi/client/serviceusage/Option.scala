package typingsSlinky.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends StObject {
  
  /**
    * The option's name. For protobuf built-in options (options defined in descriptor.proto), this is the short name. For example, `"map_entry"`. For custom options, it should be the
    * fully-qualified name. For example, `"google.api.http"`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The option's value packed in an Any message. If the value is a primitive, the corresponding wrapper type defined in google/protobuf/wrappers.proto should be used. If the value is an
    * enum, it should be stored as an int32 value using the google.protobuf.Int32Value type.
    */
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientServiceusage.maximMazurokGapiClientServiceusageStrings.Option with TopLevel[js.Any]
  ] = js.native
}
object Option {
  
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientServiceusage.maximMazurokGapiClientServiceusageStrings.Option with TopLevel[js.Any]
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
