package typingsSlinky.sanctuary.anon

import typingsSlinky.sanctuary.mod.ChainRec
import typingsSlinky.sanctuary.mod.Either
import typingsSlinky.sanctuary.mod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallF extends js.Object {
  def apply[A, B](f: Fn[A, ChainRec[Either[A, B]]]): js.Function1[/* x */ A, ChainRec[B]] = js.native
}

