package typingsSlinky.reactIntl.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl", "injectIntl")
@js.native
object injectIntl extends js.Object {
  def apply[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with (`4`[P, IntlPropName]) = js.native
}

