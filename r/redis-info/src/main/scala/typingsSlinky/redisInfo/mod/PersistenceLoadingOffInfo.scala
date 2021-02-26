package typingsSlinky.redisInfo.mod

import typingsSlinky.redisInfo.mod.Flag.OFF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceLoadingOffInfo extends StObject {
  
  var loading: OFF = js.native
}
object PersistenceLoadingOffInfo {
  
  @scala.inline
  def apply(loading: OFF): PersistenceLoadingOffInfo = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceLoadingOffInfo]
  }
  
  @scala.inline
  implicit class PersistenceLoadingOffInfoMutableBuilder[Self <: PersistenceLoadingOffInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: OFF): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
