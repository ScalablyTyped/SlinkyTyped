package typingsSlinky.iitc

import typingsSlinky.iitc.anon.Markup
import typingsSlinky.iitc.iitcStrings.PLAYER
import typingsSlinky.iitc.iitcStrings.PORTAL
import typingsSlinky.iitc.iitcStrings.TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inteltypesMod {
  
  object Intel {
    
    // CHAT
    @js.native
    trait ChatCallback extends StObject {
      
      var result: js.Array[ChatLine] = js.native
    }
    object ChatCallback {
      
      @scala.inline
      def apply(result: js.Array[ChatLine]): ChatCallback = {
        val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[ChatCallback]
      }
      
      @scala.inline
      implicit class ChatCallbackMutableBuilder[Self <: ChatCallback] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setResult(value: js.Array[ChatLine]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResultVarargs(value: ChatLine*): Self = StObject.set(x, "result", js.Array(value :_*))
      }
    }
    
    type ChatLine = js.Tuple3[/*guid*/ String, /*time*/ Double, PlextContainer]
    
    type FieldDetails = js.Array[js.Any]
    
    type LinkDetails = js.Array[js.Any]
    
    type MarkUpPlayer = js.Tuple2[PLAYER, MarkUpPlayerType]
    
    @js.native
    trait MarkUpPlayerType extends StObject {
      
      var plain: String = js.native
      
      var team: String = js.native
    }
    object MarkUpPlayerType {
      
      @scala.inline
      def apply(plain: String, team: String): MarkUpPlayerType = {
        val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
        __obj.asInstanceOf[MarkUpPlayerType]
      }
      
      @scala.inline
      implicit class MarkUpPlayerTypeMutableBuilder[Self <: MarkUpPlayerType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPlain(value: String): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      }
    }
    
    type MarkUpPortal = js.Tuple2[PORTAL, MarkUpPortalType]
    
    @js.native
    trait MarkUpPortalType extends StObject {
      
      var address: String = js.native
      
      var latE6: Double = js.native
      
      var lngE6: Double = js.native
      
      var name: String = js.native
      
      var plain: String = js.native
      
      var team: String = js.native
    }
    object MarkUpPortalType {
      
      @scala.inline
      def apply(address: String, latE6: Double, lngE6: Double, name: String, plain: String, team: String): MarkUpPortalType = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plain = plain.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
        __obj.asInstanceOf[MarkUpPortalType]
      }
      
      @scala.inline
      implicit class MarkUpPortalTypeMutableBuilder[Self <: MarkUpPortalType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatE6(value: Double): Self = StObject.set(x, "latE6", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLngE6(value: Double): Self = StObject.set(x, "lngE6", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlain(value: String): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      }
    }
    
    type MarkUpText = js.Tuple2[TEXT, MarkUpTextType]
    
    @js.native
    trait MarkUpTextType extends StObject {
      
      var plain: String = js.native
    }
    object MarkUpTextType {
      
      @scala.inline
      def apply(plain: String): MarkUpTextType = {
        val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any])
        __obj.asInstanceOf[MarkUpTextType]
      }
      
      @scala.inline
      implicit class MarkUpTextTypeMutableBuilder[Self <: MarkUpTextType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPlain(value: String): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      }
    }
    
    // PLAYER
    @js.native
    trait PlayerInfo extends StObject {
      
      var ap: String = js.native
      
      var available_invites: Double = js.native
      
      var energy: Double = js.native
      
      var level: Double = js.native
      
      var min_ap_for_current_level: String = js.native
      
      var min_ap_for_next_level: String = js.native
      
      var nickMatcher: js.RegExp = js.native
      
      var nickname: String = js.native
      
      var team: String = js.native
      
      var verified_level: Double = js.native
      
      var xm_capacity: String = js.native
    }
    object PlayerInfo {
      
      @scala.inline
      def apply(
        ap: String,
        available_invites: Double,
        energy: Double,
        level: Double,
        min_ap_for_current_level: String,
        min_ap_for_next_level: String,
        nickMatcher: js.RegExp,
        nickname: String,
        team: String,
        verified_level: Double,
        xm_capacity: String
      ): PlayerInfo = {
        val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], available_invites = available_invites.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], min_ap_for_current_level = min_ap_for_current_level.asInstanceOf[js.Any], min_ap_for_next_level = min_ap_for_next_level.asInstanceOf[js.Any], nickMatcher = nickMatcher.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], verified_level = verified_level.asInstanceOf[js.Any], xm_capacity = xm_capacity.asInstanceOf[js.Any])
        __obj.asInstanceOf[PlayerInfo]
      }
      
      @scala.inline
      implicit class PlayerInfoMutableBuilder[Self <: PlayerInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAp(value: String): Self = StObject.set(x, "ap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAvailable_invites(value: Double): Self = StObject.set(x, "available_invites", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMin_ap_for_current_level(value: String): Self = StObject.set(x, "min_ap_for_current_level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMin_ap_for_next_level(value: String): Self = StObject.set(x, "min_ap_for_next_level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNickMatcher(value: js.RegExp): Self = StObject.set(x, "nickMatcher", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerified_level(value: Double): Self = StObject.set(x, "verified_level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXm_capacity(value: String): Self = StObject.set(x, "xm_capacity", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PlextContainer extends StObject {
      
      var plext: Markup = js.native
    }
    object PlextContainer {
      
      @scala.inline
      def apply(plext: Markup): PlextContainer = {
        val __obj = js.Dynamic.literal(plext = plext.asInstanceOf[js.Any])
        __obj.asInstanceOf[PlextContainer]
      }
      
      @scala.inline
      implicit class PlextContainerMutableBuilder[Self <: PlextContainer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPlext(value: Markup): Self = StObject.set(x, "plext", value.asInstanceOf[js.Any])
      }
    }
    
    // ENTITY
    type PortalDetails = js.Array[js.Any]
  }
}
