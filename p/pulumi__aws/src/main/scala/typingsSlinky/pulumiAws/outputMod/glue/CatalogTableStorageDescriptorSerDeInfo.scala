package typingsSlinky.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogTableStorageDescriptorSerDeInfo extends StObject {
  
  /**
    * Name of the SerDe.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var serializationLibrary: js.UndefOr[String] = js.native
}
object CatalogTableStorageDescriptorSerDeInfo {
  
  @scala.inline
  def apply(): CatalogTableStorageDescriptorSerDeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptorSerDeInfo]
  }
  
  @scala.inline
  implicit class CatalogTableStorageDescriptorSerDeInfoMutableBuilder[Self <: CatalogTableStorageDescriptorSerDeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setSerializationLibrary(value: String): Self = StObject.set(x, "serializationLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationLibraryUndefined: Self = StObject.set(x, "serializationLibrary", js.undefined)
  }
}
