package typingsSlinky.broccoliOutputWrapper

import typingsSlinky.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typingsSlinky.node.Anon4
import typingsSlinky.node.Anon5
import typingsSlinky.node.AnonEncodingFlag
import typingsSlinky.node.AnonEncodingWithFileTypes
import typingsSlinky.node.AnonFlag
import typingsSlinky.node.AnonFlagString
import typingsSlinky.node.AnonWithFileTypes
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.RmDirOptions
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("broccoli-output-wrapper", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait FSOutput extends js.Object {
    @JSName("appendFileSync")
    var appendFileSync_Original: FnCallFileDataOptions = js.native
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    @JSName("mkdirSync")
    var mkdirSync_Original: Fn1 = js.native
    @JSName("readFileSync")
    var readFileSync_Original: FnCall = js.native
    @JSName("readdirSync")
    var readdirSync_Original: FnCallPathOptions = js.native
    @JSName("rmdirSync")
    var rmdirSync_Original: Fn0 = js.native
    @JSName("statSync")
    var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: FnCallPathDataOptions = js.native
    def appendFileSync(file: Double, data: js.Any): Unit = js.native
    def appendFileSync(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def appendFileSync(file: PathLike, data: js.Any): Unit = js.native
    def appendFileSync(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
    def existsSync(path: PathLike): Boolean = js.native
    def lstatSync(path: PathLike): Stats = js.native
    def mkdirSync(path: PathLike): Unit = js.native
    def mkdirSync(path: PathLike, options: String): Unit = js.native
    def mkdirSync(path: PathLike, options: Double): Unit = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): Unit = js.native
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: String): String = js.native
    def readFileSync(path: Double, options: AnonEncodingFlag): String = js.native
    def readFileSync(path: Double, options: AnonFlag): Buffer = js.native
    def readFileSync(path: Double, options: AnonFlagString): String | Buffer = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: String): String = js.native
    def readFileSync(path: PathLike, options: AnonEncodingFlag): String = js.native
    def readFileSync(path: PathLike, options: AnonFlag): Buffer = js.native
    def readFileSync(path: PathLike, options: AnonFlagString): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double, options: String): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike, options: String): String | Buffer = js.native
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon4): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon5): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: AnonEncodingWithFileTypes): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: AnonWithFileTypes): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def rmdirSync(path: PathLike): Unit = js.native
    def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
    def statSync(path: PathLike): Stats = js.native
    def writeFileSync(path: Double, data: js.Any): Unit = js.native
    def writeFileSync(path: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: PathLike, data: js.Any): Unit = js.native
    def writeFileSync(path: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  }
  
  def apply(node: js.Any): FSOutput = js.native
}

