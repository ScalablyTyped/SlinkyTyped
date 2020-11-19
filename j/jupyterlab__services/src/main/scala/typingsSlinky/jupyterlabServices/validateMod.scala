package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.contentsMod.Contents.ICheckpointModel
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/contents/validate", JSImport.Namespace)
@js.native
object validateMod extends js.Object {
  
  def validateCheckpointModel(model: ICheckpointModel): /* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, contents)), TsIdentSimple(Contents), TsIdentSimple(ICheckpointModel))),IArray())*/ Boolean = js.native
  
  def validateContentsModel(model: IModel): /* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, contents)), TsIdentSimple(Contents), TsIdentSimple(IModel))),IArray())*/ Boolean = js.native
}
