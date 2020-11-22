package typingsSlinky.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object configMod {
  
  type APIAddress = java.lang.String | js.Array[java.lang.String]
  
  type ApplyOptions = typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions with typingsSlinky.ipfsCore.configMod.ApplyOptionsExt
  
  type ApplyProfile = js.Function2[
    /* name */ java.lang.String, 
    /* options */ js.UndefOr[
      typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions with typingsSlinky.ipfsCore.configMod.ApplyOptionsExt
    ], 
    js.Promise[typingsSlinky.ipfsCore.anon.Original]
  ]
  
  type BootstrapConfig = js.Array[java.lang.String]
  
  type DatastoreSpec = js.Any
  
  type DelegateAddress = js.Array[java.lang.String]
  
  type GatewayAddress = java.lang.String | js.Array[java.lang.String]
  
  type Get = js.Function2[
    /* key */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typingsSlinky.std.JSON]
  ]
  
  type GetAll = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typingsSlinky.ipfsCore.configMod.IPFSConfig]
  ]
  
  type ListProfiles = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[js.Array[typingsSlinky.ipfsCore.configMod.Profile]]
  ]
  
  type Multiaddr = java.lang.String
  
  type PeerID = java.lang.String
  
  type PrivateKey = java.lang.String
  
  type Replace = js.Function2[
    /* value */ typingsSlinky.ipfsCore.anon.PartialIPFSConfig, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[scala.Unit]
  ]
  
  type Set = js.Function3[
    /* key */ java.lang.String, 
    /* value */ typingsSlinky.std.JSON, 
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[scala.Unit]
  ]
  
  type SwarmAddress = js.Array[java.lang.String]
}
