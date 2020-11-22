package typingsSlinky.materialSegmentedButton

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialRipple.componentMod.MDCRipple
import typingsSlinky.materialRipple.componentMod.MDCRippleFactory
import typingsSlinky.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/segmented-button/segment/component", JSImport.Namespace)
@js.native
object segmentComponentMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @js.native
  class MDCSegmentedButtonSegment () extends MDCComponent[MDCSegmentedButtonSegmentFoundation] {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * @return Returns segment's segmentId if it was set by client
      */
    def getSegmentId(): js.UndefOr[String] = js.native
    
    var handleClick: js.Any = js.native
    
    var index: js.Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    
    /**
      * @return Returns true if segment is currently selected, otherwise returns
      * false
      */
    def isSelected(): Boolean = js.native
    
    var isSingleSelect: js.Any = js.native
    
    def ripple: MDCRipple = js.native
    
    var rippleComponent: js.Any = js.native
    
    /**
      * Sets segment's index value
      *
      * @param index Segment's index within wrapping segmented button
      */
    def setIndex(index: Double): Unit = js.native
    
    /**
      * Sets segment's isSingleSelect value
      *
      * @param isSingleSelect True if wrapping segmented button is single select
      */
    def setIsSingleSelect(isSingleSelect: Boolean): Unit = js.native
    
    /**
      * Sets segment to be selected
      */
    def setSelected(): Unit = js.native
    
    /**
      * Sets segment to be not selected
      */
    def setUnselected(): Unit = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  @js.native
  object MDCSegmentedButtonSegment extends js.Object {
    
    def attachTo(root: Element): MDCSegmentedButtonSegment = js.native
  }
  
  type MDCSegmentedButtonSegmentFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCSegmentedButtonSegmentFoundation], 
    MDCSegmentedButtonSegment
  ]
}
