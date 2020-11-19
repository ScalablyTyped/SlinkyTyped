package typingsSlinky.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recompose", "mapPropsStream")
@js.native
object mapPropsStream extends js.Object {
  
  def apply[TInner, TOutter](transform: mapper[Subscribable[TOutter], Subscribable[TInner]]): ComponentEnhancer[TInner, TOutter] = js.native
}
