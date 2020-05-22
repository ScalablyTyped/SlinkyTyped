package typingsSlinky.antDesignPro.authorizedMod

import slinky.core.TagMod
import typingsSlinky.antDesignPro.authorizedRouteMod.authority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthorizedProps extends js.Object {
  var authority: typingsSlinky.antDesignPro.authorizedRouteMod.authority
  var noMatch: js.UndefOr[TagMod[Any]] = js.undefined
}

object IAuthorizedProps {
  @scala.inline
  def apply(authority: authority, noMatch: TagMod[Any] = null): IAuthorizedProps = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    if (noMatch != null) __obj.updateDynamic("noMatch")(noMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizedProps]
  }
}

