package typingsSlinky.reduxPersist

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import typingsSlinky.reduxPersist.typesMod.Persistor
import typingsSlinky.reduxPersist.typesMod.PersistorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-persist/es/persistStore", JSImport.Namespace)
@js.native
object persistStoreMod extends js.Object {
  
  def default(store: Store[_, AnyAction]): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: js.UndefOr[scala.Nothing], callback: js.Function0[_]): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: Null, callback: js.Function0[_]): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: PersistorOptions): Persistor = js.native
  def default(store: Store[_, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[_]): Persistor = js.native
}
