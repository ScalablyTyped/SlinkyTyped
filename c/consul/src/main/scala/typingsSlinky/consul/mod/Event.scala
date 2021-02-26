package typingsSlinky.consul.mod

import typingsSlinky.consul.mod.Event.FireOptions
import typingsSlinky.consul.mod.Event.ListOptions
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
  var consul: Consul = js.native
  
  /**
    * Fires a new user event
    */
  def fire[TData](name: String): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String, callback: Callback[TData]): Unit = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String, payload: String): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](name: String, payload: String, callback: Callback[TData]): Unit = js.native
  def fire[TData](name: String, payload: Buffer): Thenable[TData] = js.native
  def fire[TData](name: String, payload: Buffer, callback: Callback[TData]): Unit = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](opts: FireOptions): Thenable[TData] = js.native
  /**
    * Fires a new user event
    */
  def fire[TData](opts: FireOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](name: String): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](name: String, callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists the most recent events an agent has seen
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
}
object Event {
  
  @js.native
  trait FireOptions extends CommonOptions {
    
    var name: String = js.native
    
    var node: js.UndefOr[String] = js.native
    
    var payload: String | Buffer = js.native
    
    var service: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
  }
  object FireOptions {
    
    @scala.inline
    def apply(name: String, payload: String | Buffer): FireOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[FireOptions]
    }
    
    @scala.inline
    implicit class FireOptionsMutableBuilder[Self <: FireOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setPayload(value: String | Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  @js.native
  trait ListOptions extends CommonOptions {
    
    var name: js.UndefOr[String] = js.native
  }
  object ListOptions {
    
    @scala.inline
    def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    @scala.inline
    implicit class ListOptionsMutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
