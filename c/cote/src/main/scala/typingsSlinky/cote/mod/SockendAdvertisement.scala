package typingsSlinky.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cote.mod.Advertisement because Already inherited
- typingsSlinky.cote.mod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts */ @js.native
trait SockendAdvertisement extends ResponderAdvertisement {
  
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.native
}
object SockendAdvertisement {
  
  @scala.inline
  def apply(name: String): SockendAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SockendAdvertisement]
  }
  
  @scala.inline
  implicit class SockendAdvertisementMutableBuilder[Self <: SockendAdvertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcasts(value: js.Array[String]): Self = StObject.set(x, "broadcasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcastsUndefined: Self = StObject.set(x, "broadcasts", js.undefined)
    
    @scala.inline
    def setBroadcastsVarargs(value: String*): Self = StObject.set(x, "broadcasts", js.Array(value :_*))
  }
}
