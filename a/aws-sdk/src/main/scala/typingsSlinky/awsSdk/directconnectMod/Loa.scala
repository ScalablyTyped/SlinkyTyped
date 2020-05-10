package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loa extends js.Object {
  /**
    * The binary contents of the LOA-CFA document.
    */
  var loaContent: js.UndefOr[LoaContent] = js.native
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.native
}

object Loa {
  @scala.inline
  def apply(): Loa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loa]
  }
  @scala.inline
  implicit class LoaOps[Self <: Loa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoaContentUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaContent(value: LoaContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaContent")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaContentType(value: LoaContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaContentType")(js.undefined)
        ret
    }
  }
  
}

