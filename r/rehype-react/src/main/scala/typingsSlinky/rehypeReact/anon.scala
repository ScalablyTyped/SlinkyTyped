package typingsSlinky.rehypeReact

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Attributes
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.ClassType
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DetailedReactHTMLElement
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.FunctionComponentElement
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.ReactSVGElement
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.rehypeReact.rehypeReactStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(
      `type`: input,
      props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
      children: ReactElement*
    ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    def apply(`type`: input, props: js.UndefOr[scala.Nothing], children: ReactElement*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    def apply(`type`: input, props: Null, children: ReactElement*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    def apply[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactElement*): ReactElement = js.native
    def apply[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
    def apply[P /* <: js.Object */](`type`: String, props: Null, children: ReactElement*): ReactElement = js.native
    def apply[P /* <: js.Object */](
      `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
      props: ClassAttributes[ReactComponentClass[P]] with P,
      children: ReactElement*
    ): CElement[P, ReactComponentClass[P]] = js.native
    def apply[P /* <: js.Object */](
      `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
      props: js.UndefOr[scala.Nothing],
      children: ReactElement*
    ): CElement[P, ReactComponentClass[P]] = js.native
    def apply[P /* <: js.Object */](
      `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
      props: Null,
      children: ReactElement*
    ): CElement[P, ReactComponentClass[P]] = js.native
    def apply[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: Attributes with P, children: ReactElement*): ReactElement = js.native
    def apply[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
    def apply[P /* <: js.Object */](`type`: ComponentClass[P, js.Object], props: Null, children: ReactElement*): ReactElement = js.native
    def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactElement*): FunctionComponentElement[P] = js.native
    def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): FunctionComponentElement[P] = js.native
    def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactElement*): FunctionComponentElement[P] = js.native
    def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactElement*): ReactElement = js.native
    def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
      props: ClassAttributes[T] with P,
      children: ReactElement*
    ): ReactSVGElement = js.native
    def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
      props: js.UndefOr[scala.Nothing],
      children: ReactElement*
    ): ReactSVGElement = js.native
    def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
      props: Null,
      children: ReactElement*
    ): ReactSVGElement = js.native
    def apply[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactElement*): CElement[P, T] = js.native
    def apply[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactElement*): CElement[P, T] = js.native
    def apply[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: Null, children: ReactElement*): CElement[P, T] = js.native
  }
}
