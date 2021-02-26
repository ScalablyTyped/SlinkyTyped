package typingsSlinky.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fridaGum.NativePointer
import typingsSlinky.fridaGum.ObjectWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamically generated wrapper for any Objective-C instance, class, or meta-class.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StringDictionary because Already inherited */ @js.native
trait Object
  extends ObjectWrapper
     with ObjectMethods {
  
  /**
    * Class that this object is an instance of.
    */
  @JSName("$class")
  var $class: Object = js.native
  
  /**
    * Class name of this object.
    */
  @JSName("$className")
  var $className: String = js.native
  
  /**
    * Instance variables on this object. Supports both access and assignment.
    */
  @JSName("$ivars")
  var $ivars: StringDictionary[js.Any] = js.native
  
  /**
    * Whether this is an instance, class, or meta-class.
    */
  @JSName("$kind")
  var $kind: ObjectKind = js.native
  
  /**
    * Native method names exposed by this object’s class and parent classes.
    */
  @JSName("$methods")
  var $methods: js.Array[String] = js.native
  
  /**
    * Name of module where this object is implemented.
    */
  @JSName("$moduleName")
  var $moduleName: String = js.native
  
  /**
    * Native method names exposed by this object’s class, not including parent classes.
    */
  @JSName("$ownMethods")
  var $ownMethods: js.Array[String] = js.native
  
  /**
    * Protocols that this object conforms to.
    */
  @JSName("$protocols")
  var $protocols: StringDictionary[Protocol] = js.native
  
  /**
    * Instance used for chaining up to super-class method implementations.
    */
  @JSName("$super")
  var $super: Object = js.native
  
  /**
    * Super-class of this object's class.
    */
  @JSName("$superClass")
  var $superClass: Object = js.native
  
  def equals(other: NativePointer): Boolean = js.native
  /**
    * Determines whether two instances refer to the same underlying object.
    *
    * @param other Other object instance or address to compare to.
    */
  def equals(other: Object): Boolean = js.native
}
