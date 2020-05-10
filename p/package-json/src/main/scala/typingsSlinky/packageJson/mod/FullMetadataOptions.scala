package typingsSlinky.packageJson.mod

import typingsSlinky.packageJson.packageJsonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullMetadataOptions extends Options {
  /**
  		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
  		@default false
  		*/
  @JSName("fullMetadata")
  val fullMetadata_FullMetadataOptions: `true` = js.native
}

object FullMetadataOptions {
  @scala.inline
  def apply(fullMetadata: `true`): FullMetadataOptions = {
    val __obj = js.Dynamic.literal(fullMetadata = fullMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadataOptions]
  }
  @scala.inline
  implicit class FullMetadataOptionsOps[Self <: FullMetadataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullMetadata(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

