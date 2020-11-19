package typingsSlinky.reactTimeago

import typingsSlinky.reactTimeago.mod.Suffix
import typingsSlinky.reactTimeago.mod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactTimeagoStrings {
  
  @scala.inline
  def ago: ago = "ago".asInstanceOf[ago]
  
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  
  @scala.inline
  def `from now`: `from now` = ("from now").asInstanceOf[`from now`]
  
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  
  @js.native
  sealed trait ago extends Suffix
  
  @js.native
  sealed trait day extends Unit
  
  @js.native
  sealed trait `from now` extends Suffix
  
  @js.native
  sealed trait hour extends Unit
  
  @js.native
  sealed trait minute extends Unit
  
  @js.native
  sealed trait month extends Unit
  
  @js.native
  sealed trait second extends Unit
  
  @js.native
  sealed trait week extends Unit
  
  @js.native
  sealed trait year extends Unit
}
