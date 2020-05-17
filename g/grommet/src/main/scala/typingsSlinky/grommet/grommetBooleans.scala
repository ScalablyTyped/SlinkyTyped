package typingsSlinky.grommet

import typingsSlinky.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object grommetBooleans {
  @js.native
  sealed trait `false` extends OpacityType
  
  @js.native
  sealed trait `true` extends OpacityType
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

