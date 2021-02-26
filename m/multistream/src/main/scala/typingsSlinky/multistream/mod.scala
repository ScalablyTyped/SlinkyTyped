package typingsSlinky.multistream

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multistream", JSImport.Namespace)
  @js.native
  def apply(streams: Streams): ReadableStream = js.native
  
  @JSImport("multistream", "obj")
  @js.native
  def obj(streams: Streams): ReadableStream = js.native
  
  type FactoryStream = js.Function1[/* cb */ FactoryStreamCallback, Unit]
  
  @js.native
  trait FactoryStreamCallback extends StObject {
    
    def apply(): js.Any = js.native
    def apply(err: js.Error): js.Any = js.native
    def apply(err: Null, stream: ReadableStream): js.Any = js.native
  }
  
  type LazyStream = js.Function0[Stream]
  
  type Streams = (js.Array[LazyStream | ReadableStream]) | FactoryStream
}
