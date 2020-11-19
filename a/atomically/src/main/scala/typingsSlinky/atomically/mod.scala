package typingsSlinky.atomically

import typingsSlinky.atomically.anon.ReadOptionsencodingstring
import typingsSlinky.atomically.typesMod.Callback
import typingsSlinky.atomically.typesMod.Data
import typingsSlinky.atomically.typesMod.Path
import typingsSlinky.atomically.typesMod.ReadOptions
import typingsSlinky.atomically.typesMod.WriteOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atomically", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def readFile(filePath: Path): js.Promise[Buffer] = js.native
  def readFile(filePath: Path, options: String): js.Promise[String] = js.native
  def readFile(filePath: Path, options: ReadOptionsencodingstring): js.Promise[String] = js.native
  def readFile(filePath: Path, options: ReadOptions): js.Promise[Buffer] = js.native
  
  def readFileSync(filePath: Path): Buffer = js.native
  def readFileSync(filePath: Path, options: String): String = js.native
  def readFileSync(filePath: Path, options: ReadOptionsencodingstring): String = js.native
  def readFileSync(filePath: Path, options: ReadOptions): Buffer = js.native
  
  def writeFile(filePath: Path, data: Data): js.Promise[Unit] = js.native
  def writeFile(filePath: Path, data: Data, options: js.UndefOr[scala.Nothing], callback: Callback): js.Promise[Unit] = js.native
  def writeFile(filePath: Path, data: Data, options: String): js.Promise[Unit] = js.native
  def writeFile(filePath: Path, data: Data, options: String, callback: Callback): js.Promise[Unit] = js.native
  def writeFile(filePath: Path, data: Data, options: Callback): js.Promise[Unit] = js.native
  def writeFile(filePath: Path, data: Data, options: Callback, callback: Callback): js.Promise[Unit] = js.native
  def writeFile(filePath: Path, data: Data, options: WriteOptions): js.Promise[Unit] = js.native
  def writeFile(filePath: Path, data: Data, options: WriteOptions, callback: Callback): js.Promise[Unit] = js.native
  
  def writeFileSync(filePath: Path, data: Data): Unit = js.native
  def writeFileSync(filePath: Path, data: Data, options: String): Unit = js.native
  def writeFileSync(filePath: Path, data: Data, options: WriteOptions): Unit = js.native
}
