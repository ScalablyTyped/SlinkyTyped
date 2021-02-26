package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic Link event stat.
  */
@js.native
trait SchemaDynamicLinkEventStat extends StObject {
  
  /**
    * The number of times this event occurred.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * Link event.
    */
  var event: js.UndefOr[String] = js.native
  
  /**
    * Requested platform.
    */
  var platform: js.UndefOr[String] = js.native
}
object SchemaDynamicLinkEventStat {
  
  @scala.inline
  def apply(): SchemaDynamicLinkEventStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicLinkEventStat]
  }
  
  @scala.inline
  implicit class SchemaDynamicLinkEventStatMutableBuilder[Self <: SchemaDynamicLinkEventStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
