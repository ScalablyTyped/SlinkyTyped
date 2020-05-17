package typingsSlinky.jointjs.mod.shapes.uml

import typingsSlinky.jointjs.mod.attributes.SVGPathAttributes
import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateSelectors extends Selectors {
  @JSName(".uml-state-body")
  var `Dotuml-state-body`: js.UndefOr[SVGRectAttributes] = js.native
  @JSName(".uml-state-events")
  var `Dotuml-state-events`: js.UndefOr[SVGTextAttributes] = js.native
  @JSName(".uml-state-name")
  var `Dotuml-state-name`: js.UndefOr[SVGTextAttributes] = js.native
  @JSName(".uml-state-separator")
  var `Dotuml-state-separator`: js.UndefOr[SVGPathAttributes] = js.native
}

object StateSelectors {
  @scala.inline
  def apply(): StateSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateSelectors]
  }
  @scala.inline
  implicit class StateSelectorsOps[Self <: StateSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withDotuml-state-body`(value: SVGRectAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".uml-state-body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotuml-state-body`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".uml-state-body")(js.undefined)
        ret
    }
    @scala.inline
    def `withDotuml-state-events`(value: SVGTextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".uml-state-events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotuml-state-events`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".uml-state-events")(js.undefined)
        ret
    }
    @scala.inline
    def `withDotuml-state-name`(value: SVGTextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".uml-state-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotuml-state-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".uml-state-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withDotuml-state-separator`(value: SVGPathAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".uml-state-separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDotuml-state-separator`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".uml-state-separator")(js.undefined)
        ret
    }
  }
  
}

