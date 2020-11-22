package typingsSlinky.ember.mod.default

import typingsSlinky.emberObject.typesMod.ObserverMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember", "addListener")
@js.native
object addListener extends js.Object {
  
  def apply[Context](obj: Context, key: /* keyof Context */ java.lang.String, method: ObserverMethod[Context, Context]): Unit = js.native
  def apply[Context, Target](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): Unit = js.native
  def apply[Context, Target](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    target: Target,
    method: ObserverMethod[Target, Context],
    once: Boolean
  ): Unit = js.native
}
