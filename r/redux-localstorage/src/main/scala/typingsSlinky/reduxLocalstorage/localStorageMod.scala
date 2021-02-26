package typingsSlinky.reduxLocalstorage

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Storage
import typingsSlinky.reduxLocalstorage.mod.StorageAdapterCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localStorageMod extends Shortcut {
  
  @JSImport("redux-localstorage/lib/adapters/localStorage", JSImport.Namespace)
  @js.native
  val ^ : StorageAdapterCreator[Storage] = js.native
  
  type _To = StorageAdapterCreator[Storage]
  
  /* This means you don't have to write `^`, but can instead just say `localStorageMod.foo` */
  override def _to: StorageAdapterCreator[Storage] = ^
}
