package typingsSlinky.extjs.Ext.dd

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDrop extends IBase {
  /** [Method] Lets you specify a css class of elements that will not initiate a drag
  		* @param cssClass String the class of the elements you wish to ignore
  		*/
  var addInvalidHandleClass: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Lets you to specify an element id for a child of a drag handle that should not initiate a drag
  		* @param id String the element id of the element you wish to ignore
  		*/
  var addInvalidHandleId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Allows you to specify a tag name that should not start a drag operation when clicked
  		* @param tagName String the type of element to exclude
  		*/
  var addInvalidHandleType: js.UndefOr[js.Function1[/* tagName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Adds this instance to a group of related drag drop objects
  		* @param sGroup String the name of the group
  		*/
  var addToGroup: js.UndefOr[js.Function1[/* sGroup */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Applies the configuration parameters that were passed into the constructor  */
  var applyConfig: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var available: js.UndefOr[Boolean] = js.native
  /** [Method] Clears any constraints applied to this instance  */
  var clearConstraints: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Clears any tick interval defined for this instance */
  var clearTicks: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initializes the drag drop object s constraints to restrict movement to a certain element
  		* @param constrainTo String/HTMLElement/Ext.Element The element or element ID to constrain to.
  		* @param pad Object/Number Pad provides a way to specify "padding" of the constraints, and can be either a number for symmetrical padding (4 would be equal to {left:4, right:4, top:4, bottom:4}) or an object containing the sides to pad. For example: {right:10, bottom:10}
  		* @param inContent Boolean Constrain the draggable in the content box of the element (inside padding and borders)
  		*/
  var constrainTo: js.UndefOr[
    js.Function3[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* pad */ js.UndefOr[js.Any], 
      /* inContent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Property] (Object) */
  var defaultPadding: js.UndefOr[js.Any] = js.native
  /** [Method] Destroy this DragDrop instance */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Called when we are done dragging the object
  		* @param e Event the mouseup event
  		*/
  var endDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  /** [Method] Returns a reference to the actual element to drag
  		* @returns HTMLElement the html element
  		*/
  var getDragEl: js.UndefOr[js.Function0[HTMLElement]] = js.native
  /** [Method] Returns a reference to the linked element
  		* @returns HTMLElement the html element
  		*/
  var getEl: js.UndefOr[js.Function0[HTMLElement]] = js.native
  /** [Property] (Object) */
  var groups: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var hasOuterHandles: js.UndefOr[Boolean] = js.native
  /** [Property] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var ignoreSelf: js.UndefOr[Boolean] = js.native
  /** [Method] Sets up the DragDrop object
  		* @param id String the id of the linked element
  		* @param sGroup String the group of related items
  		* @param config Object configuration attributes
  		*/
  var init: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[String], 
      /* sGroup */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Initializes Targeting functionality only
  		* @param id String the id of the linked element
  		* @param sGroup String the group of related items
  		* @param config Object configuration attributes
  		*/
  var initTarget: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[String], 
      /* sGroup */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Property] (String[]) */
  var invalidHandleClasses: js.UndefOr[Array] = js.native
  /** [Property] (Object) */
  var invalidHandleIds: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var invalidHandleTypes: js.UndefOr[js.Any] = js.native
  /** [Method] Returns true if this instance is locked or the drag drop mgr is locked meaning that all drag drop is disabled on th
  		* @returns Boolean true if this obj or all drag/drop is locked, else false
  		*/
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Boolean) */
  var isTarget: js.UndefOr[Boolean] = js.native
  /** [Method] Checks the tag exclusion list to see if this click should be ignored
  		* @param node HTMLElement the HTMLElement to evaluate
  		* @returns Boolean true if this is a valid tag type, false if not
  		*/
  var isValidHandleChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], Boolean]] = js.native
  /** [Method] Locks this instance */
  var lock: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var maintainOffset: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var moveOnly: js.UndefOr[Boolean] = js.native
  /** [Method] Override the onAvailable method to do what is needed after the initial position was determined  */
  var onAvailable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Abstract method called during the onMouseMove event while dragging an object
  		* @param e Event the mousemove event
  		*/
  var onDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  /** [Method] Abstract method called when this item is dropped on another DragDrop obj
  		* @param e Event the mouseup event
  		* @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this was dropped on. In INTERSECT mode, an array of dd items this was dropped on.
  		*/
  var onDragDrop: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Abstract method called when this element fist begins hovering over another DragDrop obj
  		* @param e Event the mousemove event
  		* @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this is hovering over. In INTERSECT mode, an array of one or more dragdrop items being hovered over.
  		*/
  var onDragEnter: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Abstract method called when we are no longer hovering over an element
  		* @param e Event the mousemove event
  		* @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this was hovering over. In INTERSECT mode, an array of dd items that the mouse is no longer over.
  		*/
  var onDragOut: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Abstract method called when this element is hovering over another DragDrop obj
  		* @param e Event the mousemove event
  		* @param id String/Ext.dd.DragDrop[] In POINT mode, the element id this is hovering over. In INTERSECT mode, an array of dd items being hovered over.
  		*/
  var onDragOver: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Abstract method called when this item is dropped on an area with no drop target
  		* @param e Event the mouseup event
  		*/
  var onInvalidDrop: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  /** [Method] Called when a drag drop obj gets a mousedown
  		* @param e Event the mousedown event
  		*/
  var onMouseDown: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  /** [Method] Called when a drag drop obj gets a mouseup
  		* @param e Event the mouseup event
  		*/
  var onMouseUp: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.native
  /** [Property] (Number[]) */
  var padding: js.UndefOr[Array] = js.native
  /** [Property] (Boolean) */
  var primaryButtonOnly: js.UndefOr[Boolean] = js.native
  /** [Method] Removes this instance from the supplied interaction group
  		* @param sGroup String The group to drop
  		*/
  var removeFromGroup: js.UndefOr[js.Function1[/* sGroup */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Unsets an invalid css class
  		* @param cssClass String the class of the element(s) you wish to re-enable
  		*/
  var removeInvalidHandleClass: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Unsets an invalid handle id
  		* @param id String the id of the element to re-enable
  		*/
  var removeInvalidHandleId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Unsets an excluded tag name set by addInvalidHandleType
  		* @param tagName String the type of element to unexclude
  		*/
  var removeInvalidHandleType: js.UndefOr[js.Function1[/* tagName */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Must be called if you manually reposition a dd element
  		* @param maintainOffset Boolean
  		*/
  var resetConstraints: js.UndefOr[js.Function1[/* maintainOffset */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Allows you to specify that an element other than the linked element will be moved with the cursor during a drag
  		* @param id String the id of the element that will be used to initiate the drag
  		*/
  var setDragElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Allows you to specify a child of the linked element that should be used to initiate the drag operation
  		* @param id String the id of the element that will be used to initiate the drag.
  		*/
  var setHandleElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Stores the initial placement of the linked element
  		* @param diffX Number the X offset, default 0
  		* @param diffY Number the Y offset, default 0
  		*/
  var setInitPosition: js.UndefOr[
    js.Function2[/* diffX */ js.UndefOr[Double], /* diffY */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Allows you to set an element outside of the linked element as a drag handle
  		* @param id String the id of the element that will be used to initiate the drag
  		*/
  var setOuterHandleElId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Configures the padding for the target zone in px
  		* @param iTop Number Top pad
  		* @param iRight Number Right pad
  		* @param iBot Number Bot pad
  		* @param iLeft Number Left pad
  		*/
  var setPadding: js.UndefOr[
    js.Function4[
      /* iTop */ js.UndefOr[Double], 
      /* iRight */ js.UndefOr[Double], 
      /* iBot */ js.UndefOr[Double], 
      /* iLeft */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] By default the element can be dragged any place on the screen
  		* @param iLeft Number the number of pixels the element can move to the left
  		* @param iRight Number the number of pixels the element can move to the right
  		* @param iTickSize Number parameter for specifying that the element should move iTickSize pixels at a time.
  		*/
  var setXConstraint: js.UndefOr[
    js.Function3[
      /* iLeft */ js.UndefOr[Double], 
      /* iRight */ js.UndefOr[Double], 
      /* iTickSize */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] By default the element can be dragged any place on the screen
  		* @param iUp Number the number of pixels the element can move up
  		* @param iDown Number the number of pixels the element can move down
  		* @param iTickSize Number parameter for specifying that the element should move iTickSize pixels at a time.
  		*/
  var setYConstraint: js.UndefOr[
    js.Function3[
      /* iUp */ js.UndefOr[Double], 
      /* iDown */ js.UndefOr[Double], 
      /* iTickSize */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Abstract method called after a drag drop object is clicked and the drag or mousedown time thresholds have beeen met
  		* @param x Number X click location
  		* @param y Number Y click location
  		*/
  var startDrag: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] toString method
  		* @returns String string representation of the dd obj
  		*/
  @JSName("toString")
  var toString_FIDragDrop: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Unlocks this instace */
  var unlock: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Removes all drag and drop hooks for this element */
  var unreg: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Number[]) */
  var xTicks: js.UndefOr[Array] = js.native
  /** [Property] (Number[]) */
  var yTicks: js.UndefOr[Array] = js.native
}

object IDragDrop {
  @scala.inline
  def apply(): IDragDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragDrop]
  }
  @scala.inline
  implicit class IDragDropOps[Self <: IDragDrop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddInvalidHandleClass(value: /* cssClass */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInvalidHandleClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddInvalidHandleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInvalidHandleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAddInvalidHandleId(value: /* id */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInvalidHandleId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddInvalidHandleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInvalidHandleId")(js.undefined)
        ret
    }
    @scala.inline
    def withAddInvalidHandleType(value: /* tagName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInvalidHandleType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddInvalidHandleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInvalidHandleType")(js.undefined)
        ret
    }
    @scala.inline
    def withAddToGroup(value: /* sGroup */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddToGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyConfig(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutApplyConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.undefined)
        ret
    }
    @scala.inline
    def withClearConstraints(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearConstraints")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withClearTicks(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTicks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainTo(
      value: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutConstrainTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDrag(value: /* e */ js.UndefOr[Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEndDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDragEl(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragEl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDragEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDragEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEl(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withHasOuterHandles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOuterHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasOuterHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasOuterHandles")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(
      value: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withInitTarget(
      value: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initTarget")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInitTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidHandleClasses(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidHandleClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidHandleClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidHandleClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidHandleIds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidHandleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidHandleIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidHandleIds")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidHandleTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidHandleTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidHandleTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidHandleTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLocked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValidHandleChild(value: /* node */ js.UndefOr[HTMLElement] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidHandleChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsValidHandleChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidHandleChild")(js.undefined)
        ret
    }
    @scala.inline
    def withLock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAvailable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAvailable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* e */ js.UndefOr[Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragDrop(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragDrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOut(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalidDrop(value: /* e */ js.UndefOr[Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInvalidDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: /* e */ js.UndefOr[Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: /* e */ js.UndefOr[Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryButtonOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryButtonOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFromGroup(value: /* sGroup */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFromGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveFromGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFromGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveInvalidHandleClass(value: /* cssClass */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInvalidHandleClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveInvalidHandleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInvalidHandleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveInvalidHandleId(value: /* id */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInvalidHandleId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveInvalidHandleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInvalidHandleId")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveInvalidHandleType(value: /* tagName */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInvalidHandleType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveInvalidHandleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInvalidHandleType")(js.undefined)
        ret
    }
    @scala.inline
    def withResetConstraints(value: /* maintainOffset */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetConstraints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResetConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDragElId(value: /* id */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDragElId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDragElId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDragElId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHandleElId(value: /* id */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandleElId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHandleElId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandleElId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInitPosition(value: (/* diffX */ js.UndefOr[Double], /* diffY */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetInitPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOuterHandleElId(value: /* id */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOuterHandleElId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOuterHandleElId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOuterHandleElId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPadding(
      value: (/* iTop */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iBot */ js.UndefOr[Double], /* iLeft */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPadding")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSetXConstraint(
      value: (/* iLeft */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXConstraint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetXConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withSetYConstraint(
      value: (/* iUp */ js.UndefOr[Double], /* iDown */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYConstraint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetYConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDrag(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStartDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.undefined)
        ret
    }
    @scala.inline
    def withUnreg(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreg")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnreg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreg")(js.undefined)
        ret
    }
    @scala.inline
    def withXTicks(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withYTicks(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yTicks")(js.undefined)
        ret
    }
  }
  
}

