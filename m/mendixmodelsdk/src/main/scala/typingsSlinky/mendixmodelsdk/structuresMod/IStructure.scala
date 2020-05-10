package typingsSlinky.mendixmodelsdk.structuresMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStructure extends js.Object {
  val container: IContainer | Null = js.native
  var id: String = js.native
  var isLoaded: Boolean = js.native
  var model: IAbstractModel = js.native
  var structureTypeName: String = js.native
  /**
    * Unit that owns/contains this thing.
    */
  var unit: IAbstractUnit = js.native
  def allProperties(): js.Array[AbstractProperty[_, _]] = js.native
  /**
    * Returns all properties when this structure is loaded, otherwise just the public properties.
    */
  def loadedProperties(): js.Array[AbstractProperty[_, _]] = js.native
  def publicProperties(): js.Array[AbstractProperty[_, _]] = js.native
  /**
    * Renders the structure as plain JSON (without observables magic).
    * This is intended for debugging and development convenience.
    * Note that the resulting object is not of the interface type corresponding to this structure.
    */
  def toJSON(): js.Object = js.native
  /**
    * Traverses this structure by calling the provided visitor function
    * on itself and all the structures contained (as part) by it,
    * in depth-first order, and it returns synchronously after that.
    */
  def traverse(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
  /**
    * Traverses this structure, returning immediately when `visit` returns something other than `null`.
    */
  def traverseFind[T](visit: js.Function1[/* structure */ this.type, T]): T | Null = js.native
  /**
    * Traverses this structure, only visiting children contained in public properties.
    */
  def traversePublicParts(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
}

object IStructure {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    id: String,
    isLoaded: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[_, _]],
    model: IAbstractModel,
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IStructure, Unit] => Unit,
    traverseFind: js.Function1[IStructure, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IStructure, Unit] => Unit,
    unit: IAbstractUnit
  ): IStructure = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructure]
  }
  @scala.inline
  implicit class IStructureOps[Self <: IStructure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllProperties(value: () => js.Array[AbstractProperty[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadedProperties(value: () => js.Array[AbstractProperty[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModel(value: IAbstractModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicProperties(value: () => js.Array[AbstractProperty[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStructureTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTraverse(value: js.Function1[IStructure, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTraverseFind(value: js.Function1[IStructure, js.Any] => js.Any | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverseFind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTraversePublicParts(value: js.Function1[IStructure, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traversePublicParts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnit(value: IAbstractUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
  }
  
}

