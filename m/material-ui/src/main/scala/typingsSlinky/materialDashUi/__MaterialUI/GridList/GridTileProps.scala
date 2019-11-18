package typingsSlinky.materialDashUi.__MaterialUI.GridList

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.materialDashUi.materialDashUiStrings.bottom
import typingsSlinky.materialDashUi.materialDashUiStrings.left
import typingsSlinky.materialDashUi.materialDashUiStrings.right
import typingsSlinky.materialDashUi.materialDashUiStrings.top
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTileProps extends js.Object {
  var actionIcon: js.UndefOr[ReactElement] = js.undefined
  var actionPosition: js.UndefOr[left | right] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var containerElement: js.UndefOr[String | ReactElement | ReactComponentClass[_]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subtitle: js.UndefOr[TagMod[Any]] = js.undefined
  var subtitleStyle: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
  var titleBackground: js.UndefOr[String] = js.undefined
  var titlePosition: js.UndefOr[top | bottom] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
}

object GridTileProps {
  @scala.inline
  def apply(
    actionIcon: ReactElement = null,
    actionPosition: left | right = null,
    cols: Int | Double = null,
    containerElement: String | ReactElement | ReactComponentClass[_] = null,
    onClick: SyntheticMouseEvent[js.Object] => Unit = null,
    rows: Int | Double = null,
    style: CSSProperties = null,
    subtitle: TagMod[Any] = null,
    subtitleStyle: CSSProperties = null,
    title: TagMod[Any] = null,
    titleBackground: String = null,
    titlePosition: top | bottom = null,
    titleStyle: CSSProperties = null
  ): GridTileProps = {
    val __obj = js.Dynamic.literal()
    if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleBackground != null) __obj.updateDynamic("titleBackground")(titleBackground.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTileProps]
  }
}

