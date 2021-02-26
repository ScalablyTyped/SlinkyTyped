package typingsSlinky.activexLibreoffice.com_.sun.star

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`10`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`11`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`12`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`13`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`14`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`15`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`16`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`17`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`18`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`19`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`20`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`21`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`22`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`23`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`24`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`25`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`26`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`27`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`28`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`29`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`30`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`31`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XMultiComponentFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uno {
  
  /**
    * {@link Exception} signalling a deployment error.
    * @since OOo 1.1.2
    */
  type DeploymentException = RuntimeException
  
  /**
    * the base of all UNO exceptions
    *
    * All exceptions defined in UNO idl should derive from this exception.
    */
  @js.native
  trait Exception extends StObject {
    
    /**
      * should contain a reference to the original, which raised the exception.
      *
      * May be NULL.
      */
    var Context: XInterface = js.native
    
    /**
      * gives a detailed description of the reason, why the exception was thrown.
      *
      * The description should be as detailed as possible.
      */
    var Message: String = js.native
  }
  object Exception {
    
    @scala.inline
    def apply(Context: XInterface, Message: String): Exception = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exception]
    }
    
    @scala.inline
    implicit class ExceptionMutableBuilder[Self <: Exception] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: XInterface): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
  
  /** a simple named object container. */
  type NamingService = XNamingService
  
  /**
    * This exception or a subclass can occur at every interface method.
    *
    * It shall signal an error, which was not covered by the interface method specification. This exception (or a derived one) is thrown, when for instance
    * an interprocess bridge to the object broke down, some explicitly forbidden invalid parameters were passed ( e.g. null references ) or the called
    * object has been disposed before.
    */
  type RuntimeException = Exception
  
  /** Base exception for all security related exceptions. */
  type SecurityException = RuntimeException
  
  /**
    * This enum describes all type classes of UNO. Every specific type has a type class specifying the general context of the reflected type.
    *
    * Example: A type reflecting the interface {@link XInterface} is of type class INTERFACE and its name is "com.sun.star.uno.XInterface".
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`14`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`21`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`29`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`30`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`11`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`15`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`19`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`10`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`22`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`26`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`25`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`24`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`28`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`20`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`23`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`31`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`12`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`17`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`13`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`16`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`18`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`27`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
    - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  */
  trait TypeClass extends StObject
  object TypeClass {
    
    /** reflecting the any type; anys can carry any UNO value except of any values */
    @scala.inline
    def ANY: `14` = 14.asInstanceOf[`14`]
    
    /**
      * Deprecated, UNOIDL does not have an array concept.
      * @deprecated Deprecated
      */
    @scala.inline
    def ARRAY: `21` = 21.asInstanceOf[`21`]
    
    /** reflecting the boolean type; true and false */
    @scala.inline
    def BOOLEAN: `2` = 2.asInstanceOf[`2`]
    
    /** reflecting the 8-bit ordinal type */
    @scala.inline
    def BYTE: `3` = 3.asInstanceOf[`3`]
    
    /** reflecting the 16-bit unicode character type */
    @scala.inline
    def CHAR: `1` = 1.asInstanceOf[`1`]
    
    /** reflecting constants */
    @scala.inline
    def CONSTANT: `29` = 29.asInstanceOf[`29`]
    
    /** reflecting constants groups */
    @scala.inline
    def CONSTANTS: `30` = 30.asInstanceOf[`30`]
    
    /** reflecting the 64-bit floating point type */
    @scala.inline
    def DOUBLE: `11` = 11.asInstanceOf[`11`]
    
    /** reflecting enum types */
    @scala.inline
    def ENUM: `15` = 15.asInstanceOf[`15`]
    
    /** reflecting exception types */
    @scala.inline
    def EXCEPTION: `19` = 19.asInstanceOf[`19`]
    
    /** reflecting the 32-bit floating point type */
    @scala.inline
    def FLOAT: `10` = 10.asInstanceOf[`10`]
    
    /** reflecting the signed 64-bit ordinal type */
    @scala.inline
    def HYPER: `8` = 8.asInstanceOf[`8`]
    
    /** reflecting interface types */
    @scala.inline
    def INTERFACE: `22` = 22.asInstanceOf[`22`]
    
    /** reflecting interface attributes */
    @scala.inline
    def INTERFACE_ATTRIBUTE: `26` = 26.asInstanceOf[`26`]
    
    /** reflecting interface methods */
    @scala.inline
    def INTERFACE_METHOD: `25` = 25.asInstanceOf[`25`]
    
    /** reflecting the signed 32-bit ordinal type */
    @scala.inline
    def LONG: `6` = 6.asInstanceOf[`6`]
    
    /** reflecting modules */
    @scala.inline
    def MODULE: `24` = 24.asInstanceOf[`24`]
    
    /** reflecting properties */
    @scala.inline
    def PROPERTY: `28` = 28.asInstanceOf[`28`]
    
    /** reflecting sequence types */
    @scala.inline
    def SEQUENCE: `20` = 20.asInstanceOf[`20`]
    
    /** reflecting services */
    @scala.inline
    def SERVICE: `23` = 23.asInstanceOf[`23`]
    
    /** reflecting the signed 16-bit ordinal type */
    @scala.inline
    def SHORT: `4` = 4.asInstanceOf[`4`]
    
    /** reflecting singletons */
    @scala.inline
    def SINGLETON: `31` = 31.asInstanceOf[`31`]
    
    /** reflecting the string type; strings of unicode characters */
    @scala.inline
    def STRING: `12` = 12.asInstanceOf[`12`]
    
    /** reflecting compound types */
    @scala.inline
    def STRUCT: `17` = 17.asInstanceOf[`17`]
    
    /** reflecting the meta type */
    @scala.inline
    def TYPE: `13` = 13.asInstanceOf[`13`]
    
    /** reflecting typedefed types referencing other types */
    @scala.inline
    def TYPEDEF: `16` = 16.asInstanceOf[`16`]
    
    /**
      * Deprecated, UNOIDL does not have a union concept.
      * @deprecated Deprecated
      */
    @scala.inline
    def UNION: `18` = 18.asInstanceOf[`18`]
    
    /** reflecting the unreflectable type */
    @scala.inline
    def UNKNOWN: `27` = 27.asInstanceOf[`27`]
    
    /** reflecting the unsigned 64-bit ordinal type */
    @scala.inline
    def UNSIGNED_HYPER: `9` = 9.asInstanceOf[`9`]
    
    /** reflecting the unsigned 32-bit type */
    @scala.inline
    def UNSIGNED_LONG: `7` = 7.asInstanceOf[`7`]
    
    /** reflecting the unsigned 16-bit ordinal type */
    @scala.inline
    def UNSIGNED_SHORT: `5` = 5.asInstanceOf[`5`]
    
    /** reflecting the void type; denotes no type */
    @scala.inline
    def VOID: `0` = 0.asInstanceOf[`0`]
  }
  
  /**
    * Specifies an universal interface key (globally unique).
    *
    * This struct is deprecated. Uiks are not used anymore.
    * @deprecated Deprecated
    */
  @js.native
  trait Uik extends StObject {
    
    /** specifies a 4 byte data block. */
    var Data1: Double = js.native
    
    /** specifies a 2 byte data block. */
    var Data2: Double = js.native
    
    /** specifies a 2 byte data block. */
    var Data3: Double = js.native
    
    /** specifies a 4 byte data block. */
    var Data4: Double = js.native
    
    /** specifies a 4 byte data block. */
    var Data5: Double = js.native
  }
  object Uik {
    
    @scala.inline
    def apply(Data1: Double, Data2: Double, Data3: Double, Data4: Double, Data5: Double): Uik = {
      val __obj = js.Dynamic.literal(Data1 = Data1.asInstanceOf[js.Any], Data2 = Data2.asInstanceOf[js.Any], Data3 = Data3.asInstanceOf[js.Any], Data4 = Data4.asInstanceOf[js.Any], Data5 = Data5.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uik]
    }
    
    @scala.inline
    implicit class UikMutableBuilder[Self <: Uik] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData1(value: Double): Self = StObject.set(x, "Data1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData2(value: Double): Self = StObject.set(x, "Data2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData3(value: Double): Self = StObject.set(x, "Data3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData4(value: Double): Self = StObject.set(x, "Data4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData5(value: Double): Self = StObject.set(x, "Data5", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This is the server-side interface to a weak adapter.
    *
    * The implementation of {@link XAdapter} must know but not hold the adapted object, because it must not affect the lifetime of the adapted object.
    * @see XWeak for description of concepts.
    */
  @js.native
  trait XAdapter extends XInterface {
    
    /**
      * adds a reference to the adapter.
      *
      * All added references are called when the adapted object dies.
      */
    def addReference(xRef: XReference): Unit = js.native
    
    /** queries the adapted object if it is alive. */
    def queryAdapted(): XInterface = js.native
    
    /** removes a reference from the adapter. */
    def removeReference(xRef: XReference): Unit = js.native
  }
  object XAdapter {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      addReference: XReference => Unit,
      queryAdapted: () => XInterface,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeReference: XReference => Unit
    ): XAdapter = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addReference = js.Any.fromFunction1(addReference), queryAdapted = js.Any.fromFunction0(queryAdapted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeReference = js.Any.fromFunction1(removeReference))
      __obj.asInstanceOf[XAdapter]
    }
    
    @scala.inline
    implicit class XAdapterMutableBuilder[Self <: XAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddReference(value: XReference => Unit): Self = StObject.set(x, "addReference", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryAdapted(value: () => XInterface): Self = StObject.set(x, "queryAdapted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveReference(value: XReference => Unit): Self = StObject.set(x, "removeReference", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Objects which implement this interface can become aggregates of a delegator.
    *
    * That means if an object "A" aggregates "B", "A" can provide all or some of the interfaces of "B". Whenever the method {@link
    * XInterface.queryInterface()} is called on either of the objects, the call will be forwarded to object "A". Object "A" now can determine whether to use
    * the interfaces of "A" or "B" or neither. Actually, any number of aggregates can be used, even nested ones (aggregated objects which are delegators by
    * themselves).
    *
    * The following rules are to be observed:  1. All calls to {@link XInterface.acquire()} which are made before the delegator was set (using the method
    * {@link XAggregation.setDelegator()} ) must not be taken back (using the method {@link XInterface.release()} ) before the delegation is removed by
    * calling `xAggregation->setDelegator(NULL)` .
    *
    *  2. The constructor of a delegator has to increment its own reference count by calling its method {@link XInterface.acquire()} before it sets itself
    * to any aggregate using the method {@link XAggregation.setDelegator()} . After that call it has to reset its own reference count without the destructor
    * getting called.
    *
    *  3. The destructor of a delegator has to reset the delegator in its aggregated objects by calling their method {@link XAggregation.setDelegator()}
    * with NULL before it releases its reference to its aggregated objects.
    * @deprecated DeprecatedAggregation will no longer be supported as a high-level concept of UNO. You may still have the option to implement an UNO object consis
    */
  @js.native
  trait XAggregation extends XInterface {
    
    /**
      * is similar to {@link XInterface.queryInterface()} , but it is to be processed directly without being forwarded to the delegator.
      *
      * This method is only called from within an implementation of {@link XInterface.queryInterface()} or {@link XAggregation.queryAggregation()} . This
      * method is to be called by the delegator if it does not implement the interface itself. An object which got aggregated cannot depend on getting its own
      * interface when it calls the method {@link XInterface.queryInterface()} .
      * @see XAggregation.setDelegator
      */
    def queryAggregation(aType: `type`): js.Any = js.native
    
    /**
      * sets the object to which all calls to the method {@link XInterface.queryInterface()} have to be forwarded.
      * @param pDelegator specifies the object which handles the calls to {@link XInterface.queryInterface()} . If **pDelegator** is NULL, the delegator is remo
      * @see XAggregation.queryAggregation
      */
    def setDelegator(pDelegator: XInterface): Unit = js.native
  }
  object XAggregation {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      queryAggregation: `type` => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setDelegator: XInterface => Unit
    ): XAggregation = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryAggregation = js.Any.fromFunction1(queryAggregation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDelegator = js.Any.fromFunction1(setDelegator))
      __obj.asInstanceOf[XAggregation]
    }
    
    @scala.inline
    implicit class XAggregationMutableBuilder[Self <: XAggregation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryAggregation(value: `type` => js.Any): Self = StObject.set(x, "queryAggregation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDelegator(value: XInterface => Unit): Self = StObject.set(x, "setDelegator", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Component context to be passed to a component via {@link com.sun.star.lang.XSingleComponentFactory} . Arbitrary values (e.g. deployment values) can be
    * retrieved from the context.
    */
  @js.native
  trait XComponentContext extends XInterface {
    
    /**
      * Gets the service manager instance to be used from key `/singletons/com.sun.star.lang.theServiceManager` . This method has been added for convenience,
      * because the service manager is used very often.
      * @returns service manager; throws {@link DeploymentException} in case service manager is null
      */
    val ServiceManager: XMultiComponentFactory = js.native
    
    /**
      * Gets the service manager instance to be used from key `/singletons/com.sun.star.lang.theServiceManager` . This method has been added for convenience,
      * because the service manager is used very often.
      * @returns service manager; throws {@link DeploymentException} in case service manager is null
      */
    def getServiceManager(): XMultiComponentFactory = js.native
    
    /**
      * Gets a value from the context.
      * @param Name name of value
      * @returns value
      */
    def getValueByName(Name: String): js.Any = js.native
  }
  object XComponentContext {
    
    @scala.inline
    def apply(
      ServiceManager: XMultiComponentFactory,
      acquire: () => Unit,
      getServiceManager: () => XMultiComponentFactory,
      getValueByName: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XComponentContext = {
      val __obj = js.Dynamic.literal(ServiceManager = ServiceManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getServiceManager = js.Any.fromFunction0(getServiceManager), getValueByName = js.Any.fromFunction1(getValueByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XComponentContext]
    }
    
    @scala.inline
    implicit class XComponentContextMutableBuilder[Self <: XComponentContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetServiceManager(value: () => XMultiComponentFactory): Self = StObject.set(x, "getServiceManager", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueByName(value: String => js.Any): Self = StObject.set(x, "getValueByName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setServiceManager(value: XMultiComponentFactory): Self = StObject.set(x, "ServiceManager", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Task (thread) local execution context for UNO. Arbitrary values can be retrieved from the context.
    *
    * You have to use UNO runtime functions to obtain the current context in your target language.
    */
  @js.native
  trait XCurrentContext extends XInterface {
    
    /**
      * Gets a value from the context.
      * @param Name name of value
      * @returns value
      */
    def getValueByName(Name: String): js.Any = js.native
  }
  object XCurrentContext {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      getValueByName: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XCurrentContext = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getValueByName = js.Any.fromFunction1(getValueByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XCurrentContext]
    }
    
    @scala.inline
    implicit class XCurrentContextMutableBuilder[Self <: XCurrentContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValueByName(value: String => js.Any): Self = StObject.set(x, "getValueByName", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * base interface of all UNO interfaces
    *
    * It provides lifetime control by reference counting and the possibility of querying for other interfaces of the same logical object.
    *
    * "Logical Object" in this case means that the interfaces actually can be supported by internal (e.g. aggregated) physical objects.
    *
    * Deriving from this interface is mandatory for all UNO interfaces.
    *
    * Each language binding (Java, C++, StarBasic, Python, ... ) may provide a different mapping of this interface, please look into the language dependent
    * documentation.
    *
    * The UNO object does not export the state of the reference count ( {@link acquire()} and {@link release()} do not have return values). In general, also
    * the UNO object itself should not make any assumption on the concrete value of the reference count (except on the transition from one to zero ).
    */
  @js.native
  trait XInterface extends StObject {
    
    /**
      * increases the reference counter by one.
      *
      * When you have called {@link acquire()} on the UNO object, it is often said, that you have a reference or a hard reference to the object.
      *
      * It is only allowed to invoke a method on an UNO object, when you keep a hard reference to it.
      *
      * Every call to acquire must be followed by a corresponding call to release some time later, which may eventually lead to the destruction of the object.
      */
    def acquire(): Unit = js.native
    
    /**
      * queries for a new interface to an existing UNO object.
      *
      * The {@link queryInterface()} method is the entry point to obtain other interfaces which are exported by the object. The caller asks the implementation
      * of the object, if it supports the interface specified by the type argument. The call may either return with a interface reference of the requested
      * type or with a void any.
      *
      * There are certain specifications, a {@link queryInterface()} implementation must not violate.
      *
      * 1) If queryInterface on a specific object has once returned a valid interface reference for a given type, it must return a valid reference for any
      * successive queryInterface calls on this object for the same type.
      *
      * 2) If queryInterface on a specific object has once returned a null reference for a given type, it must always return a null reference for the same
      * type.
      *
      * 3) If queryInterface on a reference A returns reference B, queryInterface on B for Type A must return interface reference A or calls made on the
      * returned reference must be equivalent to calls made on reference A.
      *
      * 4) If queryInterface on a reference A returns reference B, queryInterface on A and B for {@link XInterface} must return the same interface reference
      * (object identity).
      *
      * The reason for the strong specification is, that a Uno Runtime Environment (URE) may choose to cache {@link queryInterface()} calls.
      *
      * As mentioned above, certain language bindings may map this function differently also with different specifications, please visit the language
      * dependent specification for it. The current C++ binding sticks to the specification state
      *
      * The rules mentioned above are basically identical to the rules of QueryInterface in MS COM.
      * @param aType a UNO interface type, for which an object reference shall be obtained.
      * @returns an interface reference in case the requested interface is supported by the object, a void any otherwise.
      */
    def queryInterface(aType: `type`): js.Any = js.native
    
    /**
      * decreases the reference counter by one.
      *
      * When the reference counter reaches 0, the object gets deleted.
      *
      * Calling {@link release()} on the object is often called releasing or clearing the reference to an object.
      */
    def release(): Unit = js.native
  }
  object XInterface {
    
    @scala.inline
    def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit): XInterface = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XInterface]
    }
    
    @scala.inline
    implicit class XInterfaceMutableBuilder[Self <: XInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcquire(value: () => Unit): Self = StObject.set(x, "acquire", js.Any.fromFunction0(value))
      
      @scala.inline
      def setQueryInterface(value: `type` => js.Any): Self = StObject.set(x, "queryInterface", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    }
  }
  
  /** allows to insert, remove and access named objects. */
  @js.native
  trait XNamingService extends XInterface {
    
    /** provides a previous registered object. */
    def getRegisteredObject(Name: String): XInterface = js.native
    
    /**
      * registers one object under the specified name.
      *
      * If any object is registered before, then this object is revoked automatically.
      */
    def registerObject(Name: String, Object: XInterface): Unit = js.native
    
    /**
      * revokes the registration of an object.
      *
      * If the object was not previously registered, then this call does nothing.
      */
    def revokeObject(Name: String): Unit = js.native
  }
  object XNamingService {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      getRegisteredObject: String => XInterface,
      queryInterface: `type` => js.Any,
      registerObject: (String, XInterface) => Unit,
      release: () => Unit,
      revokeObject: String => Unit
    ): XNamingService = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getRegisteredObject = js.Any.fromFunction1(getRegisteredObject), queryInterface = js.Any.fromFunction1(queryInterface), registerObject = js.Any.fromFunction2(registerObject), release = js.Any.fromFunction0(release), revokeObject = js.Any.fromFunction1(revokeObject))
      __obj.asInstanceOf[XNamingService]
    }
    
    @scala.inline
    implicit class XNamingServiceMutableBuilder[Self <: XNamingService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetRegisteredObject(value: String => XInterface): Self = StObject.set(x, "getRegisteredObject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterObject(value: (String, XInterface) => Unit): Self = StObject.set(x, "registerObject", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRevokeObject(value: String => Unit): Self = StObject.set(x, "revokeObject", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * must be implemented by anyone who holds the adapter on the client side.
    * @see XWeak for description af concepts.
    */
  @js.native
  trait XReference extends XInterface {
    
    /**
      * removes all references to the adapter.
      *
      * This method is called when the adapted object dies. The implementation of the client-side's weak reference must include removal of all references to
      * the adapter. Otherwise, the adapted object will be destroyed, but the adapter will be alive.
      */
    def dispose(): Unit = js.native
  }
  object XReference {
    
    @scala.inline
    def apply(acquire: () => Unit, dispose: () => Unit, queryInterface: `type` => js.Any, release: () => Unit): XReference = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XReference]
    }
    
    @scala.inline
    implicit class XReferenceMutableBuilder[Self <: XReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Backwards-compatibility remainder of a removed library unloading feature.
    * @deprecated DeprecatedDo not use.
    */
  @js.native
  trait XUnloadingPreference extends XInterface {
    
    def releaseOnNotification(): Boolean = js.native
  }
  object XUnloadingPreference {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      releaseOnNotification: () => Boolean
    ): XUnloadingPreference = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseOnNotification = js.Any.fromFunction0(releaseOnNotification))
      __obj.asInstanceOf[XUnloadingPreference]
    }
    
    @scala.inline
    implicit class XUnloadingPreferenceMutableBuilder[Self <: XUnloadingPreference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReleaseOnNotification(value: () => Boolean): Self = StObject.set(x, "releaseOnNotification", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * the server-side interface to a weak object.
    *
    * This interface is proxy to the adapted object. In order to make it possible to have weak references to objects, the {@link XAdapter} interface must be
    * implemented to provide a weak adapter for the clients.
    *
    * **Concept of weak referencing:**
    *
    * This module specifies the interfaces for implementing and using weak references.
    *
    * The sense of weak references is to hold a reference to an object without affecting the lifetime of the object. That means that a weak reference may
    * become invalid, at any time, if the referenced object dies.
    *
    * The following interfaces describe one way to handle weak references by providing a weak adapter. The weak object has to provide this adapter if anyone
    * wants to hold a weak reference. To separate their lifetimes, the adapter and the original object must not share the same reference counter. The weak
    * reference is in fact only a hard reference to the adapter, which knows - but does not hold - the original object. That means that the implementation
    * and synchronization of weak referencing is the responsibility of the object. The following interfaces are involved in the concept of weak referencing:
    *
    * **XWeak**: is the server-side interface of the referred object. This referred object must support the {@link XAdapter} interface.;
    *
    * **XReference**: is a client-side interface which must be implemented by the holder of any weak reference. It is used for notification when the adapted
    * object dies.;
    */
  @js.native
  trait XWeak extends XInterface {
    
    /**
      * queries the weak adapter.
      *
      * It is important that the adapter must know, but not hold the adapted object. If the adapted object dies, all references to the adapter have to be
      * notified to release the adapter.
      */
    def queryAdapter(): XAdapter = js.native
  }
  object XWeak {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      queryAdapter: () => XAdapter,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XWeak = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryAdapter = js.Any.fromFunction0(queryAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XWeak]
    }
    
    @scala.inline
    implicit class XWeakMutableBuilder[Self <: XWeak] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryAdapter(value: () => XAdapter): Self = StObject.set(x, "queryAdapter", js.Any.fromFunction0(value))
    }
  }
}
