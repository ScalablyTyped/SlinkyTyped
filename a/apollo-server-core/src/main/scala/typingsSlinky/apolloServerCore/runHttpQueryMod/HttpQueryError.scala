package typingsSlinky.apolloServerCore.runHttpQueryMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-core/dist/runHttpQuery", "HttpQueryError")
@js.native
class HttpQueryError protected () extends Error {
  def this(statusCode: Double, message: String) = this()
  def this(statusCode: Double, message: String, isGraphQLError: Boolean) = this()
  def this(
    statusCode: Double,
    message: String,
    isGraphQLError: js.UndefOr[scala.Nothing],
    headers: StringDictionary[String]
  ) = this()
  def this(statusCode: Double, message: String, isGraphQLError: Boolean, headers: StringDictionary[String]) = this()
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var isGraphQLError: Boolean = js.native
  
  var statusCode: Double = js.native
}
