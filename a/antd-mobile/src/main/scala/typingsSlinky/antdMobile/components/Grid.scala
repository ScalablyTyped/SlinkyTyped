package typingsSlinky.antdMobile.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.gridMod.GridProps
import typingsSlinky.antdMobile.gridPropsTypeMod.DataItem
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  @JSImport("antd-mobile", "Grid")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobile.mod.Grid] {
    
    @scala.inline
    def activeClassName(value: String): this.type = set("activeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeStyle(value: Boolean | CSSProperties): this.type = set("activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def carouselMaxRow(value: Double): this.type = set("carouselMaxRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnNum(value: Double): this.type = set("columnNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.UndefOr[DataItem]*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[js.UndefOr[DataItem]]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasLine(value: Boolean): this.type = set("hasLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isCarousel(value: Boolean): this.type = set("isCarousel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemStyle(value: CSSProperties): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderItem(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement): this.type = set("renderItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def square(value: Boolean): this.type = set("square", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Grid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
