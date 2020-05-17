package typingsSlinky.loadware.mod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecursiveLoadable[F /* <: AnyFunction */]
  extends Array[F | Loadable[F]]
     with Loadable[F]

