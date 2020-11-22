package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra-promise", "readdirSync")
@js.native
object readdirSync extends js.Object {
  
  def apply(path: PathLike): js.Array[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  def apply(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[typingsSlinky.node.fsMod.Dirent] = js.native
  def apply(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
}
