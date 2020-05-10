package typingsSlinky.jupyterlabDocregistry.defaultMod

import typingsSlinky.jupyterlabCodeeditor.mod.CodeEditor.Model
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/default", "DocumentModel")
@js.native
/**
  * Construct a new document model.
  */
class DocumentModel ()
  extends Model
     with IModel {
  def this(languagePreference: String) = this()
  def this(languagePreference: String, modelDB: IModelDB) = this()
  var _contentChanged: js.Any = js.native
  var _defaultLang: js.Any = js.native
  var _dirty: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _stateChanged: js.Any = js.native
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    *
    * ### Notes
    * Making direct edits to the values stored in the`IModelDB`
    * is not recommended, and may produce unpredictable results.
    */
  /* InferMemberOverrides */
  override val modelDB: IModelDB = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: JSONValue): Unit = js.native
  /**
    * Trigger a content changed signal.
    */
  /* protected */ def triggerContentChange(): Unit = js.native
  /**
    * Trigger a state change signal.
    */
  /* protected */ def triggerStateChange(args: IChangedArgs[_, String]): Unit = js.native
}

