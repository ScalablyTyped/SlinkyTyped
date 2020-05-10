package typingsSlinky.pulumiAws.applicationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationState extends js.Object {
  /**
    * The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
    */
  val computePlatform: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the application.
    */
  val name: js.UndefOr[Input[String]] = js.native
  val uniqueId: js.UndefOr[Input[String]] = js.native
}

object ApplicationState {
  @scala.inline
  def apply(): ApplicationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationState]
  }
  @scala.inline
  implicit class ApplicationStateOps[Self <: ApplicationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputePlatform(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputePlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(js.undefined)
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
    def withUniqueId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(js.undefined)
        ret
    }
  }
  
}

