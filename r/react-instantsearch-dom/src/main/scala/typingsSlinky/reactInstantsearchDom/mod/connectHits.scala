package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactInstantsearchCore.mod.HitsProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectHits")
@js.native
object connectHits extends js.Object {
  def apply[THit](stateless: StatelessComponent[HitsProvided[THit]]): ReactComponentClass[js.Object] = js.native
  def apply[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, HitsProvided[THit]]) with js.Object] = js.native
}

