package typingsSlinky.redisInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PersistenceInfo = typingsSlinky.redisInfo.mod.BasePersistenceInfo with (typingsSlinky.redisInfo.mod.PersistenceAOFOnInfo | typingsSlinky.redisInfo.mod.PersistenceAOFOffInfo) with (typingsSlinky.redisInfo.mod.PersistenceLoadingOnInfo | typingsSlinky.redisInfo.mod.PersistenceLoadingOffInfo)
  type RedisInfo = typingsSlinky.redisInfo.mod.GeneralStats with typingsSlinky.redisInfo.mod.ServerInfo with typingsSlinky.redisInfo.mod.ClientsInfo with typingsSlinky.redisInfo.mod.MemoryInfo with typingsSlinky.redisInfo.mod.PersistenceInfo with typingsSlinky.redisInfo.mod.Stats with typingsSlinky.redisInfo.mod.ReplicationInfo with typingsSlinky.redisInfo.mod.CPUInfo
  type ReplicationInfo = typingsSlinky.redisInfo.mod.BaseReplicationInfo with (typingsSlinky.redisInfo.mod.ReplicationMasterInfo | typingsSlinky.redisInfo.mod.ReplicationReplicaInfo)
  type ReplicationReplicaInfo = typingsSlinky.redisInfo.mod.BaseReplicationReplicaInfo with (typingsSlinky.redisInfo.mod.ReplicationReplicaSyncOnInfo | typingsSlinky.redisInfo.mod.ReplicationReplicaSyncOffInfo) with (typingsSlinky.redisInfo.mod.ReplicationReplicaLinkUpInfo | typingsSlinky.redisInfo.mod.ReplicationReplicaLinkDownInfo)
}
