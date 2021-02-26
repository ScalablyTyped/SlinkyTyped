package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface offers access to the written bytes */
@js.native
trait XSequenceOutputStream extends XOutputStream {
  
  /** allows to get access to the written data */
  val WrittenBytes: SafeArray[Double] = js.native
  
  /** allows to get access to the written data */
  def getWrittenBytes(): SafeArray[Double] = js.native
}
object XSequenceOutputStream {
  
  @scala.inline
  def apply(
    WrittenBytes: SafeArray[Double],
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    getWrittenBytes: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    writeBytes: SeqEquiv[Double] => Unit
  ): XSequenceOutputStream = {
    val __obj = js.Dynamic.literal(WrittenBytes = WrittenBytes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getWrittenBytes = js.Any.fromFunction0(getWrittenBytes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBytes = js.Any.fromFunction1(writeBytes))
    __obj.asInstanceOf[XSequenceOutputStream]
  }
  
  @scala.inline
  implicit class XSequenceOutputStreamMutableBuilder[Self <: XSequenceOutputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetWrittenBytes(value: () => SafeArray[Double]): Self = StObject.set(x, "getWrittenBytes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrittenBytes(value: SafeArray[Double]): Self = StObject.set(x, "WrittenBytes", value.asInstanceOf[js.Any])
  }
}
