package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import typingsSlinky.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IFaxIncomingMessage interface */
@js.native
trait IFaxIncomingMessage extends StObject {
  
  /** Called Station ID */
  val CSID: String = js.native
  
  /** Caller ID */
  val CallerId: String = js.native
  
  /** Copy Tiff image to the local file */
  def CopyTiff(bstrTiffPath: String): Unit = js.native
  
  /** Delete the message from the archive */
  def Delete(): Unit = js.native
  
  /** Name of the device that received the message */
  val DeviceName: String = js.native
  
  /** Unique message ID */
  val Id: String = js.native
  
  /** Total number of pages */
  val Pages: Double = js.native
  
  /** Number of failed routing retries */
  val Retries: Double = js.native
  
  /** Routing information */
  val RoutingInformation: String = js.native
  
  /** Size in bytes of the message's TIFF file */
  val Size: Double = js.native
  
  /** Transmitting Station ID */
  val TSID: String = js.native
  
  /** Transmission end time */
  val TransmissionEnd: VarDate = js.native
  
  /** Transmission start time */
  val TransmissionStart: VarDate = js.native
}
object IFaxIncomingMessage {
  
  @scala.inline
  def apply(
    CSID: String,
    CallerId: String,
    CopyTiff: String => Unit,
    Delete: () => Unit,
    DeviceName: String,
    Id: String,
    Pages: Double,
    Retries: Double,
    RoutingInformation: String,
    Size: Double,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate
  ): IFaxIncomingMessage = {
    val __obj = js.Dynamic.literal(CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], CopyTiff = js.Any.fromFunction1(CopyTiff), Delete = js.Any.fromFunction0(Delete), DeviceName = DeviceName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFaxIncomingMessage]
  }
  
  @scala.inline
  implicit class IFaxIncomingMessageMutableBuilder[Self <: IFaxIncomingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCSID(value: String): Self = StObject.set(x, "CSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerId(value: String): Self = StObject.set(x, "CallerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTiff(value: String => Unit): Self = StObject.set(x, "CopyTiff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Double): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetries(value: Double): Self = StObject.set(x, "Retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingInformation(value: String): Self = StObject.set(x, "RoutingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSID(value: String): Self = StObject.set(x, "TSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionEnd(value: VarDate): Self = StObject.set(x, "TransmissionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransmissionStart(value: VarDate): Self = StObject.set(x, "TransmissionStart", value.asInstanceOf[js.Any])
  }
}
