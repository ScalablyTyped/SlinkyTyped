package typingsSlinky.jsonld.mod.Options

import typingsSlinky.jsonld.mod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToRdf extends Common {
  var format: js.UndefOr[MimeNQuad] = js.native
  var produceGeneralizedRdf: js.UndefOr[Boolean] = js.native
  var skipExpansion: js.UndefOr[Boolean] = js.native
}

object ToRdf {
  @scala.inline
  def apply(): ToRdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToRdf]
  }
  @scala.inline
  implicit class ToRdfOps[Self <: ToRdf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withProduceGeneralizedRdf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produceGeneralizedRdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduceGeneralizedRdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produceGeneralizedRdf")(js.undefined)
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
  }
  
}

