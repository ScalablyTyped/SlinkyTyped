package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.9.0: introduced
  */
@js.native
trait IEntityKeyPart
  extends IElement
     with IByNameReferrable {
  
  val containerAsEntityKey: IEntityKey = js.native
  
  @JSName("model")
  val model_IEntityKeyPart: IModel = js.native
  
  val name: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  val `type`: IAttributeType = js.native
}
