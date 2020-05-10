package typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.elasticbeanstalk.ApplicationAppversionLifecycle
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationArgs extends js.Object {
  val appversionLifecycle: js.UndefOr[Input[ApplicationAppversionLifecycle]] = js.native
  /**
    * Short description of the application
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the application, must be unique within your account
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of tags for the Elastic Beanstalk Application.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ApplicationArgs {
  @scala.inline
  def apply(): ApplicationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationArgs]
  }
  @scala.inline
  implicit class ApplicationArgsOps[Self <: ApplicationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppversionLifecycle(value: Input[ApplicationAppversionLifecycle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appversionLifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppversionLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appversionLifecycle")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
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
    def withName(value: Input[String]): Self = {
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
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

