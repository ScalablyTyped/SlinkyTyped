package typingsSlinky.reduxDashPersist

import typingsSlinky.redux.reduxMod.Action
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Reducer
import typingsSlinky.redux.reduxMod.ReducersMapObject
import typingsSlinky.redux.reduxMod.Store
import typingsSlinky.reduxDashPersist.esCreateMigrateMod.MigrationConfig
import typingsSlinky.reduxDashPersist.esCreateTransformMod.TransformConfig
import typingsSlinky.reduxDashPersist.esPersistReducerMod.PersistPartial
import typingsSlinky.reduxDashPersist.esTypesMod.MigrationManifest
import typingsSlinky.reduxDashPersist.esTypesMod.PersistConfig
import typingsSlinky.reduxDashPersist.esTypesMod.PersistMigrate
import typingsSlinky.reduxDashPersist.esTypesMod.Persistoid
import typingsSlinky.reduxDashPersist.esTypesMod.Persistor
import typingsSlinky.reduxDashPersist.esTypesMod.PersistorOptions
import typingsSlinky.reduxDashPersist.esTypesMod.Transform
import typingsSlinky.reduxDashPersist.esTypesMod.TransformInbound
import typingsSlinky.reduxDashPersist.esTypesMod.TransformOutbound
import typingsSlinky.reduxDashPersist.reduxDashPersistStrings.`persist/FLUSH`
import typingsSlinky.reduxDashPersist.reduxDashPersistStrings.`persist/PAUSE`
import typingsSlinky.reduxDashPersist.reduxDashPersistStrings.`persist/PERSIST`
import typingsSlinky.reduxDashPersist.reduxDashPersistStrings.`persist/PURGE`
import typingsSlinky.reduxDashPersist.reduxDashPersistStrings.`persist/REGISTER`
import typingsSlinky.reduxDashPersist.reduxDashPersistStrings.`persist/REHYDRATE`
import typingsSlinky.reduxDashPersist.reduxDashPersistStrings.`persist:`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is not single module. There are many module included by reference directives.
// tslint:disable-next-line: no-single-declare-module
@JSImport("redux-persist", JSImport.Namespace)
@js.native
object reduxDashPersistMod extends js.Object {
  val DEFAULT_VERSION: Double = js.native
  val FLUSH: `persist/FLUSH` = js.native
  val KEY_PREFIX: `persist:` = js.native
  val PAUSE: `persist/PAUSE` = js.native
  val PERSIST: `persist/PERSIST` = js.native
  val PURGE: `persist/PURGE` = js.native
  val REGISTER: `persist/REGISTER` = js.native
  val REHYDRATE: `persist/REHYDRATE` = js.native
  def createMigrate(migrations: MigrationManifest): PersistMigrate = js.native
  def createMigrate(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
  def createPersistoid(config: PersistConfig[_, _, _, _]): Persistoid = js.native
  def createTransform[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  def getStoredState(config: PersistConfig[_, _, _, _]): js.Promise[js.UndefOr[js.Object]] = js.native
  def persistCombineReducers[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
  def persistReducer[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
  def persistStore(store: Store[_, AnyAction]): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: Null, callback: js.Function0[_]): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[_]): Persistor = js.native
  def purgeStoredState[S](config: PersistConfig[S, _, _, _]): js.Any = js.native
}

