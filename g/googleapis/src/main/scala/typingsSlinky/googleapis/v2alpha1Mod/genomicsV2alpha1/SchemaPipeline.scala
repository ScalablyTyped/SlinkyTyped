package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a series of actions to execute, expressed as Docker containers.
  */
@js.native
trait SchemaPipeline extends js.Object {
  /**
    * The list of actions to execute, in the order they are specified.
    */
  var actions: js.UndefOr[js.Array[SchemaAction]] = js.native
  /**
    * The environment to pass into every action. Each action can also specify
    * additional environment variables but cannot delete an entry from this map
    * (though they can overwrite it with a different value).
    */
  var environment: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The resources required for execution.
    */
  var resources: js.UndefOr[SchemaResources] = js.native
  /**
    * The maximum amount of time to give the pipeline to complete.  This
    * includes the time spent waiting for a worker to be allocated.  If the
    * pipeline fails to complete before the timeout, it will be cancelled and
    * the error code will be set to DEADLINE_EXCEEDED.  If unspecified, it will
    * default to 7 days.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaPipeline {
  @scala.inline
  def apply(): SchemaPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipeline]
  }
  @scala.inline
  implicit class SchemaPipelineOps[Self <: SchemaPipeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[SchemaAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: SchemaResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

