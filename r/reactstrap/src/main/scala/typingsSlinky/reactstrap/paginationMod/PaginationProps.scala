package typingsSlinky.reactstrap.paginationMod

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
trait PaginationProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var listClassName: js.UndefOr[String] = js.native
  
  var listTag: js.UndefOr[ReactType[_]] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[String | ReactType[_]] = js.native
}
object PaginationProps {
  
  @scala.inline
  def apply(): PaginationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationProps]
  }
  
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
    
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
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setListClassName(value: String): Self = this.set("listClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListClassName: Self = this.set("listClassName", js.undefined)
    
    @scala.inline
    def setListTagFunctionComponent(value: ReactComponentClass[_]): Self = this.set("listTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTagComponentClass(value: ReactComponentClass[_]): Self = this.set("listTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTag(value: ReactType[_]): Self = this.set("listTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListTag: Self = this.set("listTag", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
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
