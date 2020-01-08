package typingsSlinky.fsDashMerger.fsDashMergerMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fsDashMerger.Anon_Encoding
import typingsSlinky.fsDashMerger.Anon_EncodingFalse
import typingsSlinky.fsDashMerger.Fn_Buffer
import typingsSlinky.fsDashMerger.Fn_Options
import typingsSlinky.fsDashMerger.Fn_OptionsPath
import typingsSlinky.fsDashMerger.Typeofreaddir
import typingsSlinky.fsDashMerger.fsDashMergerStrings.buffer
import typingsSlinky.node.Anon_BufferEncodingFalse
import typingsSlinky.node.Anon_EncodingFalseWithFileTypes
import typingsSlinky.node.Anon_EncodingFlag
import typingsSlinky.node.Anon_EncodingFlagNull
import typingsSlinky.node.Anon_EncodingFlagString
import typingsSlinky.node.Anon_EncodingTrue
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.walkDashSync.walkDashSyncMod.WalkSyncEntry
import typingsSlinky.walkDashSync.walkDashSyncMod.WalkSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSMerger extends js.Object {
  var MAP: StringDictionary[FSMergerObject] | Null = js.native
  var PREFIXINDEXMAP: NumberDictionary[FSMergerObject] = js.native
  var _atList: js.Array[FSMerger] = js.native
  var _dirList: js.Array[Node] = js.native
  @JSName("entries")
  var entries_Original: Fn_OptionsPath = js.native
  var fs: FS = js.native
  @JSName("readFileSync")
  var readFileSync_Original: Fn_Options = js.native
  var readdir: Typeofreaddir = js.native
  @JSName("readdirSync")
  var readdirSync_Original: Fn_Buffer = js.native
  def _generateMap(): Unit = js.native
  def at(index: Double): FSMerger = js.native
  def entries(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry */ _
  ] = js.native
  def entries(
    dirPath: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry */ _
  ] = js.native
  def entries(path: String): js.Array[WalkSyncEntry] = js.native
  def entries(path: String, options: WalkSyncOptions): js.Array[WalkSyncEntry] = js.native
  def readFileMeta(filePath: String): js.UndefOr[FileMeta] = js.native
  def readFileMeta(filePath: String, options: FileMetaOption): js.UndefOr[FileMeta] = js.native
  @JSName("readFileMeta")
  def readFileMeta_FileMeta(filePath: String, options: FileMetaOption): FileMeta = js.native
  def readFileSync(filePath: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: Anon_Encoding): js.UndefOr[FileContent] = js.native
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
  def readdir(
    dirPath: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    dirPath: String,
    options: Anon_EncodingFalse,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdirSync(dirPath: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: Anon_EncodingFalse): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: typingsSlinky.node.Anon_EncodingFalse): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}

