package typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@js.native
trait IType extends IElement {
  
  val containerAsBasicParameterType: IBasicParameterType = js.native
  
  val containerAsJavaAction: IJavaAction = js.native
  
  val containerAsJavaActionParameter: IJavaActionParameter = js.native
  
  val containerAsListType: IListType = js.native
  
  @JSName("model")
  val model_IType: IModel = js.native
}
