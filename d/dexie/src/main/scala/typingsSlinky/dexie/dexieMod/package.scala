package typingsSlinky.dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dexieMod {
  type Dexie = Dexie_
  type IndexableType = IndexableTypePart | IndexableTypeArrayReadonly
  type IndexableTypeArray = js.Array[IndexableTypePart]
  type IndexableTypeArrayReadonly = js.Array[IndexableTypePart]
  type IndexableTypePart = String | Double | js.Date | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | scala.scalajs.js.typedarray.DataView | js.Array[js.Array[Unit]]
  type ThenShortcut[T, TResult] = js.Function1[/* value */ T, TResult | js.Thenable[TResult]]
  type default = default_
}
