package typingsSlinky.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Header")
@js.native
class Header () extends StObject {
  
  var compression: Double = js.native
  
  var crsAlgorithm: Double = js.native
  
  var dataCipherUuid: KdbxUuid = js.native
  
  var encryptionIV: js.Any = js.native
  
  var endPos: Double = js.native
  
  def generateSalts(): Unit = js.native
  
  var kdfParameters: VarDictionary = js.native
  
  var keyEncryptionRounds: Double = js.native
  
  var masterSeed: js.typedarray.Uint8Array = js.native
  
  var protectedStreamKey: js.Any = js.native
  
  var publicCustomData: js.Any = js.native
  
  def readInnerHeader(stm: BinaryStream, ctx: Context): Unit = js.native
  
  var streamStartBytes: js.Any = js.native
  
  var transformSeed: js.Any = js.native
  
  def upgrade(): Unit = js.native
  
  var versionMajor: Double = js.native
  
  var versionMinor: Double = js.native
  
  def write(stm: BinaryStream): Unit = js.native
  
  def writeInnerHeader(stm: BinaryStream, ctx: Context): Unit = js.native
}
/* static members */
object Header {
  
  @JSImport("kdbxweb", "Header.create")
  @js.native
  def create(): Header = js.native
  
  @JSImport("kdbxweb", "Header.read")
  @js.native
  def read(stm: BinaryStream, ctx: Context): Header = js.native
}
