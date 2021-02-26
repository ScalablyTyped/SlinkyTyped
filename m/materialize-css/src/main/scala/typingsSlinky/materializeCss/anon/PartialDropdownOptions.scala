package typingsSlinky.materializeCss.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.Dropdown
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.DropdownOptions> */
@js.native
trait PartialDropdownOptions extends StObject {
  
  var alignment: js.UndefOr[left | right] = js.native
  
  var autoTrigger: js.UndefOr[Boolean] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var constrainWidth: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[Element] = js.native
  
  var coverTrigger: js.UndefOr[Boolean] = js.native
  
  var hover: js.UndefOr[Boolean] = js.native
  
  var inDuration: js.UndefOr[Double] = js.native
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.native
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.native
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.native
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.native
  
  var outDuration: js.UndefOr[Double] = js.native
}
object PartialDropdownOptions {
  
  @scala.inline
  def apply(): PartialDropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDropdownOptions]
  }
  
  @scala.inline
  implicit class PartialDropdownOptionsMutableBuilder[Self <: PartialDropdownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setAutoTrigger(value: Boolean): Self = StObject.set(x, "autoTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTriggerUndefined: Self = StObject.set(x, "autoTrigger", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    @scala.inline
    def setConstrainWidth(value: Boolean): Self = StObject.set(x, "constrainWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainWidthUndefined: Self = StObject.set(x, "constrainWidth", js.undefined)
    
    @scala.inline
    def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCoverTrigger(value: Boolean): Self = StObject.set(x, "coverTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverTriggerUndefined: Self = StObject.set(x, "coverTrigger", js.undefined)
    
    @scala.inline
    def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    @scala.inline
    def setOnCloseEnd(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    @scala.inline
    def setOnCloseStart(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    @scala.inline
    def setOnOpenEnd(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    @scala.inline
    def setOnOpenStart(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    @scala.inline
    def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
  }
}
