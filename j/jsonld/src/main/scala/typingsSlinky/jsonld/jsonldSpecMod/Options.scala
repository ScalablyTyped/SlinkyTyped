package typingsSlinky.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var base: js.UndefOr[DOMString | Null] = js.native
  var compactArrays: js.UndefOr[Boolean] = js.native
  var documentLoader: js.UndefOr[LoadDocumentCallback | Null] = js.native
  var expandContext: js.UndefOr[Context | Null] = js.native
  var processingMode: js.UndefOr[DOMString] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: DOMString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(null)
        ret
    }
    @scala.inline
    def withCompactArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompactArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentLoader(value: /* url */ Url => js.Promise[RemoteDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLoader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDocumentLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentLoaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLoader")(null)
        ret
    }
    @scala.inline
    def withExpandContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandContext")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandContext")(null)
        ret
    }
    @scala.inline
    def withProcessingMode(value: DOMString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingMode")(js.undefined)
        ret
    }
  }
  
}

