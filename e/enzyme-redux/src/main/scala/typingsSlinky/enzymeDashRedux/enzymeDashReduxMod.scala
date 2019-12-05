package typingsSlinky.enzymeDashRedux

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.enzymeMod.ReactWrapper
import typingsSlinky.enzyme.enzymeMod.ShallowWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-redux", JSImport.Namespace)
@js.native
object enzymeDashReduxMod extends js.Object {
  def mountWithState[P](Component: ReactElement, state: js.Any): ReactWrapper[P, js.Object, ReactComponentClass[js.Object]] = js.native
  def mountWithStore[P](Component: ReactElement, store: js.Any): ReactWrapper[P, js.Object, ReactComponentClass[js.Object]] = js.native
  def shallowWithState[P](Component: ReactElement, state: js.Any): ShallowWrapper[P, js.Object, ReactComponentClass[js.Object]] = js.native
  def shallowWithStore[P](Component: ReactElement, store: js.Any): ShallowWrapper[P, js.Object, ReactComponentClass[js.Object]] = js.native
}

