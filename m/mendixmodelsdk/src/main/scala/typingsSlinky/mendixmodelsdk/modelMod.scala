package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.baseModelMod.BaseModel
import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typingsSlinky.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typingsSlinky.mendixmodelsdk.modelSdkClientImplMod.ModelSdkClientImpl
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel because Already inherited
  - typingsSlinky.mendixmodelsdk.baseModelMod.IBaseModel because Already inherited
  - typingsSlinky.mendixmodelsdk.baseModelMod.IModel because var conflicts: id, metaModelVersion, mxVersionForModel, root, workingCopy. Inlined findModuleByQualifiedName */ @JSImport("mendixmodelsdk/dist/Model", "Model")
  @js.native
  class Model protected () extends BaseModel {
    def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
    
    var allModelClasses: js.Any = js.native
    
    /**
      * Given a qualified name, returns a Module.
      */
    def findModuleByQualifiedName(qname: String): IModule | Null = js.native
  }
  /* static members */
  object Model {
    
    @JSImport("mendixmodelsdk/dist/Model", "Model.createSdkClient")
    @js.native
    def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, Model] = js.native
  }
  
  type IModel = typingsSlinky.mendixmodelsdk.baseModelMod.IModel
  
  type ModelSdkClient = ModelSdkClientImpl[IModel, Model]
}
