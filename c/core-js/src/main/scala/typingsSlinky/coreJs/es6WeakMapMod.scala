package typingsSlinky.coreJs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.std.WeakMap
import typingsSlinky.std.WeakMapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6WeakMapMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/es6/weak-map", JSImport.Namespace)
  @js.native
  class ^[K /* <: js.Object */, V] () extends WeakMap[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/library/es6/weak-map", JSImport.Namespace)
  @js.native
  val ^ : WeakMapConstructor = js.native
  
  type _To = WeakMapConstructor
  
  /* This means you don't have to write `^`, but can instead just say `es6WeakMapMod.foo` */
  override def _to: WeakMapConstructor = ^
}
