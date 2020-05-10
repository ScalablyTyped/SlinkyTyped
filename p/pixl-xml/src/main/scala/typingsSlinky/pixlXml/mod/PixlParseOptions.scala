package typingsSlinky.pixlXml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixlParseOptions extends js.Object {
  var forceArrays: js.UndefOr[Boolean] = js.native
  var lowerCase: js.UndefOr[Boolean] = js.native
  var preserveAttributes: js.UndefOr[Boolean] = js.native
  var preserveDocumentNode: js.UndefOr[Boolean] = js.native
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
}

object PixlParseOptions {
  @scala.inline
  def apply(): PixlParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixlParseOptions]
  }
  @scala.inline
  implicit class PixlParseOptionsOps[Self <: PixlParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForceArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCase")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveDocumentNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDocumentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveDocumentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDocumentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(js.undefined)
        ret
    }
  }
  
}

