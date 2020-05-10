package typingsSlinky.javascriptObfuscator.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifierNodeMetadata extends BaseNodeMetadata {
  var renamedIdentifier: js.UndefOr[Boolean] = js.native
}

object IdentifierNodeMetadata {
  @scala.inline
  def apply(): IdentifierNodeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifierNodeMetadata]
  }
  @scala.inline
  implicit class IdentifierNodeMetadataOps[Self <: IdentifierNodeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenamedIdentifier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renamedIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenamedIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renamedIdentifier")(js.undefined)
        ret
    }
  }
  
}

