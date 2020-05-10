package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateContainerOptions extends TimeoutIntervalOptions {
  var metadata: js.UndefOr[StorageMetadata] = js.native
  var publicAccessLevel: js.UndefOr[String] = js.native
}

object CreateContainerOptions {
  @scala.inline
  def apply(): CreateContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerOptions]
  }
  @scala.inline
  implicit class CreateContainerOptionsOps[Self <: CreateContainerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: StorageMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicAccessLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicAccessLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicAccessLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicAccessLevel")(js.undefined)
        ret
    }
  }
  
}

