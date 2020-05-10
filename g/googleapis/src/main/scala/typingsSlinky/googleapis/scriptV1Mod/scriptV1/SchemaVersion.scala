package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource representing a script project version. A version is a
  * &quot;snapshot&quot; of a script project and is similar to a read-only
  * branched release. When creating deployments, the version to use must be
  * specified.
  */
@js.native
trait SchemaVersion extends js.Object {
  /**
    * When the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The description for this version.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  /**
    * The incremental ID that is created by Apps Script when a version is
    * created. This is system assigned number and is immutable once created.
    */
  var versionNumber: js.UndefOr[Double] = js.native
}

object SchemaVersion {
  @scala.inline
  def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  @scala.inline
  implicit class SchemaVersionOps[Self <: SchemaVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptId")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionNumber")(js.undefined)
        ret
    }
  }
  
}

