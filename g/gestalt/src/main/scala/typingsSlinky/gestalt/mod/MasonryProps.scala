package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.gestalt.anon.Data
import typingsSlinky.gestalt.gestaltStrings.MasonryDefaultLayout
import typingsSlinky.gestalt.gestaltStrings.MasonryUniformRowLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasonryProps extends js.Object {
  var columnWidth: js.UndefOr[Double] = js.native
  var comp: ReactComponentClass[Data] = js.native
  var flexible: js.UndefOr[Boolean] = js.native
  var gutterWidth: js.UndefOr[Double] = js.native
  var items: js.Array[_] = js.native
  var layout: js.UndefOr[MasonryDefaultLayout | MasonryUniformRowLayout] = js.native
  var loadItems: js.UndefOr[js.Function0[Unit]] = js.native
  var measurementStore: js.UndefOr[js.Any] = js.native
  var minCols: js.UndefOr[Double] = js.native
  var scrollContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  var virtualBoundsBottom: js.UndefOr[Double] = js.native
  var virtualBoundsTop: js.UndefOr[Double] = js.native
  var virtualize: js.UndefOr[Boolean] = js.native
}

object MasonryProps {
  @scala.inline
  def apply(comp: ReactComponentClass[Data], items: js.Array[_]): MasonryProps = {
    val __obj = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps]
  }
  @scala.inline
  implicit class MasonryPropsOps[Self <: MasonryProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComp(value: ReactComponentClass[Data]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexible")(js.undefined)
        ret
    }
    @scala.inline
    def withGutterWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutterWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: MasonryDefaultLayout | MasonryUniformRowLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadItems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoadItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasurementStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasurementStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementStore")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCols")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollContainer(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScrollContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualBoundsBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualBoundsBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualBoundsBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualBoundsBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualBoundsTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualBoundsTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualBoundsTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualBoundsTop")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualize")(js.undefined)
        ret
    }
  }
  
}

