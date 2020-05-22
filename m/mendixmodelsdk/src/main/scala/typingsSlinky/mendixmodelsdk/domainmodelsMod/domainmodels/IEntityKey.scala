package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.9.0: introduced
  */
@js.native
trait IEntityKey extends IElement {
  @JSName("model")
  val model_IEntityKey: IModel = js.native
  val parts: IList[IEntityKeyPart] = js.native
}

