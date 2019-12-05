package typingsSlinky.qlikDashEngineapi

import typingsSlinky.qlikDashEngineapi.EngineAPI.INxAxisData
import typingsSlinky.qlikDashEngineapi.EngineAPI.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QAxisData extends js.Object {
  var qAxisData: js.Array[INxAxisData]
  var qDataPages: js.Array[INxDataPage]
}

object Anon_QAxisData {
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: js.Array[INxDataPage]): Anon_QAxisData = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QAxisData]
  }
}

