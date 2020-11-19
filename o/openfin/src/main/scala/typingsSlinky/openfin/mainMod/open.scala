package typingsSlinky.openfin.mainMod

import typingsSlinky.openfin.contextMod.Context
import typingsSlinky.openfin.directoryMod.AppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/fdc3/main", "open")
@js.native
object open extends js.Object {
  
  def apply(name: AppName): js.Promise[Unit] = js.native
  def apply(name: AppName, context: Context): js.Promise[Unit] = js.native
}
