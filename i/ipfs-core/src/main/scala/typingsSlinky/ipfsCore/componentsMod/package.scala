package typingsSlinky.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object componentsMod {
  
  type AddAll_ = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[
      typingsSlinky.ipfsCore.addAllMod.AddAllOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typingsSlinky.std.AsyncIterable[typingsSlinky.ipfsCore.addAllMod.UnixFSEntry]
  ]
  
  type Add_ = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ /* source */ js.Any, 
    /* options */ js.UndefOr[
      typingsSlinky.ipfsCore.addMod.AddOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    js.Promise[typingsSlinky.ipfsCore.addAllMod.UnixFSEntry]
  ]
  
  type CID = typingsSlinky.cids.mod.^
  
  type Cat_ = js.Function2[
    /* ipfsPath */ java.lang.String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[
      typingsSlinky.ipfsCore.catMod.CatOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typingsSlinky.std.AsyncIterable[js.typedarray.Uint8Array]
  ]
  
  type DNS_ = js.Function2[
    /* domain */ java.lang.String, 
    /* options */ js.UndefOr[
      typingsSlinky.ipfsCore.dnsMod.DNSSettings with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    js.Promise[java.lang.String]
  ]
  
  type Get_ = js.Function2[
    /* ipfsPath */ java.lang.String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[
      typingsSlinky.ipfsCore.dagGetMod.GetOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typingsSlinky.std.AsyncIterable[
      typingsSlinky.ipfsCore.srcUtilsMod.File | typingsSlinky.ipfsCore.srcUtilsMod.Directory
    ]
  ]
  
  type ID_ = js.Function1[
    /* _options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typingsSlinky.ipfsCore.idMod.PeerId]
  ]
  
  type IPFSBitSwap = js.Any
  
  type IPFSBlockService = js.Any
  
  type IPFSRepo = js.Any
  
  type IPLD = js.Any
  
  type IPLDBlock = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any
  
  type IPLDConfig = js.Any
  
  type Init_ = js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[typingsSlinky.ipfsCore.anon.Files]]
  
  type IsOnline_ = js.Function0[scala.Boolean]
  
  type LS_ = js.Function2[
    /* ipfsPath */ java.lang.String | typingsSlinky.cids.mod.^ , 
    /* options */ js.UndefOr[
      typingsSlinky.ipfsCore.componentsLsMod.LSOptions with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typingsSlinky.std.AsyncIterable[
      typingsSlinky.ipfsCore.srcUtilsMod.File | typingsSlinky.ipfsCore.srcUtilsMod.Directory
    ]
  ]
  
  type LibP2PConfig = js.Any
  
  type LibP2PService = js.Any
  
  type LibP2P_ = js.Any
  
  type LocalRefs = js.Function1[
    /* options */ js.UndefOr[js.Any], 
    typingsSlinky.std.AsyncGenerator[typingsSlinky.ipfsCore.anon.Ref, scala.Unit, js.Any]
  ]
  
  type Lock = js.Function0[scala.Unit]
  
  type Multiaddr = typingsSlinky.multiaddr.mod.^
  
  type PeerId = typingsSlinky.peerId.mod.^
  
  type Ping_ = js.Function2[
    /* peerId */ typingsSlinky.peerId.mod.^, 
    /* options */ js.UndefOr[
      typingsSlinky.ipfsCore.pingMod.PingSettings with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    typingsSlinky.std.AsyncIterable[
      typingsSlinky.ipfsCore.pingMod.Pong | typingsSlinky.ipfsCore.pingMod.PingFailure | typingsSlinky.ipfsCore.pingMod.StatusUpdate
    ]
  ]
  
  type Preload = (js.Function0[scala.Unit] with typingsSlinky.ipfsCore.anon.Start) | typingsSlinky.ipfsCore.anon.Call
  
  type RefsWithLocal = (js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    typingsSlinky.std.AsyncGenerator[typingsSlinky.ipfsCore.anon.Ref, scala.Unit, _]
  ]) with typingsSlinky.ipfsCore.anon.LocalLocalRefs
  
  type Refs_ = js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    typingsSlinky.std.AsyncGenerator[typingsSlinky.ipfsCore.anon.Ref, scala.Unit, js.Any]
  ]
  
  type Resolve_ = js.Function2[
    /* path */ java.lang.String, 
    /* opts */ js.UndefOr[
      typingsSlinky.ipfsCore.nameResolveMod.ResolveSettings with typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
    ], 
    js.Promise[java.lang.String]
  ]
  
  type Start_ = js.Function0[js.Promise[typingsSlinky.ipfsCore.anon.Dht]]
  
  type Stop_ = js.Function1[
    /* _options */ typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions, 
    js.Promise[scala.Unit]
  ]
  
  type Version_ = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typingsSlinky.ipfsCore.componentsVersionMod.Version]
  ]
}
