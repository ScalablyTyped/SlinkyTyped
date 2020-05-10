package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.NavigationProperty")
@js.native
class NavigationProperty protected () extends IProperty {
  def this(config: NavigationPropertyOptions) = this()
  var associationName: String = js.native
  var entityType: EntityType = js.native
  var foreignKeyNames: js.Array[String] = js.native
  var inverse: NavigationProperty = js.native
  var isScalar: Boolean = js.native
  var relatedDataProperties: js.Array[DataProperty] = js.native
}

