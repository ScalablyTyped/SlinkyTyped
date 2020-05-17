package typingsSlinky.googleCloudPubsub.iamMod.google.protobuf.UninterpretedOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a NamePart. */
@js.native
trait INamePart extends js.Object {
  /** NamePart isExtension */
  var isExtension: Boolean = js.native
  /** NamePart namePart */
  var namePart: String = js.native
}

object INamePart {
  @scala.inline
  def apply(isExtension: Boolean, namePart: String): INamePart = {
    val __obj = js.Dynamic.literal(isExtension = isExtension.asInstanceOf[js.Any], namePart = namePart.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamePart]
  }
  @scala.inline
  implicit class INamePartOps[Self <: INamePart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamePart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

