package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.subchannelMod.Subchannel
import typingsSlinky.grpcGrpcJs.subchannelMod.SubchannelAddress
import typingsSlinky.grpcGrpcJs.uriParserMod.GrpcUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/subchannel-pool", JSImport.Namespace)
@js.native
object subchannelPoolMod extends js.Object {
  
  def getSubchannelPool(global: Boolean): SubchannelPool = js.native
  
  @js.native
  class SubchannelPool protected () extends js.Object {
    /**
      * A pool of subchannels use for making connections. Subchannels with the
      * exact same parameters will be reused.
      * @param global If true, this is the global subchannel pool. Otherwise, it
      * is the pool for a single channel.
      */
    def this(global: Boolean) = this()
    
    /**
      * A timer of a task performing a periodic subchannel cleanup.
      */
    var cleanupTimer: js.Any = js.native
    
    /**
      * Ensures that the cleanup task is spawned.
      */
    def ensureCleanupTask(): Unit = js.native
    
    /**
      * Get a subchannel if one already exists with exactly matching parameters.
      * Otherwise, create and save a subchannel with those parameters.
      * @param channelTarget
      * @param subchannelTarget
      * @param channelArguments
      * @param channelCredentials
      */
    def getOrCreateSubchannel(
      channelTargetUri: GrpcUri,
      subchannelTarget: SubchannelAddress,
      channelArguments: ChannelOptions,
      channelCredentials: ChannelCredentials
    ): Subchannel = js.native
    
    var global: js.Any = js.native
    
    var pool: js.Any = js.native
    
    /**
      * Unrefs all unused subchannels and cancels the cleanup task if all
      * subchannels have been unrefed.
      */
    def unrefUnusedSubchannels(): Unit = js.native
  }
}
