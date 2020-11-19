package typingsSlinky.reactstrap.tableMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var hover: js.UndefOr[Boolean] = js.native
  
  var inverse: js.UndefOr[Boolean] = js.native
  
  var reflow: js.UndefOr[Boolean] = js.native
  
  var responsive: js.UndefOr[Boolean | String] = js.native
  
  var responsiveTag: js.UndefOr[ReactType[_]] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var striped: js.UndefOr[Boolean] = js.native
  
  var tag: js.UndefOr[String | ReactType[_]] = js.native
}
object TableProps {
  
  @scala.inline
  def apply(): TableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
    
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
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setHover(value: Boolean): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    
    @scala.inline
    def setReflow(value: Boolean): Self = this.set("reflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReflow: Self = this.set("reflow", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean | String): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setResponsiveTagFunctionComponent(value: ReactComponentClass[_]): Self = this.set("responsiveTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveTagComponentClass(value: ReactComponentClass[_]): Self = this.set("responsiveTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveTag(value: ReactType[_]): Self = this.set("responsiveTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveTag: Self = this.set("responsiveTag", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStriped(value: Boolean): Self = this.set("striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStriped: Self = this.set("striped", js.undefined)
    
    @scala.inline
    def setTagFunctionComponent(value: ReactComponentClass[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagComponentClass(value: ReactComponentClass[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
