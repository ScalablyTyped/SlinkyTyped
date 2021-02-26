package typingsSlinky.observeJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.observeJs.mod.observejs.ArrayObserverInstance
import typingsSlinky.observeJs.mod.observejs.ArrayObserverStatic
import typingsSlinky.observeJs.mod.observejs.CompoundObserverInstance
import typingsSlinky.observeJs.mod.observejs.CompoundObserverStatic
import typingsSlinky.observeJs.mod.observejs.ObjectObserverInstance
import typingsSlinky.observeJs.mod.observejs.ObjectObserverStatic
import typingsSlinky.observeJs.mod.observejs.Observable
import typingsSlinky.observeJs.mod.observejs.ObserverTransformInstance
import typingsSlinky.observeJs.mod.observejs.ObserverTransformStatic
import typingsSlinky.observeJs.mod.observejs.Path
import typingsSlinky.observeJs.mod.observejs.PathObserverInstance
import typingsSlinky.observeJs.mod.observejs.PathObserverStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("observe-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("observe-js", "ArrayObserver")
  @js.native
  class ArrayObserver protected () extends ArrayObserverInstance {
    /**
      * Constructor
      * @param receiver the target for observation
      */
    def this(receiver: js.Array[_]) = this()
  }
  /**
    * ArrayObserver observes the index-positions of an Array and reports changes as the minimal set of "splices" which would have had the same effect.
    */
  /* was `typeof observejs.ArrayObserver` */
  @JSImport("observe-js", "ArrayObserver")
  @js.native
  def ArrayObserver: ArrayObserverStatic = js.native
  @scala.inline
  def ArrayObserver_=(x: ArrayObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayObserver")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("observe-js", "CompoundObserver")
  @js.native
  /**
    * Constructor
    */
  class CompoundObserver () extends CompoundObserverInstance
  /**
    * CompoundObserver allows simultaneous observation of multiple paths and/or Observables.
    */
  /* was `typeof observejs.CompoundObserver` */
  @JSImport("observe-js", "CompoundObserver")
  @js.native
  def CompoundObserver: CompoundObserverStatic = js.native
  @scala.inline
  def CompoundObserver_=(x: CompoundObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompoundObserver")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("observe-js", "ObjectObserver")
  @js.native
  class ObjectObserver protected () extends ObjectObserverInstance {
    /**
      * Constructor
      * @param receiver the target for observation
      */
    def this(receiver: js.Any) = this()
  }
  /**
    * Observes the set of own-properties of an object and their values
    */
  /* was `typeof observejs.ObjectObserver` */
  @JSImport("observe-js", "ObjectObserver")
  @js.native
  def ObjectObserver: ObjectObserverStatic = js.native
  @scala.inline
  def ObjectObserver_=(x: ObjectObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectObserver")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("observe-js", "ObserverTransform")
  @js.native
  class ObserverTransform protected () extends ObserverTransformInstance {
    /**
      * Constructor
      * @param observer the observer to transform
      * @param valueFn function that gets invoked with all observed values. May return a single new value.
      */
    def this(observer: Observable, valueFn: js.Function1[/* values */ js.Array[_], _]) = this()
    /**
      * Constructor
      * @param observer the observer to transform
      * @param getValue function that proxys getting a value
      * @param setValue function that proxys setting a value
      */
    def this(
      observer: Observable,
      getValue: js.Function1[/* value */ js.Any, _],
      setValue: js.Function1[/* value */ js.Any, _]
    ) = this()
  }
  /**
    * CompoundObserver allows simultaneous observation of multiple paths and/or Observables.
    */
  /* was `typeof observejs.ObserverTransform` */
  @JSImport("observe-js", "ObserverTransform")
  @js.native
  def ObserverTransform: ObserverTransformStatic = js.native
  @scala.inline
  def ObserverTransform_=(x: ObserverTransformStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObserverTransform")(x.asInstanceOf[js.Any])
  
  @JSImport("observe-js", "Path")
  @js.native
  def Path: typingsSlinky.observeJs.mod.observejs.Path = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("observe-js", "PathObserver")
  @js.native
  class PathObserver protected () extends PathObserverInstance {
    /**
      * Constructor
      * @param receiver the target for observation
      * @param path specifies the paht to observe. If path === '' the receiver itself gets observed.
      * @param defaultValue the defaultValue
      */
    def this(receiver: js.Any, path: String) = this()
    def this(receiver: js.Any, path: String, defaultValue: js.Any) = this()
  }
  /**
    * Observes a "value-at-a-path" from a given object:
    */
  /* was `typeof observejs.PathObserver` */
  @JSImport("observe-js", "PathObserver")
  @js.native
  def PathObserver: PathObserverStatic = js.native
  @scala.inline
  def PathObserver_=(x: PathObserverStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PathObserver")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Path_=(x: Path): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  object observejs {
    
    @js.native
    trait ArrayObserverInstance extends Observable
    
    @js.native
    trait ArrayObserverStatic
      extends /**
      * Constructor
      * @param receiver the target for observation
      */
    Instantiable1[/* receiver */ js.Array[js.Any], ArrayObserverInstance] {
      
      /**
        * transforms a copy of an old state of an array into a copy of its current state.
        * @param previous array of old state
        * @param current array of current state
        * @param splices  splices to apply
        */
      def applySplices(previous: js.Array[_], current: js.Array[_], splices: js.Array[splice]): Unit = js.native
    }
    
    @js.native
    trait CompoundObserverInstance extends Observable {
      
      /**
        * Adds an Observer to the list of observables.
        */
      def addObserver(observer: Observable): Unit = js.native
      
      /**
        * Adds the receivers property at the specified path to the list of observables.
        * @param receiver the target for observation
        * @param path specifies the paht to observe. If path === '' the receiver itself gets observed.
        */
      def addPath(receiver: js.Any, path: String): Unit = js.native
    }
    
    /*----------------------
      CompounObserver
      ----------------------*/
    @js.native
    trait CompoundObserverStatic extends /**
      * Constructor
      */
    Instantiable0[CompoundObserverInstance]
    
    @js.native
    trait ObjectObserverInstance extends Observable {
      
      def open(
        onChange: js.Function4[
              /* added */ Properties, 
              /* removed */ Properties, 
              /* changed */ Properties, 
              /* getOldValueFn */ js.Function1[/* property */ String, _], 
              _
            ]
      ): Unit = js.native
    }
    
    @js.native
    trait ObjectObserverStatic
      extends /**
      * Constructor
      * @param receiver the target for observation
      */
    Instantiable1[/* receiver */ js.Any, ObjectObserverInstance]
    
    /*----------------------
      Observable
      ----------------------*/
    @js.native
    trait Observable extends StObject {
      
      /**
        * Ends observation. Frees resources and drops references to observed objects.
        */
      def close(): Unit = js.native
      
      /**
        * Report any changes now (does nothing if there are no changes to report).
        */
      def deliver(): Unit = js.native
      
      /**
        * If there are changes to report, ignore them. Returns the current value of the observation.
        */
      def discardChanges(): Unit = js.native
      
      /**
        * Begins observation.
        * @param onChange the function that gets invoked if a change is detected
        * @param the target of observation
        */
      def open(onChange: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, _]): Unit = js.native
      def open(onChange: js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, _], receiver: js.Any): Unit = js.native
    }
    
    @js.native
    trait ObserverTransformInstance extends Observable {
      
      /**
        * sets the observed value without notifying about the change.
        * @param value the value to set
        */
      def setValue(value: js.Any): Unit = js.native
    }
    
    /*----------------------
      ObserverTransform
      ----------------------*/
    @js.native
    trait ObserverTransformStatic
      extends /**
      * Constructor
      * @param observer the observer to transform
      * @param getValue function that proxys getting a value
      * @param setValue function that proxys setting a value
      */
    Instantiable3[
              /* observer */ Observable, 
              /* getValue */ js.Function1[/* value */ js.Any, js.Any], 
              /* setValue */ js.Function1[/* value */ js.Any, js.Any], 
              ObserverTransformInstance
            ]
         with /**
      * Constructor
      * @param observer the observer to transform
      * @param valueFn function that gets invoked with all observed values. May return a single new value.
      */
    Instantiable2[
              /* observer */ Observable, 
              /* valueFn */ js.Function1[/* values */ js.Array[js.Any], js.Any], 
              ObserverTransformInstance
            ]
    
    /*----------------------
      Path
      ----------------------*/
    @js.native
    trait Path extends StObject {
      
      /**
        * Returns the current value of the path from the provided object. If eval() is available,
        * a compiled getter will be used for better performance. Like PathObserver above, undefined
        * is returned unless you provide an overriding defaultValue.
        */
      def getValueFrom(`object`: js.Any, defaultValue: js.Any): js.Any = js.native
    }
    object Path {
      
      @scala.inline
      def apply(getValueFrom: (js.Any, js.Any) => js.Any): Path = {
        val __obj = js.Dynamic.literal(getValueFrom = js.Any.fromFunction2(getValueFrom))
        __obj.asInstanceOf[Path]
      }
      
      @scala.inline
      implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetValueFrom(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "getValueFrom", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait PathObserverInstance extends Observable {
      
      /**
        * sets the observed value without notifying about the change.
        * @param value the value to set
        */
      def setValue(value: js.Any): Unit = js.native
    }
    
    /*----------------------
      PathObserver
      ----------------------*/
    @js.native
    trait PathObserverStatic
      extends /**
      * Constructor
      * @param receiver the target for observation
      * @param path specifies the paht to observe. If path === '' the receiver itself gets observed.
      * @param defaultValue the defaultValue
      */
    Instantiable2[/* receiver */ js.Any, /* path */ String, PathObserverInstance]
         with Instantiable3[
              /* receiver */ js.Any, 
              /* path */ String, 
              /* defaultValue */ js.Any, 
              PathObserverInstance
            ]
    
    /*----------------------
      ObjectObserver
      ----------------------*/
    type Properties = StringDictionary[js.Any]
    
    /*----------------------
      ArrayObserver
      ----------------------*/
    @js.native
    trait splice extends StObject {
      
      /**
        * the number of element which were inserted
        */
      var addedCount: Double = js.native
      
      /**
        * the index position that the change occured
        */
      var index: Double = js.native
      
      /**
        * an array of values representing the sequence of removed elements
        */
      var removed: js.Array[_] = js.native
    }
    object splice {
      
      @scala.inline
      def apply(addedCount: Double, index: Double, removed: js.Array[_]): splice = {
        val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
        __obj.asInstanceOf[splice]
      }
      
      @scala.inline
      implicit class spliceMutableBuilder[Self <: splice] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddedCount(value: Double): Self = StObject.set(x, "addedCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemoved(value: js.Array[_]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemovedVarargs(value: js.Any*): Self = StObject.set(x, "removed", js.Array(value :_*))
      }
    }
  }
}
