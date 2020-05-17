package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkFormat extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var AutoUpdate: PpUpdateOption = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.LinkFormat_typekey")
  var PowerPointDotLinkFormat_typekey: LinkFormat = js.native
  var SourceFullName: String = js.native
  def BreakLink(): Unit = js.native
  def Update(): Unit = js.native
}

object LinkFormat {
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: PpUpdateOption,
    BreakLink: () => Unit,
    Parent: js.Any,
    PowerPointDotLinkFormat_typekey: LinkFormat,
    SourceFullName: String,
    Update: () => Unit
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], BreakLink = js.Any.fromFunction0(BreakLink), Parent = Parent.asInstanceOf[js.Any], SourceFullName = SourceFullName.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("PowerPoint.LinkFormat_typekey")(PowerPointDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  @scala.inline
  implicit class LinkFormatOps[Self <: LinkFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoUpdate(value: PpUpdateOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakLink(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotLinkFormat_typekey(value: LinkFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.LinkFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

