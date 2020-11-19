package typingsSlinky.gulpTypescript.projectMod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompileStream
  extends ReadableStream
     with WritableStream {
  
  var dts: Readable = js.native
  
  @JSName("js")
  var js_ : Readable = js.native
}
