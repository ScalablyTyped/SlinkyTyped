package typingsSlinky.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentType extends StObject
@JSImport("node-forge", "tls.ContentType")
@js.native
object ContentType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
  
  @js.native
  sealed trait alert extends ContentType
  /* 21 */ val alert: typingsSlinky.nodeForge.mod.tls.ContentType.alert with Double = js.native
  
  @js.native
  sealed trait application_data extends ContentType
  /* 23 */ val application_data: typingsSlinky.nodeForge.mod.tls.ContentType.application_data with Double = js.native
  
  @js.native
  sealed trait change_cipher_spec extends ContentType
  /* 20 */ val change_cipher_spec: typingsSlinky.nodeForge.mod.tls.ContentType.change_cipher_spec with Double = js.native
  
  @js.native
  sealed trait handshake extends ContentType
  /* 22 */ val handshake: typingsSlinky.nodeForge.mod.tls.ContentType.handshake with Double = js.native
  
  @js.native
  sealed trait heartbeat extends ContentType
  /* 24 */ val heartbeat: typingsSlinky.nodeForge.mod.tls.ContentType.heartbeat with Double = js.native
}
