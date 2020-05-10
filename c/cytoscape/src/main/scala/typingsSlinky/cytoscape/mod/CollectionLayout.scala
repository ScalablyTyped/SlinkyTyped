package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
@js.native
trait CollectionLayout extends js.Object {
  def createLayout(options: LayoutOptions): Layouts = js.native
  /**
    * Get a new layout, which can be used to algorithmically position the nodes in the collection.
    * This function is useful for running a layout on a subset of the elements in the graph, perhaps in parallel to other layouts.
    *
    * You must specify options.name with the name of the layout you wish to use.
    *
    * Note: that you must call layout.run() in order for it to affect the graph.
    *
    * @param options The layout options.
    */
  def layout(options: LayoutOptions): Layouts = js.native
  def makeLayout(options: LayoutOptions): Layouts = js.native
}

object CollectionLayout {
  @scala.inline
  def apply(
    createLayout: LayoutOptions => Layouts,
    layout: LayoutOptions => Layouts,
    makeLayout: LayoutOptions => Layouts
  ): CollectionLayout = {
    val __obj = js.Dynamic.literal(createLayout = js.Any.fromFunction1(createLayout), layout = js.Any.fromFunction1(layout), makeLayout = js.Any.fromFunction1(makeLayout))
    __obj.asInstanceOf[CollectionLayout]
  }
  @scala.inline
  implicit class CollectionLayoutOps[Self <: CollectionLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateLayout(value: LayoutOptions => Layouts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayout(value: LayoutOptions => Layouts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMakeLayout(value: LayoutOptions => Layouts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeLayout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

