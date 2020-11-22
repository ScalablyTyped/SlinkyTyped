package typingsSlinky.mobxStateTree.anon

import typingsSlinky.mobxStateTree.modelMod.IModelType
import typingsSlinky.mobxStateTree.modelMod.ModelPropertiesDeclaration
import typingsSlinky.mobxStateTree.modelMod.ModelPropertiesDeclarationToProperties
import typingsSlinky.mobxStateTree.snapshotProcessorMod.NotCustomized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallNameProperties extends js.Object {
  
  def apply[P /* <: ModelPropertiesDeclaration */](): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
  def apply[P /* <: ModelPropertiesDeclaration */](name: String): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
  def apply[P /* <: ModelPropertiesDeclaration */](name: String, properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
  def apply[P /* <: ModelPropertiesDeclaration */](properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
}
