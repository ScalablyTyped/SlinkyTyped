package typingsSlinky.reactDashBootstrap.libMediaListItemMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.AllHTMLAttributes
import typingsSlinky.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaListItemProps
  extends AllHTMLAttributes[MediaListItem]
     with ClassAttributes[MediaListItem] {
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object MediaListItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[MediaListItem] = null,
    ClassAttributes: ClassAttributes[MediaListItem] = null,
    componentClass: ReactComponentClass[_] = null
  ): MediaListItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaListItemProps]
  }
}

