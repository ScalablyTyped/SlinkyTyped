package typingsSlinky.samchon

import typingsSlinky.samchon.entityMod.Entity
import typingsSlinky.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/invoke/InvokeParameter", JSImport.Namespace)
@js.native
object invokeParameterMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeParameter () extends Entity {
    def this(`val`: String) = this()
    def this(`val`: Boolean) = this()
    def this(`val`: Double) = this()
    def this(`val`: js.typedarray.Uint8Array) = this()
    def this(`val`: XML) = this()
    def this(name: String, `val`: String) = this()
    /**
      * Construct from variable name and number value.
      *
      * @param name
      * @param val
      */
    def this(name: String, `val`: Boolean) = this()
    def this(name: String, `val`: Double) = this()
    def this(name: String, `val`: js.typedarray.Uint8Array) = this()
    def this(name: String, `val`: XML) = this()
    
    /**
      * Get name.
      */
    def getName(): String = js.native
    
    /**
      * Get type.
      */
    def getType(): String = js.native
    
    /**
      * Get value.
      */
    def getValue(): js.Any = js.native
    
    /**
      * Name of the parameter.
      *
      * @details Optional property, can be omitted.
      */
    var name: String = js.native
    
    def setValue(value: String): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    def setValue(value: Double): Unit = js.native
    def setValue(value: js.typedarray.Uint8Array): Unit = js.native
    def setValue(value: XML): Unit = js.native
    
    /**
      * Type of the parameter.
      */
    var `type`: String = js.native
    
    /**
      * Value of the parameter.
      */
    var value: Boolean | Double | String | XML | js.typedarray.Uint8Array = js.native
  }
}
