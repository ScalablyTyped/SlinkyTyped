package typingsSlinky.gulpFilter.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// A transform stream with a .restore object
@js.native
trait Filter
  extends ReadableStream
     with WritableStream {
  
  var restore: ReadWriteStream = js.native
}
