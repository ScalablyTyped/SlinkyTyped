package typingsSlinky.jsonfile.mod

import typingsSlinky.jsonfile.anon.FnCall
import typingsSlinky.jsonfile.anon.FnCallPathDataOptions
import typingsSlinky.jsonfile.anon.TypeoffsReadFile
import typingsSlinky.jsonfile.anon.TypeoffsWriteFile
import typingsSlinky.node.Buffer
import typingsSlinky.node.anon.EncodingFlag
import typingsSlinky.node.anon.Flag
import typingsSlinky.node.anon.FlagString
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FS extends js.Object {
  var readFile: TypeoffsReadFile = js.native
  @JSName("readFileSync")
  var readFileSync_Original: FnCall = js.native
  var writeFile: TypeoffsWriteFile = js.native
  @JSName("writeFileSync")
  var writeFileSync_Original: FnCallPathDataOptions = js.native
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
  def writeFileSync(path: Double, data: js.Any): Unit = js.native
  def writeFileSync(path: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
  def writeFileSync(path: PathLike, data: js.Any): Unit = js.native
  def writeFileSync(path: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
}

