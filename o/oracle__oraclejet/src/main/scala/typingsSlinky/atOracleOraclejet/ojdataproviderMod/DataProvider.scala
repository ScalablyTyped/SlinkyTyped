package typingsSlinky.atOracleOraclejet.ojdataproviderMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.no
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.unknown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.yes
import typingsSlinky.std.AsyncIterable
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProvider[K, D] extends EventTarget {
  def containsKeys(parameters: FetchByKeysParameters[K]): js.Promise[ContainsKeysResults[K]] = js.native
  def fetchByKeys(parameters: FetchByKeysParameters[K]): js.Promise[FetchByKeysResults[K, D]] = js.native
  def fetchByOffset(parameters: FetchByOffsetParameters[D]): js.Promise[FetchByOffsetResults[K, D]] = js.native
  def fetchFirst(): AsyncIterable[FetchListResult[K, D]] = js.native
  def fetchFirst(parameters: FetchListParameters[D]): AsyncIterable[FetchListResult[K, D]] = js.native
  def getCapability(capabilityName: String): js.Any = js.native
  def getTotalSize(): js.Promise[Double] = js.native
  def isEmpty(): yes | no | unknown = js.native
}

