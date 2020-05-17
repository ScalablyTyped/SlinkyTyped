package typingsSlinky.reactIntl.injectIntlMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.anon.WrappedComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/injectIntl", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponent[P, IntlPropName]) = js.native
}

