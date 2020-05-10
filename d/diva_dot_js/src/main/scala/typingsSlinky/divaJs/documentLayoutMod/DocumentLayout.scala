package typingsSlinky.divaJs.documentLayoutMod

import typingsSlinky.divaJs.AnonX
import typingsSlinky.divaJs.interfacesMod.Dimensions
import typingsSlinky.divaJs.interfacesMod.Offset
import typingsSlinky.divaJs.interfacesMod.PageGroup
import typingsSlinky.divaJs.interfacesMod.PageInfo
import typingsSlinky.divaJs.interfacesMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentLayout extends js.Object {
  var dimensions: Dimensions = js.native
  var pageGroups: js.Array[PageGroup] = js.native
  def getPageDimensions(pageIndex: Double): Dimensions = js.native
  def getPageInfo(pageIndex: Double): PageInfo | Null = js.native
  def getPageOffset(pageIndex: Double, options: js.Object): Offset = js.native
  def getPageRegion(pageIndex: Double, options: js.Object): Offset = js.native
  def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): AnonX = js.native
}

object DocumentLayout {
  @scala.inline
  def apply(
    dimensions: Dimensions,
    getPageDimensions: Double => Dimensions,
    getPageInfo: Double => PageInfo | Null,
    getPageOffset: (Double, js.Object) => Offset,
    getPageRegion: (Double, js.Object) => Offset,
    getPageToViewportCenterOffset: (Double, Region) => AnonX,
    pageGroups: js.Array[PageGroup]
  ): DocumentLayout = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], getPageDimensions = js.Any.fromFunction1(getPageDimensions), getPageInfo = js.Any.fromFunction1(getPageInfo), getPageOffset = js.Any.fromFunction2(getPageOffset), getPageRegion = js.Any.fromFunction2(getPageRegion), getPageToViewportCenterOffset = js.Any.fromFunction2(getPageToViewportCenterOffset), pageGroups = pageGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLayout]
  }
  @scala.inline
  implicit class DocumentLayoutOps[Self <: DocumentLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPageDimensions(value: Double => Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageDimensions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPageInfo(value: Double => PageInfo | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPageOffset(value: (Double, js.Object) => Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageOffset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPageRegion(value: (Double, js.Object) => Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageRegion")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPageToViewportCenterOffset(value: (Double, Region) => AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageToViewportCenterOffset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPageGroups(value: js.Array[PageGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

