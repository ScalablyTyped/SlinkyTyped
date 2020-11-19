package typingsSlinky.lobibox.anon

import typingsSlinky.lobibox.LobiboxModule.AlertOptions
import typingsSlinky.lobibox.LobiboxModule.LobiboxStatic
import typingsSlinky.lobibox.LobiboxModule.MessageBoxesDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
  
  var DEFAULTS: AlertOptions = js.native
}
