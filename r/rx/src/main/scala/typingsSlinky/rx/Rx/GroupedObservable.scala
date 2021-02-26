package typingsSlinky.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupedObservable[TKey, TElement] extends Observable[TElement] {
  
  var key: TKey = js.native
  
  var underlyingObservable: Observable[TElement] = js.native
}
