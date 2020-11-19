package typingsSlinky.mendixmodelsdk.restMod.rest

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.9.0: introduced
  */
@js.native
trait IODataKey extends IElement {
  
  val containerAsODataRemoteEntitySource: IODataRemoteEntitySource = js.native
  
  @JSName("model")
  val model_IODataKey: IModel = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  val parts: IList[IODataKeyPart] = js.native
}
