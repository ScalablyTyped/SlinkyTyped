package typingsSlinky.reactIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object injectIntlMod {
  type WithIntlProps[P] = (typingsSlinky.reactIntl.typesMod.Omit[P, typingsSlinky.reactIntl.reactIntlStrings.intl]) with typingsSlinky.reactIntl.AnonForwardedRef
  type WrappedComponentProps[IntlPropName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl/lib/types.IntlShape}
    */ typingsSlinky.reactIntl.reactIntlStrings.WrappedComponentProps with org.scalablytyped.runtime.TopLevel[js.Any]
}
