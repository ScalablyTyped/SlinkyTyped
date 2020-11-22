package typingsSlinky.nextAuth.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextApiRequest
  extends IncomingMessage
     with GenericObject {
  
  var body: js.Any = js.native
  
  var cookies: StringDictionary[String] = js.native
  
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  
  var query: StringDictionary[String | js.Array[String]] = js.native
}
