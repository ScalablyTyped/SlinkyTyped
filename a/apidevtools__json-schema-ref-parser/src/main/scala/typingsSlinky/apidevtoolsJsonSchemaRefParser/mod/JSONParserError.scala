package typingsSlinky.apidevtoolsJsonSchemaRefParser.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apidevtools/json-schema-ref-parser", "JSONParserError")
@js.native
class JSONParserError () extends Error {
  
  val code: JSONParserErrorType = js.native
  
  val errors: String = js.native
  
  val path: js.Array[String | Double] = js.native
  
  val source: String = js.native
}
