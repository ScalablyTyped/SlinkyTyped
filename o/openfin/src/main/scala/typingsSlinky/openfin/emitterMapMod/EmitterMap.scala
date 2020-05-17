package typingsSlinky.openfin.emitterMapMod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/events/emitterMap", "EmitterMap")
@js.native
class EmitterMap () extends js.Object {
  var hashKeys: js.Any = js.native
  var storage: js.Any = js.native
  def delete(keys: EmitterAccessor): Boolean = js.native
  def get(keys: EmitterAccessor): EventEmitter = js.native
  def has(keys: EmitterAccessor): Boolean = js.native
}

