package typingsSlinky.jsonld.mod.Options

import typingsSlinky.jsonld.jsonldStrings.URDNA2015
import typingsSlinky.jsonld.jsonldStrings.URGNA2012
import typingsSlinky.jsonld.mod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Normalize extends Common {
  var algorithm: js.UndefOr[URDNA2015 | URGNA2012] = js.native
  var expansion: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[MimeNQuad] = js.native
  var inputFormat: js.UndefOr[MimeNQuad] = js.native
  var skipExpansion: js.UndefOr[Boolean] = js.native
  var useNative: js.UndefOr[Boolean] = js.native
}

object Normalize {
  @scala.inline
  def apply(): Normalize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Normalize]
  }
  @scala.inline
  implicit class NormalizeOps[Self <: Normalize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: URDNA2015 | URGNA2012): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expansion")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: MimeNQuad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFormat(value: MimeNQuad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
  }
  
}

