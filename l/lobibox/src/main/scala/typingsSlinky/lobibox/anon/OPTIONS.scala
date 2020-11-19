package typingsSlinky.lobibox.anon

import typingsSlinky.lobibox.LobiboxModule.NotifyDefault
import typingsSlinky.lobibox.LobiboxModule.NotifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OPTIONS extends js.Object {
  
  def apply[T /* <: NotifyDefault */](`type`: String): T = js.native
  def apply[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
  
  var DEFAULTS: js.UndefOr[NotifyDefault] = js.native
  
  var OPTIONS: js.UndefOr[NotifyOptions] = js.native
}
