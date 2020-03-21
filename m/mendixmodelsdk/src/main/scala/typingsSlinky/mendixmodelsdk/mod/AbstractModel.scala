package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "AbstractModel")
@js.native
abstract class AbstractModel protected ()
  extends typingsSlinky.mendixmodelsdk.internalMod.AbstractModel {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}

