package typingsSlinky.mendixmodelsdk.projectsMod.projects

import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
  */
@js.native
trait IProject extends IAbstractUnit {
  var isSystemProject: Boolean = js.native
  @JSName("model")
  val model_IProject: IModel = js.native
  var modules: IList[IModule] = js.native
  /**
    * This property is required and cannot be set to null.
    */
  var projectConversion: IProjectConversion = js.native
  var projectDocuments: IList[IProjectDocument] = js.native
}

object IProject {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    container: IStructuralUnit,
    id: String,
    isLoaded: Boolean,
    isSystemProject: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[_, _]],
    model: IModel,
    modules: IList[IModule],
    projectConversion: IProjectConversion,
    projectDocuments: IList[IProjectDocument],
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IProject, Unit] => Unit,
    traverseFind: js.Function1[IProject, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IProject, Unit] => Unit,
    unit: IAbstractUnit
  ): IProject = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isSystemProject = isSystemProject.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], projectConversion = projectConversion.asInstanceOf[js.Any], projectDocuments = projectDocuments.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProject]
  }
  @scala.inline
  implicit class IProjectOps[Self <: IProject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSystemProject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystemProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: IList[IModule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectConversion(value: IProjectConversion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectDocuments(value: IList[IProjectDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDocuments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

