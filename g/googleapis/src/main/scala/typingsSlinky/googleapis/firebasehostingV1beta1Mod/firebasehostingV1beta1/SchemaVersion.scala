package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Version` is the collection of configuration and [static
  * files](sites.versions.files) that determine how a site is displayed.
  */
@js.native
trait SchemaVersion extends js.Object {
  /**
    * The configuration for the behavior of the site. This configuration exists
    * in the [`firebase.json`](/docs/cli/#the_firebasejson_file) file.
    */
  var config: js.UndefOr[SchemaServingConfig] = js.native
  /**
    * Output only. The time at which the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who created the version.
    */
  var createUser: js.UndefOr[SchemaActingUser] = js.native
  /**
    * Output only. The time at which the version was `DELETED`.
    */
  var deleteTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who `DELETED` the version.
    */
  var deleteUser: js.UndefOr[SchemaActingUser] = js.native
  /**
    * Output only. The total number of files associated with the version.
    * &lt;br&gt;This value is calculated after a version is `FINALIZED`.
    */
  var fileCount: js.UndefOr[String] = js.native
  /**
    * Output only. The time at which the version was `FINALIZED`.
    */
  var finalizeTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who `FINALIZED` the version.
    */
  var finalizeUser: js.UndefOr[SchemaActingUser] = js.native
  /**
    * The labels used for extra metadata and/or filtering.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The unique identifier for a version, in the format:
    * &lt;code&gt;sites/&lt;var&gt;site-name&lt;/var&gt;/versions/&lt;var&gt;versionID&lt;/var&gt;&lt;/code&gt;
    * This name is provided in the response body when you call the
    * [`CreateVersion`](../sites.versions/create) endpoint.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The deploy status of a version. &lt;br&gt; &lt;br&gt;For a successful
    * deploy, call the [`CreateVersion`](sites.versions/create) endpoint to
    * make a new version (`CREATED` status), [upload all desired
    * files](sites.versions/populateFiles) to the version, then
    * [update](sites.versions/patch) the version to the `FINALIZED` status.
    * &lt;br&gt; &lt;br&gt;Note that if you leave the version in the `CREATED`
    * state for more than 12&amp;nbsp;hours, the system will automatically mark
    * the version as `ABANDONED`. &lt;br&gt; &lt;br&gt;You can also change the
    * status of a version to `DELETED` by calling the
    * [`DeleteVersion`](sites.versions/delete) endpoint.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Output only. The total stored bytesize of the version. &lt;br&gt;This
    * value is calculated after a version is `FINALIZED`.
    */
  var versionBytes: js.UndefOr[String] = js.native
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
    def withConfig(value: SchemaServingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
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
    def withCreateUser(value: SchemaActingUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createUser")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteUser(value: SchemaActingUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteUser")(js.undefined)
        ret
    }
    @scala.inline
    def withFileCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalizeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalizeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalizeUser(value: SchemaActingUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizeUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalizeUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalizeUser")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionBytes")(js.undefined)
        ret
    }
  }
  
}

