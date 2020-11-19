package typingsSlinky.bip174.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.bip174.interfacesMod.Transaction
import typingsSlinky.bip174.interfacesMod.TransactionFromBuffer
import typingsSlinky.bip174.mod.Psbt
import typingsSlinky.node.Buffer
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPsbt extends Instantiable1[/* tx */ Transaction, Psbt] {
  
  def fromBase64[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  
  def fromBuffer[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](buffer: Buffer, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
  
  def fromHex[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Psbt */ js.Any */](data: String, txFromBuffer: TransactionFromBuffer): InstanceType[T] = js.native
}
