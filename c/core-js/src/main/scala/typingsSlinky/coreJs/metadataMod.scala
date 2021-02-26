package typingsSlinky.coreJs

import typingsSlinky.coreJs.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  /**
    * A default metadata decorator factory that can be used on a class, class member, or parameter.
    * @param metadataKey The key for the metadata entry.
    * @param metadataValue The value for the metadata entry.
    * @returns A decorator function.
    * @remarks
    * If `metadataKey` is already defined for the target and target key, the
    * metadataValue for that key will be overwritten.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  // constructor
    *  @Reflect.metadata(key, value)
    *  class Example {
    *  }
    *
    *  // property (on constructor, TypeScript only)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      static staticProperty;
    *  }
    *
    *  // property (on prototype, TypeScript only)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      property;
    *  }
    *
    *  // method (on constructor)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      static staticMethod() { }
    *  }
    *
    *  // method (on prototype)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      method() { }
    *  }
    * ```
    */
  /* was `typeof core.Reflect.metadata` */
  @JSImport("core-js/library/fn/reflect/es7/metadata'", JSImport.Namespace)
  @js.native
  def apply(metadataKey: js.Any, metadataValue: js.Any): FnCall = js.native
}
