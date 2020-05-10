package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataRemovingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the data.
  	 */
  var metadata: js.UndefOr[js.Any] = js.native
  /**
  	 * A reference to the dragged element.
  	 */
  var targetElement: js.UndefOr[String] = js.native
}

object MetadataRemovingEventUIParam {
  @scala.inline
  def apply(): MetadataRemovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataRemovingEventUIParam]
  }
  @scala.inline
  implicit class MetadataRemovingEventUIParamOps[Self <: MetadataRemovingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: js.Any): Self = {
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
    def withTargetElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetElement")(js.undefined)
        ret
    }
  }
  
}

