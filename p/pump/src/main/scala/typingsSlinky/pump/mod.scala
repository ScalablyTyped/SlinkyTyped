package typingsSlinky.pump

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // callback have to be passed as last argument
  @JSImport("pump", JSImport.Namespace)
  @js.native
  def apply(streams: (Stream | Callback)*): Stream = js.native
  @JSImport("pump", JSImport.Namespace)
  @js.native
  def apply(streams: js.Array[Stream]): Stream = js.native
  @JSImport("pump", JSImport.Namespace)
  @js.native
  def apply(streams: js.Array[Stream], callback: Callback): Stream = js.native
  
  type Callback = js.Function1[/* err */ js.Error, js.Any]
  
  type Stream = ReadableStream | WritableStream
}
