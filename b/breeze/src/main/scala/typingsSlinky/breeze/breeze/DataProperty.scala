package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataProperty")
@js.native
class DataProperty protected () extends IProperty {
  def this(config: DataPropertyOptions) = this()
  var complexTypeName: String = js.native
  var concurrencyMode: String = js.native
  var dataType: DataTypeSymbol = js.native
  var defaultValue: js.Any = js.native
  var isComplexProperty: Boolean = js.native
  var isInherited: Boolean = js.native
  var isNullable: Boolean = js.native
  var isPartOfKey: Boolean = js.native
  var isUnmapped: Boolean = js.native
  var maxLength: Double = js.native
  var relatedNavigationProperty: NavigationProperty = js.native
}

