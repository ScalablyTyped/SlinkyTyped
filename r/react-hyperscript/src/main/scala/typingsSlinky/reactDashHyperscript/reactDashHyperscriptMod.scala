package typingsSlinky.reactDashHyperscript

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.reactDashHyperscript.reactDashHyperscriptMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hyperscript", JSImport.Namespace)
@js.native
object reactDashHyperscriptMod extends js.Object {
  def apply(componentOrTag: String): ReactElement = js.native
  def apply(componentOrTag: String, children: js.Array[Element]): ReactElement = js.native
  def apply(componentOrTag: String, children: Element): ReactElement = js.native
  def apply(componentOrTag: ComponentClass[js.Object, ComponentState]): ReactElement = js.native
  def apply(componentOrTag: ComponentClass[js.Object, ComponentState], children: js.Array[Element]): ReactElement = js.native
  def apply(componentOrTag: ComponentClass[js.Object, ComponentState], children: Element): ReactElement = js.native
  def apply(componentOrTag: StatelessComponent[js.Object]): ReactElement = js.native
  def apply(componentOrTag: StatelessComponent[js.Object], children: js.Array[Element]): ReactElement = js.native
  def apply(componentOrTag: StatelessComponent[js.Object], children: Element): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: String, properties: P): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: String, properties: P, children: js.Array[Element]): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: String, properties: P, children: Element): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: ComponentClass[P, ComponentState], properties: P): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: ComponentClass[P, ComponentState], properties: P, children: js.Array[Element]): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: ComponentClass[P, ComponentState], properties: P, children: Element): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: StatelessComponent[P], properties: P): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: StatelessComponent[P], properties: P, children: js.Array[Element]): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: StatelessComponent[P], properties: P, children: Element): ReactElement = js.native
  type Element = ReactElement | String | Double | Null
}

