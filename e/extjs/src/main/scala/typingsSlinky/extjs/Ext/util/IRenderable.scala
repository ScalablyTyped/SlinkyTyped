package typingsSlinky.extjs.Ext.util

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.core.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRenderable extends IBase {
  
  /** [Method] Allows addition of behavior after rendering is complete  */
  var afterRender: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Handles autoRender  */
  var doAutoRender: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Ensures that this component is attached to document body
    * @param runLayout Boolean True to run the component's layout.
    */
  var ensureAttachedToBody: js.UndefOr[js.Function1[/* runLayout */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] This function takes the position argument passed to onRender and returns a DOM element that you can use in the insert
    * @param position String/Number/Ext.dom.Element/HTMLElement Index, element id or element you want to put this component before.
    * @returns HTMLElement DOM element that you can use in the insertBefore
    */
  var getInsertPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[js.Any], HTMLElement]] = js.native
  
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
    * @returns Object Object with keys and values that are going to be applied to the renderTpl
    */
  var initRenderData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Template method called when this Component s DOM structure is created
    * @param parentNode Ext.core.Element The parent Element in which this Component's encapsulating element is contained.
    * @param containerIdx Number The index within the parent Container's child collection of this Component.
    */
  var onRender: js.UndefOr[
    js.Function2[/* parentNode */ js.UndefOr[IElement], /* containerIdx */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /** [Method] Renders the Component into the passed HTML element
    * @param container Ext.Element/HTMLElement/String The element this Component should be rendered into. If it is being created from existing markup, this should be omitted.
    * @param position String/Number The element ID or DOM node index within the container before which this component will be inserted (defaults to appending to the end of the container)
    */
  var render: js.UndefOr[
    js.Function2[/* container */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object IRenderable {
  
  @scala.inline
  def apply(): IRenderable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRenderable]
  }
  
  @scala.inline
  implicit class IRenderableMutableBuilder[Self <: IRenderable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRender(value: () => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    @scala.inline
    def setDoAutoRender(value: () => Unit): Self = StObject.set(x, "doAutoRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoAutoRenderUndefined: Self = StObject.set(x, "doAutoRender", js.undefined)
    
    @scala.inline
    def setEnsureAttachedToBody(value: /* runLayout */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "ensureAttachedToBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnsureAttachedToBodyUndefined: Self = StObject.set(x, "ensureAttachedToBody", js.undefined)
    
    @scala.inline
    def setGetInsertPosition(value: /* position */ js.UndefOr[js.Any] => HTMLElement): Self = StObject.set(x, "getInsertPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInsertPositionUndefined: Self = StObject.set(x, "getInsertPosition", js.undefined)
    
    @scala.inline
    def setInitRenderData(value: () => _): Self = StObject.set(x, "initRenderData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitRenderDataUndefined: Self = StObject.set(x, "initRenderData", js.undefined)
    
    @scala.inline
    def setOnRender(value: (/* parentNode */ js.UndefOr[IElement], /* containerIdx */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    @scala.inline
    def setRender(value: (/* container */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
