package typingsSlinky.dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Dexie = typingsSlinky.dexie.mod.Dexie_
  type IndexableType = typingsSlinky.dexie.mod.IndexableTypePart | typingsSlinky.dexie.mod.IndexableTypeArrayReadonly
  type IndexableTypeArray = js.Array[typingsSlinky.dexie.mod.IndexableTypePart]
  type IndexableTypeArrayReadonly = js.Array[typingsSlinky.dexie.mod.IndexableTypePart]
  type IndexableTypePart = java.lang.String | scala.Double | js.Date | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | scala.scalajs.js.typedarray.DataView | js.Array[js.Array[scala.Unit]]
  type ThenShortcut[T, TResult] = js.Function1[/* value */ T, TResult | js.Thenable[TResult]]
  type default = typingsSlinky.dexie.mod.default_
}
