package typingsSlinky.extjs.Ext.dd

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.IEventObject
import typingsSlinky.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragTracker extends IObservable {
  
  /** [Property] (Boolean) */
  var active: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean/Number) */
  var autoStart: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Ext.util.Region/Ext.Element) */
  var constrainTo: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var delegate: js.UndefOr[String] = js.native
  
  /** [Property] (HTMLElement) */
  var dragTarget: js.UndefOr[HTMLElement] = js.native
  
  /** [Method] Returns the drag target
    * @returns Ext.Element The element currently being tracked.
    */
  var getDragTarget: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Returns the X Y offset of the current mouse position from the mousedown point
    * @param constrainMode String If omitted the true mouse position is returned. May be passed as point or dragTarget. See above.
    * @returns Number[] The X, Y offset from the mousedown point, optionally constrained.
    */
  var getOffset: js.UndefOr[js.Function1[/* constrainMode */ js.UndefOr[String], Array]] = js.native
  
  /** [Method] Initializes the DragTracker on a given element
    * @param el Ext.Element/HTMLElement The element
    */
  var initEl: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onBeforeStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onDrag: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onEnd: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Ext.EventObject The event object
    */
  var onStart: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  
  /** [Config Option] (String) */
  var overCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var stopEvent: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var tolerance: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.native
}
object IDragTracker {
  
  @scala.inline
  def apply(): IDragTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragTracker]
  }
  
  @scala.inline
  implicit class IDragTrackerMutableBuilder[Self <: IDragTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAutoStart(value: js.Any): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    @scala.inline
    def setConstrainTo(value: js.Any): Self = StObject.set(x, "constrainTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainToUndefined: Self = StObject.set(x, "constrainTo", js.undefined)
    
    @scala.inline
    def setDelegate(value: String): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    @scala.inline
    def setDragTarget(value: HTMLElement): Self = StObject.set(x, "dragTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragTargetUndefined: Self = StObject.set(x, "dragTarget", js.undefined)
    
    @scala.inline
    def setGetDragTarget(value: () => IElement): Self = StObject.set(x, "getDragTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDragTargetUndefined: Self = StObject.set(x, "getDragTarget", js.undefined)
    
    @scala.inline
    def setGetOffset(value: /* constrainMode */ js.UndefOr[String] => Array): Self = StObject.set(x, "getOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOffsetUndefined: Self = StObject.set(x, "getOffset", js.undefined)
    
    @scala.inline
    def setInitEl(value: /* el */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "initEl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitElUndefined: Self = StObject.set(x, "initEl", js.undefined)
    
    @scala.inline
    def setOnBeforeStart(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = StObject.set(x, "onBeforeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeStartUndefined: Self = StObject.set(x, "onBeforeStart", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnEnd(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    @scala.inline
    def setOverCls(value: String): Self = StObject.set(x, "overCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverClsUndefined: Self = StObject.set(x, "overCls", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    @scala.inline
    def setStopEvent(value: Boolean): Self = StObject.set(x, "stopEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    
    @scala.inline
    def setTrackOver(value: Boolean): Self = StObject.set(x, "trackOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackOverUndefined: Self = StObject.set(x, "trackOver", js.undefined)
  }
}
