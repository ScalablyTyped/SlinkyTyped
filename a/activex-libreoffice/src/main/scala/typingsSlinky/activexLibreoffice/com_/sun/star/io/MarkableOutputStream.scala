package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to set marks in an outputstream and to later jump back to these marks.
  *
  * The implementation stores the data as long as marks exists and later writes these data into the output stream, that has been set previously at the
  * {@link XActiveDataSource} interface.
  */
@js.native
trait MarkableOutputStream
  extends XOutputStream
     with XMarkableStream
     with XActiveDataSource
     with XConnectable
object MarkableOutputStream {
  
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: () => Unit,
    closeOutput: () => Unit,
    createMark: () => Double,
    deleteMark: Double => Unit,
    flush: () => Unit,
    getOutputStream: () => XOutputStream,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    jumpToFurthest: () => Unit,
    jumpToMark: Double => Unit,
    offsetToMark: Double => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setOutputStream: XOutputStream => Unit,
    setPredecessor: XConnectable => Unit,
    setSuccessor: XConnectable => Unit,
    writeBytes: SeqEquiv[Double] => Unit
  ): MarkableOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), createMark = js.Any.fromFunction0(createMark), deleteMark = js.Any.fromFunction1(deleteMark), flush = js.Any.fromFunction0(flush), getOutputStream = js.Any.fromFunction0(getOutputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), jumpToFurthest = js.Any.fromFunction0(jumpToFurthest), jumpToMark = js.Any.fromFunction1(jumpToMark), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), writeBytes = js.Any.fromFunction1(writeBytes))
    __obj.asInstanceOf[MarkableOutputStream]
  }
}
