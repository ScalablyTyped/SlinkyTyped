package typingsSlinky.backboneRelational.mod

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone-relational", "Relation")
@js.native
class Relation ()
  extends typingsSlinky.backbone.mod.Model[js.Any, ModelSetOptions, js.Object] {
  
  def checkPreconditions(): Boolean = js.native
  
  def getReverseRelations(model: Model): Relation = js.native
  
  var instance: js.Any = js.native
  
  var key: js.Any = js.native
  
  var keyContents: js.Any = js.native
  
  var options: js.Any = js.native
  
  var related: js.Any = js.native
  
  var relatedCollection: js.Any = js.native
  
  var relatedModel: js.Any = js.native
  
  var reverseRelation: js.Any = js.native
  
  def setRelated(related: Collection[typingsSlinky.backbone.mod.Model[_, ModelSetOptions, js.Object]]): Unit = js.native
  def setRelated(related: typingsSlinky.backbone.mod.Model[_, ModelSetOptions, js.Object]): Unit = js.native
}
