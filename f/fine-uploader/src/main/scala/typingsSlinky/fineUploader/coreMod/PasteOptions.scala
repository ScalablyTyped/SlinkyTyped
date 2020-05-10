package typingsSlinky.fineUploader.coreMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasteOptions extends js.Object {
  /**
    * The default name given to pasted images
    *
    * @default `'pasted_image'`
    */
  var defaultName: js.UndefOr[String] = js.native
  /**
    * Enable this feature by providing any HTMLElement here
    *
    * @default `null`
    */
  var targetElement: js.UndefOr[HTMLElement] = js.native
}

object PasteOptions {
  @scala.inline
  def apply(): PasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteOptions]
  }
  @scala.inline
  implicit class PasteOptionsOps[Self <: PasteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElement(value: HTMLElement): Self = {
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

