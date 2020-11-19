package typingsSlinky.mz.readlineMod

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadLineOptions
  extends typingsSlinky.node.readlineMod.ReadLineOptions
object ReadLineOptions {
  
  @scala.inline
  def apply(input: ReadableStream): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLineOptions]
  }
}
