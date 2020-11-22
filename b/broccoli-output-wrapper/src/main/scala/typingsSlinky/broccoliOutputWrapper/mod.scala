package typingsSlinky.broccoliOutputWrapper

import typingsSlinky.broccoliOutputWrapper.anon.Fn0
import typingsSlinky.broccoliOutputWrapper.anon.Fn1
import typingsSlinky.broccoliOutputWrapper.anon.FnCall
import typingsSlinky.broccoliOutputWrapper.anon.FnCallFileDataOptions
import typingsSlinky.broccoliOutputWrapper.anon.FnCallPathAtimeMtime
import typingsSlinky.broccoliOutputWrapper.anon.FnCallPathDataOptions
import typingsSlinky.broccoliOutputWrapper.anon.FnCallPathOptions
import typingsSlinky.broccoliOutputWrapper.anon.FnCallTargetPathType
import typingsSlinky.broccoliOutputWrapper.anon.Recursive
import typingsSlinky.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.anon.BaseEncodingOptionsflagst
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.EncodingBufferEncoding
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.anon.`3`
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.MakeDirectoryOptions
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.node.fsMod.WriteFileOptions
import typingsSlinky.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("broccoli-output-wrapper", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(node: js.Any): FSOutput = js.native
  
  @js.native
  trait FSOutput extends js.Object {
    
    def appendFileSync(file: Double, data: String): Unit = js.native
    def appendFileSync(file: Double, data: String, options: WriteFileOptions): Unit = js.native
    def appendFileSync(file: Double, data: js.typedarray.Uint8Array): Unit = js.native
    def appendFileSync(file: Double, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
    def appendFileSync(file: PathLike, data: String): Unit = js.native
    def appendFileSync(file: PathLike, data: String, options: WriteFileOptions): Unit = js.native
    def appendFileSync(file: PathLike, data: js.typedarray.Uint8Array): Unit = js.native
    def appendFileSync(file: PathLike, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
    @JSName("appendFileSync")
    var appendFileSync_Original: FnCallFileDataOptions = js.native
    
    def existsSync(path: PathLike): Boolean = js.native
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    
    def lstatSync(path: PathLike): Stats = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    
    def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = js.native
    @JSName("mkdirSync")
    var mkdirSync_Original: Fn1 = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike): Unit = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: Mode): Unit = js.native
    
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: BufferEncoding): String = js.native
    def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: Double, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: Double, options: `3`): Buffer = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: BufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: `3`): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    var readFileSync_Original: FnCall = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = js.native
    
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    @JSName("readdirSync")
    var readdirSync_Original: FnCallPathOptions = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    
    def rmdirSync(path: String): Unit = js.native
    def rmdirSync(path: String, options: Recursive): Unit = js.native
    
    def statSync(path: PathLike): Stats = js.native
    def statSync(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def statSync(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
    @JSName("statSync")
    var statSync_Original: Fn0 = js.native
    
    def symlinkOrCopySync(srcPath: String, destPath: String): Unit = js.native
    
    def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
    def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
    @JSName("symlinkSync")
    var symlinkSync_Original: FnCallTargetPathType = js.native
    
    def unlinkSync(path: PathLike): Unit = js.native
    @JSName("unlinkSync")
    var unlinkSync_Original: js.Function1[/* path */ PathLike, Unit] = js.native
    
    def utimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
    def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
    def utimesSync(path: PathLike, atime: String, mtime: js.Date): Unit = js.native
    def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
    def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
    def utimesSync(path: PathLike, atime: Double, mtime: js.Date): Unit = js.native
    def utimesSync(path: PathLike, atime: js.Date, mtime: String): Unit = js.native
    def utimesSync(path: PathLike, atime: js.Date, mtime: Double): Unit = js.native
    def utimesSync(path: PathLike, atime: js.Date, mtime: js.Date): Unit = js.native
    @JSName("utimesSync")
    var utimesSync_Original: FnCallPathAtimeMtime = js.native
    
    def writeFileSync(path: Double, data: String): Unit = js.native
    def writeFileSync(path: Double, data: String, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: Double, data: ArrayBufferView): Unit = js.native
    def writeFileSync(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: PathLike, data: String): Unit = js.native
    def writeFileSync(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: PathLike, data: ArrayBufferView): Unit = js.native
    def writeFileSync(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: FnCallPathDataOptions = js.native
  }
}
