package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn extends StObject {
  
  /**
    * The Mapping reference to the data element.
    */
  var mapping: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the column.
    */
  var name: Input[String] = js.native
  
  /**
    * The SQL Type of the column.
    */
  var sqlType: Input[String] = js.native
}
object AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn {
  
  @scala.inline
  def apply(name: Input[String], sqlType: Input[String]): AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaRecordColumnMutableBuilder[Self <: AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapping(value: Input[String]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlType(value: Input[String]): Self = StObject.set(x, "sqlType", value.asInstanceOf[js.Any])
  }
}
