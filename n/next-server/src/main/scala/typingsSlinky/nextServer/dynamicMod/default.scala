package typingsSlinky.nextServer.dynamicMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-server/dist/lib/dynamic", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[P](dynamicOptions: DynamicOptions[P]): ReactComponentClass[P] = js.native
  def apply[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ReactComponentClass[P] = js.native
  def apply[P](dynamicOptions: Loader[P]): ReactComponentClass[P] = js.native
  def apply[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ReactComponentClass[P] = js.native
}
