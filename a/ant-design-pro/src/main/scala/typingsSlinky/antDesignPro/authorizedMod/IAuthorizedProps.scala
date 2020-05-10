package typingsSlinky.antDesignPro.authorizedMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.authorizedRouteMod.authority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuthorizedProps extends js.Object {
  var authority: typingsSlinky.antDesignPro.authorizedRouteMod.authority = js.native
  var noMatch: js.UndefOr[TagMod[Any]] = js.native
}

object IAuthorizedProps {
  @scala.inline
  def apply(authority: authority): IAuthorizedProps = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizedProps]
  }
  @scala.inline
  implicit class IAuthorizedPropsOps[Self <: IAuthorizedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorityFunction1(value: /* currentAuthority */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAuthority(value: authority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoMatchReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoMatch(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatch")(js.undefined)
        ret
    }
  }
  
}

