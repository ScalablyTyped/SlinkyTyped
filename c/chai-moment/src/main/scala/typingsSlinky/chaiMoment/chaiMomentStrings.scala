package typingsSlinky.chaiMoment

import typingsSlinky.chaiMoment.mod.global.ChaiMoment.Granularity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chaiMomentStrings {
  
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  
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
  sealed trait day extends Granularity
  
  @js.native
  sealed trait hour extends Granularity
  
  @js.native
  sealed trait minute extends Granularity
  
  @js.native
  sealed trait month extends Granularity
  
  @js.native
  sealed trait second extends Granularity
  
  @js.native
  sealed trait week extends Granularity
  
  @js.native
  sealed trait year extends Granularity
}
