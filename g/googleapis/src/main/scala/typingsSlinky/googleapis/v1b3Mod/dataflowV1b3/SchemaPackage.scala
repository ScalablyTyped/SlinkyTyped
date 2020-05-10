package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The packages that must be installed in order for a worker to run the steps
  * of the Cloud Dataflow job that will be assigned to its worker pool.  This
  * is the mechanism by which the Cloud Dataflow SDK causes code to be loaded
  * onto the workers. For example, the Cloud Dataflow Java SDK might use this
  * to install jars containing the user&#39;s code and all of the various
  * dependencies (libraries, data files, etc.) required in order for that code
  * to run.
  */
@js.native
trait SchemaPackage extends js.Object {
  /**
    * The resource to read the package from. The supported resource type is:
    * Google Cloud Storage:    storage.googleapis.com/{bucket}
    * bucket.storage.googleapis.com/
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The name of the package.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPackage {
  @scala.inline
  def apply(): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackage]
  }
  @scala.inline
  implicit class SchemaPackageOps[Self <: SchemaPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
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
  }
  
}

