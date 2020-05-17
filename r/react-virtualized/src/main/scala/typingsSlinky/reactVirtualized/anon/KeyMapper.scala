package typingsSlinky.reactVirtualized.anon

import typingsSlinky.reactVirtualized.esMasonryMod.emptyObject
import typingsSlinky.reactVirtualized.esMasonryMod.identity
import typingsSlinky.reactVirtualized.esMasonryMod.noop
import typingsSlinky.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsSlinky.reactVirtualized.reactVirtualizedNumbers.`20`
import typingsSlinky.reactVirtualized.reactVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyMapper extends js.Object {
  var autoHeight: `false` = js.native
  var keyMapper: identity = js.native
  var onCellsRendered: noop = js.native
  var onScroll: noop = js.native
  var overscanByPixels: `20` = js.native
  var role: grid = js.native
  var scrollingResetTimeInterval: /* 150 */ Double = js.native
  var style: emptyObject = js.native
  var tabIndex: `0` = js.native
}

object KeyMapper {
  @scala.inline
  def apply(
    autoHeight: `false`,
    keyMapper: /* value */ js.Any => js.Any,
    onCellsRendered: () => Unit,
    onScroll: () => Unit,
    overscanByPixels: `20`,
    role: grid,
    scrollingResetTimeInterval: /* 150 */ Double,
    style: emptyObject,
    tabIndex: `0`
  ): KeyMapper = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], keyMapper = js.Any.fromFunction1(keyMapper), onCellsRendered = js.Any.fromFunction0(onCellsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanByPixels = overscanByPixels.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapper]
  }
  @scala.inline
  implicit class KeyMapperOps[Self <: KeyMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHeight(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyMapper(value: /* value */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCellsRendered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellsRendered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnScroll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverscanByPixels(value: `20`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscanByPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: grid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollingResetTimeInterval(value: /* 150 */ Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: emptyObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabIndex(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

