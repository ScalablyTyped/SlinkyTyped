package typingsSlinky.mnemonist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object heapMod {
  
  type HeapComparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
