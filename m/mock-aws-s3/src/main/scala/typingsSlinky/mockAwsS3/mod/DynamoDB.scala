package typingsSlinky.mockAwsS3.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.converterMod.Converter.ConverterOptions
import typingsSlinky.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typingsSlinky.awsSdk.dynamodbMod.AttributeMap
import typingsSlinky.awsSdk.dynamodbMod.AttributeValue
import typingsSlinky.awsSdk.dynamodbMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "DynamoDB")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class DynamoDB ()
  extends typingsSlinky.awsSdk.mod.DynamoDB {
  def this(options: ClientConfiguration) = this()
}
@JSImport("mock-aws-s3", "DynamoDB")
@js.native
object DynamoDB extends js.Object {
  
  @js.native
  class Converter ()
    extends typingsSlinky.awsSdk.mod.DynamoDB.Converter
  /* static members */
  @js.native
  object Converter extends js.Object {
    
    def input(data: js.Any): AttributeValue = js.native
    def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
    
    def marshall(data: StringDictionary[js.Any]): AttributeMap = js.native
    def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = js.native
    
    def output(data: AttributeValue): js.Any = js.native
    def output(data: AttributeValue, options: ConverterOptions): js.Any = js.native
    
    def unmarshall(data: AttributeMap): StringDictionary[js.Any] = js.native
    def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = js.native
  }
  
  @js.native
  /**
    * Creates a DynamoDB document client with a set of configuration options.
    */
  class DocumentClient ()
    extends typingsSlinky.awsSdk.mod.DynamoDB.DocumentClient {
    def this(options: DocumentClientOptions with ClientConfiguration) = this()
  }
}
