package typingsSlinky.jestReporters

import typingsSlinky.jestTestResult.typesMod.SnapshotSummary
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/get_snapshot_summary", JSImport.Namespace)
@js.native
object getSnapshotSummaryMod extends js.Object {
  def default(snapshots: SnapshotSummary, globalConfig: GlobalConfig, updateCommand: String): js.Array[String] = js.native
}

