package typingsSlinky.pendoDashIoDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pendo {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.pendoDashIoDashBrowser.Anon_Id
  import typingsSlinky.pendoDashIoDashBrowser.Anon_IdString

  type Account = Anon_IdString with Metadata
  type Events = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'ready' | 'guidesLoaded' | 'guidesFailed' ]: -? (callback : pendo-io-browser.pendo.EventCallbacks[K]): / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias pendo-io-browser.pendo.Events * / object}
    */ typingsSlinky.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.Events with EventCallbacks
  type Metadata = StringDictionary[String | Double | Boolean | js.Date | (js.Array[Double | String])]
  type Visitor = Anon_Id with Metadata
}
