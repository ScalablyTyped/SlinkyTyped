package typingsSlinky.relayTestUtils.relayModernMockEnvironmentMod

import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import typingsSlinky.relayRuntime.relayStoreTypesMod.OptimisticUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayMockEnvironment
  extends MockEnvironment
     with Environment {
  var configName: js.UndefOr[String | Null] = js.native
  def replaceUpdate(update: OptimisticUpdate, newUpdate: OptimisticUpdate): Unit = js.native
  def revertUpdate(update: OptimisticUpdate): Unit = js.native
}

