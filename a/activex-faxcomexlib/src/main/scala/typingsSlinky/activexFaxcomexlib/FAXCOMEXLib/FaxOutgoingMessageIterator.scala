package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingMessageIterator Class */
@js.native
trait FaxOutgoingMessageIterator extends StObject {
  
  /** End of archive marker */
  val AtEOF: Boolean = js.native
  
  @JSName("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: FaxOutgoingMessageIterator = js.native
  
  /** Current message */
  val Message: IFaxOutgoingMessage = js.native
  
  /** Move to the first message */
  def MoveFirst(): Unit = js.native
  
  /** Move to the next message */
  def MoveNext(): Unit = js.native
  
  /** Size of prefetch buffer */
  var PrefetchSize: Double = js.native
}
object FaxOutgoingMessageIterator {
  
  @scala.inline
  def apply(
    AtEOF: Boolean,
    FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: FaxOutgoingMessageIterator,
    Message: IFaxOutgoingMessage,
    MoveFirst: () => Unit,
    MoveNext: () => Unit,
    PrefetchSize: Double
  ): FaxOutgoingMessageIterator = {
    val __obj = js.Dynamic.literal(AtEOF = AtEOF.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MoveFirst = js.Any.fromFunction0(MoveFirst), MoveNext = js.Any.fromFunction0(MoveNext), PrefetchSize = PrefetchSize.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")(FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutgoingMessageIterator]
  }
  
  @scala.inline
  implicit class FaxOutgoingMessageIteratorMutableBuilder[Self <: FaxOutgoingMessageIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtEOF(value: Boolean): Self = StObject.set(x, "AtEOF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxOutgoingMessageIterator_typekey(value: FaxOutgoingMessageIterator): Self = StObject.set(x, "FAXCOMEXLib.FaxOutgoingMessageIterator_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: IFaxOutgoingMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveFirst(value: () => Unit): Self = StObject.set(x, "MoveFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Unit): Self = StObject.set(x, "MoveNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefetchSize(value: Double): Self = StObject.set(x, "PrefetchSize", value.asInstanceOf[js.Any])
  }
}
