package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdk.dynamodbMod.AttributeMap
import typingsSlinky.awsSdk.dynamodbMod.AttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/dynamodb/converter", JSImport.Namespace)
@js.native
object converterMod extends js.Object {
  
  @js.native
  class Converter () extends js.Object
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
    
    type ConverterOptions = typingsSlinky.awsSdk.documentClientMod.DocumentClient.ConverterOptions
  }
}
