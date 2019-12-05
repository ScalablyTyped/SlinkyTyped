package typingsSlinky.sanctuary

import typingsSlinky.sanctuary.sanctuaryMod.ChainRec
import typingsSlinky.sanctuary.sanctuaryMod.Either
import typingsSlinky.sanctuary.sanctuaryMod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_F extends js.Object {
  def apply[A, B](f: Fn[A, ChainRec[Either[A, B]]]): js.Function1[/* x */ A, ChainRec[B]] = js.native
}

