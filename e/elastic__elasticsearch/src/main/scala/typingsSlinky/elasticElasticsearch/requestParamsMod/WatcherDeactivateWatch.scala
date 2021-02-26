package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherDeactivateWatch extends Generic {
  
  var watch_id: String = js.native
}
object WatcherDeactivateWatch {
  
  @scala.inline
  def apply(watch_id: String): WatcherDeactivateWatch = {
    val __obj = js.Dynamic.literal(watch_id = watch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherDeactivateWatch]
  }
  
  @scala.inline
  implicit class WatcherDeactivateWatchMutableBuilder[Self <: WatcherDeactivateWatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWatch_id(value: String): Self = StObject.set(x, "watch_id", value.asInstanceOf[js.Any])
  }
}
