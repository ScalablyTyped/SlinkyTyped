package typingsSlinky.broccoliOutputWrapper

import typingsSlinky.broccoliOutputWrapper.anon.Fn0
import typingsSlinky.broccoliOutputWrapper.anon.Fn1
import typingsSlinky.broccoliOutputWrapper.anon.FnCall
import typingsSlinky.broccoliOutputWrapper.anon.FnCallFileDataOptions
import typingsSlinky.broccoliOutputWrapper.anon.FnCallPathDataOptions
import typingsSlinky.broccoliOutputWrapper.anon.FnCallPathOptions
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
    def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: String): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: Double): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike): Unit = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: String): Unit = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: Double): Unit = js.native
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: String): String = js.native
    def readFileSync(path: Double, options: EncodingFlag): String = js.native
    def readFileSync(path: Double, options: Flag): Buffer = js.native
    def readFileSync(path: Double, options: FlagString): String | Buffer = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: String): String = js.native
    def readFileSync(path: PathLike, options: EncodingFlag): String = js.native
    def readFileSync(path: PathLike, options: Flag): Buffer = js.native
    def readFileSync(path: PathLike, options: FlagString): String | Buffer = js.native
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
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: EncodingWithFileTypes): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: `4`): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: `5`): js.Array[Dirent] = js.native
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

