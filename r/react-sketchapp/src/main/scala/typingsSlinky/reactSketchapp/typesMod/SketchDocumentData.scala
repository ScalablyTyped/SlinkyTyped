package typingsSlinky.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchDocumentData extends js.Object {
  def addBlankPage(): SketchPage = js.native
  def assets(): SketchAssetCollection = js.native
  def currentPage(): SketchPage = js.native
  def layerStyles(): Unit = js.native
  def layerSymbols(): Unit = js.native
  def layerTextStyles(): SketchSharedStyleContainer = js.native
  def pages(): MSArray[SketchPage] = js.native
  def removePageAtIndex(index: Double): Unit = js.native
  def setCurrentPage(page: SketchPage): Unit = js.native
  def symbolsPageOrCreateIfNecessary(): SketchPage = js.native
}

object SketchDocumentData {
  @scala.inline
  def apply(
    addBlankPage: () => SketchPage,
    assets: () => SketchAssetCollection,
    currentPage: () => SketchPage,
    layerStyles: () => Unit,
    layerSymbols: () => Unit,
    layerTextStyles: () => SketchSharedStyleContainer,
    pages: () => MSArray[SketchPage],
    removePageAtIndex: Double => Unit,
    setCurrentPage: SketchPage => Unit,
    symbolsPageOrCreateIfNecessary: () => SketchPage
  ): SketchDocumentData = {
    val __obj = js.Dynamic.literal(addBlankPage = js.Any.fromFunction0(addBlankPage), assets = js.Any.fromFunction0(assets), currentPage = js.Any.fromFunction0(currentPage), layerStyles = js.Any.fromFunction0(layerStyles), layerSymbols = js.Any.fromFunction0(layerSymbols), layerTextStyles = js.Any.fromFunction0(layerTextStyles), pages = js.Any.fromFunction0(pages), removePageAtIndex = js.Any.fromFunction1(removePageAtIndex), setCurrentPage = js.Any.fromFunction1(setCurrentPage), symbolsPageOrCreateIfNecessary = js.Any.fromFunction0(symbolsPageOrCreateIfNecessary))
    __obj.asInstanceOf[SketchDocumentData]
  }
  @scala.inline
  implicit class SketchDocumentDataOps[Self <: SketchDocumentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBlankPage(value: () => SketchPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBlankPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAssets(value: () => SketchAssetCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrentPage(value: () => SketchPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLayerStyles(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerStyles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLayerSymbols(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerSymbols")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLayerTextStyles(value: () => SketchSharedStyleContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerTextStyles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPages(value: () => MSArray[SketchPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemovePageAtIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePageAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCurrentPage(value: SketchPage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSymbolsPageOrCreateIfNecessary(value: () => SketchPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolsPageOrCreateIfNecessary")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

