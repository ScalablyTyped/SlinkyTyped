package typingsSlinky.dbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object DbJs {
  
  type ErrorListener = js.Function1[/* err */ js.Error, scala.Unit]
  
  type IndexAccessibleServer = org.scalablytyped.runtime.StringDictionary[typingsSlinky.dbJs.DbJs.TypedObjectStoreServer[js.Any]]
  
  type Server = typingsSlinky.dbJs.DbJs.IndexAccessibleServer with typingsSlinky.dbJs.DbJs.ObjectStoreServer with typingsSlinky.dbJs.DbJs.BaseServer
}
