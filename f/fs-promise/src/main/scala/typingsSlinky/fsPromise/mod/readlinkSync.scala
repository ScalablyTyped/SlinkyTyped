package typingsSlinky.fsPromise.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.BaseEncodingOptions
import typingsSlinky.node.fsMod.BufferEncodingOption
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "readlinkSync")
@js.native
object readlinkSync extends js.Object {
  
  def apply(path: PathLike): String = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  def apply(path: PathLike, options: BufferEncoding): String = js.native
  def apply(path: PathLike, options: BaseEncodingOptions): String = js.native
  def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
}
