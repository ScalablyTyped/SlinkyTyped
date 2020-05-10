package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a WorkerPool to run the builds.  Workers are machines
  * that Cloud Build uses to run your builds. By default, all workers run in a
  * project owned by Cloud Build. To have full control over the workers that
  * execute your builds -- such as enabling them to access private resources on
  * your private network -- you can request Cloud Build to run the workers in
  * your own project by creating a custom workers pool.
  */
@js.native
trait SchemaWorkerPool extends js.Object {
  /**
    * Output only. Time at which the request to create the `WorkerPool` was
    * received.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. Time at which the request to delete the `WorkerPool` was
    * received.
    */
  var deleteTime: js.UndefOr[String] = js.native
  /**
    * User-defined name of the `WorkerPool`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The project ID of the GCP project in which the `WorkerPool` is created.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * List of regions to create the `WorkerPool`. Regions can&#39;t be empty.
    * If Cloud Build adds a new GCP region in the future, the existing
    * `WorkerPool` will not be enabled in the new region automatically; you
    * must add the new region to the `regions` field to enable the `WorkerPool`
    * in that region.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The service account used to manage the `WorkerPool`. The
    * service account must have the Compute Instance Admin (Beta) permission at
    * the project level.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * Output only. WorkerPool Status.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Output only. Time at which the request to update the `WorkerPool` was
    * received.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Configuration to be used for a creating workers in the `WorkerPool`.
    */
  var workerConfig: js.UndefOr[SchemaWorkerConfig] = js.native
  /**
    * Total number of workers to be created across all requested regions.
    */
  var workerCount: js.UndefOr[String] = js.native
}

object SchemaWorkerPool {
  @scala.inline
  def apply(): SchemaWorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerPool]
  }
  @scala.inline
  implicit class SchemaWorkerPoolOps[Self <: SchemaWorkerPool] (val x: Self) extends AnyVal {
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
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(js.undefined)
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
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerConfig(value: SchemaWorkerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(js.undefined)
        ret
    }
  }
  
}

