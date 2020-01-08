package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.BaseModel
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IModule
import typingsSlinky.mendixmodelsdk.distModelSdkClientImplMod.ModelSdkClientImpl
import typingsSlinky.mendixmodelsdk.distSdkConfigurationMod.configuration.ISdkConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/Model", JSImport.Namespace)
@js.native
object distModelMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distSdkInternalAbstractModelMod.IAbstractModel because Already inherited
  - typings.mendixmodelsdk.distGenBaseDashModelMod.IBaseModel because Already inherited
  - typings.mendixmodelsdk.distGenBaseDashModelMod.IModel because var conflicts: id, metaModelVersion, mxVersionForModel, root, workingCopy. Inlined findModuleByQualifiedName */ @js.native
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
  
  type IModel = typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
  type ModelSdkClient = ModelSdkClientImpl[IModel, Model]
}

