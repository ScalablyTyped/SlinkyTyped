package typingsSlinky.dbDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DbJs {
  import org.scalablytyped.runtime.StringDictionary

  type ErrorListener = js.Function1[/* err */ js.Error, Unit]
  type IndexAccessibleServer = StringDictionary[TypedObjectStoreServer[js.Any]]
  type Server = IndexAccessibleServer with ObjectStoreServer with BaseServer
}
