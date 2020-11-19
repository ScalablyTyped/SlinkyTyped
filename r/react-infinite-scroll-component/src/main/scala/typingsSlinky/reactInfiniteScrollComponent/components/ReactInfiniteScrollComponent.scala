package typingsSlinky.reactInfiniteScrollComponent.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInfiniteScrollComponent.mod.InfiniteScrollProps
import typingsSlinky.reactInfiniteScrollComponent.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactInfiniteScrollComponent {
  
  @JSImport("react-infinite-scroll-component", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endMessageReactElement(value: ReactElement): this.type = set("endMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endMessage(value: ReactElement): this.type = set("endMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasChildren(value: Boolean): this.type = set("hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialScrollY(value: Double): this.type = set("initialScrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loader(value: ReactElement): this.type = set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onScroll(value: () => Unit): this.type = set("onScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def pullDownToRefresh(value: Boolean): this.type = set("pullDownToRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pullDownToRefreshContentReactElement(value: ReactElement): this.type = set("pullDownToRefreshContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pullDownToRefreshContent(value: ReactElement): this.type = set("pullDownToRefreshContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pullDownToRefreshThreshold(value: Double): this.type = set("pullDownToRefreshThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refreshFunction(value: () => Unit): this.type = set("refreshFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def releaseToRefreshContentReactElement(value: ReactElement): this.type = set("releaseToRefreshContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def releaseToRefreshContent(value: ReactElement): this.type = set("releaseToRefreshContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollThreshold(value: Double | String): this.type = set("scrollThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollableTargetReactElement(value: ReactElement): this.type = set("scrollableTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollableTarget(value: ReactElement | String): this.type = set("scrollableTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InfiniteScrollProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(dataLength: Double, hasMore: Boolean, next: () => Unit): Builder = {
    val __props = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], next = js.Any.fromFunction0(next))
    new Builder(js.Array(this.component, __props.asInstanceOf[InfiniteScrollProps]))
  }
}
