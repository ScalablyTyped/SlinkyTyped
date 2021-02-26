package typingsSlinky.instagramPrivateApi.anon

import typingsSlinky.instagramPrivateApi.graphqlRequestOptionsMod.InsightsFriendlyName
import typingsSlinky.instagramPrivateApi.graphqlRequestOptionsMod.InsightsSurface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FriendlyName extends StObject {
  
  var friendlyName: InsightsFriendlyName = js.native
  
  var name: js.UndefOr[InsightsSurface] = js.native
}
object FriendlyName {
  
  @scala.inline
  def apply(friendlyName: InsightsFriendlyName): FriendlyName = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FriendlyName]
  }
  
  @scala.inline
  implicit class FriendlyNameMutableBuilder[Self <: FriendlyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(value: InsightsFriendlyName): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: InsightsSurface): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
