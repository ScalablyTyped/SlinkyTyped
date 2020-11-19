package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsSlinky.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILayoutParameter
  extends IElement
     with IByNameReferrable {
  
  val containerAsLayout: ILayout = js.native
  
  @JSName("model")
  val model_ILayoutParameter: IModel = js.native
  
  val name: String = js.native
}
