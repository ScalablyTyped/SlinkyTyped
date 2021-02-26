package typingsSlinky.inversifyRestifyUtils

import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Path extends _RouteOptions {
    
    var path: StrOrRegex = js.native
  }
  object Path {
    
    @scala.inline
    def apply(path: StrOrRegex): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: StrOrRegex): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathRegExp(value: js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  options :std.Object,   path :inversify-restify-utils.inversify-restify-utils/dts/interfaces.interfaces.StrOrRegex} & std.Object */
  @js.native
  trait optionsObjectpathStrOrReg extends _RouteOptions {
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    var options: js.Object = js.native
    
    var path: StrOrRegex = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  object optionsObjectpathStrOrReg {
    
    @scala.inline
    def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      options: js.Object,
      path: StrOrRegex,
      propertyIsEnumerable: PropertyKey => Boolean
    ): optionsObjectpathStrOrReg = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[optionsObjectpathStrOrReg]
    }
    
    @scala.inline
    implicit class optionsObjectpathStrOrRegMutableBuilder[Self <: optionsObjectpathStrOrReg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasOwnProperty(value: PropertyKey => Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: StrOrRegex): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathRegExp(value: js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyIsEnumerable(value: PropertyKey => Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
    }
  }
}
