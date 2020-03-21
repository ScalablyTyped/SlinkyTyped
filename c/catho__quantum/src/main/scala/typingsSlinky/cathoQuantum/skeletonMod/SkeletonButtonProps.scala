package typingsSlinky.cathoQuantum.skeletonMod

import typingsSlinky.cathoQuantum.AnonSpacingObject
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonButtonProps extends js.Object {
  var size: xsmall | small | medium | large
  var theme: AnonSpacingObject
}

object SkeletonButtonProps {
  @scala.inline
  def apply(size: xsmall | small | medium | large, theme: AnonSpacingObject): SkeletonButtonProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkeletonButtonProps]
  }
}

