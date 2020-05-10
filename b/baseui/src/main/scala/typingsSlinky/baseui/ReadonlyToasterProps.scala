package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.toastMod.ToasterOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/toast.ToasterProps> */
@js.native
trait ReadonlyToasterProps extends js.Object {
  val autoHideDuration: js.UndefOr[Double] = js.native
  val overrides: js.UndefOr[ToasterOverrides] = js.native
  val placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.native
  val usePortal: js.UndefOr[Boolean] = js.native
}

object ReadonlyToasterProps {
  @scala.inline
  def apply(): ReadonlyToasterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyToasterProps]
  }
  @scala.inline
  implicit class ReadonlyToasterPropsOps[Self <: ReadonlyToasterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHideDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: ToasterOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(js.undefined)
        ret
    }
  }
  
}

