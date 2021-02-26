package typingsSlinky.browserfs.zipFSMod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/ZipFS", "DataDescriptor")
@js.native
class DataDescriptor protected () extends StObject {
  def this(data: Buffer) = this()
  
  def compressedSize(): Double = js.native
  
  def crc32(): Double = js.native
  
  var data: js.Any = js.native
  
  def uncompressedSize(): Double = js.native
}
