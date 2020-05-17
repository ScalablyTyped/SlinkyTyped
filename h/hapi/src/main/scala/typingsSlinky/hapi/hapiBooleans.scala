package typingsSlinky.hapi

import typingsSlinky.hapi.mod.RouteOptionsAccessScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hapiBooleans {
  @js.native
  sealed trait `false` extends RouteOptionsAccessScope
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

