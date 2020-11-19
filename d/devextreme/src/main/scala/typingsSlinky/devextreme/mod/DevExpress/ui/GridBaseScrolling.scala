package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.never
import typingsSlinky.devextreme.devextremeStrings.onHover
import typingsSlinky.devextreme.devextremeStrings.onScroll
import typingsSlinky.devextreme.devextremeStrings.standard
import typingsSlinky.devextreme.devextremeStrings.virtual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridBaseScrolling extends js.Object {
  
  /** @name GridBase.Options.scrolling.columnRenderingMode */
  var columnRenderingMode: js.UndefOr[standard | virtual] = js.native
  
  /** @name GridBase.Options.scrolling.preloadEnabled */
  var preloadEnabled: js.UndefOr[Boolean] = js.native
  
  /** @name GridBase.Options.scrolling.rowRenderingMode */
  var rowRenderingMode: js.UndefOr[standard | virtual] = js.native
  
  /** @name GridBase.Options.scrolling.scrollByContent */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  
  /** @name GridBase.Options.scrolling.scrollByThumb */
  var scrollByThumb: js.UndefOr[Boolean] = js.native
  
  /** @name GridBase.Options.scrolling.showScrollbar */
  var showScrollbar: js.UndefOr[always | never | onHover | onScroll] = js.native
  
  /** @name GridBase.Options.scrolling.useNative */
  var useNative: js.UndefOr[Boolean | auto] = js.native
}
object GridBaseScrolling {
  
  @scala.inline
  def apply(): GridBaseScrolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseScrolling]
  }
  
  @scala.inline
  implicit class GridBaseScrollingOps[Self <: GridBaseScrolling] (val x: Self) extends AnyVal {
    
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
    def setColumnRenderingMode(value: standard | virtual): Self = this.set("columnRenderingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnRenderingMode: Self = this.set("columnRenderingMode", js.undefined)
    
    @scala.inline
    def setPreloadEnabled(value: Boolean): Self = this.set("preloadEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadEnabled: Self = this.set("preloadEnabled", js.undefined)
    
    @scala.inline
    def setRowRenderingMode(value: standard | virtual): Self = this.set("rowRenderingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowRenderingMode: Self = this.set("rowRenderingMode", js.undefined)
    
    @scala.inline
    def setScrollByContent(value: Boolean): Self = this.set("scrollByContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollByContent: Self = this.set("scrollByContent", js.undefined)
    
    @scala.inline
    def setScrollByThumb(value: Boolean): Self = this.set("scrollByThumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollByThumb: Self = this.set("scrollByThumb", js.undefined)
    
    @scala.inline
    def setShowScrollbar(value: always | never | onHover | onScroll): Self = this.set("showScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScrollbar: Self = this.set("showScrollbar", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean | auto): Self = this.set("useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
  }
}
