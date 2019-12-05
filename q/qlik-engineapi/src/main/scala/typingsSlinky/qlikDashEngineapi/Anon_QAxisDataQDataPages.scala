package typingsSlinky.qlikDashEngineapi

import typingsSlinky.qlikDashEngineapi.EngineAPI.INxAxisData
import typingsSlinky.qlikDashEngineapi.EngineAPI.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QAxisDataQDataPages extends js.Object {
  var qAxisData: js.Array[INxAxisData]
  var qDataPages: INxDataPage
}

object Anon_QAxisDataQDataPages {
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: INxDataPage): Anon_QAxisDataQDataPages = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QAxisDataQDataPages]
  }
}

