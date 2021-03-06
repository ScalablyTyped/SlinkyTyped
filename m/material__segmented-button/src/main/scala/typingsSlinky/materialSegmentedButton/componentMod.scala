package typingsSlinky.materialSegmentedButton

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialSegmentedButton.foundationMod.MDCSegmentedButtonFoundation
import typingsSlinky.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment
import typingsSlinky.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegmentFactory
import typingsSlinky.materialSegmentedButton.typesMod.SegmentDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/segmented-button/segmented-button/component", "MDCSegmentedButton")
  @js.native
  class MDCSegmentedButton protected () extends MDCComponent[MDCSegmentedButtonFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCSegmentedButtonFoundation, args: js.Any*) = this()
    
    /**
      * @return Returns readonly list of selected child segments as SegmentDetails
      */
    def getSelectedSegments(): js.Array[SegmentDetail] = js.native
    
    var handleSelected: js.Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(segmentFactory: MDCSegmentedButtonSegmentFactory): Unit = js.native
    
    /**
      * @param segmentFactory Factory to create new child segments
      * @return Returns list of child segments found in DOM
      */
    var instantiateSegments: js.Any = js.native
    
    def isSegmentSelected(indexOrSegmentId: String): Boolean = js.native
    /**
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      * @return Returns true if identified child segment is currently selected,
      * otherwise returns false
      */
    def isSegmentSelected(indexOrSegmentId: Double): Boolean = js.native
    
    /**
      * @return Returns child segments mapped to readonly SegmentDetail list
      */
    var mappedSegments: js.Any = js.native
    
    var segmentFactory: js.Any = js.native
    
    def segments: js.Array[MDCSegmentedButtonSegment] = js.native
    
    var segments_ : js.Any = js.native
    
    def selectSegment(indexOrSegmentId: String): Unit = js.native
    /**
      * Sets identified segment to be selected
      *
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      */
    def selectSegment(indexOrSegmentId: Double): Unit = js.native
    
    def unselectSegment(indexOrSegmentId: String): Unit = js.native
    /**
      * Sets identified segment to be not selected
      *
      * @param indexOrSegmentId Number index or string segmentId that identifies
      * child segment
      */
    def unselectSegment(indexOrSegmentId: Double): Unit = js.native
  }
  /* static members */
  object MDCSegmentedButton {
    
    @JSImport("@material/segmented-button/segmented-button/component", "MDCSegmentedButton.attachTo")
    @js.native
    def attachTo(root: Element): MDCSegmentedButton = js.native
  }
}
