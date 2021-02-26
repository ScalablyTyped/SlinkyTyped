package typingsSlinky.redisInfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type PersistenceInfo = typingsSlinky.redisInfo.mod.BasePersistenceInfo with (typingsSlinky.redisInfo.mod.PersistenceAOFOnInfo | typingsSlinky.redisInfo.mod.PersistenceAOFOffInfo) with (typingsSlinky.redisInfo.mod.PersistenceLoadingOnInfo | typingsSlinky.redisInfo.mod.PersistenceLoadingOffInfo)
  
  type RedisInfo = typingsSlinky.redisInfo.mod.GeneralStats with typingsSlinky.redisInfo.mod.ServerInfo with typingsSlinky.redisInfo.mod.ClientsInfo with typingsSlinky.redisInfo.mod.MemoryInfo with typingsSlinky.redisInfo.mod.PersistenceInfo with typingsSlinky.redisInfo.mod.Stats with typingsSlinky.redisInfo.mod.ReplicationInfo with typingsSlinky.redisInfo.mod.CPUInfo
  
  type ReplicationInfo = typingsSlinky.redisInfo.mod.BaseReplicationInfo with (typingsSlinky.redisInfo.mod.ReplicationMasterInfo | typingsSlinky.redisInfo.mod.ReplicationReplicaInfo)
  
  type ReplicationReplicaInfo = typingsSlinky.redisInfo.mod.BaseReplicationReplicaInfo with (typingsSlinky.redisInfo.mod.ReplicationReplicaSyncOnInfo | typingsSlinky.redisInfo.mod.ReplicationReplicaSyncOffInfo) with (typingsSlinky.redisInfo.mod.ReplicationReplicaLinkUpInfo | typingsSlinky.redisInfo.mod.ReplicationReplicaLinkDownInfo)
  
  @scala.inline
  def parse(info: java.lang.String): typingsSlinky.redisInfo.mod.RedisInfo = typingsSlinky.redisInfo.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(info.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.redisInfo.mod.RedisInfo]
}
