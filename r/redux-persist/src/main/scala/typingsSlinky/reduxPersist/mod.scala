package typingsSlinky.reduxPersist

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.redux.mod.ReducersMapObject
import typingsSlinky.redux.mod.Store
import typingsSlinky.reduxPersist.createMigrateMod.MigrationConfig
import typingsSlinky.reduxPersist.createTransformMod.TransformConfig
import typingsSlinky.reduxPersist.persistReducerMod.PersistPartial
import typingsSlinky.reduxPersist.reduxPersistStrings.persistColon
import typingsSlinky.reduxPersist.reduxPersistStrings.persistSlashFLUSH
import typingsSlinky.reduxPersist.reduxPersistStrings.persistSlashPAUSE
import typingsSlinky.reduxPersist.reduxPersistStrings.persistSlashPERSIST
import typingsSlinky.reduxPersist.reduxPersistStrings.persistSlashPURGE
import typingsSlinky.reduxPersist.reduxPersistStrings.persistSlashREGISTER
import typingsSlinky.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import typingsSlinky.reduxPersist.typesMod.MigrationManifest
import typingsSlinky.reduxPersist.typesMod.PersistConfig
import typingsSlinky.reduxPersist.typesMod.PersistMigrate
import typingsSlinky.reduxPersist.typesMod.Persistoid
import typingsSlinky.reduxPersist.typesMod.Persistor
import typingsSlinky.reduxPersist.typesMod.PersistorOptions
import typingsSlinky.reduxPersist.typesMod.Transform
import typingsSlinky.reduxPersist.typesMod.TransformInbound
import typingsSlinky.reduxPersist.typesMod.TransformOutbound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This is not single module. There are many module included by reference directives.
// tslint:disable-next-line: no-single-declare-module
object mod {
  
  @JSImport("redux-persist", "DEFAULT_VERSION")
  @js.native
  val DEFAULT_VERSION: Double = js.native
  
  @JSImport("redux-persist", "FLUSH")
  @js.native
  val FLUSH: persistSlashFLUSH = js.native
  
  @JSImport("redux-persist", "KEY_PREFIX")
  @js.native
  val KEY_PREFIX: persistColon = js.native
  
  @JSImport("redux-persist", "PAUSE")
  @js.native
  val PAUSE: persistSlashPAUSE = js.native
  
  @JSImport("redux-persist", "PERSIST")
  @js.native
  val PERSIST: persistSlashPERSIST = js.native
  
  @JSImport("redux-persist", "PURGE")
  @js.native
  val PURGE: persistSlashPURGE = js.native
  
  @JSImport("redux-persist", "REGISTER")
  @js.native
  val REGISTER: persistSlashREGISTER = js.native
  
  @JSImport("redux-persist", "REHYDRATE")
  @js.native
  val REHYDRATE: persistSlashREHYDRATE = js.native
  
  @JSImport("redux-persist", "createMigrate")
  @js.native
  def createMigrate(migrations: MigrationManifest): PersistMigrate = js.native
  @JSImport("redux-persist", "createMigrate")
  @js.native
  def createMigrate(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
  
  @JSImport("redux-persist", "createPersistoid")
  @js.native
  def createPersistoid(config: PersistConfig[_, _, _, _]): Persistoid = js.native
  
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](
    inbound: js.UndefOr[scala.Nothing],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: js.UndefOr[scala.Nothing],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  @JSImport("redux-persist", "createTransform")
  @js.native
  def createTransform[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  
  @JSImport("redux-persist", "getStoredState")
  @js.native
  def getStoredState(config: PersistConfig[_, _, _, _]): js.Promise[js.UndefOr[js.Object]] = js.native
  
  @JSImport("redux-persist", "persistCombineReducers")
  @js.native
  def persistCombineReducers[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
  
  @JSImport("redux-persist", "persistReducer")
  @js.native
  def persistReducer[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
  
  @JSImport("redux-persist", "persistStore")
  @js.native
  def persistStore(store: Store[_, AnyAction]): Persistor = js.native
  @JSImport("redux-persist", "persistStore")
  @js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: js.UndefOr[scala.Nothing], callback: js.Function0[_]): Persistor = js.native
  @JSImport("redux-persist", "persistStore")
  @js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: Null, callback: js.Function0[_]): Persistor = js.native
  @JSImport("redux-persist", "persistStore")
  @js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions): Persistor = js.native
  @JSImport("redux-persist", "persistStore")
  @js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[_]): Persistor = js.native
  
  @JSImport("redux-persist", "purgeStoredState")
  @js.native
  def purgeStoredState[S](config: PersistConfig[S, _, _, _]): js.Any = js.native
}
