package typingsSlinky.libp2pInterfaces

import typingsSlinky.itPushable.mod.Pushable
import typingsSlinky.libp2pInterfaces.anon.Id
import typingsSlinky.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerStreamsMod {
  
  /**
    * @callback Sink
    * @param {Uint8Array} source
    * @returns {Promise<Uint8Array>}
    *
    * @typedef {object} DuplexIterableStream
    * @property {Sink} sink
    * @property {() AsyncIterator<Uint8Array>} source
    *
    * @typedef PeerId
    * @type import('peer-id')
    */
  /**
    * Thin wrapper around a peer's inbound / outbound pubsub streams
    */
  @JSImport("libp2p-interfaces/src/pubsub/peer-streams", JSImport.Namespace)
  @js.native
  class ^ protected () extends PeerStreams {
    /**
      * @param {object} properties properties of the PeerStreams.
      * @param {PeerId} properties.id
      * @param {string} properties.protocol
      */
    def this(hasIdProtocol: Id) = this()
  }
  
  @js.native
  trait DuplexIterableStream extends StObject {
    
    def sink(source: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("sink")
    var sink_Original: Sink = js.native
    
    def source(): AsyncIterator[js.typedarray.Uint8Array, _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  type PeerId = typingsSlinky.peerId.mod.^
  
  /**
    * @callback Sink
    * @param {Uint8Array} source
    * @returns {Promise<Uint8Array>}
    *
    * @typedef {object} DuplexIterableStream
    * @property {Sink} sink
    * @property {() AsyncIterator<Uint8Array>} source
    *
    * @typedef PeerId
    * @type import('peer-id')
    */
  /**
    * Thin wrapper around a peer's inbound / outbound pubsub streams
    */
  @js.native
  trait PeerStreams extends StObject {
    
    /**
      * An AbortController for controlled shutdown of the inbound stream
      * @private
      * @type {typeof AbortController}
      */
    var _inboundAbortController: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof imported_abort-controller */ js.Any = js.native
    
    /**
      * The raw inbound stream, as retrieved from the callback from libp2p.handle
      * @private
      * @type {DuplexIterableStream}
      */
    var _rawInboundStream: DuplexIterableStream = js.native
    
    /**
      * The raw outbound stream, as retrieved from conn.newStream
      * @private
      * @type {DuplexIterableStream}
      */
    var _rawOutboundStream: DuplexIterableStream = js.native
    
    /**
      * Attach a raw inbound stream and setup a read stream
      *
      * @param {DuplexIterableStream} stream
      * @returns {void}
      */
    def attachInboundStream(stream: DuplexIterableStream): Unit = js.native
    
    /**
      * Attach a raw outbound stream and setup a write stream
      *
      * @param {Stream} stream
      * @returns {Promise<void>}
      */
    def attachOutboundStream(stream: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Closes the open connection to peer
      * @returns {void}
      */
    def close(): Unit = js.native
    
    /**
      * @type {import('peer-id')}
      */
    var id: typingsSlinky.peerId.mod.^ = js.native
    
    /**
      * Read stream
      * @type {DuplexIterableStream}
      */
    var inboundStream: DuplexIterableStream = js.native
    
    /**
      * Do we have a connection to read from?
      *
      * @type {boolean}
      */
    def isReadable: Boolean = js.native
    
    /**
      * Do we have a connection to write on?
      *
      * @type {boolean}
      */
    def isWritable: Boolean = js.native
    
    /**
      * Write stream -- its preferable to use the write method
      * @type {import('it-pushable').Pushable<Uint8Array>>}
      */
    var outboundStream: Pushable[js.typedarray.Uint8Array] = js.native
    
    /**
      * Established protocol
      * @type {string}
      */
    var protocol: String = js.native
    
    /**
      * Send a message to this peer.
      * Throws if there is no `stream` to write to available.
      *
      * @param {Uint8Array} data
      * @returns {void}
      */
    def write(data: js.typedarray.Uint8Array): Unit = js.native
  }
  
  type Sink = js.Function1[/* source */ js.typedarray.Uint8Array, js.Promise[js.typedarray.Uint8Array]]
}
