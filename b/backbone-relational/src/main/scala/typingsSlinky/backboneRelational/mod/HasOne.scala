package typingsSlinky.backboneRelational.mod

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "HasOne")
@js.native
class HasOne () extends Relation {
  var collectionType: js.Any = js.native
  def addRelated(model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions], options: js.Any): Unit = js.native
  def findRelated(options: js.Any): typingsSlinky.backbone.mod.Model[_, ModelSetOptions] = js.native
  def handleAddition(
    model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions],
    coll: Collection[typingsSlinky.backbone.mod.Model[_, ModelSetOptions]],
    options: js.Any
  ): Unit = js.native
  def handleRemoval(
    model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions],
    coll: Collection[typingsSlinky.backbone.mod.Model[_, ModelSetOptions]],
    options: js.Any
  ): Unit = js.native
  def handleReset(coll: Collection[typingsSlinky.backbone.mod.Model[_, ModelSetOptions]], options: js.Any): Unit = js.native
  def onChange(model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions], attr: js.Any, options: js.Any): Unit = js.native
  def removeRelated(model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions], coll: js.Any, options: js.Any): Unit = js.native
  def setKeyContents(keyContents: String): Unit = js.native
  def setKeyContents(keyContents: js.Array[Double | String]): Unit = js.native
  def setKeyContents(keyContents: Double): Unit = js.native
  def setKeyContents(keyContents: Collection[typingsSlinky.backbone.mod.Model[_, ModelSetOptions]]): Unit = js.native
  def tryAddRelated(model: typingsSlinky.backbone.mod.Model[_, ModelSetOptions], coll: js.Any, options: js.Any): Unit = js.native
}

