package typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Async options that determine when a resource should finish.
  */
@js.native
trait SchemaAsyncOptions extends js.Object {
  /**
    * Method regex where this policy will apply.
    */
  var methodMatch: js.UndefOr[String] = js.native
  /**
    * Deployment manager will poll instances for this API resource setting a
    * RUNNING state, and blocking until polling conditions tell whether the
    * resource is completed or failed.
    */
  var pollingOptions: js.UndefOr[SchemaPollingOptions] = js.native
}

object SchemaAsyncOptions {
  @scala.inline
  def apply(): SchemaAsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncOptions]
  }
  @scala.inline
  implicit class SchemaAsyncOptionsOps[Self <: SchemaAsyncOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethodMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withPollingOptions(value: SchemaPollingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingOptions")(js.undefined)
        ret
    }
  }
  
}

