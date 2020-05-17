package typingsSlinky.csvStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* err */ js.UndefOr[scala.Null | js.Error], 
    /* output */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type Cast[T] = js.Function2[
    /* value */ T, 
    /* context */ typingsSlinky.csvStringify.mod.CastingContext, 
    java.lang.String
  ]
  type Input = js.Array[js.Any]
  type PlainObject[T] = typingsSlinky.std.Record[java.lang.String, T]
}
