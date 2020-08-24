package typingsSlinky.ol.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.ol.mapBrowserEventMod.default
import typingsSlinky.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "MapBrowserEvent")
@js.native
class MapBrowserEvent protected () extends default {
  def this(`type`: String, map: typingsSlinky.ol.pluggableMapMod.default, browserEvent: Event) = this()
  def this(
    `type`: String,
    map: typingsSlinky.ol.pluggableMapMod.default,
    browserEvent: Event,
    opt_dragging: Boolean
  ) = this()
  def this(
    `type`: String,
    map: typingsSlinky.ol.pluggableMapMod.default,
    browserEvent: Event,
    opt_dragging: js.UndefOr[scala.Nothing],
    opt_frameState: FrameState
  ) = this()
  def this(
    `type`: String,
    map: typingsSlinky.ol.pluggableMapMod.default,
    browserEvent: Event,
    opt_dragging: Boolean,
    opt_frameState: FrameState
  ) = this()
}

