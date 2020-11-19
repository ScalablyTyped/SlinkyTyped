package typingsSlinky.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-awesome-card-io", "CardIOModule")
@js.native
object CardIOModule extends js.Object {
  
  def scanCard(): js.Promise[CardDetails] = js.native
  def scanCard(config: CardIOModuleProps): js.Promise[CardDetails] = js.native
}
