package typingsSlinky.backboneRelational.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "HasMany")
@js.native
class HasMany () extends Relation {
  var collectionType: js.Any = js.native
  def addRelated(model: typingsSlinky.backbone.mod.Model, options: js.Any): Unit = js.native
  def findRelated(options: js.Any): typingsSlinky.backbone.mod.Model = js.native
  def onChange(model: typingsSlinky.backbone.mod.Model, attr: js.Any, options: js.Any): Unit = js.native
  def removeRelated(model: typingsSlinky.backbone.mod.Model, coll: js.Any, options: js.Any): Unit = js.native
  def setKeyContents(keyContents: String): Unit = js.native
  def setKeyContents(keyContents: Double): Unit = js.native
  def setKeyContents(keyContents: typingsSlinky.backbone.mod.Model): Unit = js.native
  def tryAddRelated(model: typingsSlinky.backbone.mod.Model, coll: js.Any, options: js.Any): Unit = js.native
}

