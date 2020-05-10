package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builder extends js.Object {
  /**
    * The ARN of the builder.
    */
  var ARN: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ARN] = js.native
}

object Builder {
  @scala.inline
  def apply(): Builder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Builder]
  }
  @scala.inline
  implicit class BuilderOps[Self <: Builder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(js.undefined)
        ret
    }
  }
  
}

