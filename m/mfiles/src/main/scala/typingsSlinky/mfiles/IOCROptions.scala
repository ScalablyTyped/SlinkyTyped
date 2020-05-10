package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFOCRLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOCROptions extends js.Object {
  var PrimaryLanguage: MFOCRLanguage = js.native
  var SecondaryLanguage: MFOCRLanguage = js.native
  def Clone(): IOCROptions = js.native
}

object IOCROptions {
  @scala.inline
  def apply(Clone: () => IOCROptions, PrimaryLanguage: MFOCRLanguage, SecondaryLanguage: MFOCRLanguage): IOCROptions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PrimaryLanguage = PrimaryLanguage.asInstanceOf[js.Any], SecondaryLanguage = SecondaryLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCROptions]
  }
  @scala.inline
  implicit class IOCROptionsOps[Self <: IOCROptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IOCROptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrimaryLanguage(value: MFOCRLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryLanguage(value: MFOCRLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondaryLanguage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

