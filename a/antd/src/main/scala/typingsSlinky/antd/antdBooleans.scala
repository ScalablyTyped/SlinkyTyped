package typingsSlinky.antd

import typingsSlinky.antd.directoryTreeMod.ExpandAction
import typingsSlinky.antd.statisticUtilsMod._Formatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object antdBooleans {
  @js.native
  sealed trait `false`
    extends ExpandAction
       with _Formatter
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

