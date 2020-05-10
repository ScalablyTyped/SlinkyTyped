package typingsSlinky.mendixmodelsdk.projectsMod.projects

import typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderBase extends IAbstractUnit {
  val containerAsFolderBase: IFolderBase = js.native
  val containerAsProject: IProject = js.native
  var documents: IList[IDocument] = js.native
  var folders: IList[IFolder] = js.native
  @JSName("model")
  val model_IFolderBase: IModel = js.native
}

object IFolderBase {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    container: IStructuralUnit,
    containerAsFolderBase: IFolderBase,
    containerAsProject: IProject,
    documents: IList[IDocument],
    folders: IList[IFolder],
    id: String,
    isLoaded: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[_, _]],
    model: IModel,
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IFolderBase, Unit] => Unit,
    traverseFind: js.Function1[IFolderBase, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IFolderBase, Unit] => Unit,
    unit: IAbstractUnit
  ): IFolderBase = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderBase]
  }
  @scala.inline
  implicit class IFolderBaseOps[Self <: IFolderBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerAsFolderBase(value: IFolderBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAsFolderBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerAsProject(value: IProject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAsProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocuments(value: IList[IDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolders(value: IList[IFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

