package typingsSlinky.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-plugin-react-html-attrs", "memo")
@js.native
object memo extends js.Object {
  
  def apply[T /* <: ComponentType[_] */](Component: T): MemoExoticComponent[T] = js.native
  def apply[T /* <: ComponentType[_] */](
    Component: T,
    propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
  ): MemoExoticComponent[T] = js.native
  def apply[P /* <: js.Object */](Component: SFC[P]): NamedExoticComponent[P] = js.native
  def apply[P /* <: js.Object */](
    Component: SFC[P],
    propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
  ): NamedExoticComponent[P] = js.native
}
