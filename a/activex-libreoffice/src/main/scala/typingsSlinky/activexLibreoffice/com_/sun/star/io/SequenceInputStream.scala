package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service allows to wrap a sequence of bytes with a stream object. */
@js.native
trait SequenceInputStream extends XSeekableInputStream {
  
  /** allows to create a stream based on the sequence. */
  def createStreamFromSequence(aData: SeqEquiv[Double]): Unit = js.native
}
object SequenceInputStream {
  
  @scala.inline
  def apply(
    Length: Double,
    Position: Double,
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    createStreamFromSequence: SeqEquiv[Double] => Unit,
    getLength: () => Double,
    getPosition: () => Double,
    queryInterface: `type` => js.Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: () => Unit,
    seek: Double => Unit,
    skipBytes: Double => Unit
  ): SequenceInputStream = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), createStreamFromSequence = js.Any.fromFunction1(createStreamFromSequence), getLength = js.Any.fromFunction0(getLength), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), seek = js.Any.fromFunction1(seek), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[SequenceInputStream]
  }
  
  @scala.inline
  implicit class SequenceInputStreamMutableBuilder[Self <: SequenceInputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateStreamFromSequence(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "createStreamFromSequence", js.Any.fromFunction1(value))
  }
}
