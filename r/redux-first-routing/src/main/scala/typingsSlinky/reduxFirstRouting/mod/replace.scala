package typingsSlinky.reduxFirstRouting.mod

import typingsSlinky.history.mod.LocationDescriptorObject
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-first-routing", "replace")
@js.native
object replace extends js.Object {
  
  def apply(href: String): replaceAction[String] = js.native
  def apply(href: LocationDescriptorObject[LocationState]): replaceAction[LocationDescriptorObject[LocationState]] = js.native
}
