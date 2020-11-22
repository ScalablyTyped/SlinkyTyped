package typingsSlinky.ipfsCore.componentsMod

import typingsSlinky.ipfsCore.addAllMod.AddAllOptions
import typingsSlinky.ipfsCore.addAllMod.UnixFSEntry
import typingsSlinky.ipfsCore.addMod.AddOptions
import typingsSlinky.ipfsCore.anon.AddAll
import typingsSlinky.ipfsCore.anon.ApiManager
import typingsSlinky.ipfsCore.anon.BlockBlockService
import typingsSlinky.ipfsCore.anon.Config
import typingsSlinky.ipfsCore.anon.Dht
import typingsSlinky.ipfsCore.anon.Files
import typingsSlinky.ipfsCore.anon.FindProvs
import typingsSlinky.ipfsCore.anon.IpldName
import typingsSlinky.ipfsCore.anon.IpldPreload
import typingsSlinky.ipfsCore.anon.Libp2p
import typingsSlinky.ipfsCore.anon.Libp2pAny
import typingsSlinky.ipfsCore.anon.Libp2pPeerId
import typingsSlinky.ipfsCore.anon.Ls
import typingsSlinky.ipfsCore.anon.MfsPreload
import typingsSlinky.ipfsCore.anon.Print
import typingsSlinky.ipfsCore.anon.RepoAny
import typingsSlinky.ipfsCore.anon.`0`
import typingsSlinky.ipfsCore.catMod.CatOptions
import typingsSlinky.ipfsCore.componentsLsMod.LSOptions
import typingsSlinky.ipfsCore.componentsVersionMod.Version
import typingsSlinky.ipfsCore.dagGetMod.GetOptions
import typingsSlinky.ipfsCore.dnsMod.DNSSettings
import typingsSlinky.ipfsCore.filesMod.MFS
import typingsSlinky.ipfsCore.nameResolveMod.ResolveSettings
import typingsSlinky.ipfsCore.pingMod.PingFailure
import typingsSlinky.ipfsCore.pingMod.PingSettings
import typingsSlinky.ipfsCore.pingMod.Pong
import typingsSlinky.ipfsCore.pingMod.StatusUpdate
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.ipfsCore.srcUtilsMod.Directory
import typingsSlinky.ipfsCore.srcUtilsMod.File
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var add: js.Function1[
    /* hasAddAll */ AddAll, 
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ /* source */ js.Any, 
      /* options */ js.UndefOr[AddOptions with AbortOptions], 
      js.Promise[UnixFSEntry]
    ]
  ] = js.native
  
  var addAll: js.Function1[
    /* hasBlockGcLockPreloadPinOptions */ typingsSlinky.ipfsCore.anon.Preload, 
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
      /* options */ js.UndefOr[AddAllOptions with AbortOptions], 
      AsyncIterable[UnixFSEntry]
    ]
  ] = js.native
  
  var cat: js.Function1[
    /* hasIpldPreload */ IpldPreload, 
    js.Function2[
      /* ipfsPath */ String | typingsSlinky.cids.mod.^ , 
      /* options */ js.UndefOr[CatOptions with AbortOptions], 
      AsyncIterable[js.typedarray.Uint8Array]
    ]
  ] = js.native
  
  var dht: js.Function1[/* hasLibp2pRepo */ Libp2p, FindProvs] = js.native
  
  var dns: js.Function0[
    js.Function2[
      /* domain */ String, 
      /* options */ js.UndefOr[DNSSettings with AbortOptions], 
      js.Promise[String]
    ]
  ] = js.native
  
  var files: js.Function1[/* hasIpldBlockBlockServiceRepoPreloadOptions */ BlockBlockService, MFS] = js.native
  
  var get: js.Function1[
    /* hasIpldPreload */ IpldPreload, 
    js.Function2[
      /* ipfsPath */ String | typingsSlinky.cids.mod.^ , 
      /* options */ js.UndefOr[GetOptions with AbortOptions], 
      AsyncIterable[File | Directory]
    ]
  ] = js.native
  
  var id: js.Function1[
    /* hasPeerIdLibp2p */ Libp2pPeerId, 
    js.Function1[
      /* _options */ js.UndefOr[AbortOptions], 
      js.Promise[typingsSlinky.ipfsCore.idMod.PeerId]
    ]
  ] = js.native
  
  var init: js.Function1[
    /* hasApiManagerPrintOptions */ ApiManager, 
    js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[Files]]
  ] = js.native
  
  var isOnline: js.Function1[/* hasLibp2p */ `0`, js.Function0[Boolean]] = js.native
  
  var libp2p: js.Function1[/* hasOptionsPeerIdMultiaddrsRepoKeychainConfigConfig */ Config, js.Any] = js.native
  
  var ls: js.Function1[
    /* hasIpldPreload */ IpldPreload, 
    js.Function2[
      /* ipfsPath */ String | typingsSlinky.cids.mod.^ , 
      /* options */ js.UndefOr[LSOptions with AbortOptions], 
      AsyncIterable[File | Directory]
    ]
  ] = js.native
  
  var ping: js.Function1[
    /* hasLibp2p */ Libp2pAny, 
    js.Function2[
      /* peerId */ typingsSlinky.peerId.mod.^, 
      /* options */ js.UndefOr[PingSettings with AbortOptions], 
      AsyncIterable[Pong | PingFailure | StatusUpdate]
    ]
  ] = js.native
  
  var pubsub: js.Function1[/* hasLibp2p */ Libp2pAny, Ls] = js.native
  
  var resolve: js.Function1[
    /* hasIpldName */ IpldName, 
    js.Function2[
      /* path */ String, 
      /* opts */ js.UndefOr[ResolveSettings with AbortOptions], 
      js.Promise[String]
    ]
  ] = js.native
  
  var start: js.Function1[
    /* hasApiManagerOptionsBlockServiceGcLockInitOptionsIpldKeychainPeerIdPinManagerPreloadPrintRepo */ Print, 
    js.Function0[js.Promise[Dht]]
  ] = js.native
  
  var stop: js.Function1[
    /* hasApiManagerOptionsBitswapBlockServiceGcLockInitOptionsIpldIpnsKeychainLibp2pMfsPreloadPeerIdPinManagerPreloadPrintRepo */ MfsPreload, 
    js.Function1[/* _options */ AbortOptions, js.Promise[Unit]]
  ] = js.native
  
  var version: js.Function1[
    /* hasRepo */ RepoAny, 
    js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Version]]
  ] = js.native
}
