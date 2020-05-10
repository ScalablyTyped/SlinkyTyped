package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
  */
@js.native
trait Preconditions extends js.Object {
  /**
    * Specifies the target ResourceVersion
    */
  var resourceVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the target UID.
    */
  var uid: js.UndefOr[Input[String]] = js.native
}

object Preconditions {
  @scala.inline
  def apply(): Preconditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Preconditions]
  }
  @scala.inline
  implicit class PreconditionsOps[Self <: Preconditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
  }
  
}

