package typingsSlinky.reactIntl

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.formatjsIntl.srcTypesMod.MessageDescriptor
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("react-intl/lib/src/components/message", JSImport.Default)
  @js.native
  class default[V /* <: Record[String, _] */] () extends FormattedMessage[V]
  object default {
    
    @JSImport("react-intl/lib/src/components/message", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-intl/lib/src/components/message", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FormattedMessage[V /* <: Record[String, _] */]
    extends Component[Props[V], js.Object, js.Any] {
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MFormattedMessage(nextProps: Props[V]): Boolean = js.native
  }
  
  @js.native
  trait Props[V /* <: Record[String, _] */] extends MessageDescriptor {
    
    var children: js.UndefOr[js.Function1[/* nodes */ ReactNodeArray, ReactElement]] = js.native
    
    var tagName: js.UndefOr[ReactElement] = js.native
    
    var values: js.UndefOr[V] = js.native
  }
  object Props {
    
    @scala.inline
    def apply[V /* <: Record[String, _] */](): Props[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[V]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[_], V /* <: Record[String, _] */] (val x: Self with Props[V]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* nodes */ ReactNodeArray => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTagName(value: ReactElement): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setValues(value: V): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
