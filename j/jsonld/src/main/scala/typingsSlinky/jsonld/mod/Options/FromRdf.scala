package typingsSlinky.jsonld.mod.Options

import typingsSlinky.jsonld.mod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromRdf extends js.Object {
  var format: js.UndefOr[MimeNQuad] = js.native
  var rdfParser: js.UndefOr[js.Any] = js.native
  var useNativeTypes: js.UndefOr[Boolean] = js.native
  var useRdfType: js.UndefOr[Boolean] = js.native
}

object FromRdf {
  @scala.inline
  def apply(): FromRdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromRdf]
  }
  @scala.inline
  implicit class FromRdfOps[Self <: FromRdf] (val x: Self) extends AnyVal {
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
    def withRdfParser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdfParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRdfParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdfParser")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withUseRdfType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRdfType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseRdfType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRdfType")(js.undefined)
        ret
    }
  }
  
}

