package typingsSlinky.officeUiFabricReact.commandBarBaseMod

import typingsSlinky.officeUiFabricReact.commandBarTypesMod.ICommandBarItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandBarData extends js.Object {
  /**
    * Unique string used to cache the width of the command bar
    */
  var cacheKey: String = js.native
  /**
    * Items being rendered on the far side
    */
  var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.native
  /**
    * Length of original overflowItems to ensure that they are not moved into primary region on resize
    */
  var minimumOverflowItems: Double = js.native
  /**
    * Items being rendered in the overflow
    */
  var overflowItems: js.Array[ICommandBarItemProps] = js.native
  /**
    * Items being rendered in the primary region
    */
  var primaryItems: js.Array[ICommandBarItemProps] = js.native
}

object ICommandBarData {
  @scala.inline
  def apply(
    cacheKey: String,
    minimumOverflowItems: Double,
    overflowItems: js.Array[ICommandBarItemProps],
    primaryItems: js.Array[ICommandBarItemProps]
  ): ICommandBarData = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], minimumOverflowItems = minimumOverflowItems.asInstanceOf[js.Any], overflowItems = overflowItems.asInstanceOf[js.Any], primaryItems = primaryItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarData]
  }
  @scala.inline
  implicit class ICommandBarDataOps[Self <: ICommandBarData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumOverflowItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumOverflowItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowItems(value: js.Array[ICommandBarItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryItems(value: js.Array[ICommandBarItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFarItems(value: js.Array[ICommandBarItemProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFarItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("farItems")(js.undefined)
        ret
    }
  }
  
}

