package typingsSlinky.requestPromise.errorsMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.requestPromise.mod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformErrorConstructor
  extends Error
     with Instantiable3[
      /* cause */ js.Any, 
      /* options */ Options, 
      /* response */ IncomingMessage, 
      TransformError
    ] {
  
  def apply(cause: js.Any, options: Options, response: IncomingMessage): TransformError = js.native
}
