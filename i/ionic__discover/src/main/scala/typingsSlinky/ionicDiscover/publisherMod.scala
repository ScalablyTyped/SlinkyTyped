package typingsSlinky.ionicDiscover

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ionicDiscover.ionicDiscoverStrings.error
import typingsSlinky.node.NodeJS.Timer
import typingsSlinky.node.dgramMod.Socket
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.osMod.NetworkInterfaceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherMod {
  
  @JSImport("@ionic/discover/dist/publisher", "Publisher")
  @js.native
  class Publisher protected ()
    extends EventEmitter
       with IPublisherEventEmitter {
    def this(namespace: String, name: String, port: Double) = this()
    def this(namespace: String, name: String, port: Double, commPort: Double) = this()
    
    /* protected */ def buildMessage(ip: String): PublisherMessage = js.native
    
    var client: js.UndefOr[Socket] = js.native
    
    var commPort: js.UndefOr[Double] = js.native
    
    /* protected */ def getInterfaces(): js.Array[Interface] = js.native
    
    val id: String = js.native
    
    var interfaces: js.UndefOr[js.Array[Interface]] = js.native
    
    var interval: Double = js.native
    
    var name: String = js.native
    
    var namespace: String = js.native
    
    val path: /* "/" */ String = js.native
    
    var port: Double = js.native
    
    var running: Boolean = js.native
    
    /* protected */ def sayHello(): Unit = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): Unit = js.native
    
    var timer: js.UndefOr[Timer] = js.native
  }
  
  @JSImport("@ionic/discover/dist/publisher", "computeBroadcastAddress")
  @js.native
  def computeBroadcastAddress(address: String, netmask: String): String = js.native
  
  @JSImport("@ionic/discover/dist/publisher", "newSilentPublisher")
  @js.native
  def newSilentPublisher(namespace: String, name: String, port: Double): Publisher = js.native
  
  @JSImport("@ionic/discover/dist/publisher", "prepareInterfaces")
  @js.native
  def prepareInterfaces(interfaces: StringDictionary[js.Array[NetworkInterfaceInfo]]): js.Array[Interface] = js.native
  
  @js.native
  trait IPublisherEventEmitter extends StObject {
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  }
  object IPublisherEventEmitter {
    
    @scala.inline
    def apply(on: (error, js.Function1[/* err */ js.Error, Unit]) => IPublisherEventEmitter): IPublisherEventEmitter = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[IPublisherEventEmitter]
    }
    
    @scala.inline
    implicit class IPublisherEventEmitterMutableBuilder[Self <: IPublisherEventEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(value: (error, js.Function1[/* err */ js.Error, Unit]) => IPublisherEventEmitter): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Interface extends StObject {
    
    var address: String = js.native
    
    var broadcast: String = js.native
  }
  object Interface {
    
    @scala.inline
    def apply(address: String, broadcast: String): Interface = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], broadcast = broadcast.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interface]
    }
    
    @scala.inline
    implicit class InterfaceMutableBuilder[Self <: Interface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBroadcast(value: String): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PublisherMessage extends StObject {
    
    var commPort: js.UndefOr[Double] = js.native
    
    var host: String = js.native
    
    var id: String = js.native
    
    var ip: String = js.native
    
    var name: String = js.native
    
    var nspace: String = js.native
    
    var path: String = js.native
    
    var port: Double = js.native
    
    var t: Double = js.native
  }
  object PublisherMessage {
    
    @scala.inline
    def apply(
      host: String,
      id: String,
      ip: String,
      name: String,
      nspace: String,
      path: String,
      port: Double,
      t: Double
    ): PublisherMessage = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nspace = nspace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublisherMessage]
    }
    
    @scala.inline
    implicit class PublisherMessageMutableBuilder[Self <: PublisherMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommPort(value: Double): Self = StObject.set(x, "commPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommPortUndefined: Self = StObject.set(x, "commPort", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNspace(value: String): Self = StObject.set(x, "nspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
}
