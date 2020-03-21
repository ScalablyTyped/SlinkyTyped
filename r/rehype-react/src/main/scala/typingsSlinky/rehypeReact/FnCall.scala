package typingsSlinky.rehypeReact

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Attributes
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.ClassType
import typingsSlinky.react.mod.ClassicComponent
import typingsSlinky.react.mod.ClassicComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DetailedReactHTMLElement
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.FunctionComponentElement
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.ReactNode
import typingsSlinky.react.mod.ReactSVGElement
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.rehypeReact.rehypeReactStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(`type`: input): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(`type`: input, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply(
    `type`: input,
    props: InputHTMLAttributes[typingsSlinky.std.HTMLInputElement] with ClassAttributes[typingsSlinky.std.HTMLInputElement],
    children: TagMod[Any]*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def apply[P /* <: js.Object */](`type`: String): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: String, children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: String, props: Attributes with P, children: TagMod[Any]*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CElement[P, ReactComponentClass[P]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    children: ReactNode*
  ): CElement[P, ReactComponentClass[P]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: TagMod[Any]*
  ): CElement[P, ReactComponentClass[P]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState]): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], children: ReactNode*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: TagMod[Any]*): ReactElement = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P]): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: TagMod[Any]*): FunctionComponentElement[P] = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: TagMod[Any]*): ReactElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    children: ReactNode*
  ): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: TagMod[Any]*
  ): ReactSVGElement = js.native
  def apply[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C]): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], children: ReactNode*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: TagMod[Any]*): CElement[P, T] = js.native
}

