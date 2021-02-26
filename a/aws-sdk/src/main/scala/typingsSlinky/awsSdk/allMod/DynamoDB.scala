package typingsSlinky.awsSdk.allMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.converterMod.Converter.ConverterOptions
import typingsSlinky.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typingsSlinky.awsSdk.dynamodbMod.AttributeMap
import typingsSlinky.awsSdk.dynamodbMod.AttributeValue
import typingsSlinky.awsSdk.dynamodbMod.ClientConfiguration
import typingsSlinky.awsSdk.dynamodbMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/all", "DynamoDB")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class DynamoDB () extends ^ {
  def this(options: ClientConfiguration) = this()
}
object DynamoDB {
  
  @JSImport("aws-sdk/clients/all", "DynamoDB.Converter")
  @js.native
  class Converter ()
    extends typingsSlinky.awsSdk.dynamodbMod.Converter
  /* static members */
  object Converter {
    
    @JSImport("aws-sdk/clients/all", "DynamoDB.Converter.input")
    @js.native
    def input(data: js.Any): AttributeValue = js.native
    @JSImport("aws-sdk/clients/all", "DynamoDB.Converter.input")
    @js.native
    def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
    
    @JSImport("aws-sdk/clients/all", "DynamoDB.Converter.marshall")
    @js.native
    def marshall(data: StringDictionary[js.Any]): AttributeMap = js.native
    @JSImport("aws-sdk/clients/all", "DynamoDB.Converter.marshall")
    @js.native
    def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = js.native
    
    @JSImport("aws-sdk/clients/all", "DynamoDB.Converter.output")
    @js.native
    def output(data: AttributeValue): js.Any = js.native
    @JSImport("aws-sdk/clients/all", "DynamoDB.Converter.output")
    @js.native
    def output(data: AttributeValue, options: ConverterOptions): js.Any = js.native
    
    @JSImport("aws-sdk/clients/all", "DynamoDB.Converter.unmarshall")
    @js.native
    def unmarshall(data: AttributeMap): StringDictionary[js.Any] = js.native
    @JSImport("aws-sdk/clients/all", "DynamoDB.Converter.unmarshall")
    @js.native
    def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = js.native
  }
  
  @JSImport("aws-sdk/clients/all", "DynamoDB.DocumentClient")
  @js.native
  /**
    * Creates a DynamoDB document client with a set of configuration options.
    */
  class DocumentClient ()
    extends typingsSlinky.awsSdk.dynamodbMod.DocumentClient {
    def this(options: DocumentClientOptions with ClientConfiguration) = this()
  }
}
