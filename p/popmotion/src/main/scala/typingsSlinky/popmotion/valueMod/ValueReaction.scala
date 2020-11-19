package typingsSlinky.popmotion.valueMod

import typingsSlinky.framesync.typesMod.FrameData
import typingsSlinky.popmotion.reactionsMod.BaseMulticast
import typingsSlinky.popmotion.typesMod.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/reactions/value", "ValueReaction")
@js.native
class ValueReaction protected () extends BaseMulticast[ValueReaction] {
  def this(props: ValueProps) = this()
  
  def create(props: ValueProps): ValueReaction = js.native
  
  var current: js.Any = js.native
  
  def get(): Value = js.native
  
  var getListVelocity: js.Any = js.native
  
  var getMapVelocity: js.Any = js.native
  
  var getSingleVelocity: js.Any = js.native
  
  def getVelocity(): js.Any = js.native
  
  def getVelocityOfCurrent(): js.Any = js.native
  
  var lastUpdated: js.Any = js.native
  
  var prev: js.Any = js.native
  
  def scheduleVelocityCheck(): Process = js.native
  
  var timeDelta: js.Any = js.native
  
  def updateCurrent(v: js.Any): js.Any = js.native
  
  @JSName("update")
  def update_MValueReaction(v: Value): Unit = js.native
  
  def velocityCheck(hasTimestamp: FrameData): Unit = js.native
}
