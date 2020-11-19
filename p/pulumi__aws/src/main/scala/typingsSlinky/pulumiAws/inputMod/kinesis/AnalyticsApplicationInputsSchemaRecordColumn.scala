package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsSchemaRecordColumn extends js.Object {
  
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
object AnalyticsApplicationInputsSchemaRecordColumn {
  
  @scala.inline
  def apply(name: Input[String], sqlType: Input[String]): AnalyticsApplicationInputsSchemaRecordColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordColumn]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsSchemaRecordColumnOps[Self <: AnalyticsApplicationInputsSchemaRecordColumn] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlType(value: Input[String]): Self = this.set("sqlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapping(value: Input[String]): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
  }
}
