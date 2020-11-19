package typingsSlinky.reactHotLoader.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-hot-loader", "hot")
@js.native
object hot extends js.Object {
  
  def apply(module: js.Any): js.Function2[
    /* Component */ ReactComponentClass[_], 
    /* props */ js.UndefOr[AppContainerProps], 
    ReactComponentClass[_]
  ] = js.native
}
