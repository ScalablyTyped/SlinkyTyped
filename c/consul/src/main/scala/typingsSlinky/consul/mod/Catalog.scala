package typingsSlinky.consul.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.consul.mod.Catalog.DatacentersOptions
import typingsSlinky.consul.mod.Catalog.Node
import typingsSlinky.consul.mod.Catalog.Node.ListOptions
import typingsSlinky.consul.mod.Catalog.NodesOptions
import typingsSlinky.consul.mod.Catalog.Service
import typingsSlinky.consul.mod.Catalog.ServicesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Catalog extends StObject {
  
  var consul: Consul = js.native
  
  /**
    * Lists known datacenters
    */
  def datacenters[TData](): Thenable[TData] = js.native
  /**
    * Lists known datacenters
    */
  def datacenters[TData](callback: Callback[TData]): Unit = js.native
  def datacenters[TData](opts: DatacentersOptions): Thenable[TData] = js.native
  /**
    * Lists known datacenters
    */
  def datacenters[TData](opts: DatacentersOptions, callback: Callback[TData]): Unit = js.native
  
  var node: Node = js.native
  
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](callback: Callback[TData]): Unit = js.native
  def nodes[TData](dc: String): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def nodes[TData](opts: NodesOptions): Thenable[TData] = js.native
  /**
    * Lists nodes in a given DC
    */
  def nodes[TData](opts: NodesOptions, callback: Callback[TData]): Unit = js.native
  
  var service: Service = js.native
  
  /**
    * Lists services in a given DC
    */
  def services[TData](): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](callback: Callback[TData]): Unit = js.native
  def services[TData](dc: String): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def services[TData](opts: ServicesOptions): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def services[TData](opts: ServicesOptions, callback: Callback[TData]): Unit = js.native
}
object Catalog {
  
  type DatacentersOptions = CommonOptions
  
  @js.native
  trait Node extends StObject {
    
    var consul: Consul = js.native
    
    /**
      * Lists nodes in a given DC
      */
    def list[TData](): Thenable[TData] = js.native
    /**
      * Lists nodes in a given DC
      */
    def list[TData](callback: Callback[TData]): Unit = js.native
    def list[TData](dc: String): Thenable[TData] = js.native
    /**
      * Lists nodes in a given DC
      */
    def list[TData](dc: String, callback: Callback[TData]): Unit = js.native
    def list[TData](opts: ListOptions): Thenable[TData] = js.native
    /**
      * Lists nodes in a given DC
      */
    def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Lists the services provided by a node
      */
    def services[TData](node: String): Thenable[TData] = js.native
    /**
      * Lists the services provided by a node
      */
    def services[TData](node: String, callback: Callback[TData]): Unit = js.native
    /**
      * Lists the services provided by a node
      */
    def services[TData](opts: typingsSlinky.consul.mod.Catalog.Node.ServicesOptions): Thenable[TData] = js.native
    /**
      * Lists the services provided by a node
      */
    def services[TData](opts: typingsSlinky.consul.mod.Catalog.Node.ServicesOptions, callback: Callback[TData]): Unit = js.native
  }
  object Node {
    
    @js.native
    trait ListOptions extends CommonOptions
    object ListOptions {
      
      @scala.inline
      def apply(): ListOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListOptions]
      }
    }
    
    @js.native
    trait ServicesOptions extends CommonOptions {
      
      var node: String = js.native
    }
    object ServicesOptions {
      
      @scala.inline
      def apply(node: String): typingsSlinky.consul.mod.Catalog.Node.ServicesOptions = {
        val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.consul.mod.Catalog.Node.ServicesOptions]
      }
      
      @scala.inline
      implicit class ServicesOptionsMutableBuilder[Self <: typingsSlinky.consul.mod.Catalog.Node.ServicesOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait NodeStatic extends Instantiable1[/* consul */ Consul, Node]
  
  type NodesOptions = ListOptions
  
  @js.native
  trait Service extends StObject {
    
    var consul: Consul = js.native
    
    /**
      * Lists services in a given DC
      */
    def list[TData](): Thenable[TData] = js.native
    /**
      * Lists services in a given DC
      */
    def list[TData](callback: Callback[TData]): Unit = js.native
    def list[TData](dc: String): Thenable[TData] = js.native
    /**
      * Lists services in a given DC
      */
    def list[TData](dc: String, callback: Callback[TData]): Unit = js.native
    def list[TData](opts: typingsSlinky.consul.mod.Catalog.Service.ListOptions): Thenable[TData] = js.native
    /**
      * Lists services in a given DC
      */
    def list[TData](opts: typingsSlinky.consul.mod.Catalog.Service.ListOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Lists the nodes in a given service
      */
    def nodes[TData](opts: typingsSlinky.consul.mod.Catalog.Service.NodesOptions): Thenable[TData] = js.native
    /**
      * Lists the nodes in a given service
      */
    def nodes[TData](opts: typingsSlinky.consul.mod.Catalog.Service.NodesOptions, callback: Callback[TData]): Unit = js.native
    /**
      * Lists the nodes in a given service
      */
    def nodes[TData](service: String): Thenable[TData] = js.native
    /**
      * Lists the nodes in a given service
      */
    def nodes[TData](service: String, callback: Callback[TData]): Unit = js.native
  }
  object Service {
    
    @js.native
    trait ListOptions extends CommonOptions
    object ListOptions {
      
      @scala.inline
      def apply(): typingsSlinky.consul.mod.Catalog.Service.ListOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.consul.mod.Catalog.Service.ListOptions]
      }
    }
    
    @js.native
    trait NodesOptions extends CommonOptions {
      
      var service: String = js.native
      
      var tag: js.UndefOr[String] = js.native
    }
    object NodesOptions {
      
      @scala.inline
      def apply(service: String): typingsSlinky.consul.mod.Catalog.Service.NodesOptions = {
        val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.consul.mod.Catalog.Service.NodesOptions]
      }
      
      @scala.inline
      implicit class NodesOptionsMutableBuilder[Self <: typingsSlinky.consul.mod.Catalog.Service.NodesOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
  }
  
  @js.native
  trait ServiceStatic extends Instantiable1[/* consul */ Consul, Service]
  
  type ServicesOptions = typingsSlinky.consul.mod.Catalog.Service.ListOptions
}
