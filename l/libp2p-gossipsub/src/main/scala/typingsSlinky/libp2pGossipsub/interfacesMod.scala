package typingsSlinky.libp2pGossipsub

import typingsSlinky.libp2pGossipsub.anon.Direction
import typingsSlinky.libp2pGossipsub.anon.Protocol
import typingsSlinky.libp2pGossipsub.anon.Stream
import typingsSlinky.libp2pInterfaces.pubsubMod.InMessage
import typingsSlinky.multiaddr.mod.^
import typingsSlinky.std.AsyncIterator
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait AddrInfo extends StObject {
    
    var addrs: js.Array[^] = js.native
    
    var id: typingsSlinky.peerId.mod.^ = js.native
  }
  object AddrInfo {
    
    @scala.inline
    def apply(addrs: js.Array[^], id: typingsSlinky.peerId.mod.^): AddrInfo = {
      val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddrInfo]
    }
    
    @scala.inline
    implicit class AddrInfoMutableBuilder[Self <: AddrInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddrs(value: js.Array[^]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddrsVarargs(value: ^ *): Self = StObject.set(x, "addrs", js.Array(value :_*))
      
      @scala.inline
      def setId(value: typingsSlinky.peerId.mod.^): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AddressBook
    extends Book[typingsSlinky.peerId.mod.^, js.Array[^]] {
    
    def consumePeerRecord(envelope: Envelope): Boolean = js.native
    
    def getRawEnvelope(peerId: typingsSlinky.peerId.mod.^): js.UndefOr[js.typedarray.Uint8Array] = js.native
  }
  object AddressBook {
    
    @scala.inline
    def apply(
      add: (typingsSlinky.peerId.mod.^, js.Array[^]) => AddressBook,
      consumePeerRecord: Envelope => Boolean,
      get: typingsSlinky.peerId.mod.^ => js.Array[js.Array[^]],
      getRawEnvelope: typingsSlinky.peerId.mod.^ => js.UndefOr[js.typedarray.Uint8Array],
      set: (typingsSlinky.peerId.mod.^, js.Array[js.Array[^]]) => AddressBook
    ): AddressBook = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), consumePeerRecord = js.Any.fromFunction1(consumePeerRecord), get = js.Any.fromFunction1(get), getRawEnvelope = js.Any.fromFunction1(getRawEnvelope), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[AddressBook]
    }
    
    @scala.inline
    implicit class AddressBookMutableBuilder[Self <: AddressBook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumePeerRecord(value: Envelope => Boolean): Self = StObject.set(x, "consumePeerRecord", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRawEnvelope(value: typingsSlinky.peerId.mod.^ => js.UndefOr[js.typedarray.Uint8Array]): Self = StObject.set(x, "getRawEnvelope", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Book[K, V] extends StObject {
    
    def add(k: K, v: V): this.type = js.native
    
    def get(k: K): js.Array[V] = js.native
    
    def set(k: K, v: js.Array[V]): this.type = js.native
  }
  object Book {
    
    @scala.inline
    def apply[K, V](add: (K, V) => Book[K, V], get: K => js.Array[V], set: (K, js.Array[V]) => Book[K, V]): Book[K, V] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Book[K, V]]
    }
    
    @scala.inline
    implicit class BookMutableBuilder[Self <: Book[_, _], K, V] (val x: Self with (Book[K, V])) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (K, V) => Book[K, V]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGet(value: K => js.Array[V]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (K, js.Array[V]) => Book[K, V]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Connection extends StObject {
    
    var registry: Map[String, Protocol] = js.native
    
    var remoteAddr: ^ = js.native
    
    var remotePeer: typingsSlinky.peerId.mod.^ = js.native
    
    var stat: Direction = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(
      registry: Map[String, Protocol],
      remoteAddr: ^,
      remotePeer: typingsSlinky.peerId.mod.^,
      stat: Direction
    ): Connection = {
      val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], remoteAddr = remoteAddr.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegistry(value: Map[String, Protocol]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAddr(value: ^): Self = StObject.set(x, "remoteAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotePeer(value: typingsSlinky.peerId.mod.^): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStat(value: Direction): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectionManager extends StObject {
    
    def getAll(peerId: typingsSlinky.peerId.mod.^): js.Array[Connection] = js.native
  }
  object ConnectionManager {
    
    @scala.inline
    def apply(getAll: typingsSlinky.peerId.mod.^ => js.Array[Connection]): ConnectionManager = {
      val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll))
      __obj.asInstanceOf[ConnectionManager]
    }
    
    @scala.inline
    implicit class ConnectionManagerMutableBuilder[Self <: ConnectionManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAll(value: typingsSlinky.peerId.mod.^ => js.Array[Connection]): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DuplexIterableStream[T, U, V] extends StObject {
    
    def sink(source: T): js.Promise[U] = js.native
    
    def source(): AsyncIterator[V, _, js.UndefOr[scala.Nothing]] = js.native
  }
  object DuplexIterableStream {
    
    @scala.inline
    def apply[T, U, V](sink: T => js.Promise[U], source: () => AsyncIterator[V, _, js.UndefOr[scala.Nothing]]): DuplexIterableStream[T, U, V] = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = js.Any.fromFunction0(source))
      __obj.asInstanceOf[DuplexIterableStream[T, U, V]]
    }
    
    @scala.inline
    implicit class DuplexIterableStreamMutableBuilder[Self <: DuplexIterableStream[_, _, _], T, U, V] (val x: Self with (DuplexIterableStream[T, U, V])) extends AnyVal {
      
      @scala.inline
      def setSink(value: T => js.Promise[U]): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: () => AsyncIterator[V, _, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "source", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Envelope extends StObject {
    
    def isEqual(other: Envelope): Boolean = js.native
    
    def marshal(): js.typedarray.Uint8Array = js.native
    
    var payload: js.typedarray.Uint8Array = js.native
    
    var payloadType: js.typedarray.Uint8Array = js.native
    
    var peerId: typingsSlinky.peerId.mod.^ = js.native
    
    var signature: js.typedarray.Uint8Array = js.native
    
    def validate(domain: String): js.Promise[Boolean] = js.native
  }
  object Envelope {
    
    @scala.inline
    def apply(
      isEqual: Envelope => Boolean,
      marshal: () => js.typedarray.Uint8Array,
      payload: js.typedarray.Uint8Array,
      payloadType: js.typedarray.Uint8Array,
      peerId: typingsSlinky.peerId.mod.^,
      signature: js.typedarray.Uint8Array,
      validate: String => js.Promise[Boolean]
    ): Envelope = {
      val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), marshal = js.Any.fromFunction0(marshal), payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Envelope]
    }
    
    @scala.inline
    implicit class EnvelopeMutableBuilder[Self <: Envelope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEqual(value: Envelope => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarshal(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "marshal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadType(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerId(value: typingsSlinky.peerId.mod.^): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: String => js.Promise[Boolean]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait EnvelopeClass extends StObject {
    
    def openAndCertify(data: js.typedarray.Uint8Array, domain: String): js.Promise[Envelope] = js.native
  }
  object EnvelopeClass {
    
    @scala.inline
    def apply(openAndCertify: (js.typedarray.Uint8Array, String) => js.Promise[Envelope]): EnvelopeClass = {
      val __obj = js.Dynamic.literal(openAndCertify = js.Any.fromFunction2(openAndCertify))
      __obj.asInstanceOf[EnvelopeClass]
    }
    
    @scala.inline
    implicit class EnvelopeClassMutableBuilder[Self <: EnvelopeClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenAndCertify(value: (js.typedarray.Uint8Array, String) => js.Promise[Envelope]): Self = StObject.set(x, "openAndCertify", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Libp2p extends StObject {
    
    var connectionManager: ConnectionManager = js.native
    
    def dialProtocol(peer: String, protocols: String): js.Promise[Stream] = js.native
    def dialProtocol(peer: String, protocols: String, options: js.Object): js.Promise[Stream] = js.native
    def dialProtocol(peer: String, protocols: js.Array[String]): js.Promise[Stream] = js.native
    def dialProtocol(peer: String, protocols: js.Array[String], options: js.Object): js.Promise[Stream] = js.native
    def dialProtocol(peer: ^, protocols: String): js.Promise[Stream] = js.native
    def dialProtocol(peer: ^, protocols: String, options: js.Object): js.Promise[Stream] = js.native
    def dialProtocol(peer: ^, protocols: js.Array[String]): js.Promise[Stream] = js.native
    def dialProtocol(peer: ^, protocols: js.Array[String], options: js.Object): js.Promise[Stream] = js.native
    def dialProtocol(peer: typingsSlinky.peerId.mod.^, protocols: String): js.Promise[Stream] = js.native
    def dialProtocol(peer: typingsSlinky.peerId.mod.^, protocols: String, options: js.Object): js.Promise[Stream] = js.native
    def dialProtocol(peer: typingsSlinky.peerId.mod.^, protocols: js.Array[String]): js.Promise[Stream] = js.native
    def dialProtocol(peer: typingsSlinky.peerId.mod.^, protocols: js.Array[String], options: js.Object): js.Promise[Stream] = js.native
    
    var peerId: typingsSlinky.peerId.mod.^ = js.native
    
    var peerStore: PeerStore = js.native
    
    var registrar: Registrar = js.native
  }
  
  type MessageIdFunction = js.Function1[/* msg */ InMessage, js.typedarray.Uint8Array]
  
  @js.native
  trait PeerStore extends StObject {
    
    var addressBook: AddressBook = js.native
  }
  object PeerStore {
    
    @scala.inline
    def apply(addressBook: AddressBook): PeerStore = {
      val __obj = js.Dynamic.literal(addressBook = addressBook.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerStore]
    }
    
    @scala.inline
    implicit class PeerStoreMutableBuilder[Self <: PeerStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressBook(value: AddressBook): Self = StObject.set(x, "addressBook", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Registrar extends StObject {
    
    def handle(): Unit = js.native
    
    def register(): Unit = js.native
    
    def unregister(): Unit = js.native
  }
  object Registrar {
    
    @scala.inline
    def apply(handle: () => Unit, register: () => Unit, unregister: () => Unit): Registrar = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction0(handle), register = js.Any.fromFunction0(register), unregister = js.Any.fromFunction0(unregister))
      __obj.asInstanceOf[Registrar]
    }
    
    @scala.inline
    implicit class RegistrarMutableBuilder[Self <: Registrar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: () => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnregister(value: () => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    }
  }
}
