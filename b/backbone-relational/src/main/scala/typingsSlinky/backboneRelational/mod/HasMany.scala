package typingsSlinky.backboneRelational.mod

import typingsSlinky.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone-relational", "HasMany")
@js.native
class HasMany () extends Relation {
  
  def addRelated(model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions, js.Object], options: js.Any): Unit = js.native
  
  var collectionType: js.Any = js.native
  
  def findRelated(options: js.Any): typingsSlinky.backbone.mod.Model[_, ModelSetOptions, js.Object] = js.native
  
  def onChange(
    model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions, js.Object],
    attr: js.Any,
    options: js.Any
  ): Unit = js.native
  
  def removeRelated(
    model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions, js.Object],
    coll: js.Any,
    options: js.Any
  ): Unit = js.native
  
  def setKeyContents(keyContents: String): Unit = js.native
  def setKeyContents(keyContents: Double): Unit = js.native
  def setKeyContents(keyContents: typingsSlinky.backbone.mod.Model[_, ModelSetOptions, js.Object]): Unit = js.native
  
  def tryAddRelated(
    model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions, js.Object],
    coll: js.Any,
    options: js.Any
  ): Unit = js.native
}
