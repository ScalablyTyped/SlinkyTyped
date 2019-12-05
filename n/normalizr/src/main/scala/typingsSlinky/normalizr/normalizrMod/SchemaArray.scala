package typingsSlinky.normalizr.normalizrMod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaArray[T]
  extends Array[Schema[T]]
     with Schema[T]

