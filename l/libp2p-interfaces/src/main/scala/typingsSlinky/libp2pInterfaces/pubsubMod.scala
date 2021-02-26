package typingsSlinky.libp2pInterfaces

import typingsSlinky.libp2pInterfaces.anon.CanRelayMessage
import typingsSlinky.libp2pInterfaces.anon.Connection
import typingsSlinky.node.Buffer
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubMod {
  
  /**
    * @typedef {Object} InMessage
    * @property {string} [from]
    * @property {string} receivedFrom
    * @property {string[]} topicIDs
    * @property {Uint8Array} [seqno]
    * @property {Uint8Array} data
    * @property {Uint8Array} [signature]
    * @property {Uint8Array} [key]
    *
    * @typedef PeerId
    * @type import('peer-id')
    */
  /**
  * PubsubBaseProtocol handles the peers and connections logic for pubsub routers
  * and specifies the API that pubsub routers should have.
  */
  @JSImport("libp2p-interfaces/src/pubsub", JSImport.Namespace)
  @js.native
  class ^ protected () extends PubsubBaseProtocol {
    /**
      * @param {Object} props
      * @param {String} props.debugName log namespace
      * @param {Array<string>|string} props.multicodecs protocol identificers to connect
      * @param {Libp2p} props.libp2p
      * @param {SignaturePolicy} [props.globalSignaturePolicy = SignaturePolicy.StrictSign] defines how signatures should be handled
      * @param {boolean} [props.canRelayMessage = false] if can relay messages not subscribed
      * @param {boolean} [props.emitSelf = false] if publish should emit to self, if subscribed
      * @abstract
      */
    def this(hasDebugNameMulticodecsLibp2pGlobalSignaturePolicyCanRelayMessageEmitSelf: CanRelayMessage) = this()
  }
  
  object SignaturePolicy {
    
    @JSImport("libp2p-interfaces/src/pubsub", "SignaturePolicy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p-interfaces/src/pubsub", "SignaturePolicy.StrictNoSign")
    @js.native
    def StrictNoSign: String = js.native
    @scala.inline
    def StrictNoSign_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StrictNoSign")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p-interfaces/src/pubsub", "SignaturePolicy.StrictSign")
    @js.native
    def StrictSign: String = js.native
    @scala.inline
    def StrictSign_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StrictSign")(x.asInstanceOf[js.Any])
  }
  
  /* was `typeof imported_message` */
  object message {
    
    @JSImport("libp2p-interfaces/src/pubsub", "message")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p-interfaces/src/pubsub", "message.Message")
    @js.native
    def Message: js.Any = js.native
    @scala.inline
    def Message_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Message")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p-interfaces/src/pubsub", "message.RPC")
    @js.native
    def RPC_ : js.Any = js.native
    
    @scala.inline
    def RPC__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RPC")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p-interfaces/src/pubsub", "message.SubOpts")
    @js.native
    def SubOpts: js.Any = js.native
    @scala.inline
    def SubOpts_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubOpts")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p-interfaces/src/pubsub", "message.rpc")
    @js.native
    def rpc: js.Any = js.native
    @scala.inline
    def rpc_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rpc")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p-interfaces/src/pubsub", "message.td")
    @js.native
    def td: js.Any = js.native
    @scala.inline
    def td_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("td")(x.asInstanceOf[js.Any])
  }
  
  /* was `typeof imported_utils` */
  object utils {
    
    @JSImport("libp2p-interfaces/src/pubsub", "utils.anyMatch")
    @js.native
    def anyMatch(a: js.Array[_], b: js.Array[_]): Boolean = js.native
    @JSImport("libp2p-interfaces/src/pubsub", "utils.anyMatch")
    @js.native
    def anyMatch(a: js.Array[_], b: Set[_]): Boolean = js.native
    @JSImport("libp2p-interfaces/src/pubsub", "utils.anyMatch")
    @js.native
    def anyMatch(a: Set[_], b: js.Array[_]): Boolean = js.native
    @JSImport("libp2p-interfaces/src/pubsub", "utils.anyMatch")
    @js.native
    def anyMatch(a: Set[_], b: Set[_]): Boolean = js.native
    
    @JSImport("libp2p-interfaces/src/pubsub", "utils.ensureArray")
    @js.native
    def ensureArray(maybeArray: js.Any): js.Array[_] = js.native
    
    @JSImport("libp2p-interfaces/src/pubsub", "utils.msgId")
    @js.native
    def msgId(from: String, seqno: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    @JSImport("libp2p-interfaces/src/pubsub", "utils.noSignMsgId")
    @js.native
    def noSignMsgId(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    @JSImport("libp2p-interfaces/src/pubsub", "utils.normalizeInRpcMessage")
    @js.native
    def normalizeInRpcMessage(message: js.Any, peerId: String): js.Any = js.native
    
    @JSImport("libp2p-interfaces/src/pubsub", "utils.normalizeOutRpcMessage")
    @js.native
    def normalizeOutRpcMessage(message: js.Any): js.Any = js.native
    
    @JSImport("libp2p-interfaces/src/pubsub", "utils.randomSeqno")
    @js.native
    def randomSeqno(): js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  trait InMessage extends StObject {
    
    var data: js.typedarray.Uint8Array = js.native
    
    var from: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    var receivedFrom: String = js.native
    
    var seqno: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    var signature: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    var topicIDs: js.Array[String] = js.native
  }
  object InMessage {
    
    @scala.inline
    def apply(data: js.typedarray.Uint8Array, receivedFrom: String, topicIDs: js.Array[String]): InMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], receivedFrom = receivedFrom.asInstanceOf[js.Any], topicIDs = topicIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[InMessage]
    }
    
    @scala.inline
    implicit class InMessageMutableBuilder[Self <: InMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setReceivedFrom(value: String): Self = StObject.set(x, "receivedFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeqno(value: js.typedarray.Uint8Array): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
      
      @scala.inline
      def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      @scala.inline
      def setTopicIDs(value: js.Array[String]): Self = StObject.set(x, "topicIDs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicIDsVarargs(value: String*): Self = StObject.set(x, "topicIDs", js.Array(value :_*))
    }
  }
  
  type PeerId = typingsSlinky.peerId.mod.^
  
  /**
    * @typedef {Object} InMessage
    * @property {string} [from]
    * @property {string} receivedFrom
    * @property {string[]} topicIDs
    * @property {Uint8Array} [seqno]
    * @property {Uint8Array} data
    * @property {Uint8Array} [signature]
    * @property {Uint8Array} [key]
    *
    * @typedef PeerId
    * @type import('peer-id')
    */
  /**
  * PubsubBaseProtocol handles the peers and connections logic for pubsub routers
  * and specifies the API that pubsub routers should have.
  */
  @js.native
  trait PubsubBaseProtocol extends StObject {
    
    /**
      * Whether to accept a message from a peer
      * Override to create a graylist
      * @override
      * @param {string} id
      * @returns {boolean}
      */
    def _acceptFrom(id: String): Boolean = js.native
    
    /**
      * Notifies the router that a peer has been connected
      * @private
      * @param {PeerId} peerId
      * @param {string} protocol
      * @returns {PeerStreams}
      */
    def _addPeer(peerId: typingsSlinky.peerId.mod.^, protocol: String): typingsSlinky.libp2pInterfaces.peerStreamsMod.^ = js.native
    
    /**
      * Normalizes the message and signs it, if signing is enabled.
      * Should be used by the routers to create the message to send.
      * @private
      * @param {Message} message
      * @returns {Promise<Message>}
      */
    def _buildMessage(message: js.Any): js.Promise[_] = js.native
    
    /**
      * Decode Uint8Array into an RPC object.
      * This can be override to use a custom router protobuf.
      * @param {Uint8Array} bytes
      * @returns {RPC}
      */
    def _decodeRpc(bytes: js.typedarray.Uint8Array): js.Any = js.native
    
    /**
      * Emit a message from a peer
      * @param {InMessage} message
      */
    def _emitMessage(message: InMessage): Unit = js.native
    
    /**
      * Encode RPC object into a Uint8Array.
      * This can be override to use a custom router protobuf.
      * @param {RPC} rpc
      * @returns {Uint8Array}
      */
    def _encodeRpc(rpc: js.Any): js.typedarray.Uint8Array = js.native
    
    var _libp2p: js.Any = js.native
    
    /**
      * On an inbound stream opened.
      * @private
      * @param {Object} props
      * @param {string} props.protocol
      * @param {DuplexIterableStream} props.stream
      * @param {Connection} props.connection connection
      */
    def _onIncomingStream(hasProtocolStreamConnection: Connection): Unit = js.native
    
    /**
      * Registrar notifies an established connection with pubsub protocol.
      * @private
      * @param {PeerId} peerId remote peer-id
      * @param {Connection} conn connection to the peer
      */
    def _onPeerConnected(peerId: typingsSlinky.peerId.mod.^, conn: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Registrar notifies a closing connection with pubsub protocol.
      * @private
      * @param {PeerId} peerId peerId
      * @param {Error} err error for connection end
      */
    def _onPeerDisconnected(peerId: typingsSlinky.peerId.mod.^, err: js.Error): Unit = js.native
    
    /**
      * Responsible for processing each RPC message received by other peers.
      * @param {string} idB58Str peer id string in base58
      * @param {DuplexIterableStream} stream inbound stream
      * @param {PeerStreams} peerStreams PubSub peer
      * @returns {Promise<void>}
      */
    def _processMessages(idB58Str: String, stream: js.Any, peerStreams: typingsSlinky.libp2pInterfaces.peerStreamsMod.^): js.Promise[Unit] = js.native
    
    /**
      * Handles an rpc request from a peer
      * @param {String} idB58Str
      * @param {PeerStreams} peerStreams
      * @param {RPC} rpc
      * @returns {boolean}
      */
    def _processRpc(idB58Str: String, peerStreams: typingsSlinky.libp2pInterfaces.peerStreamsMod.^, rpc: js.Any): Boolean = js.native
    
    /**
      * Handles an message from a peer
      * @param {InMessage} msg
      * @returns {Promise<void>}
      */
    def _processRpcMessage(msg: InMessage): js.Promise[Unit] = js.native
    
    /**
      * Handles a subscription change from a peer
      * @param {string} id
      * @param {RPC.SubOpt} subOpt
      */
    def _processRpcSubOpt(id: String, subOpt: js.Any): Unit = js.native
    
    /**
      * Overriding the implementation of publish should handle the appropriate algorithms for the publish/subscriber implementation.
      * For example, a Floodsub implementation might simply publish each message to each topic for every peer
      * @abstract
      * @param {InMessage} message
      * @returns {Promise<void>}
      *
      */
    def _publish(message: InMessage): js.Promise[Unit] = js.native
    
    var _registrarId: js.Any = js.native
    
    /**
      * Notifies the router that a peer has been disconnected.
      * @private
      * @param {PeerId} peerId
      * @returns {PeerStreams | undefined}
      */
    def _removePeer(peerId: typingsSlinky.peerId.mod.^): typingsSlinky.libp2pInterfaces.peerStreamsMod.^ = js.native
    
    /**
      * Send an rpc object to a peer
      * @param {string} id peer id
      * @param {RPC} rpc
      * @returns {void}
      */
    def _sendRpc(id: String, rpc: js.Any): Unit = js.native
    
    /**
      * Send subscroptions to a peer
      * @param {string} id peer id
      * @param {string[]} topics
      * @param {boolean} subscribe set to false for unsubscriptions
      * @returns {void}
      */
    def _sendSubscriptions(id: String, topics: js.Array[String], subscribe: Boolean): Unit = js.native
    
    /**
      * If router can relay received messages, even if not subscribed
      * @type {boolean}
      */
    var canRelayMessage: Boolean = js.native
    
    /**
      * if publish should emit to self, if subscribed
      * @type {boolean}
      */
    var emitSelf: Boolean = js.native
    
    /**
      * The default msgID implementation
      * Child class can override this.
      * @param {RPC.Message} msg the message object
      * @returns {Uint8Array} message id as bytes
      */
    def getMsgId(msg: js.Any): js.typedarray.Uint8Array = js.native
    
    /**
      * Get a list of the peer-ids that are subscribed to one topic.
      * @param {string} topic
      * @returns {Array<string>}
      */
    def getSubscribers(topic: String): js.Array[String] = js.native
    
    /**
      * Get the list of topics which the peer is subscribed to.
      * @override
      * @returns {Array<String>}
      */
    def getTopics(): js.Array[String] = js.native
    
    /**
      * The signature policy to follow by default
      *
      * @type {string}
      */
    var globalSignaturePolicy: String = js.native
    
    var log: js.Any = js.native
    
    /**
      * @type {Array<string>}
      */
    var multicodecs: js.Array[String] = js.native
    
    /**
      * @type {PeerId}
      */
    var peerId: PeerId = js.native
    
    /**
      * Map of peer streams
      *
      * @type {Map<string, import('./peer-streams')>}
      */
    var peers: Map[String, typingsSlinky.libp2pInterfaces.peerStreamsMod.^] = js.native
    
    /**
      * Publishes messages to all subscribed peers
      * @override
      * @param {string} topic
      * @param {Buffer} message
      * @returns {Promise<void>}
      */
    def publish(topic: String, message: Buffer): js.Promise[Unit] = js.native
    
    var registrar: js.Any = js.native
    
    /**
      * Register the pubsub protocol onto the libp2p node.
      * @returns {void}
      */
    def start(): Unit = js.native
    
    var started: Boolean = js.native
    
    /**
      * Unregister the pubsub protocol and the streams with other peers will be closed.
      * @returns {void}
      */
    def stop(): Unit = js.native
    
    /**
      * Subscribes to a given topic.
      * @abstract
      * @param {string} topic
      * @returns {void}
      */
    def subscribe(topic: String): Unit = js.native
    
    /**
      * List of our subscriptions
      * @type {Set<string>}
      */
    var subscriptions: Set[String] = js.native
    
    /**
      * Topic validator function
      * @typedef {function(string, InMessage): Promise<void>} validator
      */
    /**
      * Topic validator map
      *
      * Keyed by topic
      * Topic validators are functions with the following input:
      * @type {Map<string, validator>}
      */
    var topicValidators: Map[String, validator] = js.native
    
    /**
      * Map of topics to which peers are subscribed to
      *
      * @type {Map<string, Set<string>>}
      */
    var topics: Map[String, Set[String]] = js.native
    
    /**
      * Unsubscribe from the given topic.
      * @override
      * @param {string} topic
      * @returns {void}
      */
    def unsubscribe(topic: String): Unit = js.native
    
    /**
      * Validates the given message. The signature will be checked for authenticity.
      * Throws an error on invalid messages
      * @param {InMessage} message
      * @returns {Promise<void>}
      */
    def validate(message: InMessage): js.Promise[Unit] = js.native
  }
  object PubsubBaseProtocol {
    
    @scala.inline
    def apply(
      _acceptFrom: String => Boolean,
      _addPeer: (typingsSlinky.peerId.mod.^, String) => typingsSlinky.libp2pInterfaces.peerStreamsMod.^,
      _buildMessage: js.Any => js.Promise[_],
      _decodeRpc: js.typedarray.Uint8Array => js.Any,
      _emitMessage: InMessage => Unit,
      _encodeRpc: js.Any => js.typedarray.Uint8Array,
      _libp2p: js.Any,
      _onIncomingStream: Connection => Unit,
      _onPeerConnected: (typingsSlinky.peerId.mod.^, js.Any) => js.Promise[Unit],
      _onPeerDisconnected: (typingsSlinky.peerId.mod.^, js.Error) => Unit,
      _processMessages: (String, js.Any, typingsSlinky.libp2pInterfaces.peerStreamsMod.^) => js.Promise[Unit],
      _processRpc: (String, typingsSlinky.libp2pInterfaces.peerStreamsMod.^, js.Any) => Boolean,
      _processRpcMessage: InMessage => js.Promise[Unit],
      _processRpcSubOpt: (String, js.Any) => Unit,
      _publish: InMessage => js.Promise[Unit],
      _registrarId: js.Any,
      _removePeer: typingsSlinky.peerId.mod.^ => typingsSlinky.libp2pInterfaces.peerStreamsMod.^,
      _sendRpc: (String, js.Any) => Unit,
      _sendSubscriptions: (String, js.Array[String], Boolean) => Unit,
      canRelayMessage: Boolean,
      emitSelf: Boolean,
      getMsgId: js.Any => js.typedarray.Uint8Array,
      getSubscribers: String => js.Array[String],
      getTopics: () => js.Array[String],
      globalSignaturePolicy: String,
      log: js.Any,
      multicodecs: js.Array[String],
      peerId: PeerId,
      peers: Map[String, typingsSlinky.libp2pInterfaces.peerStreamsMod.^],
      publish: (String, Buffer) => js.Promise[Unit],
      registrar: js.Any,
      start: () => Unit,
      started: Boolean,
      stop: () => Unit,
      subscribe: String => Unit,
      subscriptions: Set[String],
      topicValidators: Map[String, validator],
      topics: Map[String, Set[String]],
      unsubscribe: String => Unit,
      validate: InMessage => js.Promise[Unit]
    ): PubsubBaseProtocol = {
      val __obj = js.Dynamic.literal(_acceptFrom = js.Any.fromFunction1(_acceptFrom), _addPeer = js.Any.fromFunction2(_addPeer), _buildMessage = js.Any.fromFunction1(_buildMessage), _decodeRpc = js.Any.fromFunction1(_decodeRpc), _emitMessage = js.Any.fromFunction1(_emitMessage), _encodeRpc = js.Any.fromFunction1(_encodeRpc), _libp2p = _libp2p.asInstanceOf[js.Any], _onIncomingStream = js.Any.fromFunction1(_onIncomingStream), _onPeerConnected = js.Any.fromFunction2(_onPeerConnected), _onPeerDisconnected = js.Any.fromFunction2(_onPeerDisconnected), _processMessages = js.Any.fromFunction3(_processMessages), _processRpc = js.Any.fromFunction3(_processRpc), _processRpcMessage = js.Any.fromFunction1(_processRpcMessage), _processRpcSubOpt = js.Any.fromFunction2(_processRpcSubOpt), _publish = js.Any.fromFunction1(_publish), _registrarId = _registrarId.asInstanceOf[js.Any], _removePeer = js.Any.fromFunction1(_removePeer), _sendRpc = js.Any.fromFunction2(_sendRpc), _sendSubscriptions = js.Any.fromFunction3(_sendSubscriptions), canRelayMessage = canRelayMessage.asInstanceOf[js.Any], emitSelf = emitSelf.asInstanceOf[js.Any], getMsgId = js.Any.fromFunction1(getMsgId), getSubscribers = js.Any.fromFunction1(getSubscribers), getTopics = js.Any.fromFunction0(getTopics), globalSignaturePolicy = globalSignaturePolicy.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], multicodecs = multicodecs.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish), registrar = registrar.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), started = started.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), subscribe = js.Any.fromFunction1(subscribe), subscriptions = subscriptions.asInstanceOf[js.Any], topicValidators = topicValidators.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction1(unsubscribe), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[PubsubBaseProtocol]
    }
    
    @scala.inline
    implicit class PubsubBaseProtocolMutableBuilder[Self <: PubsubBaseProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanRelayMessage(value: Boolean): Self = StObject.set(x, "canRelayMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetMsgId(value: js.Any => js.typedarray.Uint8Array): Self = StObject.set(x, "getMsgId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSubscribers(value: String => js.Array[String]): Self = StObject.set(x, "getSubscribers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTopics(value: () => js.Array[String]): Self = StObject.set(x, "getTopics", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGlobalSignaturePolicy(value: String): Self = StObject.set(x, "globalSignaturePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulticodecs(value: js.Array[String]): Self = StObject.set(x, "multicodecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulticodecsVarargs(value: String*): Self = StObject.set(x, "multicodecs", js.Array(value :_*))
      
      @scala.inline
      def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeers(value: Map[String, typingsSlinky.libp2pInterfaces.peerStreamsMod.^]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublish(value: (String, Buffer) => js.Promise[Unit]): Self = StObject.set(x, "publish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegistrar(value: js.Any): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubscribe(value: String => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscriptions(value: Set[String]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicValidators(value: Map[String, validator]): Self = StObject.set(x, "topicValidators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopics(value: Map[String, Set[String]]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribe(value: String => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidate(value: InMessage => js.Promise[Unit]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_acceptFrom(value: String => Boolean): Self = StObject.set(x, "_acceptFrom", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_addPeer(value: (typingsSlinky.peerId.mod.^, String) => typingsSlinky.libp2pInterfaces.peerStreamsMod.^): Self = StObject.set(x, "_addPeer", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_buildMessage(value: js.Any => js.Promise[_]): Self = StObject.set(x, "_buildMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_decodeRpc(value: js.typedarray.Uint8Array => js.Any): Self = StObject.set(x, "_decodeRpc", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_emitMessage(value: InMessage => Unit): Self = StObject.set(x, "_emitMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_encodeRpc(value: js.Any => js.typedarray.Uint8Array): Self = StObject.set(x, "_encodeRpc", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_libp2p(value: js.Any): Self = StObject.set(x, "_libp2p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onIncomingStream(value: Connection => Unit): Self = StObject.set(x, "_onIncomingStream", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_onPeerConnected(value: (typingsSlinky.peerId.mod.^, js.Any) => js.Promise[Unit]): Self = StObject.set(x, "_onPeerConnected", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_onPeerDisconnected(value: (typingsSlinky.peerId.mod.^, js.Error) => Unit): Self = StObject.set(x, "_onPeerDisconnected", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_processMessages(value: (String, js.Any, typingsSlinky.libp2pInterfaces.peerStreamsMod.^) => js.Promise[Unit]): Self = StObject.set(x, "_processMessages", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_processRpc(value: (String, typingsSlinky.libp2pInterfaces.peerStreamsMod.^, js.Any) => Boolean): Self = StObject.set(x, "_processRpc", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_processRpcMessage(value: InMessage => js.Promise[Unit]): Self = StObject.set(x, "_processRpcMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_processRpcSubOpt(value: (String, js.Any) => Unit): Self = StObject.set(x, "_processRpcSubOpt", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_publish(value: InMessage => js.Promise[Unit]): Self = StObject.set(x, "_publish", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_registrarId(value: js.Any): Self = StObject.set(x, "_registrarId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_removePeer(value: typingsSlinky.peerId.mod.^ => typingsSlinky.libp2pInterfaces.peerStreamsMod.^): Self = StObject.set(x, "_removePeer", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_sendRpc(value: (String, js.Any) => Unit): Self = StObject.set(x, "_sendRpc", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_sendSubscriptions(value: (String, js.Array[String], Boolean) => Unit): Self = StObject.set(x, "_sendSubscriptions", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * Topic validator function
    */
  type validator = js.Function2[/* arg0 */ String, /* arg1 */ InMessage, js.Promise[Unit]]
}
