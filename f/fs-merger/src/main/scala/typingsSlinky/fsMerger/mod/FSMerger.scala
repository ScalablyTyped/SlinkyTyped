package typingsSlinky.fsMerger.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fsMerger.anon.Encoding
import typingsSlinky.fsMerger.anon.Fn0
import typingsSlinky.fsMerger.anon.FnCall
import typingsSlinky.fsMerger.anon.FnCallPathOptions
import typingsSlinky.fsMerger.anon.Typeofreaddir
import typingsSlinky.fsMerger.anon.WithFileTypes
import typingsSlinky.fsMerger.fsMergerStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.EncodingFlag
import typingsSlinky.node.anon.EncodingWithFileTypes
import typingsSlinky.node.anon.Flag
import typingsSlinky.node.anon.FlagString
import typingsSlinky.node.anon.`4`
import typingsSlinky.node.anon.`5`
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.walkSync.mod.WalkSyncEntry
import typingsSlinky.walkSync.mod.WalkSyncOptions
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
  var entries_Original: Fn0 = js.native
  var fs: FS = js.native
  @JSName("readFileSync")
  var readFileSync_Original: FnCall = js.native
  var readdir: Typeofreaddir = js.native
  @JSName("readdirSync")
  var readdirSync_Original: FnCallPathOptions = js.native
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
  def readFileMeta(filePath: String, options: FileMetaOption): FileMeta = js.native
  @JSName("readFileMeta")
  def readFileMeta_Union(filePath: String, options: FileMetaOption): js.UndefOr[FileMeta] = js.native
  def readFileSync(filePath: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: String): js.UndefOr[FileContent] = js.native
  def readFileSync(filePath: String, options: Encoding): js.UndefOr[FileContent] = js.native
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
  def readdir(
    dirPath: String,
    options: js.UndefOr[Null | String | WithFileTypes],
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdirSync(dirPath: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(dirPath: String, options: WithFileTypes): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: EncodingWithFileTypes): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: typingsSlinky.node.anon.WithFileTypes): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: `4`): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: `5`): js.Array[Dirent] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}

