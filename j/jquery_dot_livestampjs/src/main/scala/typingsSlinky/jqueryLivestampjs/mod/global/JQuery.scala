package typingsSlinky.jqueryLivestampjs.mod.global

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def livestamp(date: js.Date): JQuery = js.native
  def livestamp(moment: Moment): JQuery = js.native
  def livestamp(timestamp: String): JQuery = js.native
  def livestamp(timestamp: Double): JQuery = js.native
}
