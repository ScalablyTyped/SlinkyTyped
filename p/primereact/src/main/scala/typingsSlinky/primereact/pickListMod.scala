package typingsSlinky.primereact

import slinky.core.facade.ReactElement
import typingsSlinky.primereact.anon.Source
import typingsSlinky.primereact.anon.Value
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickListMod {
  
  @JSImport("primereact/components/picklist/PickList", "PickList")
  @js.native
  class PickList protected ()
    extends Component[PickListProps, js.Any, js.Any] {
    def this(props: PickListProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickListProps, context: js.Any) = this()
  }
  
  @js.native
  trait PickListProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[ReactElement]]] = js.native
    
    var metaKeySelection: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ Source, Unit]] = js.native
    
    var onMoveAllToSource: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var onMoveAllToTarget: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var onMoveToSource: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var onMoveToTarget: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var onSourceSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var onTargetSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var showSourceControls: js.UndefOr[Boolean] = js.native
    
    var showTargetControls: js.UndefOr[Boolean] = js.native
    
    var source: js.UndefOr[js.Array[_]] = js.native
    
    var sourceHeader: js.UndefOr[js.Any] = js.native
    
    var sourceStyle: js.UndefOr[js.Object] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var tabIndex: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[js.Array[_]] = js.native
    
    var targetHeader: js.UndefOr[js.Any] = js.native
    
    var targetStyle: js.UndefOr[js.Object] = js.native
  }
  object PickListProps {
    
    @scala.inline
    def apply(): PickListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickListProps]
    }
    
    @scala.inline
    implicit class PickListPropsMutableBuilder[Self <: PickListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: /* item */ js.Any => js.UndefOr[ReactElement]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setMetaKeySelection(value: Boolean): Self = StObject.set(x, "metaKeySelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKeySelectionUndefined: Self = StObject.set(x, "metaKeySelection", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ Source => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnMoveAllToSource(value: /* e */ Value => Unit): Self = StObject.set(x, "onMoveAllToSource", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveAllToSourceUndefined: Self = StObject.set(x, "onMoveAllToSource", js.undefined)
      
      @scala.inline
      def setOnMoveAllToTarget(value: /* e */ Value => Unit): Self = StObject.set(x, "onMoveAllToTarget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveAllToTargetUndefined: Self = StObject.set(x, "onMoveAllToTarget", js.undefined)
      
      @scala.inline
      def setOnMoveToSource(value: /* e */ Value => Unit): Self = StObject.set(x, "onMoveToSource", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveToSourceUndefined: Self = StObject.set(x, "onMoveToSource", js.undefined)
      
      @scala.inline
      def setOnMoveToTarget(value: /* e */ Value => Unit): Self = StObject.set(x, "onMoveToTarget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveToTargetUndefined: Self = StObject.set(x, "onMoveToTarget", js.undefined)
      
      @scala.inline
      def setOnSourceSelect(value: /* e */ Value => Unit): Self = StObject.set(x, "onSourceSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSourceSelectUndefined: Self = StObject.set(x, "onSourceSelect", js.undefined)
      
      @scala.inline
      def setOnTargetSelect(value: /* e */ Value => Unit): Self = StObject.set(x, "onTargetSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTargetSelectUndefined: Self = StObject.set(x, "onTargetSelect", js.undefined)
      
      @scala.inline
      def setShowSourceControls(value: Boolean): Self = StObject.set(x, "showSourceControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSourceControlsUndefined: Self = StObject.set(x, "showSourceControls", js.undefined)
      
      @scala.inline
      def setShowTargetControls(value: Boolean): Self = StObject.set(x, "showTargetControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTargetControlsUndefined: Self = StObject.set(x, "showTargetControls", js.undefined)
      
      @scala.inline
      def setSource(value: js.Array[_]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceHeader(value: js.Any): Self = StObject.set(x, "sourceHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceHeaderUndefined: Self = StObject.set(x, "sourceHeader", js.undefined)
      
      @scala.inline
      def setSourceStyle(value: js.Object): Self = StObject.set(x, "sourceStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceStyleUndefined: Self = StObject.set(x, "sourceStyle", js.undefined)
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSourceVarargs(value: js.Any*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Array[_]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHeader(value: js.Any): Self = StObject.set(x, "targetHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHeaderUndefined: Self = StObject.set(x, "targetHeader", js.undefined)
      
      @scala.inline
      def setTargetStyle(value: js.Object): Self = StObject.set(x, "targetStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetStyleUndefined: Self = StObject.set(x, "targetStyle", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetVarargs(value: js.Any*): Self = StObject.set(x, "target", js.Array(value :_*))
    }
  }
}
