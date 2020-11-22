package typingsSlinky.reactIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object injectIntlMod {
  
  type WithIntlProps[P] = (typingsSlinky.std.Omit[P, typingsSlinky.reactIntl.reactIntlStrings.intl]) with typingsSlinky.reactIntl.anon.ForwardedRef
  
  type WrappedComponentProps[IntlPropName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl/lib/src/types.IntlShape}
    */ typingsSlinky.reactIntl.reactIntlStrings.WrappedComponentProps with org.scalablytyped.runtime.TopLevel[js.Any]
}
