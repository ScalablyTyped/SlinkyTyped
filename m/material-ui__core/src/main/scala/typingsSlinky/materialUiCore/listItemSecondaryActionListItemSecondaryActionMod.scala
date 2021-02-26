package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiCore.anon.PartialClassNameMapListItRoot
import typingsSlinky.materialUiCore.materialUiCoreStrings.root
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemSecondaryActionListItemSecondaryActionMod extends Shortcut {
  
  @JSImport("@material-ui/core/ListItemSecondaryAction/ListItemSecondaryAction", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ListItemSecondaryActionProps] = js.native
  
  type ListItemSecondaryActionClassKey = root
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/ListItemSecondaryAction/ListItemSecondaryAction.ListItemSecondaryActionClassKey, never> */
  @js.native
  trait ListItemSecondaryActionProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[PartialClassNameMapListItRoot] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ListItemSecondaryActionProps {
    
    @scala.inline
    def apply(): ListItemSecondaryActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemSecondaryActionProps]
    }
    
    @scala.inline
    implicit class ListItemSecondaryActionPropsMutableBuilder[Self <: ListItemSecondaryActionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialClassNameMapListItRoot): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[_] | ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ListItemSecondaryActionProps]
  
  /* This means you don't have to write `default`, but can instead just say `listItemSecondaryActionListItemSecondaryActionMod.foo` */
  override def _to: ReactComponentClass[ListItemSecondaryActionProps] = default
}
