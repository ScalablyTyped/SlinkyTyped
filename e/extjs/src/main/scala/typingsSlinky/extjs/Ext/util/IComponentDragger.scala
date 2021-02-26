package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.dd.IDragTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComponentDragger extends IDragTracker {
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var constrainDelegate: js.UndefOr[Boolean] = js.native
  
  /** [Method] Move either the ghost Component or the target Component to its new position on drag
    * @param e Object
    */
  @JSName("onDrag")
  var onDrag_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onEnd")
  var onEnd_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onStart")
  var onStart_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}
object IComponentDragger {
  
  @scala.inline
  def apply(): IComponentDragger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentDragger]
  }
  
  @scala.inline
  implicit class IComponentDraggerMutableBuilder[Self <: IComponentDragger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainDelegate(value: Boolean): Self = StObject.set(x, "constrainDelegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainDelegateUndefined: Self = StObject.set(x, "constrainDelegate", js.undefined)
    
    @scala.inline
    def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnEnd(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
