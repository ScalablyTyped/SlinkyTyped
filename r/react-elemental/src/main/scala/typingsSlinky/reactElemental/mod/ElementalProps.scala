package typingsSlinky.reactElemental.mod

import slinky.core.TagMod
import typingsSlinky.reactElemental.AnonPrimary
import typingsSlinky.reactElemental.AnonPrimaryDark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementalProps extends js.Object {
  val children: TagMod[Any]
  val colorOpts: js.UndefOr[AnonPrimaryDark] = js.undefined
  val fontOpts: js.UndefOr[AnonPrimary] = js.undefined
}

object ElementalProps {
  @scala.inline
  def apply(children: TagMod[Any], colorOpts: AnonPrimaryDark = null, fontOpts: AnonPrimary = null): ElementalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (colorOpts != null) __obj.updateDynamic("colorOpts")(colorOpts.asInstanceOf[js.Any])
    if (fontOpts != null) __obj.updateDynamic("fontOpts")(fontOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementalProps]
  }
}

