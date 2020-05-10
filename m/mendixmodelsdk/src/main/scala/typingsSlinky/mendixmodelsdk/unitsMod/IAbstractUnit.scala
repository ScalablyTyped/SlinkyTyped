package typingsSlinky.mendixmodelsdk.unitsMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.structuresMod.IStructure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractUnit extends IStructure {
  /**
    * The parent unit of this unit.
    */
  @JSName("container")
  val container_IAbstractUnit: IStructuralUnit = js.native
}

object IAbstractUnit {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    container: IStructuralUnit,
    id: String,
    isLoaded: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[_, _]],
    model: IAbstractModel,
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IAbstractUnit, Unit] => Unit,
    traverseFind: js.Function1[IAbstractUnit, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IAbstractUnit, Unit] => Unit,
    unit: IAbstractUnit
  ): IAbstractUnit = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractUnit]
  }
  @scala.inline
  implicit class IAbstractUnitOps[Self <: IAbstractUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: IStructuralUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

