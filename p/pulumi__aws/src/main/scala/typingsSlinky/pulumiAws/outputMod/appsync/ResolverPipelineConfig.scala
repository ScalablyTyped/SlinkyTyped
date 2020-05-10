package typingsSlinky.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverPipelineConfig extends js.Object {
  var functions: js.UndefOr[js.Array[String]] = js.native
}

object ResolverPipelineConfig {
  @scala.inline
  def apply(): ResolverPipelineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverPipelineConfig]
  }
  @scala.inline
  implicit class ResolverPipelineConfigOps[Self <: ResolverPipelineConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(js.undefined)
        ret
    }
  }
  
}

