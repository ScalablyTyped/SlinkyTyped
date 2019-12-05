package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumericLogLevel extends js.Object

@JSGlobal("Realm.Sync.NumericLogLevel")
@js.native
object NumericLogLevel extends js.Object {
  @js.native
  sealed trait All extends NumericLogLevel
  
  @js.native
  sealed trait Debug extends NumericLogLevel
  
  @js.native
  sealed trait Detail extends NumericLogLevel
  
  @js.native
  sealed trait Error extends NumericLogLevel
  
  @js.native
  sealed trait Fatal extends NumericLogLevel
  
  @js.native
  sealed trait Info extends NumericLogLevel
  
  @js.native
  sealed trait Off extends NumericLogLevel
  
  @js.native
  sealed trait Trace extends NumericLogLevel
  
  @js.native
  sealed trait Warn extends NumericLogLevel
  
  /* 0 */ val All: typingsSlinky.realm.Realm.Sync.NumericLogLevel.All with Double = js.native
  /* 2 */ val Debug: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Debug with Double = js.native
  /* 3 */ val Detail: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Detail with Double = js.native
  /* 6 */ val Error: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Error with Double = js.native
  /* 7 */ val Fatal: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Fatal with Double = js.native
  /* 4 */ val Info: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Info with Double = js.native
  /* 8 */ val Off: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Off with Double = js.native
  /* 1 */ val Trace: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Trace with Double = js.native
  /* 5 */ val Warn: typingsSlinky.realm.Realm.Sync.NumericLogLevel.Warn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumericLogLevel with Double] = js.native
}

