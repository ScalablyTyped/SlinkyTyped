package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.anon.AppUuid
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.disband
import typingsSlinky.openfin.openfinStrings.join
import typingsSlinky.openfin.openfinStrings.leave
import typingsSlinky.openfin.openfinStrings.merge
import typingsSlinky.openfin.openfinStrings.nothing
import typingsSlinky.openfin.openfinStrings.source
import typingsSlinky.openfin.openfinStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowGroupChanged[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var memberOf: source | target | nothing = js.native
  
  var reason: leave | join | merge | disband = js.native
  
  var sourceGroup: js.Array[AppUuid] = js.native
  
  var sourceWindowAppUuid: String = js.native
  
  var sourceWindowName: String = js.native
  
  var targetGroup: js.Array[AppUuid] = js.native
  
  var targetWindowAppUuid: String = js.native
  
  var targetWindowName: String = js.native
}
object WindowGroupChanged {
  
  @scala.inline
  def apply[Topic, Type](
    memberOf: source | target | nothing,
    name: String,
    reason: leave | join | merge | disband,
    sourceGroup: js.Array[AppUuid],
    sourceWindowAppUuid: String,
    sourceWindowName: String,
    targetGroup: js.Array[AppUuid],
    targetWindowAppUuid: String,
    targetWindowName: String,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowGroupChanged[Topic, Type] = {
    val __obj = js.Dynamic.literal(memberOf = memberOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceGroup = sourceGroup.asInstanceOf[js.Any], sourceWindowAppUuid = sourceWindowAppUuid.asInstanceOf[js.Any], sourceWindowName = sourceWindowName.asInstanceOf[js.Any], targetGroup = targetGroup.asInstanceOf[js.Any], targetWindowAppUuid = targetWindowAppUuid.asInstanceOf[js.Any], targetWindowName = targetWindowName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowGroupChanged[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowGroupChangedMutableBuilder[Self <: WindowGroupChanged[_, _], Topic, Type] (val x: Self with (WindowGroupChanged[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setMemberOf(value: source | target | nothing): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: leave | join | merge | disband): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceGroup(value: js.Array[AppUuid]): Self = StObject.set(x, "sourceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceGroupVarargs(value: AppUuid*): Self = StObject.set(x, "sourceGroup", js.Array(value :_*))
    
    @scala.inline
    def setSourceWindowAppUuid(value: String): Self = StObject.set(x, "sourceWindowAppUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceWindowName(value: String): Self = StObject.set(x, "sourceWindowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroup(value: js.Array[AppUuid]): Self = StObject.set(x, "targetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupVarargs(value: AppUuid*): Self = StObject.set(x, "targetGroup", js.Array(value :_*))
    
    @scala.inline
    def setTargetWindowAppUuid(value: String): Self = StObject.set(x, "targetWindowAppUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWindowName(value: String): Self = StObject.set(x, "targetWindowName", value.asInstanceOf[js.Any])
  }
}
