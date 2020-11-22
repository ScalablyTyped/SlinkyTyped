package typingsSlinky.ipfsCore.startMod

import typingsSlinky.ipfsCore.initMod.ExperimentalOptions
import typingsSlinky.ipfsCore.initMod.PreloadOptions
import typingsSlinky.ipfsCore.initMod.RelayOptions
import typingsSlinky.ipfsCore.ipfsCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartOptions extends js.Object {
  
  /**
    * - Enable and configure
    * experimental features.
    */
  var EXPERIMENTAL: js.UndefOr[ExperimentalOptions] = js.native
  
  /**
    * - Modify the default IPFS node config. This
    * object will be *merged* with the default config; it will not replace it.
    * (Default: [`config-nodejs.js`](https://github.com/ipfs/js-ipfs/tree/master/packages/ipfs/src/core/runtime/config-nodejs.js)
    * in Node.js, [`config-browser.js`](https://github.com/ipfs/js-ipfs/tree/master/packages/ipfs/src/core/runtime/config-browser.js)
    * in browsers)
    */
  var config: js.UndefOr[js.Any] = js.native
  
  /**
    * - Perform repo initialization steps when creating
    * the IPFS node.
    * Note that *initializing* a repo is different from creating an instance of
    * [`ipfs.Repo`](https://github.com/ipfs/js-ipfs-repo). The IPFS constructor
    * sets many special properties when initializing a repo, so you should usually
    * not try and call `repoInstance.init()` yourself.
    */
  var init: js.UndefOr[Boolean | typingsSlinky.ipfsCore.initMod.InitOptions] = js.native
  
  /**
    * - Modify the default IPLD config. This object
    * will be *merged* with the default config; it will not replace it. Check IPLD
    * [docs](https://github.com/ipld/js-ipld#ipld-constructor) for more information
    * on the available options. (Default: [`ipld.js`]
    * (https://github.com/ipfs/js-ipfs/tree/master/packages/ipfs/src/core/runtime/ipld.js)
    * in browsers)
    */
  var ipld: js.UndefOr[js.Any] = js.native
  
  /**
    * - The libp2p option allows you to build
    * your libp2p node by configuration, or via a bundle function. If you are
    * looking to just modify the below options, using the object format is the
    * quickest way to get the default features of libp2p. If you need to create a
    * more customized libp2p node, such as with custom transports or peer/content
    * routers that need some of the ipfs data on startup, a custom bundle is a
    * great way to achieve this.
    * - You can see the bundle in action in the [custom libp2p example](https://github.com/ipfs/js-ipfs/tree/master/examples/custom-libp2p).
    * - Please see [libp2p/docs/CONFIGURATION.md](https://github.com/libp2p/js-libp2p/blob/master/doc/CONFIGURATION.md)
    * for the list of options libp2p supports.
    * - Default: [`libp2p-nodejs.js`](../src/core/runtime/libp2p-nodejs.js)
    * in Node.js, [`libp2p-browser.js`](../src/core/runtime/libp2p-browser.js) in
    * browsers.
    */
  var libp2p: js.UndefOr[js.Any] = js.native
  
  /**
    * - Run ipfs node offline. The node does
    * not connect to the rest of the network but provides a local API.
    */
  var offline: js.UndefOr[Boolean] = js.native
  
  /**
    * - A passphrase to encrypt/decrypt your keys.
    */
  var pass: js.UndefOr[String] = js.native
  
  /**
    * - Configure remote preload nodes.
    * The remote will preload content added on this node, and also attempt to
    * preload objects requested by this node.
    */
  var preload: js.UndefOr[PreloadOptions] = js.native
  
  /**
    * - Configure circuit relay (see the [circuit relay tutorial]
    * (https://github.com/ipfs/js-ipfs/tree/master/examples/circuit-relaying)
    * to learn more).
    */
  var relay: js.UndefOr[RelayOptions] = js.native
  
  var repo: js.UndefOr[js.Any] = js.native
  
  /**
    * - `js-ipfs` comes bundled with a
    * tool that automatically migrates your IPFS repository when a new version is
    * available.
    */
  var repoAutoMigrate: js.UndefOr[Boolean] = js.native
  
  var repoOwner: js.UndefOr[Boolean] = js.native
  
  /**
    * - Prevents all logging output from the
    * IPFS node. (Default: `false`)
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * - If `false`, do not automatically
    * start the IPFS node. Instead, you’ll need to manually call
    * [`node.start()`](https://github.com/ipfs/js-ipfs/blob/master/packages/ipfs/docs/MODULE.md#nodestart)
    * yourself.
    */
  var start: js.UndefOr[`true`] = js.native
}
object StartOptions {
  
  @scala.inline
  def apply(): StartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOptions]
  }
  
  @scala.inline
  implicit class StartOptionsOps[Self <: StartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEXPERIMENTAL(value: ExperimentalOptions): Self = this.set("EXPERIMENTAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEXPERIMENTAL: Self = this.set("EXPERIMENTAL", js.undefined)
    
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setInit(value: Boolean | typingsSlinky.ipfsCore.initMod.InitOptions): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setIpld(value: js.Any): Self = this.set("ipld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpld: Self = this.set("ipld", js.undefined)
    
    @scala.inline
    def setLibp2p(value: js.Any): Self = this.set("libp2p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibp2p: Self = this.set("libp2p", js.undefined)
    
    @scala.inline
    def setOffline(value: Boolean): Self = this.set("offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffline: Self = this.set("offline", js.undefined)
    
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    
    @scala.inline
    def setPreload(value: PreloadOptions): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setRelay(value: RelayOptions): Self = this.set("relay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelay: Self = this.set("relay", js.undefined)
    
    @scala.inline
    def setRepo(value: js.Any): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepo: Self = this.set("repo", js.undefined)
    
    @scala.inline
    def setRepoAutoMigrate(value: Boolean): Self = this.set("repoAutoMigrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoAutoMigrate: Self = this.set("repoAutoMigrate", js.undefined)
    
    @scala.inline
    def setRepoOwner(value: Boolean): Self = this.set("repoOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoOwner: Self = this.set("repoOwner", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setStart(value: `true`): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
