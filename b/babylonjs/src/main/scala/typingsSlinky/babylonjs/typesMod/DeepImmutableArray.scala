package typingsSlinky.babylonjs.typesMod

import typingsSlinky.std.ReadonlyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait DeepImmutableArray[T]
  extends ReadonlyArray[DeepImmutable[T]]
     with DeepImmutable[js.Any]

