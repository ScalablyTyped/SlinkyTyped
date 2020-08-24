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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is not single module. There are many module included by reference directives.
// tslint:disable-next-line: no-single-declare-module
@JSImport("redux-persist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DEFAULT_VERSION: Double = js.native
  val FLUSH: persistSlashFLUSH = js.native
  val KEY_PREFIX: persistColon = js.native
  val PAUSE: persistSlashPAUSE = js.native
  val PERSIST: persistSlashPERSIST = js.native
  val PURGE: persistSlashPURGE = js.native
  val REGISTER: persistSlashREGISTER = js.native
  val REHYDRATE: persistSlashREHYDRATE = js.native
  def createMigrate(migrations: MigrationManifest): PersistMigrate = js.native
  def createMigrate(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
  def createPersistoid(config: PersistConfig[_, _, _, _]): Persistoid = js.native
  def createTransform[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: js.UndefOr[scala.Nothing], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](
    inbound: js.UndefOr[scala.Nothing],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: js.UndefOr[scala.Nothing], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: js.UndefOr[scala.Nothing],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
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
  def persistStore(store: Store[_, AnyAction], persistorOptions: js.UndefOr[scala.Nothing], callback: js.Function0[_]): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: Null, callback: js.Function0[_]): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[_]): Persistor = js.native
  def purgeStoredState[S](config: PersistConfig[S, _, _, _]): js.Any = js.native
}

