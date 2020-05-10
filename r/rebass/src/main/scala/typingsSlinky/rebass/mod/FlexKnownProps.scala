package typingsSlinky.rebass.mod

import typingsSlinky.styledSystem.mod.AlignItemsProps
import typingsSlinky.styledSystem.mod.FlexDirectionProps
import typingsSlinky.styledSystem.mod.FlexWrapProps
import typingsSlinky.styledSystem.mod.JustifyContentProps
import typingsSlinky.styledSystem.mod.RequiredTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexKnownProps
  extends BoxKnownProps
     with FlexWrapProps[RequiredTheme]
     with FlexDirectionProps[RequiredTheme]
     with AlignItemsProps[RequiredTheme]
     with JustifyContentProps[RequiredTheme]

object FlexKnownProps {
  @scala.inline
  def apply(): FlexKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexKnownProps]
  }
}

