package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides recording functionality of dispatches
  *
  * With such recorder it will be possible to record requests of type {@link XDispatch} by using additional interface {@link XRecordableDispatch} . The
  * result of that will be a a script which can be used to start the dispatch at later time again. Such recorder objects are available on a {@link
  * XDispatchRecorderSupplier} which is provided by the {@link Frame} service.
  * @see Frame
  * @see XDispatchRecorderSupplier
  * @since OOo 1.1.2
  */
@js.native
trait XDispatchRecorder extends XInterface {
  
  /**
    * returns the recorded source code
    *
    * This method must be used before {@link endRecording()} is called! Otherwise the macro will be released.
    * @returns the recorded data as a string which can be interpreted as a script
    */
  val RecordedMacro: String = js.native
  
  /**
    * stops the recording process
    *
    * Must be called in pairs with {@link XDispatchRecorder.startRecording()} .
    * @see getRecordedMacro()
    */
  def endRecording(): Unit = js.native
  
  /**
    * returns the recorded source code
    *
    * This method must be used before {@link endRecording()} is called! Otherwise the macro will be released.
    * @returns the recorded data as a string which can be interpreted as a script
    */
  def getRecordedMacro(): String = js.native
  
  /**
    * records a single dispatch call identified by its command URL
    * @param URL the full parsed command URL
    * @param Arguments optional arguments for the command URL ;  (see {@link com.sun.star.document.MediaDescriptor} for further information)
    */
  def recordDispatch(URL: URL, Arguments: SeqEquiv[PropertyValue]): Unit = js.native
  
  /**
    * records a single dispatch call identified by its command URL, but comments it out
    *
    * This way calls that failed on execution can be documented.
    * @param URL the full parsed command URL
    * @param Arguments optional arguments for the command URL ;  (see {@link com.sun.star.document.MediaDescriptor} for further information)
    */
  def recordDispatchAsComment(URL: URL, Arguments: SeqEquiv[PropertyValue]): Unit = js.native
  
  /**
    * initializes the recorder by passing the frame for which all macro statements shall be recorded
    * @param Frame it includes the document on which such requests shall be recorded
    */
  def startRecording(Frame: XFrame): Unit = js.native
}
object XDispatchRecorder {
  
  @scala.inline
  def apply(
    RecordedMacro: String,
    acquire: () => Unit,
    endRecording: () => Unit,
    getRecordedMacro: () => String,
    queryInterface: `type` => js.Any,
    recordDispatch: (URL, SeqEquiv[PropertyValue]) => Unit,
    recordDispatchAsComment: (URL, SeqEquiv[PropertyValue]) => Unit,
    release: () => Unit,
    startRecording: XFrame => Unit
  ): XDispatchRecorder = {
    val __obj = js.Dynamic.literal(RecordedMacro = RecordedMacro.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), endRecording = js.Any.fromFunction0(endRecording), getRecordedMacro = js.Any.fromFunction0(getRecordedMacro), queryInterface = js.Any.fromFunction1(queryInterface), recordDispatch = js.Any.fromFunction2(recordDispatch), recordDispatchAsComment = js.Any.fromFunction2(recordDispatchAsComment), release = js.Any.fromFunction0(release), startRecording = js.Any.fromFunction1(startRecording))
    __obj.asInstanceOf[XDispatchRecorder]
  }
  
  @scala.inline
  implicit class XDispatchRecorderMutableBuilder[Self <: XDispatchRecorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndRecording(value: () => Unit): Self = StObject.set(x, "endRecording", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordedMacro(value: () => String): Self = StObject.set(x, "getRecordedMacro", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecordDispatch(value: (URL, SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "recordDispatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRecordDispatchAsComment(value: (URL, SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "recordDispatchAsComment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRecordedMacro(value: String): Self = StObject.set(x, "RecordedMacro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRecording(value: XFrame => Unit): Self = StObject.set(x, "startRecording", js.Any.fromFunction1(value))
  }
}
