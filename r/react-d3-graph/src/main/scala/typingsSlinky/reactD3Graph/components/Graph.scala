package typingsSlinky.reactD3Graph.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactD3Graph.mod.GraphConfiguration
import typingsSlinky.reactD3Graph.mod.GraphData
import typingsSlinky.reactD3Graph.mod.GraphLink
import typingsSlinky.reactD3Graph.mod.GraphNode
import typingsSlinky.reactD3Graph.mod.GraphProps
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Graph {
  
  @scala.inline
  def apply[N /* <: GraphNode */, L /* <: GraphLink */](id: String): Builder[N, L] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[GraphProps[N, L]]))
  }
  
  @JSImport("react-d3-graph", "Graph")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[N /* <: GraphNode */, L /* <: GraphLink */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactD3Graph.mod.Graph[N, L]] {
    
    @scala.inline
    def config(value: Partial[GraphConfiguration[N, L]]): this.type = set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: GraphData[N, L]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClickGraph(value: /* event */ SyntheticMouseEvent[Element] => Unit): this.type = set("onClickGraph", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClickLink(value: (/* source */ String, /* target */ String) => Unit): this.type = set("onClickLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClickNode(value: /* nodeId */ String => Unit): this.type = set("onClickNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClickNode(value: /* nodeId */ String => Unit): this.type = set("onDoubleClickNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOutLink(value: (/* source */ String, /* target */ String) => Unit): this.type = set("onMouseOutLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseOutNode(value: /* nodeId */ String => Unit): this.type = set("onMouseOutNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOverLink(value: (/* source */ String, /* target */ String) => Unit): this.type = set("onMouseOverLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseOverNode(value: /* nodeId */ String => Unit): this.type = set("onMouseOverNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def onNodePositionChange(value: (/* nodeId */ String, /* x */ Double, /* y */ Double) => Unit): this.type = set("onNodePositionChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onRightClickLink(
      value: (/* event */ SyntheticMouseEvent[Element], /* source */ String, /* target */ String) => Unit
    ): this.type = set("onRightClickLink", js.Any.fromFunction3(value))
    
    @scala.inline
    def onRightClickNode(value: (/* event */ SyntheticMouseEvent[Element], /* nodeId */ String) => Unit): this.type = set("onRightClickNode", js.Any.fromFunction2(value))
  }
  
  def withProps[N /* <: GraphNode */, L /* <: GraphLink */](p: GraphProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
