package typingsSlinky.jestSnapshot

import typingsSlinky.jestSnapshot.anon.Data
import typingsSlinky.jestTypes.configMod.SnapshotUpdateState
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot/build/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  val SNAPSHOT_GUIDE_LINK: /* "https://goo.gl/fbAQLP" */ String = js.native
  
  val SNAPSHOT_VERSION: /* "1" */ String = js.native
  
  val SNAPSHOT_VERSION_WARNING: String = js.native
  
  def deepMerge(target: js.Any, source: js.Any): js.Any = js.native
  
  def ensureDirectoryExists(filePath: String): Unit = js.native
  
  def escapeBacktickString(str: String): String = js.native
  
  def getSnapshotData(snapshotPath: String, update: SnapshotUpdateState): Data = js.native
  
  def keyToTestName(key: String): String = js.native
  
  def saveSnapshotFile(snapshotData: Record[String, String], snapshotPath: String): Unit = js.native
  
  def serialize(data: String): String = js.native
  
  def testNameToKey(testName: String, count: Double): String = js.native
  
  def unescape(data: String): String = js.native
}
