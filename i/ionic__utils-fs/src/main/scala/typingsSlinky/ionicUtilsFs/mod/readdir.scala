package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.fsExtra.anon.EncodingWithFileTypes
import typingsSlinky.fsExtra.anon.WithFileTypes
import typingsSlinky.fsExtra.anon.`0`
import typingsSlinky.fsExtra.anon.`1`
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "readdir")
@js.native
object readdir extends js.Object {
  
  def apply(path: PathLike): js.Promise[js.Array[String]] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: EncodingWithFileTypes): js.Promise[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: WithFileTypes): js.Promise[js.Array[String]] = js.native
  def apply(path: PathLike, options: `0`): js.Promise[js.Array[Buffer | String]] = js.native
  def apply(path: PathLike, options: `1`): js.Promise[js.Array[typingsSlinky.node.fsMod.Dirent]] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
}
