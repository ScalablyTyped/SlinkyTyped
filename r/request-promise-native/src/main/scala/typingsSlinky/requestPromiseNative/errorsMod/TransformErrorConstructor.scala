package typingsSlinky.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.requestPromiseNative.mod.FullResponse
import typingsSlinky.requestPromiseNative.mod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformErrorConstructor
  extends Error
     with Instantiable3[/* cause */ js.Any, /* options */ Options, /* response */ FullResponse, TransformError] {
  
  def apply(cause: js.Any, options: Options, response: FullResponse): TransformError = js.native
}
