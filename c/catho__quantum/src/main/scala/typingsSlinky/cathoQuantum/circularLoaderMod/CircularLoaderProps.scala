package typingsSlinky.cathoQuantum.circularLoaderMod

import typingsSlinky.cathoQuantum.anon.Gutter
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.secondary
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xxlarge
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xxxlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularLoaderProps extends js.Object {
  var size: js.UndefOr[medium | large | xlarge | xxlarge | xxxlarge] = js.undefined
  var skin: js.UndefOr[primary | secondary] = js.undefined
  var theme: js.UndefOr[Gutter] = js.undefined
}

object CircularLoaderProps {
  @scala.inline
  def apply(
    size: medium | large | xlarge | xxlarge | xxxlarge = null,
    skin: primary | secondary = null,
    theme: Gutter = null
  ): CircularLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularLoaderProps]
  }
}

