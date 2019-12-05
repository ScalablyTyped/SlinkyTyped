package typingsSlinky.atJupyterlabObservables

import typingsSlinky.atJupyterlabObservables.libModeldbMod.ModelDB.ICreateOptions
import typingsSlinky.atJupyterlabObservables.libObservablejsonMod.IObservableJSON.IChangedArgs
import typingsSlinky.atJupyterlabObservables.libObservablejsonMod.ObservableJSON.IOptions
import typingsSlinky.atJupyterlabObservables.libUndoablelistMod.ISerializer
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables", JSImport.Namespace)
@js.native
object atJupyterlabObservablesMod extends js.Object {
  @js.native
  /**
    * Constructor for the `ModelDB`.
    */
  class ModelDB ()
    extends typingsSlinky.atJupyterlabObservables.libModeldbMod.ModelDB {
    def this(options: ICreateOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new observable JSON object.
    */
  class ObservableJSON ()
    extends typingsSlinky.atJupyterlabObservables.libObservablejsonMod.ObservableJSON {
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new observable map.
    */
  class ObservableList[T] ()
    extends typingsSlinky.atJupyterlabObservables.libObservablelistMod.ObservableList[T] {
    def this(options: typingsSlinky.atJupyterlabObservables.libObservablelistMod.ObservableList.IOptions[T]) = this()
  }
  
  @js.native
  /**
    * Construct a new observable map.
    */
  class ObservableMap[T] ()
    extends typingsSlinky.atJupyterlabObservables.libObservablemapMod.ObservableMap[T] {
    def this(options: typingsSlinky.atJupyterlabObservables.libObservablemapMod.ObservableMap.IOptions[T]) = this()
  }
  
  @js.native
  /**
    * Construct a new observable string.
    */
  class ObservableString ()
    extends typingsSlinky.atJupyterlabObservables.libObservablestringMod.ObservableString {
    def this(initialText: String) = this()
  }
  
  @js.native
  class ObservableUndoableList[T] protected ()
    extends typingsSlinky.atJupyterlabObservables.libUndoablelistMod.ObservableUndoableList[T] {
    /**
      * Construct a new undoable observable list.
      */
    def this(serializer: ISerializer[T]) = this()
  }
  
  @js.native
  /**
    * Constructor for the value.
    *
    * @param initialValue: the starting value for the `ObservableValue`.
    */
  class ObservableValue ()
    extends typingsSlinky.atJupyterlabObservables.libModeldbMod.ObservableValue {
    def this(initialValue: JSONValue) = this()
  }
  
  @js.native
  object ObservableJSON extends js.Object {
    /**
      * An observable JSON change message.
      */
    @js.native
    class ChangeMessage protected ()
      extends typingsSlinky.atJupyterlabObservables.libObservablejsonMod.ObservableJSON.ChangeMessage {
      /**
        * Create a new metadata changed message.
        */
      def this(`type`: String, args: IChangedArgs) = this()
    }
    
  }
  
  @js.native
  object ObservableUndoableList extends js.Object {
    /**
      * A default, identity serializer.
      */
    @js.native
    class IdentitySerializer[T /* <: JSONValue */] ()
      extends typingsSlinky.atJupyterlabObservables.libUndoablelistMod.ObservableUndoableList.IdentitySerializer[T]
    
  }
  
  @js.native
  object ObservableValue extends js.Object {
    /**
      * The changed args object emitted by the `IObservableValue`.
      */
    @js.native
    class IChangedArgs ()
      extends typingsSlinky.atJupyterlabObservables.libModeldbMod.ObservableValue.IChangedArgs
    
  }
  
}

