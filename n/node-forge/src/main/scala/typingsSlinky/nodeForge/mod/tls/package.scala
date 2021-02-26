package typingsSlinky.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tls {
  
  type ConnectionState = js.Any
  
  @scala.inline
  def MaxFragment: scala.Double = typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("MaxFragment").asInstanceOf[scala.Double]
  
  @scala.inline
  def SupportedVersions: js.Array[typingsSlinky.nodeForge.mod.tls.ProtocolVersion] = typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("SupportedVersions").asInstanceOf[js.Array[typingsSlinky.nodeForge.mod.tls.ProtocolVersion]]
  
  @scala.inline
  def Version: typingsSlinky.nodeForge.mod.tls.ProtocolVersion = typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("Version").asInstanceOf[typingsSlinky.nodeForge.mod.tls.ProtocolVersion]
  
  @scala.inline
  def Versions: js.Array[typingsSlinky.nodeForge.mod.tls.ProtocolVersion] = typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("Versions").asInstanceOf[js.Array[typingsSlinky.nodeForge.mod.tls.ProtocolVersion]]
  
  @scala.inline
  def createConnection(options: typingsSlinky.nodeForge.anon.CaStore): typingsSlinky.nodeForge.mod.tls.Connection = typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.tls.Connection]
  
  @scala.inline
  def createSessionCache(): typingsSlinky.nodeForge.mod.tls.SessionCache = typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")().asInstanceOf[typingsSlinky.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(cache: js.UndefOr[scala.Nothing], capacity: scala.Double): typingsSlinky.nodeForge.mod.tls.SessionCache = (typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(cache: org.scalablytyped.runtime.StringDictionary[typingsSlinky.nodeForge.mod.tls.Session]): typingsSlinky.nodeForge.mod.tls.SessionCache = typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(
    cache: org.scalablytyped.runtime.StringDictionary[typingsSlinky.nodeForge.mod.tls.Session],
    capacity: scala.Double
  ): typingsSlinky.nodeForge.mod.tls.SessionCache = (typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(cache: typingsSlinky.nodeForge.mod.tls.SessionCache): typingsSlinky.nodeForge.mod.tls.SessionCache = typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(cache: typingsSlinky.nodeForge.mod.tls.SessionCache, capacity: scala.Double): typingsSlinky.nodeForge.mod.tls.SessionCache = (typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.tls.SessionCache]
  
  @scala.inline
  def hmacSha1(
    key: java.lang.String,
    seqNum: js.Tuple2[scala.Double, scala.Double],
    record: typingsSlinky.nodeForge.mod.tls.Record
  ): typingsSlinky.nodeForge.mod.Bytes = (typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.Bytes]
  @scala.inline
  def hmacSha1(
    key: js.Array[typingsSlinky.nodeForge.mod.Byte],
    seqNum: js.Tuple2[scala.Double, scala.Double],
    record: typingsSlinky.nodeForge.mod.tls.Record
  ): typingsSlinky.nodeForge.mod.Bytes = (typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.Bytes]
  @scala.inline
  def hmacSha1(
    key: typingsSlinky.nodeForge.mod.util.ByteBuffer,
    seqNum: js.Tuple2[scala.Double, scala.Double],
    record: typingsSlinky.nodeForge.mod.tls.Record
  ): typingsSlinky.nodeForge.mod.Bytes = (typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.Bytes]
  
  @scala.inline
  def prfTls1(secret: java.lang.String, label: java.lang.String, seed: java.lang.String, length: scala.Double): typingsSlinky.nodeForge.mod.util.ByteBuffer = (typingsSlinky.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("prf_tls1")(secret.asInstanceOf[js.Any], label.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeForge.mod.util.ByteBuffer]
}
