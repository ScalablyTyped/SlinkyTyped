package typingsSlinky.reduxFirstRouting.mod

import typingsSlinky.history.mod.Hash
import typingsSlinky.history.mod.Pathname
import typingsSlinky.history.mod.Search
import typingsSlinky.reduxFirstRouting.AnonPathname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "locationChange")
@js.native
object locationChange extends js.Object {
  def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](_underscore: AnonPathname[P, S, H]): locationChangeAction[P, S, H] = js.native
}

