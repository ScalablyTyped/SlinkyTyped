package typingsSlinky.broccoliOutputWrapper

import typingsSlinky.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.EncodingFlag
import typingsSlinky.node.anon.EncodingWithFileTypes
import typingsSlinky.node.anon.Flag
import typingsSlinky.node.anon.FlagString
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.anon.`4`
import typingsSlinky.node.anon.`5`
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.RmDirOptions
import typingsSlinky.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Fn0 extends js.Object {
    def apply(path: PathLike): Unit = js.native
    def apply(path: PathLike, options: RmDirOptions): Unit = js.native
  }
  
  @js.native
  trait Fn1 extends js.Object {
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: String): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Double): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    def apply(path: Double): String | Buffer = js.native
    def apply(path: Double, options: String): String = js.native
    def apply(path: Double, options: EncodingFlag): String = js.native
    def apply(path: Double, options: Flag): Buffer = js.native
    def apply(path: Double, options: FlagString): String | Buffer = js.native
    def apply(path: PathLike): String | Buffer = js.native
    def apply(path: PathLike, options: String): String = js.native
    def apply(path: PathLike, options: EncodingFlag): String = js.native
    def apply(path: PathLike, options: Flag): Buffer = js.native
    def apply(path: PathLike, options: FlagString): String | Buffer = js.native
  }
  
  @js.native
  trait FnCallFileDataOptions extends js.Object {
    def apply(file: Double, data: js.Any): Unit = js.native
    def apply(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def apply(file: PathLike, data: js.Any): Unit = js.native
    def apply(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallPathDataOptions extends js.Object {
    def apply(path: Double, data: js.Any): Unit = js.native
    def apply(path: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def apply(path: PathLike, data: js.Any): Unit = js.native
    def apply(path: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends js.Object {
    def apply(path: PathLike): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
    def apply(path: PathLike, options: EncodingWithFileTypes): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    def apply(path: PathLike, options: `4`): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: `5`): js.Array[Dirent] = js.native
  }
  
}

