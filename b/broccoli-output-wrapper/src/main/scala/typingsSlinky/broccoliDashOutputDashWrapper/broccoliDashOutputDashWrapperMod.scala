package typingsSlinky.broccoliDashOutputDashWrapper

import typingsSlinky.broccoliDashOutputDashWrapper.broccoliDashOutputDashWrapperStrings.buffer
import typingsSlinky.node.Anon_BufferEncodingFalse
import typingsSlinky.node.Anon_EncodingFalse
import typingsSlinky.node.Anon_EncodingFalseWithFileTypes
import typingsSlinky.node.Anon_EncodingFlag
import typingsSlinky.node.Anon_EncodingFlagNull
import typingsSlinky.node.Anon_EncodingFlagString
import typingsSlinky.node.Anon_EncodingTrue
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
object broccoliDashOutputDashWrapperMod extends js.Object {
  @js.native
  trait FSOutput extends js.Object {
    @JSName("appendFileSync")
    var appendFileSync_Original: Fn_Data = js.native
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    @JSName("mkdirSync")
    var mkdirSync_Original: Fn_OptionsPathMakeDirectoryOptions = js.native
    @JSName("readFileSync")
    var readFileSync_Original: Fn_Options = js.native
    @JSName("readdirSync")
    var readdirSync_Original: Fn_Buffer = js.native
    @JSName("rmdirSync")
    var rmdirSync_Original: Fn_OptionsPath = js.native
    @JSName("statSync")
    var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: Fn_Data = js.native
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
    def readFileSync(path: Double, options: String): String | Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlag): Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlagNull): String | Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlagString): String = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: String): String | Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlag): Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlagNull): String | Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlagString): String = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_String(path: Double, options: String): String = js.native
    @JSName("readFileSync")
    def readFileSync_String(path: PathLike, options: String): String = js.native
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: Anon_EncodingFalse): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def rmdirSync(path: PathLike): Unit = js.native
    def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
    def statSync(path: PathLike): Stats = js.native
    def writeFileSync(file: Double, data: js.Any): Unit = js.native
    def writeFileSync(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def writeFileSync(file: PathLike, data: js.Any): Unit = js.native
    def writeFileSync(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  }
  
  def apply(node: js.Any): FSOutput = js.native
}

