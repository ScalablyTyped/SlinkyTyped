package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lokijs {
  /**
    * LokiJS
    * A lightweight document oriented javascript database
    * @author Joe Minichino <joe.minichino@gmail.com>
    */
  type LokiConstructor = typingsSlinky.lokijs.Loki
  type LokiQuery[E] = typingsSlinky.lokijs.PartialModel[E with typingsSlinky.lokijs.anon.And, typingsSlinky.lokijs.anon.YinkeyofLokiOpsany]
  type PartialModel[E, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? T | E[P]}
    */ typingsSlinky.lokijs.lokijsStrings.PartialModel with org.scalablytyped.runtime.TopLevel[E]
  // type aliases to allow the nested classes inside LokiConstructor to extend classes sharing them same name(s) as themselves
  type _Collection[E /* <: js.Object */] = typingsSlinky.lokijs.Collection[E]
  type _KeyValueStore = typingsSlinky.lokijs.KeyValueStore
  type _LokiFsAdapter = typingsSlinky.lokijs.LokiFsAdapter
  type _LokiLocalStorageAdapter = typingsSlinky.lokijs.LokiLocalStorageAdapter
  type _LokiMemoryAdapter = typingsSlinky.lokijs.LokiMemoryAdapter
  type _LokiPartitioningAdapter = typingsSlinky.lokijs.LokiPartitioningAdapter
}
