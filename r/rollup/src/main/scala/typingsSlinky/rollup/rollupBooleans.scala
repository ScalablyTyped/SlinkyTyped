package typingsSlinky.rollup

import typingsSlinky.rollup.mod.ResolveIdResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rollupBooleans {
  @js.native
  sealed trait `false` extends ResolveIdResult
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

