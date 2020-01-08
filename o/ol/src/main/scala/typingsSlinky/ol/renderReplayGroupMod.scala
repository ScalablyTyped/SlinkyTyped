package typingsSlinky.ol

import typingsSlinky.ol.renderReplayTypeMod.ReplayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/ReplayGroup", JSImport.Namespace)
@js.native
object renderReplayGroupMod extends js.Object {
  @js.native
  trait ReplayGroup extends js.Object {
    def addDeclutter(group: Boolean): js.Array[_] = js.native
    def getReplay(zIndex: js.UndefOr[scala.Nothing], replayType: ReplayType): typingsSlinky.ol.renderVectorContextMod.default = js.native
    def getReplay(zIndex: Double, replayType: ReplayType): typingsSlinky.ol.renderVectorContextMod.default = js.native
    def isEmpty(): Boolean = js.native
  }
  
  @js.native
  class default () extends ReplayGroup
  
}

