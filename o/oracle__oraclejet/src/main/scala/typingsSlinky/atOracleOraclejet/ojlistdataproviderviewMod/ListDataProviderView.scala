package typingsSlinky.atOracleOraclejet.ojlistdataproviderviewMod

import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataMapping
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.FetchAttribute
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.SortCriterion
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataProviderView[K, D, Kin, Din] extends DataProvider[K, D] {
  var attributes: js.Array[String | FetchAttribute] = js.native
  var dataMapping: DataMapping[K, D, Kin, Din] = js.native
  var from: Kin = js.native
  var offset: Double = js.native
  var sortCriteria: js.Array[SortCriterion[D]] = js.native
  def addEventListener(eventType: String, listener: EventListener): Unit = js.native
  def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
}

