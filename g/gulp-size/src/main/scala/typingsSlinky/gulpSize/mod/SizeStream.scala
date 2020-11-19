package typingsSlinky.gulpSize.mod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeStream
  extends ReadableStream
     with WritableStream {
  
  var prettySize: String = js.native
  
  var size: Double = js.native
}
