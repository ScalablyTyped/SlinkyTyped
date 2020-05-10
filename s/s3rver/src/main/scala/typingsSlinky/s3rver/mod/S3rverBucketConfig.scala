package typingsSlinky.s3rver.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3rverBucketConfig extends js.Object {
  var configs: js.Array[Buffer | String] = js.native
  var name: String = js.native
}

object S3rverBucketConfig {
  @scala.inline
  def apply(configs: js.Array[Buffer | String], name: String): S3rverBucketConfig = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3rverBucketConfig]
  }
  @scala.inline
  implicit class S3rverBucketConfigOps[Self <: S3rverBucketConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigs(value: js.Array[Buffer | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(value.asInstanceOf[js.Any])
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

