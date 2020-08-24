package typingsSlinky.reactCytoscapejs.components

import org.scalajs.dom.raw.Position
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cytoscape.mod.Core
import typingsSlinky.cytoscape.mod.ElementDefinition
import typingsSlinky.cytoscape.mod.LayoutOptions
import typingsSlinky.cytoscape.mod.Stylesheet
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactCytoscapejs.mod.CytoscapeComponentProps
import typingsSlinky.reactCytoscapejs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCytoscapejs {
  @JSImport("react-cytoscapejs", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoungrabify(value: Boolean): this.type = set("autoungrabify", value.asInstanceOf[js.Any])
    @scala.inline
    def autounselectify(value: Boolean): this.type = set("autounselectify", value.asInstanceOf[js.Any])
    @scala.inline
    def boxSelectionEnabled(value: Boolean): this.type = set("boxSelectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def cy(value: /* cy */ Core => Unit): this.type = set("cy", js.Any.fromFunction1(value))
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def layout(value: LayoutOptions): this.type = set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def minZoom(value: Double): this.type = set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def pan(value: Position): this.type = set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesheetVarargs(value: Stylesheet*): this.type = set("stylesheet", js.Array(value :_*))
    @scala.inline
    def stylesheet(value: Stylesheet | js.Array[Stylesheet] | String): this.type = set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def userZoomingEnabled(value: Boolean): this.type = set("userZoomingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def zoomingEnabled(value: Boolean): this.type = set("zoomingEnabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CytoscapeComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(elements: js.Array[ElementDefinition]): Builder = {
    val __props = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CytoscapeComponentProps]))
  }
}

