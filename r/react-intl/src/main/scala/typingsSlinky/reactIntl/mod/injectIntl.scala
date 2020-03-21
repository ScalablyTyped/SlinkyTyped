package typingsSlinky.reactIntl.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.AnonWrappedComponentComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "injectIntl")
@js.native
object injectIntl extends js.Object {
  def apply[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with AnonWrappedComponentComponentType[P] = js.native
}

