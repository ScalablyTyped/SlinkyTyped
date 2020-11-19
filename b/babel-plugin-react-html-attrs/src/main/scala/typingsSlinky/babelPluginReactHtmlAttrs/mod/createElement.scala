package typingsSlinky.babelPluginReactHtmlAttrs.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-plugin-react-html-attrs", "createElement")
@js.native
object createElement extends js.Object {
  
  def apply[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactNode*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = js.native
}
