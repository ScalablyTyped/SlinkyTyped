package typingsSlinky.easyXHeaders.streamMod

import typingsSlinky.easyXHeaders.NodeJS.WritableStream
import typingsSlinky.easyXHeaders.anon.End
import typingsSlinky.easyXHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends EventEmitter {
  
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}
