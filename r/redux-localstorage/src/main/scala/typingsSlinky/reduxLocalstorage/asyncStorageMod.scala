package typingsSlinky.reduxLocalstorage

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.reduxLocalstorage.mod.StorageAdapterCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncStorageMod extends Shortcut {
  
  @JSImport("redux-localstorage/lib/adapters/AsyncStorage", JSImport.Namespace)
  @js.native
  val ^ : StorageAdapterCreator[js.Any] = js.native
  
  type _To = StorageAdapterCreator[js.Any]
  
  /* This means you don't have to write `^`, but can instead just say `asyncStorageMod.foo` */
  override def _to: StorageAdapterCreator[js.Any] = ^
}
