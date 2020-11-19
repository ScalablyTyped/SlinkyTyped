package typingsSlinky.backboneAssociations.mod

import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.backboneAssociations.mod.Associations.IRelation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone", "AssociatedModel")
@js.native
class AssociatedModel ()
  extends Model[js.Any, ModelSetOptions] {
  
  var _proxyCalls: js.Any = js.native
  
  /** Cleans up any parent relations on other AssociatedModels */
  def cleanup(): Unit = js.native
  
  /** Reverse association lookup for objects that contain this object */
  var parents: js.Array[_] = js.native
  
  /** Relations with their associated model */
  var relations: js.Array[IRelation] = js.native
}
