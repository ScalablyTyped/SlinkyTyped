package typingsSlinky.reactVirtualized.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderProps
import typingsSlinky.reactVirtualized.mod.Index
import typingsSlinky.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InfiniteLoader {
  @JSImport("react-virtualized", "InfiniteLoader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.InfiniteLoader] {
    @scala.inline
    def minimumBatchSize(value: Double): this.type = set("minimumBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def rowCount(value: Double): this.type = set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InfiniteLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isRowLoaded: Index => Boolean, loadMoreRows: IndexRange => js.Promise[_]): Builder = {
    val __props = js.Dynamic.literal(isRowLoaded = js.Any.fromFunction1(isRowLoaded), loadMoreRows = js.Any.fromFunction1(loadMoreRows))
    new Builder(js.Array(this.component, __props.asInstanceOf[InfiniteLoaderProps]))
  }
}

