package typingsSlinky.awsDashSdk.awsDashSdkMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsDashSdk.clientsDynamodbMod.AttributeMap
import typingsSlinky.awsDashSdk.clientsDynamodbMod.AttributeValue
import typingsSlinky.awsDashSdk.clientsDynamodbMod.ClientConfiguration
import typingsSlinky.awsDashSdk.libDynamodbConverterMod.Converter.ConverterOptions
import typingsSlinky.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.DocumentClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "DynamoDB")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class DynamoDB ()
  extends typingsSlinky.awsDashSdk.clientsAllMod.DynamoDB {
  def this(options: ClientConfiguration) = this()
}

@JSImport("aws-sdk", "DynamoDB")
@js.native
object DynamoDB extends js.Object {
  @js.native
  class Converter ()
    extends typingsSlinky.awsDashSdk.clientsAllMod.DynamoDB.Converter
  
  @js.native
  /**
    * Creates a DynamoDB document client with a set of configuration options.
    */
  class DocumentClient ()
    extends typingsSlinky.awsDashSdk.clientsAllMod.DynamoDB.DocumentClient {
    def this(options: DocumentClientOptions with ClientConfiguration) = this()
  }
  
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
  
}

