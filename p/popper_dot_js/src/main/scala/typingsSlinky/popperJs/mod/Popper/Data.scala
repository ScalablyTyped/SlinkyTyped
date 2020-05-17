package typingsSlinky.popperJs.mod.Popper

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.Element
import typingsSlinky.popperJs.anon.Arrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var arrowElement: Element = js.native
  var arrowStyles: CSSStyleDeclaration = js.native
  var attributes: Attributes = js.native
  var boundaries: js.Object = js.native
  var flipped: Boolean = js.native
  var hide: Boolean = js.native
  var instance: typingsSlinky.popperJs.mod.Popper = js.native
  var offsets: Arrow = js.native
  var originalPlacement: Placement = js.native
  var placement: Placement = js.native
  var styles: CSSStyleDeclaration = js.native
}

object Data {
  @scala.inline
  def apply(
    arrowElement: Element,
    arrowStyles: CSSStyleDeclaration,
    attributes: Attributes,
    boundaries: js.Object,
    flipped: Boolean,
    hide: Boolean,
    instance: typingsSlinky.popperJs.mod.Popper,
    offsets: Arrow,
    originalPlacement: Placement,
    placement: Placement,
    styles: CSSStyleDeclaration
  ): Data = {
    val __obj = js.Dynamic.literal(arrowElement = arrowElement.asInstanceOf[js.Any], arrowStyles = arrowStyles.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], flipped = flipped.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], originalPlacement = originalPlacement.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowStyles(value: CSSStyleDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundaries(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: typingsSlinky.popperJs.mod.Popper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsets(value: Arrow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: CSSStyleDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

