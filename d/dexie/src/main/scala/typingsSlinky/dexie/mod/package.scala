package typingsSlinky.dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DbSchema = org.scalablytyped.runtime.StringDictionary[typingsSlinky.dexie.mod.TableSchema]
  
  type Dexie = typingsSlinky.dexie.mod.Dexie_
  
  type IndexableType = typingsSlinky.dexie.mod.IndexableTypePart | typingsSlinky.dexie.mod.IndexableTypeArrayReadonly
  
  type IndexableTypeArray = js.Array[typingsSlinky.dexie.mod.IndexableTypePart]
  
  type IndexableTypeArrayReadonly = js.Array[typingsSlinky.dexie.mod.IndexableTypePart]
  
  type IndexableTypePart = java.lang.String | scala.Double | js.Date | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView | js.Array[js.Array[scala.Unit]]
  
  type ThenShortcut[T, TResult] = js.Function1[/* value */ T, TResult | js.Thenable[TResult]]
  
  type _Collection[T, TKey] = typingsSlinky.dexie.mod.Collection[T, TKey]
  
  type _Table[T, TKey] = typingsSlinky.dexie.mod.Table[T, TKey]
}
