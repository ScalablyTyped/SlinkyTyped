package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.intercomClientStrings.social_profileDotlist
import typingsSlinky.intercomClient.userMod.SocialProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socialprofiles extends StObject {
  
  var social_profiles: js.Array[SocialProfile] = js.native
  
  var `type`: social_profileDotlist = js.native
}
object Socialprofiles {
  
  @scala.inline
  def apply(social_profiles: js.Array[SocialProfile], `type`: social_profileDotlist): Socialprofiles = {
    val __obj = js.Dynamic.literal(social_profiles = social_profiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Socialprofiles]
  }
  
  @scala.inline
  implicit class SocialprofilesMutableBuilder[Self <: Socialprofiles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocial_profiles(value: js.Array[SocialProfile]): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocial_profilesVarargs(value: SocialProfile*): Self = StObject.set(x, "social_profiles", js.Array(value :_*))
    
    @scala.inline
    def setType(value: social_profileDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
