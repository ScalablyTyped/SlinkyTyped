package typingsSlinky.pulumiPulumi.queryableMod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedArray[T]
  extends Array[Resolved[T]]
     with ResolvedSimple[js.Any]

