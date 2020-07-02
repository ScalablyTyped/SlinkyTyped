package typingsSlinky.materialUi.MaterialUI.GridList

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.materialUi.materialUiStrings.bottom
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.materialUi.materialUiStrings.top
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
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
  var subtitle: js.UndefOr[ReactElement] = js.undefined
  var subtitleStyle: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactElement] = js.undefined
  var titleBackground: js.UndefOr[String] = js.undefined
  var titlePosition: js.UndefOr[top | bottom] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
}

object GridTileProps {
  @scala.inline
  def apply(): GridTileProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTileProps]
  }
  @scala.inline
  implicit class GridTilePropsOps[Self <: GridTileProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionIcon(value: ReactElement): Self = this.set("actionIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionIcon: Self = this.set("actionIcon", js.undefined)
    @scala.inline
    def setActionPosition(value: left | right): Self = this.set("actionPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionPosition: Self = this.set("actionPosition", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setContainerElementReactElement(value: ReactElement): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerElementComponentClass(value: ReactComponentClass[_]): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerElement(value: String | ReactElement | ReactComponentClass[_]): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerElement: Self = this.set("containerElement", js.undefined)
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[js.Object] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubtitleReactElement(value: ReactElement): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtitle(value: ReactElement): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setSubtitleStyle(value: CSSProperties): Self = this.set("subtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleStyle: Self = this.set("subtitleStyle", js.undefined)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleBackground(value: String): Self = this.set("titleBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleBackground: Self = this.set("titleBackground", js.undefined)
    @scala.inline
    def setTitlePosition(value: top | bottom): Self = this.set("titlePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlePosition: Self = this.set("titlePosition", js.undefined)
    @scala.inline
    def setTitleStyle(value: CSSProperties): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
  }
  
}

