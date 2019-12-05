package typingsSlinky.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsInjectIntlMod {
  import typingsSlinky.reactDashIntl.Anon_ForwardedRef
  import typingsSlinky.reactDashIntl.libTypesMod.Omit

  type WithIntlProps[P] = (Omit[P, String]) with Anon_ForwardedRef
  type WrappedComponentProps[IntlPropName /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl/lib/types.IntlShape}
    */ typingsSlinky.reactDashIntl.reactDashIntlStrings.WrappedComponentProps with js.Any
}
