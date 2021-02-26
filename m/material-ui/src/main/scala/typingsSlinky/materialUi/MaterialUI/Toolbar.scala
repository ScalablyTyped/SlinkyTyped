package typingsSlinky.materialUi.MaterialUI

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar {
  
  type Toolbar = ReactComponentClass[ToolbarProps]
  
  type ToolbarGroup = ReactComponentClass[ToolbarGroupProps]
  
  @js.native
  trait ToolbarGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var firstChild: js.UndefOr[Boolean] = js.native
    
    var float: js.UndefOr[left | right] = js.native
    
    var lastChild: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ToolbarGroupProps {
    
    @scala.inline
    def apply(): ToolbarGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarGroupProps]
    }
    
    @scala.inline
    implicit class ToolbarGroupPropsMutableBuilder[Self <: ToolbarGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFirstChild(value: Boolean): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
      
      @scala.inline
      def setFloat(value: left | right): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setLastChild(value: Boolean): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var noGutter: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ToolbarProps {
    
    @scala.inline
    def apply(): ToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarProps]
    }
    
    @scala.inline
    implicit class ToolbarPropsMutableBuilder[Self <: ToolbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setNoGutter(value: Boolean): Self = StObject.set(x, "noGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoGutterUndefined: Self = StObject.set(x, "noGutter", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type ToolbarSeparator = ReactComponentClass[ToolbarSeparatorProps]
  
  @js.native
  trait ToolbarSeparatorProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ToolbarSeparatorProps {
    
    @scala.inline
    def apply(): ToolbarSeparatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSeparatorProps]
    }
    
    @scala.inline
    implicit class ToolbarSeparatorPropsMutableBuilder[Self <: ToolbarSeparatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarTitle
    extends Component[ToolbarTitleProps, js.Object, js.Any]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.react.mod.Props because var conflicts: children. Inlined ref, key */ @js.native
  trait ToolbarTitleProps
    extends HTMLAttributes[js.Object] {
    
    var key: js.UndefOr[Key] = js.native
    
    var ref: js.UndefOr[LegacyRef[ToolbarTitle]] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object ToolbarTitleProps {
    
    @scala.inline
    def apply(): ToolbarTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarTitleProps]
    }
    
    @scala.inline
    implicit class ToolbarTitlePropsMutableBuilder[Self <: ToolbarTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setRef(value: LegacyRef[ToolbarTitle]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ ToolbarTitle | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[ToolbarTitle]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
