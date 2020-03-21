package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.baseModelMod.BaseModel
import typingsSlinky.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typingsSlinky.mendixmodelsdk.modelSdkClientImplMod.ModelSdkClientImpl
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/Model", JSImport.Namespace)
@js.native
object modelMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel because Already inherited
  - typingsSlinky.mendixmodelsdk.baseModelMod.IBaseModel because Already inherited
  - typingsSlinky.mendixmodelsdk.baseModelMod.IModel because var conflicts: id, metaModelVersion, mxVersionForModel, root, workingCopy. Inlined findModuleByQualifiedName */ @js.native
  class Model () extends BaseModel {
    var allModelClasses: js.Any = js.native
    /**
      * Given a qualified name, returns a Module.
      */
    def findModuleByQualifiedName(qname: String): IModule | Null = js.native
  }
  
  /* static members */
  @js.native
  object Model extends js.Object {
    def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, Model] = js.native
  }
  
  type IModel = typingsSlinky.mendixmodelsdk.baseModelMod.IModel
  type ModelSdkClient = ModelSdkClientImpl[IModel, Model]
}

