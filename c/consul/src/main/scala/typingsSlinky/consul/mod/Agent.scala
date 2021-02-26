package typingsSlinky.consul.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.consul.mod.Agent.Check
import typingsSlinky.consul.mod.Agent.Check.DeregisterOptions
import typingsSlinky.consul.mod.Agent.Check.FailOptions
import typingsSlinky.consul.mod.Agent.Check.ListOptions
import typingsSlinky.consul.mod.Agent.Check.PassOptions
import typingsSlinky.consul.mod.Agent.Check.RegisterOptions
import typingsSlinky.consul.mod.Agent.Check.WarnOptions
import typingsSlinky.consul.mod.Agent.ChecksOptions
import typingsSlinky.consul.mod.Agent.ForceLeaveOptions
import typingsSlinky.consul.mod.Agent.JoinOptions
import typingsSlinky.consul.mod.Agent.MaintenanceOptions
import typingsSlinky.consul.mod.Agent.MembersOptions
import typingsSlinky.consul.mod.Agent.SelfOptions
import typingsSlinky.consul.mod.Agent.Service
import typingsSlinky.consul.mod.Agent.ServicesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Agent extends StObject {
  
  var check: Check = js.native
  
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](callback: Callback[TData]): Unit = js.native
  def checks[TData](opts: ChecksOptions): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](opts: ChecksOptions, callback: Callback[TData]): Unit = js.native
  
  var consul: Consul = js.native
  
  /**
    * Force remove node
    */
  def forceLeave[TData](node: String): Thenable[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](node: String, callback: Callback[TData]): Unit = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: ForceLeaveOptions): Thenable[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: ForceLeaveOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: String): Thenable[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: String, callback: Callback[TData]): Unit = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: JoinOptions): Thenable[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: JoinOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: Boolean): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: Boolean, callback: Callback[TData]): Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: MaintenanceOptions): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: MaintenanceOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](): Thenable[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](callback: Callback[TData]): Unit = js.native
  def members[TData](opts: MembersOptions): Thenable[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](opts: MembersOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Returns the local node configuration
    */
  def self[TData](): Thenable[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](callback: Callback[TData]): Unit = js.native
  def self[TData](opts: SelfOptions): Thenable[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](opts: SelfOptions, callback: Callback[TData]): Unit = js.native
  
  var service: Service = js.native
  
  /**
    * Returns the services local agent is managing
    */
  def services[TData](): Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](callback: Callback[TData]): Unit = js.native
  def services[TData](opts: ServicesOptions): Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](opts: ServicesOptions, callback: Callback[TData]): Unit = js.native
}
object Agent {
  
  @js.native
  trait Check extends StObject {
    
    var consul: Consul = js.native
    
    /**
      * Deregister a local check
      */
    def deregister[TData](id: String): Thenable[TData] = js.native
    /**
      * Deregister a local check
      */
    def deregister[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Deregister a local check
      */
    def deregister[TData](opts: DeregisterOptions): Thenable[TData] = js.native
    /**
      * Deregister a local check
      */
    def deregister[TData](opts: DeregisterOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Mark a local test as critical
      */
    def fail[TData](id: String): Thenable[TData] = js.native
    /**
      * Mark a local test as critical
      */
    def fail[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Mark a local test as critical
      */
    def fail[TData](opts: FailOptions): Thenable[TData] = js.native
    /**
      * Mark a local test as critical
      */
    def fail[TData](opts: FailOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Returns the checks the local agent is managing
      */
    def list[TData](): Thenable[TData] = js.native
    /**
      * Returns the checks the local agent is managing
      */
    def list[TData](callback: Callback[TData]): Unit = js.native
    def list[TData](opts: ListOptions): Thenable[TData] = js.native
    /**
      * Returns the checks the local agent is managing
      */
    def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Mark a local test as passing
      */
    def pass[TData](id: String): Thenable[TData] = js.native
    /**
      * Mark a local test as passing
      */
    def pass[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Mark a local test as passing
      */
    def pass[TData](opts: PassOptions): Thenable[TData] = js.native
    /**
      * Mark a local test as passing
      */
    def pass[TData](opts: PassOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Registers a new local check
      */
    def register[TData](opts: RegisterOptions): Thenable[TData] = js.native
    /**
      * Registers a new local check
      */
    def register[TData](opts: RegisterOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Mark a local test as warning
      */
    def warn[TData](id: String): Thenable[TData] = js.native
    /**
      * Mark a local test as warning
      */
    def warn[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Mark a local test as warning
      */
    def warn[TData](opts: WarnOptions): Thenable[TData] = js.native
    /**
      * Mark a local test as warning
      */
    def warn[TData](opts: WarnOptions, callback: Callback[TData]): Unit = js.native
  }
  object Check {
    
    @js.native
    trait DeregisterOptions extends CommonOptions {
      
      var id: String = js.native
    }
    object DeregisterOptions {
      
      @scala.inline
      def apply(id: String): DeregisterOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[DeregisterOptions]
      }
      
      @scala.inline
      implicit class DeregisterOptionsMutableBuilder[Self <: DeregisterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait FailOptions extends CommonOptions {
      
      var id: String = js.native
      
      var note: js.UndefOr[String] = js.native
    }
    object FailOptions {
      
      @scala.inline
      def apply(id: String): FailOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[FailOptions]
      }
      
      @scala.inline
      implicit class FailOptionsMutableBuilder[Self <: FailOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      }
    }
    
    type ListOptions = CommonOptions
    
    @js.native
    trait PassOptions extends CommonOptions {
      
      var id: String = js.native
      
      var note: js.UndefOr[String] = js.native
    }
    object PassOptions {
      
      @scala.inline
      def apply(id: String): PassOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[PassOptions]
      }
      
      @scala.inline
      implicit class PassOptionsMutableBuilder[Self <: PassOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      }
    }
    
    @js.native
    trait RegisterOptions extends CommonOptions {
      
      var http: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var interval: js.UndefOr[String] = js.native
      
      var name: String = js.native
      
      var notes: js.UndefOr[String] = js.native
      
      var script: js.UndefOr[String] = js.native
      
      var serviceid: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[String] = js.native
      
      var ttl: js.UndefOr[String] = js.native
    }
    object RegisterOptions {
      
      @scala.inline
      def apply(name: String): RegisterOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[RegisterOptions]
      }
      
      @scala.inline
      implicit class RegisterOptionsMutableBuilder[Self <: RegisterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHttp(value: String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
        
        @scala.inline
        def setServiceid(value: String): Self = StObject.set(x, "serviceid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceidUndefined: Self = StObject.set(x, "serviceid", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        @scala.inline
        def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      }
    }
    
    @js.native
    trait WarnOptions extends CommonOptions {
      
      var id: String = js.native
      
      var note: js.UndefOr[String] = js.native
    }
    object WarnOptions {
      
      @scala.inline
      def apply(id: String): WarnOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[WarnOptions]
      }
      
      @scala.inline
      implicit class WarnOptionsMutableBuilder[Self <: WarnOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      }
    }
  }
  
  @js.native
  trait CheckStatic extends Instantiable1[/* consul */ Consul, Check]
  
  type ChecksOptions = ListOptions
  
  @js.native
  trait ForceLeaveOptions extends CommonOptions {
    
    var node: String = js.native
  }
  object ForceLeaveOptions {
    
    @scala.inline
    def apply(node: String): ForceLeaveOptions = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceLeaveOptions]
    }
    
    @scala.inline
    implicit class ForceLeaveOptionsMutableBuilder[Self <: ForceLeaveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JoinOptions extends CommonOptions {
    
    var address: String = js.native
  }
  object JoinOptions {
    
    @scala.inline
    def apply(address: String): JoinOptions = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinOptions]
    }
    
    @scala.inline
    implicit class JoinOptionsMutableBuilder[Self <: JoinOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaintenanceOptions extends CommonOptions {
    
    var enable: Boolean = js.native
    
    var reason: js.UndefOr[String] = js.native
  }
  object MaintenanceOptions {
    
    @scala.inline
    def apply(enable: Boolean): MaintenanceOptions = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaintenanceOptions]
    }
    
    @scala.inline
    implicit class MaintenanceOptionsMutableBuilder[Self <: MaintenanceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    }
  }
  
  @js.native
  trait MembersOptions extends CommonOptions
  object MembersOptions {
    
    @scala.inline
    def apply(): MembersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MembersOptions]
    }
  }
  
  type SelfOptions = CommonOptions
  
  @js.native
  trait Service extends StObject {
    
    var consul: Consul = js.native
    
    /**
      * Deregister a local service
      */
    def deregister[TData](id: String): Thenable[TData] = js.native
    /**
      * Deregister a local service
      */
    def deregister[TData](id: String, callback: Callback[TData]): Unit = js.native
    /**
      * Deregister a local service
      */
    def deregister[TData](opts: typingsSlinky.consul.mod.Agent.Service.DeregisterOptions): Thenable[TData] = js.native
    /**
      * Deregister a local service
      */
    def deregister[TData](opts: typingsSlinky.consul.mod.Agent.Service.DeregisterOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Returns the services local agent is managing
      */
    def list[TData](): Thenable[TData] = js.native
    /**
      * Returns the services local agent is managing
      */
    def list[TData](callback: Callback[TData]): Unit = js.native
    def list[TData](opts: typingsSlinky.consul.mod.Agent.Service.ListOptions): Thenable[TData] = js.native
    /**
      * Returns the services local agent is managing
      */
    def list[TData](opts: typingsSlinky.consul.mod.Agent.Service.ListOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Manages node maintenance mode
      */
    def maintenance[TData](opts: typingsSlinky.consul.mod.Agent.Service.MaintenanceOptions): Thenable[TData] = js.native
    /**
      * Manages node maintenance mode
      */
    def maintenance[TData](opts: typingsSlinky.consul.mod.Agent.Service.MaintenanceOptions, callback: Callback[TData]): Unit = js.native
    
    /**
      * Registers a new local service
      */
    def register[TData](name: String): Thenable[TData] = js.native
    /**
      * Registers a new local service
      */
    def register[TData](name: String, callback: Callback[TData]): Unit = js.native
    /**
      * Registers a new local service
      */
    def register[TData](opts: typingsSlinky.consul.mod.Agent.Service.RegisterOptions): Thenable[TData] = js.native
    /**
      * Registers a new local service
      */
    def register[TData](opts: typingsSlinky.consul.mod.Agent.Service.RegisterOptions, callback: Callback[TData]): Unit = js.native
  }
  object Service {
    
    @js.native
    trait DeregisterOptions extends CommonOptions {
      
      var id: String = js.native
    }
    object DeregisterOptions {
      
      @scala.inline
      def apply(id: String): typingsSlinky.consul.mod.Agent.Service.DeregisterOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.consul.mod.Agent.Service.DeregisterOptions]
      }
      
      @scala.inline
      implicit class DeregisterOptionsMutableBuilder[Self <: typingsSlinky.consul.mod.Agent.Service.DeregisterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    type ListOptions = CommonOptions
    
    @js.native
    trait MaintenanceOptions extends CommonOptions {
      
      var enable: Boolean = js.native
      
      var id: String = js.native
      
      var reason: js.UndefOr[String] = js.native
    }
    object MaintenanceOptions {
      
      @scala.inline
      def apply(enable: Boolean, id: String): typingsSlinky.consul.mod.Agent.Service.MaintenanceOptions = {
        val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.consul.mod.Agent.Service.MaintenanceOptions]
      }
      
      @scala.inline
      implicit class MaintenanceOptionsMutableBuilder[Self <: typingsSlinky.consul.mod.Agent.Service.MaintenanceOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      }
    }
    
    @js.native
    trait RegisterCheck extends StObject {
      
      var http: js.UndefOr[String] = js.native
      
      var interval: js.UndefOr[String] = js.native
      
      var notes: js.UndefOr[String] = js.native
      
      var script: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[String] = js.native
      
      var ttl: js.UndefOr[String] = js.native
    }
    object RegisterCheck {
      
      @scala.inline
      def apply(): RegisterCheck = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RegisterCheck]
      }
      
      @scala.inline
      implicit class RegisterCheckMutableBuilder[Self <: RegisterCheck] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHttp(value: String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
        
        @scala.inline
        def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        @scala.inline
        def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      }
    }
    
    @js.native
    trait RegisterOptions extends CommonOptions {
      
      var address: js.UndefOr[String] = js.native
      
      var check: js.UndefOr[RegisterCheck] = js.native
      
      var checks: js.UndefOr[js.Array[RegisterCheck]] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var name: String = js.native
      
      var port: js.UndefOr[Double] = js.native
      
      var tags: js.UndefOr[js.Array[String]] = js.native
    }
    object RegisterOptions {
      
      @scala.inline
      def apply(name: String): typingsSlinky.consul.mod.Agent.Service.RegisterOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.consul.mod.Agent.Service.RegisterOptions]
      }
      
      @scala.inline
      implicit class RegisterOptionsMutableBuilder[Self <: typingsSlinky.consul.mod.Agent.Service.RegisterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        @scala.inline
        def setCheck(value: RegisterCheck): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
        
        @scala.inline
        def setChecks(value: js.Array[RegisterCheck]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
        
        @scala.inline
        def setChecksVarargs(value: RegisterCheck*): Self = StObject.set(x, "checks", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        @scala.inline
        def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        @scala.inline
        def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      }
    }
  }
  
  @js.native
  trait ServiceStatic extends Instantiable1[/* consul */ Consul, Service]
  
  type ServicesOptions = typingsSlinky.consul.mod.Agent.Service.ListOptions
}
