package typingsSlinky.samchon

import org.scalajs.dom.raw.MessagePort
import typingsSlinky.samchon.ientityMod.IEntity
import typingsSlinky.samchon.iprotocolMod.IProtocol
import typingsSlinky.samchon.iserverMod.IServer
import typingsSlinky.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolMod {
  
  @JSImport("samchon/protocol", "ClientDriver")
  @js.native
  class ClientDriver protected ()
    extends typingsSlinky.samchon.clientDriverMod.ClientDriver {
    /**
      * Construct from a socket.
      */
    def this(socket: js.Any) = this()
  }
  
  @JSImport("samchon/protocol", "DedicatedWorkerClientDriver")
  @js.native
  /**
    * Default Constructor.
    */
  class DedicatedWorkerClientDriver ()
    extends typingsSlinky.samchon.dedicatedWorkerClientDriverMod.DedicatedWorkerClientDriver
  
  @JSImport("samchon/protocol", "DedicatedWorkerServer")
  @js.native
  abstract class DedicatedWorkerServer ()
    extends typingsSlinky.samchon.dedicatedWorkerServerMod.DedicatedWorkerServer
  
  @JSImport("samchon/protocol", "DedicatedWorkerServerBase")
  @js.native
  class DedicatedWorkerServerBase protected ()
    extends typingsSlinky.samchon.dedicatedWorkerServerBaseMod.DedicatedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "DedicatedWorkerServerConnector")
  @js.native
  class DedicatedWorkerServerConnector protected ()
    extends typingsSlinky.samchon.dedicatedWorkerServerConnectorMod.DedicatedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon/protocol", "Entity")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Entity ()
    extends typingsSlinky.samchon.entityMod.Entity
  
  @JSImport("samchon/protocol", "EntityArray")
  @js.native
  abstract class EntityArray[T /* <: IEntity */] ()
    extends typingsSlinky.samchon.entityArrayMod.EntityArray[T]
  
  @JSImport("samchon/protocol", "EntityArrayCollection")
  @js.native
  abstract class EntityArrayCollection[T /* <: IEntity */] ()
    extends typingsSlinky.samchon.entityCollectionMod.EntityArrayCollection[T]
  
  @JSImport("samchon/protocol", "EntityDeque")
  @js.native
  abstract class EntityDeque[T /* <: IEntity */] ()
    extends typingsSlinky.samchon.entityArrayMod.EntityDeque[T]
  
  @JSImport("samchon/protocol", "EntityDequeCollection")
  @js.native
  abstract class EntityDequeCollection[T /* <: IEntity */] ()
    extends typingsSlinky.samchon.entityCollectionMod.EntityDequeCollection[T]
  
  @JSImport("samchon/protocol", "EntityList")
  @js.native
  abstract class EntityList[T /* <: IEntity */] ()
    extends typingsSlinky.samchon.entityArrayMod.EntityList[T]
  
  @JSImport("samchon/protocol", "EntityListCollection")
  @js.native
  abstract class EntityListCollection[T /* <: IEntity */] ()
    extends typingsSlinky.samchon.entityCollectionMod.EntityListCollection[T]
  
  object IEntity {
    
    @JSImport("samchon/protocol", "IEntity.construct")
    @js.native
    def construct(entity: typingsSlinky.samchon.ientityMod.IEntity, xml: XML, prohibited_names: String*): Unit = js.native
    
    @JSImport("samchon/protocol", "IEntity.toXML")
    @js.native
    def toXML(entity: typingsSlinky.samchon.ientityMod.IEntity, prohibited_names: String*): XML = js.native
  }
  
  object IEntityGroup {
    
    /**
      * @hidden
      */
    @JSImport("samchon/protocol", "IEntityGroup.construct")
    @js.native
    def construct[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typingsSlinky.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      xml: XML,
      prohibited_names: String*
    ): Unit = js.native
    
    @JSImport("samchon/protocol", "IEntityGroup.count")
    @js.native
    def count[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typingsSlinky.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): Double = js.native
    
    @JSImport("samchon/protocol", "IEntityGroup.get")
    @js.native
    def get[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typingsSlinky.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): T = js.native
    
    @JSImport("samchon/protocol", "IEntityGroup.has")
    @js.native
    def has[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typingsSlinky.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): Boolean = js.native
    
    /**
      * @hidden
      */
    @JSImport("samchon/protocol", "IEntityGroup.toXML")
    @js.native
    def toXML[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      group: typingsSlinky.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      prohibited_names: String*
    ): XML = js.native
  }
  
  @JSImport("samchon/protocol", "Invoke")
  @js.native
  /**
    * Default Constructor.
    */
  class Invoke ()
    extends typingsSlinky.samchon.invokeMod.Invoke {
    /**
      * Copy Constructor.
      *
      * @param invoke
      */
    def this(invoke: typingsSlinky.samchon.invokeMod.Invoke) = this()
    def this(listener: String) = this()
    /**
      * Construct from listener and parametric values.
      *
      * @param listener
      * @param parameters
      */
    def this(listener: String, parameters: (Boolean | Double | String | XML | js.typedarray.Uint8Array)*) = this()
  }
  
  @JSImport("samchon/protocol", "InvokeParameter")
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeParameter ()
    extends typingsSlinky.samchon.invokeParameterMod.InvokeParameter {
    def this(`val`: String) = this()
    def this(`val`: js.typedarray.Uint8Array) = this()
    def this(`val`: Boolean) = this()
    def this(`val`: Double) = this()
    def this(`val`: XML) = this()
    def this(name: String, `val`: String) = this()
    def this(name: String, `val`: js.typedarray.Uint8Array) = this()
    /**
      * Construct from variable name and number value.
      *
      * @param name
      * @param val
      */
    def this(name: String, `val`: Boolean) = this()
    def this(name: String, `val`: Double) = this()
    def this(name: String, `val`: XML) = this()
  }
  
  @JSImport("samchon/protocol", "Server")
  @js.native
  abstract class Server ()
    extends typingsSlinky.samchon.serverMod.Server
  
  @JSImport("samchon/protocol", "ServerBase")
  @js.native
  class ServerBase protected ()
    extends typingsSlinky.samchon.serverBaseMod.ServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "ServerConnector")
  @js.native
  class ServerConnector protected ()
    extends typingsSlinky.samchon.serverConnectorMod.ServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon/protocol", "SharedWorkerClientDriver")
  @js.native
  class SharedWorkerClientDriver protected ()
    extends typingsSlinky.samchon.sharedWorkerClientDriverMod.SharedWorkerClientDriver {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: MessagePort) = this()
  }
  
  @JSImport("samchon/protocol", "SharedWorkerServer")
  @js.native
  abstract class SharedWorkerServer ()
    extends typingsSlinky.samchon.sharedWorkerServerMod.SharedWorkerServer
  
  @JSImport("samchon/protocol", "SharedWorkerServerBase")
  @js.native
  class SharedWorkerServerBase protected ()
    extends typingsSlinky.samchon.sharedWorkerServerBaseMod.SharedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "SharedWorkerServerConnector")
  @js.native
  class SharedWorkerServerConnector protected ()
    extends typingsSlinky.samchon.sharedWorkerServerConnectorMod.SharedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon/protocol", "WebClientDriver")
  @js.native
  class WebClientDriver protected ()
    extends typingsSlinky.samchon.webClientDriverMod.WebClientDriver {
    /**
      * Initialization Constructor.
      *
      * @param connection Connection driver, a socket for web-socket.
      * @param path Requested path.
      * @param session_id Session ID, an identifier of the remote client.
      */
    def this(connection: js.Any, path: String, session_id: String) = this()
  }
  
  @JSImport("samchon/protocol", "WebServer")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class WebServer ()
    extends typingsSlinky.samchon.webServerMod.WebServer
  
  @JSImport("samchon/protocol", "WebServerBase")
  @js.native
  class WebServerBase protected ()
    extends typingsSlinky.samchon.webServerBaseMod.WebServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "WebServerConnector")
  @js.native
  class WebServerConnector protected ()
    extends typingsSlinky.samchon.webServerConnectorMod.WebServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
}
