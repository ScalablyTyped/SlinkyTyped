package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaVersionsDiffInput extends StObject {
  
  /**
    * The first of the two schema versions to be compared.
    */
  var FirstSchemaVersionNumber: SchemaVersionNumber = js.native
  
  /**
    * Refers to SYNTAX_DIFF, which is the currently supported diff type.
    */
  var SchemaDiffType: typingsSlinky.awsSdk.glueMod.SchemaDiffType = js.native
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of SchemaArn or SchemaName has to be provided.   SchemaId$SchemaName: The name of the schema. One of SchemaArn or SchemaName has to be provided.  
    */
  var SchemaId: typingsSlinky.awsSdk.glueMod.SchemaId = js.native
  
  /**
    * The second of the two schema versions to be compared.
    */
  var SecondSchemaVersionNumber: SchemaVersionNumber = js.native
}
object GetSchemaVersionsDiffInput {
  
  @scala.inline
  def apply(
    FirstSchemaVersionNumber: SchemaVersionNumber,
    SchemaDiffType: SchemaDiffType,
    SchemaId: SchemaId,
    SecondSchemaVersionNumber: SchemaVersionNumber
  ): GetSchemaVersionsDiffInput = {
    val __obj = js.Dynamic.literal(FirstSchemaVersionNumber = FirstSchemaVersionNumber.asInstanceOf[js.Any], SchemaDiffType = SchemaDiffType.asInstanceOf[js.Any], SchemaId = SchemaId.asInstanceOf[js.Any], SecondSchemaVersionNumber = SecondSchemaVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaVersionsDiffInput]
  }
  
  @scala.inline
  implicit class GetSchemaVersionsDiffInputMutableBuilder[Self <: GetSchemaVersionsDiffInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstSchemaVersionNumber(value: SchemaVersionNumber): Self = StObject.set(x, "FirstSchemaVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDiffType(value: SchemaDiffType): Self = StObject.set(x, "SchemaDiffType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondSchemaVersionNumber(value: SchemaVersionNumber): Self = StObject.set(x, "SecondSchemaVersionNumber", value.asInstanceOf[js.Any])
  }
}
