package typingsSlinky.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterS3Import extends js.Object {
  /**
    * The bucket name where your backup is stored
    */
  var bucketName: String = js.native
  /**
    * Can be blank, but is the path to your backup
    */
  var bucketPrefix: js.UndefOr[String] = js.native
  /**
    * Role applied to load the data.
    */
  var ingestionRole: String = js.native
  /**
    * Source engine for the backup
    */
  var sourceEngine: String = js.native
  /**
    * Version of the source engine used to make the backup
    */
  var sourceEngineVersion: String = js.native
}

object ClusterS3Import {
  @scala.inline
  def apply(bucketName: String, ingestionRole: String, sourceEngine: String, sourceEngineVersion: String): ClusterS3Import = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], ingestionRole = ingestionRole.asInstanceOf[js.Any], sourceEngine = sourceEngine.asInstanceOf[js.Any], sourceEngineVersion = sourceEngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterS3Import]
  }
  @scala.inline
  implicit class ClusterS3ImportOps[Self <: ClusterS3Import] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIngestionRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestionRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucketPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketPrefix")(js.undefined)
        ret
    }
  }
  
}

