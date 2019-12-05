package typingsSlinky.reactDashElemental.reactDashElementalMod

import slinky.core.TagMod
import typingsSlinky.reactDashElemental.Anon_Primary
import typingsSlinky.reactDashElemental.Anon_PrimaryPrimaryDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementalProps extends js.Object {
  val children: TagMod[Any]
  val colorOpts: js.UndefOr[Anon_PrimaryPrimaryDark] = js.undefined
  val fontOpts: js.UndefOr[Anon_Primary] = js.undefined
}

object ElementalProps {
  @scala.inline
  def apply(children: TagMod[Any], colorOpts: Anon_PrimaryPrimaryDark = null, fontOpts: Anon_Primary = null): ElementalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (colorOpts != null) __obj.updateDynamic("colorOpts")(colorOpts.asInstanceOf[js.Any])
    if (fontOpts != null) __obj.updateDynamic("fontOpts")(fontOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementalProps]
  }
}

