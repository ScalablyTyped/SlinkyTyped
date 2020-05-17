package typingsSlinky.jestSnapshot.anon

import typingsSlinky.jestTypes.configMod.SnapshotUpdateState
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofutils extends js.Object {
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

object Typeofutils {
  @scala.inline
  def apply(
    SNAPSHOT_GUIDE_LINK: /* "https://goo.gl/fbAQLP" */ String,
    SNAPSHOT_VERSION: /* "1" */ String,
    SNAPSHOT_VERSION_WARNING: String,
    deepMerge: (js.Any, js.Any) => js.Any,
    ensureDirectoryExists: String => Unit,
    escapeBacktickString: String => String,
    getSnapshotData: (String, SnapshotUpdateState) => Data,
    keyToTestName: String => String,
    saveSnapshotFile: (Record[String, String], String) => Unit,
    serialize: String => String,
    testNameToKey: (String, Double) => String,
    unescape: String => String
  ): Typeofutils = {
    val __obj = js.Dynamic.literal(SNAPSHOT_GUIDE_LINK = SNAPSHOT_GUIDE_LINK.asInstanceOf[js.Any], SNAPSHOT_VERSION = SNAPSHOT_VERSION.asInstanceOf[js.Any], SNAPSHOT_VERSION_WARNING = SNAPSHOT_VERSION_WARNING.asInstanceOf[js.Any], deepMerge = js.Any.fromFunction2(deepMerge), ensureDirectoryExists = js.Any.fromFunction1(ensureDirectoryExists), escapeBacktickString = js.Any.fromFunction1(escapeBacktickString), getSnapshotData = js.Any.fromFunction2(getSnapshotData), keyToTestName = js.Any.fromFunction1(keyToTestName), saveSnapshotFile = js.Any.fromFunction2(saveSnapshotFile), serialize = js.Any.fromFunction1(serialize), testNameToKey = js.Any.fromFunction2(testNameToKey), unescape = js.Any.fromFunction1(unescape))
    __obj.asInstanceOf[Typeofutils]
  }
  @scala.inline
  implicit class TypeofutilsOps[Self <: Typeofutils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSNAPSHOT_GUIDE_LINK(value: /* "https://goo.gl/fbAQLP" */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNAPSHOT_GUIDE_LINK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSNAPSHOT_VERSION(value: /* "1" */ String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNAPSHOT_VERSION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSNAPSHOT_VERSION_WARNING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNAPSHOT_VERSION_WARNING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeepMerge(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepMerge")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEnsureDirectoryExists(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureDirectoryExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEscapeBacktickString(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeBacktickString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSnapshotData(value: (String, SnapshotUpdateState) => Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSnapshotData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKeyToTestName(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyToTestName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSaveSnapshotFile(value: (Record[String, String], String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveSnapshotFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSerialize(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestNameToKey(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testNameToKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnescape(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

