package typingsSlinky.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.oauth2Server.oauth2ServerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an incoming HTTP request.
  */
@JSImport("oauth2-server", "Request")
@js.native
/**
  * Instantiates Request using the supplied options.
  *
  */
class Request () extends js.Object {
  def this(options: StringDictionary[js.Any]) = this()
  def this(options: Request_[ParamsDictionary, _, _, Query]) = this()
  
  var body: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns the specified HTTP header field. The match is case-insensitive.
    *
    */
  def get(field: String): js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Checks if the request’s Content-Type HTTP header matches any of the given MIME types.
    *
    */
  def is(types: js.Array[String]): String | `false` = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[StringDictionary[String]] = js.native
}
