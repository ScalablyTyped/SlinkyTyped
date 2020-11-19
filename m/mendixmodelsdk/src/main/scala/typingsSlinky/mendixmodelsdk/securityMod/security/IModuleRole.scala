package typingsSlinky.mendixmodelsdk.securityMod.security

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
  */
@js.native
trait IModuleRole
  extends IElement
     with IByNameReferrable {
  
  val containerAsModuleSecurity: IModuleSecurity = js.native
  
  @JSName("model")
  val model_IModuleRole: IModel = js.native
  
  val name: String = js.native
}
