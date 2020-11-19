package typingsSlinky.awsSdkMiddlewareHeaderDefault

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-header-default", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def headerDefault(headerBag: HeaderDefaultArgs): BuildMiddleware[_, _, _] = js.native
  
  type HeaderDefaultArgs = StringDictionary[String]
}
