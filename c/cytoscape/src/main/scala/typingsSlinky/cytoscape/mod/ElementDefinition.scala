package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.mod.Css.Edge
import typingsSlinky.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementDefinition extends js.Object {
  /**
    * a space separated list of class names that the element has
    */
  var classes: js.UndefOr[String] = js.native
  /**
    * you should only use `style`/`css` for very special cases; use classes instead
    */
  var css: js.UndefOr[Node | Edge] = js.native
  var data: NodeDataDefinition | EdgeDataDefinition = js.native
  /**
    * Wether the node can be grabbed and moved by the user
    */
  var grabbable: js.UndefOr[Boolean] = js.native
  var group: js.UndefOr[ElementGroup] = js.native
  /**
    * When locked a node's position is immutable (default false)
    */
  var locked: js.UndefOr[Boolean] = js.native
  /**
    * The model position of the node (optional on init, mandatory after)
    */
  var position: js.UndefOr[Position] = js.native
  /**
    * can alternatively specify position in rendered on-screen pixels
    */
  var renderedPosition: js.UndefOr[Position] = js.native
  /**
    * Scratchpad data (usually temp or nonserialisable data)
    */
  var scratch: js.UndefOr[Scratchpad] = js.native
  /**
    * Whether the selection state is mutable (default true)
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the element is selected (default false)
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    *  CssStyleDeclaration;
    */
  var style: js.UndefOr[CssStyleDeclaration] = js.native
}

object ElementDefinition {
  @scala.inline
  def apply(data: NodeDataDefinition | EdgeDataDefinition): ElementDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinition]
  }
  @scala.inline
  implicit class ElementDefinitionOps[Self <: ElementDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: NodeDataDefinition | EdgeDataDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: Node | Edge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withGrabbable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabbable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrabbable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grabbable")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: ElementGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderedPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderedPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withScratch(value: Scratchpad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scratch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScratch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scratch")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CssStyleDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

