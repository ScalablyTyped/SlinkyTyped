package typingsSlinky.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.requestPromiseNative.mod.FullResponse
import typingsSlinky.requestPromiseNative.mod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCodeErrorConstructor
  extends Error
     with Instantiable4[
      /* statusCode */ Double, 
      /* body */ js.Any, 
      /* options */ Options, 
      /* response */ FullResponse, 
      StatusCodeError
    ] {
  
  def apply(statusCode: Double, body: js.Any, options: Options, response: FullResponse): StatusCodeError = js.native
}
