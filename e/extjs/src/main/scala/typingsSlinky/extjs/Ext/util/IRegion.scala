package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRegion extends IBase {
  /** [Method] Modifies the current region to be adjusted by offsets
  		* @param top Number top offset
  		* @param right Number right offset
  		* @param bottom Number bottom offset
  		* @param left Number left offset
  		* @returns Ext.util.Region this
  		*/
  var adjust: js.UndefOr[
    js.Function4[
      /* top */ js.UndefOr[Double], 
      /* right */ js.UndefOr[Double], 
      /* bottom */ js.UndefOr[Double], 
      /* left */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  /** [Method] Modifies the current region to be constrained to the targetRegion
  		* @param targetRegion Ext.util.Region
  		* @returns Ext.util.Region this
  		*/
  var constrainTo: js.UndefOr[js.Function1[/* targetRegion */ js.UndefOr[this.type], this.type]] = js.native
  /** [Method] Checks if this region completely contains the region that is passed in
  		* @param region Ext.util.Region
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.native
  /** [Method] Create a copy of this Region
  		* @returns Ext.util.Region
  		*/
  var copy: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Copy the values of another Region to this Region
  		* @param p Ext.util.Region The region to copy from.
  		* @returns Ext.util.Region This Region
  		*/
  var copyFrom: js.UndefOr[js.Function1[/* p */ js.UndefOr[this.type], this.type]] = js.native
  /** [Method] Check whether this region is equivalent to the given region
  		* @param region Ext.util.Region The region to compare with
  		* @returns Boolean
  		*/
  @JSName("equals")
  var equals_FIRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.native
  /** [Method] Get the offset amount of a point outside the region
  		* @param axis String
  		* @param p Ext.util.Point the point
  		* @returns Ext.util.Offset
  		*/
  var getOutOfBoundOffset: js.UndefOr[js.Function2[/* axis */ js.UndefOr[String], /* p */ js.UndefOr[IPoint], IOffset]] = js.native
  /** [Method] Get the offset amount on the x axis
  		* @param p Number the offset
  		* @returns Number
  		*/
  var getOutOfBoundOffsetX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Get the offset amount on the y axis
  		* @param p Number the offset
  		* @returns Number
  		*/
  var getOutOfBoundOffsetY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Checks if this region intersects the region passed in
  		* @param region Ext.util.Region
  		* @returns Ext.util.Region/Boolean Returns the intersected region or false if there is no intersection.
  		*/
  var intersect: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], _]] = js.native
  /** [Method] Check whether the point  offset is out of bound
  		* @param axis String
  		* @param p Ext.util.Point/Number the point / offset
  		* @returns Boolean
  		*/
  var isOutOfBound: js.UndefOr[js.Function2[/* axis */ js.UndefOr[String], /* p */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Check whether the offset is out of bound in the x axis
  		* @param p Number the offset
  		* @returns Boolean
  		*/
  var isOutOfBoundX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.native
  /** [Method] Check whether the offset is out of bound in the y axis
  		* @param p Number the offset
  		* @returns Boolean
  		*/
  var isOutOfBoundY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.native
  /** [Method] Round all the properties of this region
  		* @returns Ext.util.Region this This Region
  		*/
  var round: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Translate this region by the given offset amount
  		* @param x Ext.util.Offset/Object Object containing the x and y properties. Or the x value is using the two argument form.
  		* @param y Number The y value unless using an Offset object.
  		* @returns Ext.util.Region this This Region
  		*/
  var translateBy: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Returns the smallest region that contains the current AND targetRegion
  		* @param region Ext.util.Region
  		* @returns Ext.util.Region a new region
  		*/
  var union: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], this.type]] = js.native
}

object IRegion {
  @scala.inline
  def apply(): IRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegion]
  }
  @scala.inline
  implicit class IRegionOps[Self <: IRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjust(
      value: (/* top */ js.UndefOr[Double], /* right */ js.UndefOr[Double], /* bottom */ js.UndefOr[Double], /* left */ js.UndefOr[Double]) => IRegion
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainTo(value: /* targetRegion */ js.UndefOr[IRegion] => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConstrainTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainTo")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: /* region */ js.UndefOr[IRegion] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: () => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyFrom(value: /* p */ js.UndefOr[IRegion] => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCopyFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withEquals(value: /* region */ js.UndefOr[IRegion] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOutOfBoundOffset(value: (/* axis */ js.UndefOr[String], /* p */ js.UndefOr[IPoint]) => IOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutOfBoundOffset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetOutOfBoundOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutOfBoundOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOutOfBoundOffsetX(value: /* p */ js.UndefOr[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutOfBoundOffsetX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOutOfBoundOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutOfBoundOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOutOfBoundOffsetY(value: /* p */ js.UndefOr[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutOfBoundOffsetY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetOutOfBoundOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutOfBoundOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersect(value: /* region */ js.UndefOr[IRegion] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIntersect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersect")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOutOfBound(value: (/* axis */ js.UndefOr[String], /* p */ js.UndefOr[js.Any]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfBound")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsOutOfBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfBound")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOutOfBoundX(value: /* p */ js.UndefOr[Double] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfBoundX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsOutOfBoundX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfBoundX")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOutOfBoundY(value: /* p */ js.UndefOr[Double] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfBoundY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsOutOfBoundY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfBoundY")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: () => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateBy(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTranslateBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateBy")(js.undefined)
        ret
    }
    @scala.inline
    def withUnion(value: /* region */ js.UndefOr[IRegion] => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union")(js.undefined)
        ret
    }
  }
  
}

