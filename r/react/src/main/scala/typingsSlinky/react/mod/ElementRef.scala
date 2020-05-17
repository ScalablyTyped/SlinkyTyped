package typingsSlinky.react.mod

import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gets the instance type for a React element. The instance will be different for various component types:
  *
  * - React class components will be the class instance. So if you had `class Foo extends React.Component<{}> {}`
  *   and used `React.ElementRef<typeof Foo>` then the type would be the instance of `Foo`.
  * - React stateless functional components do not have a backing instance and so `React.ElementRef<typeof Bar>`
  *   (when `Bar` is `function Bar() {}`) will give you the `undefined` type.
  * - JSX intrinsics like `div` will give you their DOM instance. For `React.ElementRef<'div'>` that would be
  *   `HTMLDivElement`. For `React.ElementRef<'input'>` that would be `HTMLInputElement`.
  * - React stateless functional components that forward a `ref` will give you the `ElementRef` of the forwarded
  *   to component.
  *
  * `C` must be the type _of_ a React component so you need to use typeof as in React.ElementRef<typeof MyComponent>.
  *
  * @todo In Flow, this works a little different with forwarded refs and the `AbstractComponent` that
  *       `React.forwardRef()` returns.
  */
/* Rewritten from type alias, can be one of: 
  - js.Any
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.std.InstanceType[C]
*/
trait ElementRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any */] extends js.Object

object ElementRef {
  @scala.inline
  implicit def apply[C](value: js.Any | InstanceType[C]): ElementRef[C] = value.asInstanceOf[ElementRef[C]]
  @scala.inline
  implicit def fromUndef[C, T](value: js.UndefOr[T])(implicit ev: T => ElementRef[C]): ElementRef[C] = value.asInstanceOf[ElementRef[C]]
}

