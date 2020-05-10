package typingsSlinky.atlaskitLayer.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Sets whether the content auto flip when it reaches the border set it as true for default flip
    * or set the custom flip positions
    */
  var autoFlip: js.UndefOr[Boolean | FlipPositionType | js.Array[FlipPositionType]] = js.native
  /**
    * Element to act as a boundary for the Layer. The Layer will not sit outside this element if it
    * can help it. If, through it's normal positoning, it would end up outside the boundary the
    * layer will flip positions if the autoPosition prop is set.
    */
  var boundariesElement: js.UndefOr[BoundariesElementType] = js.native
  /** Target to which layer is attached */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** HTML content to display in the layer. Will be aligned to the target according to the position prop. */
  var content: js.UndefOr[TagMod[Any]] = js.native
  /** Lock scrolling behind the layer */
  var lockScroll: js.UndefOr[Boolean] = js.native
  /**
    * String representing the offsets from the target element in the format "[x-offset][y-offset]",
    * measured in pixels.
    */
  var offset: js.UndefOr[String] = js.native
  /**
    * Callback that is used to know when the flipped state of Layer changes. This occurs when placing a
    * Layered element in the requested position would cause Layer to be rendered outside of the
    * boundariesElement (usually viewport).
    */
  var onFlippedChange: js.UndefOr[
    js.Function3[
      /* flipped */ Boolean, 
      /* actualPosition */ CSSPositionType, 
      /* originalPosition */ CSSPositionType, 
      Unit
    ]
  ] = js.native
  /**
    * Position of a layer relative to its target. The position attribute takes two positional arguments in
    * the format position="edge edge-position", where edge specifies what edge to align the layer to, and
    * edge-position specifies where on that edge the layer should appear.
    */
  var position: js.UndefOr[PositionType] = js.native
  /** z-index for the layer component */
  var zIndex: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFlip(value: Boolean | FlipPositionType | js.Array[FlipPositionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFlip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFlip")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundariesElement(value: BoundariesElementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundariesElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundariesElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundariesElement")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFlippedChange(
      value: (/* flipped */ Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFlippedChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnFlippedChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFlippedChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionType): Self = {
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
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

