package typingsSlinky.reactIntl.injectIntlMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.anon.WrappedComponentComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-intl/lib/src/components/injectIntl", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ReactComponentClass[P]): ReactComponentClass[WithIntlProps[P]] with (WrappedComponentComponentType[P, IntlPropName]) = js.native
}
