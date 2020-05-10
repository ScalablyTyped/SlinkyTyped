package typingsSlinky.jupyterlabObservables.modeldbMod

import typingsSlinky.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString
import typingsSlinky.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelDB extends IDisposable {
  /**
    * The base path for the `IModelDB`. This is prepended
    * to all the paths that are passed in to the member
    * functions of the object.
    */
  val basePath: String = js.native
  /**
    * A map of the currently active collaborators
    * for the database, including the local user.
    */
  val collaborators: js.UndefOr[ICollaboratorMap] = js.native
  /**
    * A promise that resolves when the database
    * has connected to its backend, if any.
    */
  val connected: js.Promise[Unit] = js.native
  /**
    * Whether the database is collaborative.
    */
  val isCollaborative: Boolean = js.native
  /**
    * Whether the database has been populated
    * with model values prior to connection.
    */
  val isPrepopulated: Boolean = js.native
  /**
    * Create an undoable list and insert it in the database.
    *
    * @param path: the path for the list.
    *
    * @returns the list that was created.
    *
    * #### Notes
    * The list can only store objects that are simple
    * JSON Objects and primitives.
    */
  def createList[T /* <: JSONValue */](path: String): IObservableUndoableList[T] = js.native
  /**
    * Create a map and insert it in the database.
    *
    * @param path: the path for the map.
    *
    * @returns the map that was created.
    *
    * #### Notes
    * The map can only store objects that are simple
    * JSON Objects and primitives.
    */
  def createMap(path: String): IObservableJSON = js.native
  /**
    * Create a string and insert it in the database.
    *
    * @param path: the path for the string.
    *
    * @returns the string that was created.
    */
  def createString(path: String): IObservableString = js.native
  /**
    * Create an opaque value and insert it in the database.
    *
    * @param path: the path for the value.
    *
    * @returns the value that was created.
    */
  def createValue(path: String): IObservableValue = js.native
  /**
    * Get a value for a path.
    *
    * @param path: the path for the object.
    *
    * @returns an `IObservable`.
    */
  def get(path: String): js.UndefOr[IObservable] = js.native
  /**
    * Get a value at a path, or `undefined if it has not been set
    * That value must already have been created using `createValue`.
    *
    * @param path: the path for the value.
    */
  def getValue(path: String): js.UndefOr[JSONValue] = js.native
  /**
    * Whether the `IModelDB` has an object at this path.
    *
    * @param path: the path for the object.
    *
    * @returns a boolean for whether an object is at `path`.
    */
  def has(path: String): Boolean = js.native
  /**
    * Set a value at a path. That value must already have
    * been created using `createValue`.
    *
    * @param path: the path for the value.
    *
    * @param value: the new value.
    */
  def setValue(path: String, value: JSONValue): Unit = js.native
  /**
    * Create a view onto a subtree of the model database.
    *
    * @param basePath: the path for the root of the subtree.
    *
    * @returns an `IModelDB` with a view onto the original
    *   `IModelDB`, with `basePath` prepended to all paths.
    */
  def view(basePath: String): IModelDB = js.native
}

object IModelDB {
  @scala.inline
  def apply(
    basePath: String,
    connected: js.Promise[Unit],
    createList: String => IObservableUndoableList[js.Any],
    createMap: String => IObservableJSON,
    createString: String => IObservableString,
    createValue: String => IObservableValue,
    dispose: () => Unit,
    get: String => js.UndefOr[IObservable],
    getValue: String => js.UndefOr[JSONValue],
    has: String => Boolean,
    isCollaborative: Boolean,
    isDisposed: Boolean,
    isPrepopulated: Boolean,
    setValue: (String, JSONValue) => Unit,
    view: String => IModelDB
  ): IModelDB = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], createList = js.Any.fromFunction1(createList), createMap = js.Any.fromFunction1(createMap), createString = js.Any.fromFunction1(createString), createValue = js.Any.fromFunction1(createValue), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), getValue = js.Any.fromFunction1(getValue), has = js.Any.fromFunction1(has), isCollaborative = isCollaborative.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isPrepopulated = isPrepopulated.asInstanceOf[js.Any], setValue = js.Any.fromFunction2(setValue), view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[IModelDB]
  }
  @scala.inline
  implicit class IModelDBOps[Self <: IModelDB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnected(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateList(value: String => IObservableUndoableList[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateMap(value: String => IObservableJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateString(value: String => IObservableString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateValue(value: String => IObservableValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.UndefOr[IObservable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValue(value: String => js.UndefOr[JSONValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsCollaborative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollaborative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrepopulated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrepopulated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetValue(value: (String, JSONValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withView(value: String => IModelDB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCollaborators(value: ICollaboratorMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollaborators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(js.undefined)
        ret
    }
  }
  
}

