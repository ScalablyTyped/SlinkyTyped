package typingsSlinky.openlayers.mod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Represents a `<PropertyIsEqualTo>` comparison operator.
  *
  * @param propertyName Name of the context property to compare.
  * @param expression The value to compare.
  * @param opt_matchCase Case-sensitive?
  * @api
  */
@JSImport("openlayers", "format.filter.EqualTo")
@js.native
class EqualTo_ protected () extends ComparisonBinary {
  /**
    * @classdesc
    * Represents a `<PropertyIsEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @api
    */
  def this(propertyName: String, expression: String) = this()
  def this(propertyName: String, expression: Double) = this()
  def this(propertyName: String, expression: String, opt_matchCase: Boolean) = this()
  def this(propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
}
