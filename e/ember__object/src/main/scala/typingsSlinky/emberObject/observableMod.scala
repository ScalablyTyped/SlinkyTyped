package typingsSlinky.emberObject

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.emberObject.typesMod.ObserverMethod
import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertyGetter
import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertyGetters
import typingsSlinky.emberObject.typesMod.UnwrapComputedPropertySetters
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableMod extends Shortcut {
  
  @JSImport("@ember/object/observable", JSImport.Default)
  @js.native
  val default: typingsSlinky.emberObject.mixinMod.default[Observable, typingsSlinky.emberObject.coreMod.default] = js.native
  
  /**
    * This mixin provides properties and property observing functionality, core features of the Ember object model.
    */
  @js.native
  trait Observable extends StObject {
    
    def addObserver(key: /* keyof this */ String, method: ObserverMethod[this.type, this.type]): this.type = js.native
    /**
      * Adds an observer on a property.
      */
    def addObserver[Target](key: /* keyof this */ String, target: Target, method: ObserverMethod[Target, this.type]): this.type = js.native
    
    /**
      * Returns the cached value of a computed property, if it exists.
      * This allows you to inspect the value of a computed property
      * without accidentally invoking it if it is intended to be
      * generated lazily.
      */
    def cacheFor[K /* <: /* keyof this */ String */](key: K): js.UndefOr[
        UnwrapComputedPropertyGetter[
          /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
        ]
      ] = js.native
    
    /**
      * Set the value of a property to the current value minus some amount.
      */
    def decrementProperty(keyName: /* keyof this */ String): Double = js.native
    def decrementProperty(keyName: /* keyof this */ String, decrement: Double): Double = js.native
    
    /**
      * Retrieves the value of a property from the object.
      */
    def get[K /* <: /* keyof this */ String */](key: K): UnwrapComputedPropertyGetter[
        /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
      ] = js.native
    
    def getProperties[K /* <: /* keyof this */ String */](list: K*): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
    /**
      * To get the values of multiple properties at once, call `getProperties`
      * with a list of strings or an array:
      */
    def getProperties[K /* <: /* keyof this */ String */](list: js.Array[K]): Pick[UnwrapComputedPropertyGetters[this.type], K] = js.native
    
    /**
      * Retrieves the value of a property, or a default value in the case that the
      * property returns `undefined`.
      */
    def getWithDefault[K /* <: /* keyof this */ String */](
      key: K,
      defaultValue: UnwrapComputedPropertyGetter[
          /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
        ]
    ): UnwrapComputedPropertyGetter[
        /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
      ] = js.native
    
    /**
      * Set the value of a property to the current value plus some amount.
      */
    def incrementProperty(keyName: /* keyof this */ String): Double = js.native
    def incrementProperty(keyName: /* keyof this */ String, increment: Double): Double = js.native
    
    /**
      * Convenience method to call `propertyWillChange` and `propertyDidChange` in
      * succession.
      */
    def notifyPropertyChange(keyName: String): this.type = js.native
    
    def removeObserver(key: /* keyof this */ String, method: ObserverMethod[this.type, this.type]): this.type = js.native
    /**
      * Remove an observer you have previously registered on this object. Pass
      * the same key, target, and method you passed to `addObserver()` and your
      * target will no longer receive notifications.
      */
    def removeObserver[Target](key: /* keyof this */ String, target: Target, method: ObserverMethod[Target, this.type]): this.type = js.native
    
    /**
      * Sets the provided key or path to the value.
      */
    def set[K /* <: /* keyof this */ String */](
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
    ): /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any = js.native
    def set[T](key: /* keyof this */ String, value: T): T = js.native
    
    def setProperties[K /* <: /* keyof this */ String */](
      // tslint:disable-next-line:unified-signatures
    hash: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ KK in K ]: any}
      */ typingsSlinky.emberObject.emberObjectStrings.Observable with TopLevel[js.Any]
    ): Pick[UnwrapComputedPropertySetters[this.type], K] = js.native
    /**
      * Sets a list of properties at once. These properties are set inside
      * a single `beginPropertyChanges` and `endPropertyChanges` batch, so
      * observers will be buffered.
      */
    def setProperties[K /* <: /* keyof this */ String */](hash: Pick[this.type, K]): Pick[UnwrapComputedPropertySetters[this.type], K] = js.native
    
    /**
      * Set the value of a boolean property to the opposite of its
      * current value.
      */
    def toggleProperty(keyName: /* keyof this */ String): Boolean = js.native
  }
  
  type _To = typingsSlinky.emberObject.mixinMod.default[Observable, typingsSlinky.emberObject.coreMod.default]
  
  /* This means you don't have to write `default`, but can instead just say `observableMod.foo` */
  override def _to: typingsSlinky.emberObject.mixinMod.default[Observable, typingsSlinky.emberObject.coreMod.default] = default
}
