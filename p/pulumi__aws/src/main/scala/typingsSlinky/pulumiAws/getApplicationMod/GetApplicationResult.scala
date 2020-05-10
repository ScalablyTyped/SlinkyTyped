package typingsSlinky.pulumiAws.getApplicationMod

import typingsSlinky.pulumiAws.outputMod.elasticbeanstalk.GetApplicationAppversionLifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationResult extends js.Object {
  val appversionLifecycle: GetApplicationAppversionLifecycle = js.native
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  val arn: String = js.native
  /**
    * Short description of the application
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
}

object GetApplicationResult {
  @scala.inline
  def apply(
    appversionLifecycle: GetApplicationAppversionLifecycle,
    arn: String,
    description: String,
    id: String,
    name: String
  ): GetApplicationResult = {
    val __obj = js.Dynamic.literal(appversionLifecycle = appversionLifecycle.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationResult]
  }
  @scala.inline
  implicit class GetApplicationResultOps[Self <: GetApplicationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppversionLifecycle(value: GetApplicationAppversionLifecycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appversionLifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

