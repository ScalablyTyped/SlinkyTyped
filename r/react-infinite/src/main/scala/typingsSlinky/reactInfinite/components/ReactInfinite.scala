package typingsSlinky.reactInfinite.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInfinite.mod.InfiniteProps
import typingsSlinky.reactInfinite.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactInfinite {
  
  @scala.inline
  def apply(elementHeight: Double | js.Array[Double]): Builder = {
    val __props = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InfiniteProps]))
  }
  
  @JSImport("react-infinite", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerHeight(value: Double): this.type = set("containerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayBottomUpwards(value: Boolean): this.type = set("displayBottomUpwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleScroll(value: /* node */ ReactElement => Unit): this.type = set("handleScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def infiniteLoadBeginBottomOffset(value: Double): this.type = set("infiniteLoadBeginBottomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def infiniteLoadBeginEdgeOffset(value: Double): this.type = set("infiniteLoadBeginEdgeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInfiniteLoading(value: Boolean): this.type = set("isInfiniteLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingSpinnerDelegate(value: ReactElement): this.type = set("loadingSpinnerDelegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onInfiniteLoad(value: () => Unit): this.type = set("onInfiniteLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def preloadAdditionalHeight(value: Double | js.Object): this.type = set("preloadAdditionalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preloadBatchSize(value: Double | js.Object): this.type = set("preloadBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeScrollStateLastsForAfterUserScrolls(value: Double): this.type = set("timeScrollStateLastsForAfterUserScrolls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useWindowAsScrollContainer(value: Boolean): this.type = set("useWindowAsScrollContainer", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InfiniteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
