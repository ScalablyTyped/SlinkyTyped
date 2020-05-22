package typingsSlinky.reactElemental.mod

import slinky.core.TagMod
import typingsSlinky.reactElemental.anon.Primary
import typingsSlinky.reactElemental.anon.PrimaryDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementalProps extends js.Object {
  val children: TagMod[Any]
  val colorOpts: js.UndefOr[PrimaryDark] = js.undefined
  val fontOpts: js.UndefOr[Primary] = js.undefined
}

object ElementalProps {
  @scala.inline
  def apply(children: TagMod[Any] = null, colorOpts: PrimaryDark = null, fontOpts: Primary = null): ElementalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (colorOpts != null) __obj.updateDynamic("colorOpts")(colorOpts.asInstanceOf[js.Any])
    if (fontOpts != null) __obj.updateDynamic("fontOpts")(fontOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementalProps]
  }
}

