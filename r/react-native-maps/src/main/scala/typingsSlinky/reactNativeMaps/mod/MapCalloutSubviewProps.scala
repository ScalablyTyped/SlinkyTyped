package typingsSlinky.reactNativeMaps.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeMaps.Anon1
import typingsSlinky.reactNativeMaps.AnonCoordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapCalloutSubviewProps extends ViewProps {
  var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Anon1 with AnonCoordinate], Unit]] = js.native
}

object MapCalloutSubviewProps {
  @scala.inline
  def apply(): MapCalloutSubviewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCalloutSubviewProps]
  }
  @scala.inline
  implicit class MapCalloutSubviewPropsOps[Self <: MapCalloutSubviewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPress(value: SyntheticEvent[NodeHandle, Anon1 with AnonCoordinate] => Unit): Self = {
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
  }
  
}

