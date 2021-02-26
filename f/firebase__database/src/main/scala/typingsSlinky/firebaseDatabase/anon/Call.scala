package typingsSlinky.firebaseDatabase.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.firebaseDatabase.mod.firebaseAppTypesAugmentingMod.FirebaseApp
import typingsSlinky.firebaseDatabaseTypes.mod.FirebaseDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends StObject {
  
  def apply(): FirebaseDatabase = js.native
  def apply(app: FirebaseApp): FirebaseDatabase = js.native
  
  var Database: Instantiable0[FirebaseDatabase] = js.native
  
  var ServerValue: typingsSlinky.firebaseDatabaseTypes.mod.ServerValue = js.native
  
  def enableLogging(): js.Any = js.native
  def enableLogging(logger: js.UndefOr[scala.Nothing], persistent: Boolean): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, _]): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ String, _], persistent: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean): js.Any = js.native
  def enableLogging(logger: Boolean, persistent: Boolean): js.Any = js.native
  @JSName("enableLogging")
  var enableLogging_Original: FnCall = js.native
}
