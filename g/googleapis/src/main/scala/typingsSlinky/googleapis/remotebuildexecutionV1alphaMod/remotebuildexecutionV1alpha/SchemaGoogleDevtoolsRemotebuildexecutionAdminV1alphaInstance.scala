package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instance conceptually encapsulates all Remote Build Execution resources for
  * remote builds. An instance consists of storage and compute resources (for
  * example, `ContentAddressableStorage`, `ActionCache`, `WorkerPools`) used
  * for running remote builds. All Remote Build Execution API calls are scoped
  * to an instance.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance extends js.Object {
  /**
    * The location is a GCP region. Currently only `us-central1` is supported.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Output only. Whether stack driver logging is enabled for the instance.
    */
  var loggingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Output only. Instance resource name formatted as:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be
    * populated when creating an instance since it is provided in the
    * `instance_id` field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. State of the instance.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstanceOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] (val x: Self) extends AnyVal {
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
    def withLoggingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingEnabled")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

