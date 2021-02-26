package typingsSlinky.materialUi.MaterialUI

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.react.mod.Props because var conflicts: children. Inlined ref, key */ @js.native
trait DialogProps
  extends DOMAttributes[js.Object] {
  
  /** @deprecated use a custom `actions` property instead */
  var actionFocus: js.UndefOr[String] = js.native
  
  var actions: js.UndefOr[js.Array[DialogAction | ReactElement]] = js.native
  
  var actionsContainerClassName: js.UndefOr[String] = js.native
  
  var actionsContainerStyle: js.UndefOr[CSSProperties] = js.native
  
  var autoDetectWindowHeight: js.UndefOr[Boolean] = js.native
  
  var autoScrollBodyContent: js.UndefOr[Boolean] = js.native
  
  var bodyClassName: js.UndefOr[String] = js.native
  
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var contentClassName: js.UndefOr[String] = js.native
  
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var onRequestClose: js.UndefOr[js.Function1[/* buttonClicked */ Boolean, Unit]] = js.native
  
  var open: Boolean = js.native
  
  var overlayClassName: js.UndefOr[String] = js.native
  
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  
  var paperClassName: js.UndefOr[String] = js.native
  
  var paperProps: js.UndefOr[js.Any] = js.native
  
  var ref: js.UndefOr[LegacyRef[Dialog]] = js.native
  
  var repositionOnUpdate: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
  
  var titleClassName: js.UndefOr[String] = js.native
  
  var titleStyle: js.UndefOr[CSSProperties] = js.native
}
object DialogProps {
  
  @scala.inline
  def apply(open: Boolean): DialogProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
  
  @scala.inline
  implicit class DialogPropsMutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionFocus(value: String): Self = StObject.set(x, "actionFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionFocusUndefined: Self = StObject.set(x, "actionFocus", js.undefined)
    
    @scala.inline
    def setActions(value: js.Array[DialogAction | ReactElement]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsContainerClassName(value: String): Self = StObject.set(x, "actionsContainerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsContainerClassNameUndefined: Self = StObject.set(x, "actionsContainerClassName", js.undefined)
    
    @scala.inline
    def setActionsContainerStyle(value: CSSProperties): Self = StObject.set(x, "actionsContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsContainerStyleUndefined: Self = StObject.set(x, "actionsContainerStyle", js.undefined)
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: (DialogAction | ReactElement)*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setAutoDetectWindowHeight(value: Boolean): Self = StObject.set(x, "autoDetectWindowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDetectWindowHeightUndefined: Self = StObject.set(x, "autoDetectWindowHeight", js.undefined)
    
    @scala.inline
    def setAutoScrollBodyContent(value: Boolean): Self = StObject.set(x, "autoScrollBodyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollBodyContentUndefined: Self = StObject.set(x, "autoScrollBodyContent", js.undefined)
    
    @scala.inline
    def setBodyClassName(value: String): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
    
    @scala.inline
    def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
    
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setOnRequestClose(value: /* buttonClicked */ Boolean => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
    
    @scala.inline
    def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    @scala.inline
    def setPaperClassName(value: String): Self = StObject.set(x, "paperClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperClassNameUndefined: Self = StObject.set(x, "paperClassName", js.undefined)
    
    @scala.inline
    def setPaperProps(value: js.Any): Self = StObject.set(x, "paperProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperPropsUndefined: Self = StObject.set(x, "paperProps", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[Dialog]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ Dialog | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[Dialog]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRepositionOnUpdate(value: Boolean): Self = StObject.set(x, "repositionOnUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositionOnUpdateUndefined: Self = StObject.set(x, "repositionOnUpdate", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleClassName(value: String): Self = StObject.set(x, "titleClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleClassNameUndefined: Self = StObject.set(x, "titleClassName", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
