package typingsSlinky.reactHyperscript

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hyperscript", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(componentOrTag: String): ReactElement = js.native
  def apply(componentOrTag: String, children: js.Array[Element]): ReactElement = js.native
  def apply(componentOrTag: String, children: Element): ReactElement = js.native
  def apply(componentOrTag: ComponentClass[js.Object, js.Object]): ReactElement = js.native
  def apply(componentOrTag: ComponentClass[js.Object, js.Object], children: js.Array[Element]): ReactElement = js.native
  def apply(componentOrTag: ComponentClass[js.Object, js.Object], children: Element): ReactElement = js.native
  def apply(componentOrTag: StatelessComponent[js.Object]): ReactElement = js.native
  def apply(componentOrTag: StatelessComponent[js.Object], children: js.Array[Element]): ReactElement = js.native
  def apply(componentOrTag: StatelessComponent[js.Object], children: Element): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: String, properties: P): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: String, properties: P, children: js.Array[Element]): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: String, properties: P, children: Element): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: ComponentClass[P, js.Object], properties: P): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: ComponentClass[P, js.Object], properties: P, children: js.Array[Element]): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: ComponentClass[P, js.Object], properties: P, children: Element): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: StatelessComponent[P], properties: P): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: StatelessComponent[P], properties: P, children: js.Array[Element]): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](componentOrTag: StatelessComponent[P], properties: P, children: Element): ReactElement = js.native
  type Element = ReactElement | String | Double | Null
}

