package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPoints extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.AnimationPoints_typekey")
  var PowerPointDotAnimationPoints_typekey: AnimationPoints = js.native
  var Smooth: MsoTriState = js.native
  /** @param number [Index=-1] */
  def Add(): AnimationPoint = js.native
  def Add(Index: Double): AnimationPoint = js.native
  def Item(Index: Double): AnimationPoint = js.native
}

