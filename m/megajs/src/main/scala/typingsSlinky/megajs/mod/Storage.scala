package typingsSlinky.megajs.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("megajs", "Storage")
@js.native
class Storage protected () extends js.Object {
  def this(options: StorageOptions) = this()
  def this(options: StorageOptions, callback: js.Any) = this()
  
  var files: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ id in string ]: megajs.megajs.MutableFile}
    */ typingsSlinky.megajs.megajsStrings.Storage with TopLevel[js.Any] = js.native
  
  def getAccountInfo(cb: js.Any): AccountInfo = js.native
  
  var inbox: MutableFile = js.native
  
  var key: Buffer = js.native
  
  def login(cb: js.Any): Readable = js.native
  
  def mkdir(options: String, cb: js.Function2[/* err */ js.UndefOr[js.Error], /* file */ MutableFile, Unit]): Readable = js.native
  def mkdir(
    options: MakeDirectoryOptions,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* file */ MutableFile, Unit]
  ): Readable = js.native
  
  var mounts: js.Array[File] = js.native
  
  var name: String = js.native
  
  def reload(cb: js.Any): Readable = js.native
  
  var root: MutableFile = js.native
  
  var sid: String = js.native
  
  def toJSON(): JSON = js.native
  
  var trash: MutableFile = js.native
  
  def upload(options: String): Writable = js.native
  def upload(options: String, buffer: js.UndefOr[scala.Nothing], cb: js.Any): Writable = js.native
  def upload(options: String, buffer: Buffer): Writable = js.native
  def upload(options: String, buffer: Buffer, cb: js.Any): Writable = js.native
  def upload(options: UploadOptions): Writable = js.native
  def upload(options: UploadOptions, buffer: js.UndefOr[scala.Nothing], cb: js.Any): Writable = js.native
  def upload(options: UploadOptions, buffer: Buffer): Writable = js.native
  def upload(options: UploadOptions, buffer: Buffer, cb: js.Any): Writable = js.native
}
/* static members */
@JSImport("megajs", "Storage")
@js.native
object Storage extends js.Object {
  
  def fromJSON(json: JSON): Storage = js.native
}
