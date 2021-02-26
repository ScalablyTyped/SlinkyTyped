package typingsSlinky.nodeForge.mod.tls

import typingsSlinky.nodeForge.mod.tls.Alert.Description
import typingsSlinky.nodeForge.mod.tls.Alert.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alert extends StObject {
  
  var description: Description = js.native
  
  var level: Level = js.native
}
object Alert {
  
  @scala.inline
  def apply(description: Description, level: Level): Alert = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
  
  @js.native
  sealed trait Description extends StObject
  @JSImport("node-forge", "tls.Alert.Description")
  @js.native
  object Description extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Description with Double] = js.native
    
    @js.native
    sealed trait access_denied extends Description
    /* 49 */ val access_denied: typingsSlinky.nodeForge.mod.tls.Alert.Description.access_denied with Double = js.native
    
    @js.native
    sealed trait bad_certificate extends Description
    /* 42 */ val bad_certificate: typingsSlinky.nodeForge.mod.tls.Alert.Description.bad_certificate with Double = js.native
    
    @js.native
    sealed trait bad_record_mac extends Description
    /* 20 */ val bad_record_mac: typingsSlinky.nodeForge.mod.tls.Alert.Description.bad_record_mac with Double = js.native
    
    @js.native
    sealed trait certificate_expired extends Description
    /* 45 */ val certificate_expired: typingsSlinky.nodeForge.mod.tls.Alert.Description.certificate_expired with Double = js.native
    
    @js.native
    sealed trait certificate_revoked extends Description
    /* 44 */ val certificate_revoked: typingsSlinky.nodeForge.mod.tls.Alert.Description.certificate_revoked with Double = js.native
    
    @js.native
    sealed trait certificate_unknown extends Description
    /* 46 */ val certificate_unknown: typingsSlinky.nodeForge.mod.tls.Alert.Description.certificate_unknown with Double = js.native
    
    @js.native
    sealed trait close_notify extends Description
    /* 0 */ val close_notify: typingsSlinky.nodeForge.mod.tls.Alert.Description.close_notify with Double = js.native
    
    @js.native
    sealed trait decode_error extends Description
    /* 50 */ val decode_error: typingsSlinky.nodeForge.mod.tls.Alert.Description.decode_error with Double = js.native
    
    @js.native
    sealed trait decompression_failure extends Description
    /* 30 */ val decompression_failure: typingsSlinky.nodeForge.mod.tls.Alert.Description.decompression_failure with Double = js.native
    
    @js.native
    sealed trait decrypt_error extends Description
    /* 51 */ val decrypt_error: typingsSlinky.nodeForge.mod.tls.Alert.Description.decrypt_error with Double = js.native
    
    @js.native
    sealed trait decryption_failed extends Description
    /* 21 */ val decryption_failed: typingsSlinky.nodeForge.mod.tls.Alert.Description.decryption_failed with Double = js.native
    
    @js.native
    sealed trait export_restriction extends Description
    /* 60 */ val export_restriction: typingsSlinky.nodeForge.mod.tls.Alert.Description.export_restriction with Double = js.native
    
    @js.native
    sealed trait handshake_failure extends Description
    /* 40 */ val handshake_failure: typingsSlinky.nodeForge.mod.tls.Alert.Description.handshake_failure with Double = js.native
    
    @js.native
    sealed trait illegal_parameter extends Description
    /* 47 */ val illegal_parameter: typingsSlinky.nodeForge.mod.tls.Alert.Description.illegal_parameter with Double = js.native
    
    @js.native
    sealed trait insufficient_security extends Description
    /* 71 */ val insufficient_security: typingsSlinky.nodeForge.mod.tls.Alert.Description.insufficient_security with Double = js.native
    
    @js.native
    sealed trait internal_error extends Description
    /* 80 */ val internal_error: typingsSlinky.nodeForge.mod.tls.Alert.Description.internal_error with Double = js.native
    
    @js.native
    sealed trait no_renegotiation extends Description
    /* 100 */ val no_renegotiation: typingsSlinky.nodeForge.mod.tls.Alert.Description.no_renegotiation with Double = js.native
    
    @js.native
    sealed trait protocol_version extends Description
    /* 70 */ val protocol_version: typingsSlinky.nodeForge.mod.tls.Alert.Description.protocol_version with Double = js.native
    
    @js.native
    sealed trait record_overflow extends Description
    /* 22 */ val record_overflow: typingsSlinky.nodeForge.mod.tls.Alert.Description.record_overflow with Double = js.native
    
    @js.native
    sealed trait unexpected_message extends Description
    /* 10 */ val unexpected_message: typingsSlinky.nodeForge.mod.tls.Alert.Description.unexpected_message with Double = js.native
    
    @js.native
    sealed trait unknown_ca extends Description
    /* 48 */ val unknown_ca: typingsSlinky.nodeForge.mod.tls.Alert.Description.unknown_ca with Double = js.native
    
    @js.native
    sealed trait unsupported_certificate extends Description
    /* 43 */ val unsupported_certificate: typingsSlinky.nodeForge.mod.tls.Alert.Description.unsupported_certificate with Double = js.native
    
    @js.native
    sealed trait user_canceled extends Description
    /* 90 */ val user_canceled: typingsSlinky.nodeForge.mod.tls.Alert.Description.user_canceled with Double = js.native
  }
  
  @js.native
  sealed trait Level extends StObject
  @JSImport("node-forge", "tls.Alert.Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Level with Double] = js.native
    
    @js.native
    sealed trait fatal extends Level
    /* 2 */ val fatal: typingsSlinky.nodeForge.mod.tls.Alert.Level.fatal with Double = js.native
    
    @js.native
    sealed trait warning extends Level
    /* 1 */ val warning: typingsSlinky.nodeForge.mod.tls.Alert.Level.warning with Double = js.native
  }
  
  @scala.inline
  implicit class AlertMutableBuilder[Self <: Alert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
