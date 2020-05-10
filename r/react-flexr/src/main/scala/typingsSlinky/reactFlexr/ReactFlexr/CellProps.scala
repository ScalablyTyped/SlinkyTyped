package typingsSlinky.reactFlexr.ReactFlexr

import typingsSlinky.react.mod.Props
import typingsSlinky.reactFlexr.reactFlexrStrings.bottom
import typingsSlinky.reactFlexr.reactFlexrStrings.center
import typingsSlinky.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellProps extends Props[Cell] {
  /**
    * Vertical Align This Cell: top, center, bottom
    */
  var align: js.UndefOr[top | center | bottom] = js.native
  /**
    * Like size, but only for desk devices.
    * Accepts 'hidden' as well.
    */
  var desk: js.UndefOr[String | Double] = js.native
  /**
    * Cell will be full height.
    */
  var flex: js.UndefOr[Boolean] = js.native
  /**
    * Override default gutter: '1em', '5%', '10px', etc.
    */
  var gutter: js.UndefOr[String] = js.native
  /**
    * Like size, but only for lap devices.
    * Accepts 'hidden' as well.
    */
  var lap: js.UndefOr[String | Double] = js.native
  /**
    * Like size, but only for palm devices.
    * Accepts 'hidden' as well.
    */
  var palm: js.UndefOr[String | Double] = js.native
  /**
    * Like size, but only for ( palm + lap ) devices.
    * Accepts 'hidden' as well.
    */
  var portable: js.UndefOr[String | Double] = js.native
  /**
    * Takes a fraction. e.g. 1/6
    */
  var size: js.UndefOr[String | Double] = js.native
}

object CellProps {
  @scala.inline
  def apply(): CellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellProps]
  }
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: top | center | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withDesk(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desk")(js.undefined)
        ret
    }
    @scala.inline
    def withFlex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withLap(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lap")(js.undefined)
        ret
    }
    @scala.inline
    def withPalm(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palm")(js.undefined)
        ret
    }
    @scala.inline
    def withPortable(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portable")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

