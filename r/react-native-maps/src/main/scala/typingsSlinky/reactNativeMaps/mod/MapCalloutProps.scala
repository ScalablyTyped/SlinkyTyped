package typingsSlinky.reactNativeMaps.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeMaps.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapCalloutProps extends ViewProps {
  var onPress: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, `0` with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  var tooltip: js.UndefOr[Boolean] = js.native
}

object MapCalloutProps {
  @scala.inline
  def apply(): MapCalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCalloutProps]
  }
  @scala.inline
  implicit class MapCalloutPropsOps[Self <: MapCalloutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPress(value: SyntheticEvent[NodeHandle, `0` with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

