package typingsSlinky.materialSegmentedButton

import typingsSlinky.materialSegmentedButton.typesMod.SegmentDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/segmented-button/segmented-button/adapter", JSImport.Namespace)
@js.native
object adapterMod extends js.Object {
  
  @js.native
  trait MDCSegmentedButtonAdapter extends js.Object {
    
    /**
      * @return Returns child segments represented as readonly list of
      * SegmentDetails
      */
    def getSegments(): js.Array[SegmentDetail] = js.native
    
    /**
      * @param className Class of interest
      * @return Returns true if segmented button has css class, otherwise returns
      * false
      */
    def hasClass(className: String): Boolean = js.native
    
    /**
      * Emits event about changed child segment to client
      *
      * @param detail Changed child segment represented as a SegmentDetail
      * @event change With detail - SegmentDetail
      */
    def notifySelectedChange(detail: SegmentDetail): Unit = js.native
    
    def selectSegment(indexOrSegmentId: String): Unit = js.native
    /**
      * Sets identified child segment to be selected
      *
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      */
    def selectSegment(indexOrSegmentId: Double): Unit = js.native
    
    def unselectSegment(indexOrSegmentId: String): Unit = js.native
    /**
      * Sets identified child segment to be not selected
      *
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      */
    def unselectSegment(indexOrSegmentId: Double): Unit = js.native
  }
}
