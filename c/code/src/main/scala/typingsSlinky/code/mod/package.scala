package typingsSlinky.code

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Assertion[T] = typingsSlinky.code.mod.Grammar[T] with typingsSlinky.code.mod.Flags[T]
  type AssertionChain[T] = typingsSlinky.code.mod.Assertion[T] with typingsSlinky.code.mod.Expectation[T]
  type Expectation[T] = typingsSlinky.code.mod.Types[T] with typingsSlinky.code.mod.Values[T]
}
