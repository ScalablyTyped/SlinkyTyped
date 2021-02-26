package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browse {
  
  /**
    * This service provides access to the Macros and Macro containers via the {@link XBrowseNode} interface. {@link XInvocation} is an optional interface
    * that is used to execute macros, or to create/delete/rename macros or macro containers.
    * @since OOo 2.0
    */
  @js.native
  trait BrowseNode
    extends XBrowseNode
       with XInvocation
  object BrowseNode {
    
    @scala.inline
    def apply(
      ChildNodes: SafeArray[XBrowseNode],
      Introspection: XIntrospectionAccess,
      Name: String,
      Type: Double,
      acquire: () => Unit,
      getChildNodes: () => SafeArray[XBrowseNode],
      getIntrospection: () => XIntrospectionAccess,
      getName: () => String,
      getType: () => Double,
      getValue: String => js.Any,
      hasChildNodes: () => Boolean,
      hasMethod: String => Boolean,
      hasProperty: String => Boolean,
      invoke: (String, SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setValue: (String, js.Any) => Unit
    ): BrowseNode = {
      val __obj = js.Dynamic.literal(ChildNodes = ChildNodes.asInstanceOf[js.Any], Introspection = Introspection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getChildNodes = js.Any.fromFunction0(getChildNodes), getIntrospection = js.Any.fromFunction0(getIntrospection), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction1(getValue), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
      __obj.asInstanceOf[BrowseNode]
    }
  }
  
  /**
    * This service is used to create Root XBrowseNodes.
    * @deprecated Deprecateduse the singleton theBrowseNodeFactory
    * @since OOo 2.0
    */
  type BrowseNodeFactory = XBrowseNodeFactory
  
  object BrowseNodeFactoryViewTypes {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      @scala.inline
      def MACROORGANIZER: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def MACROSELECTOR: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  object BrowseNodeTypes {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      @scala.inline
      def CONTAINER: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def ROOT: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def SCRIPT: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  /**
    * This interface represents a node in the hierarchy used to browse available scripts. Objects implementing this interface are expected to also implement
    * {@link com.sun.star.beans.XPropertySet} and, optionally, {@link com.sun.star.script.XInvocation} (see the Developer's Guide for more details).
    */
  @js.native
  trait XBrowseNode extends XInterface {
    
    /**
      * Get the children of this node
      * @returns {@link com.sun.star.script.browse.XBrowseNode} sequence of child nodes
      */
    val ChildNodes: SafeArray[XBrowseNode] = js.native
    
    /**
      * Get the name of the node
      * @returns The `string` name of this node
      */
    val Name: String = js.native
    
    /**
      * the type of the node.
      * @returns A `short` representing the type of this node.
      */
    val Type: Double = js.native
    
    /**
      * Get the children of this node
      * @returns {@link com.sun.star.script.browse.XBrowseNode} sequence of child nodes
      */
    def getChildNodes(): SafeArray[XBrowseNode] = js.native
    
    /**
      * Get the name of the node
      * @returns The `string` name of this node
      */
    def getName(): String = js.native
    
    /**
      * the type of the node.
      * @returns A `short` representing the type of this node.
      */
    def getType(): Double = js.native
    
    /**
      * Indicates if this node contains any children
      * @returns `boolean` true if there are child nodes.
      */
    def hasChildNodes(): Boolean = js.native
  }
  object XBrowseNode {
    
    @scala.inline
    def apply(
      ChildNodes: SafeArray[XBrowseNode],
      Name: String,
      Type: Double,
      acquire: () => Unit,
      getChildNodes: () => SafeArray[XBrowseNode],
      getName: () => String,
      getType: () => Double,
      hasChildNodes: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XBrowseNode = {
      val __obj = js.Dynamic.literal(ChildNodes = ChildNodes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getChildNodes = js.Any.fromFunction0(getChildNodes), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), hasChildNodes = js.Any.fromFunction0(hasChildNodes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XBrowseNode]
    }
    
    @scala.inline
    implicit class XBrowseNodeMutableBuilder[Self <: XBrowseNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildNodes(value: SafeArray[XBrowseNode]): Self = StObject.set(x, "ChildNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetChildNodes(value: () => SafeArray[XBrowseNode]): Self = StObject.set(x, "getChildNodes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  /** This interface provides a factory for obtaining objects implementing the {@link XBrowseNode} interface. */
  @js.native
  trait XBrowseNodeFactory extends XInterface {
    
    /**
      * a factory method for the creation of XBrowseNodes ( view ) {@link com.sun.star.script.browse.BrowseNodeFactoryViewTypes} specifies the type of view to
      * be returned
      * @returns an object implementing {@link com.sun.star.script.browse.XBrowseNode}
      */
    def createView(viewType: Double): XBrowseNode = js.native
  }
  object XBrowseNodeFactory {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      createView: Double => XBrowseNode,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XBrowseNodeFactory = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createView = js.Any.fromFunction1(createView), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XBrowseNodeFactory]
    }
    
    @scala.inline
    implicit class XBrowseNodeFactoryMutableBuilder[Self <: XBrowseNodeFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateView(value: Double => XBrowseNode): Self = StObject.set(x, "createView", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The one and only {@link BrowseNodeFactory} .
    *
    * To get the singleton call getValueByName on the component context `; /singletons/com.sun.star.script.theBrowseNodeFactory; `
    * @since OOo 2.0
    */
  type theBrowseNodeFactory = XBrowseNodeFactory
}
