package typingsSlinky.officeUiFabricReact.announcedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Announced/Announced.types.IAnnouncedProps, 'className'> */
@js.native
trait IAnnouncedStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
}

object IAnnouncedStyleProps {
  @scala.inline
  def apply(): IAnnouncedStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnnouncedStyleProps]
  }
  @scala.inline
  implicit class IAnnouncedStylePropsOps[Self <: IAnnouncedStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
  }
  
}

