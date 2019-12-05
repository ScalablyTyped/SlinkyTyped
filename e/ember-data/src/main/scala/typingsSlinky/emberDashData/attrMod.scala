package typingsSlinky.emberDashData

import typingsSlinky.ember.emberMod.default.ComputedProperty
import typingsSlinky.emberDashData.emberDashDataMod.DS.AttrOptions
import typingsSlinky.emberDashData.emberDashDataStrings.boolean
import typingsSlinky.emberDashData.emberDashDataStrings.date
import typingsSlinky.emberDashData.emberDashDataStrings.number
import typingsSlinky.emberDashData.emberDashDataStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/attr", JSImport.Namespace)
@js.native
object attrMod extends js.Object {
  def default(): ComputedProperty[_, _] = js.native
  def default(options: AttrOptions[_]): ComputedProperty[_, _] = js.native
  @JSName("default")
  def default_boolean(`type`: boolean): ComputedProperty[Boolean, Boolean] = js.native
  @JSName("default")
  def default_boolean(`type`: boolean, options: AttrOptions[Boolean]): ComputedProperty[Boolean, Boolean] = js.native
  @JSName("default")
  def default_date(`type`: date): ComputedProperty[js.Date, js.Date] = js.native
  @JSName("default")
  def default_date(`type`: date, options: AttrOptions[js.Date]): ComputedProperty[js.Date, js.Date] = js.native
  @JSName("default")
  def default_number(`type`: number): ComputedProperty[Double, Double] = js.native
  @JSName("default")
  def default_number(`type`: number, options: AttrOptions[Double]): ComputedProperty[Double, Double] = js.native
  /**
    * `DS.attr` defines an attribute on a [DS.Model](/api/data/classes/DS.Model.html).
    * By default, attributes are passed through as-is, however you can specify an
    * optional type to have the value automatically transformed.
    * Ember Data ships with four basic transform types: `string`, `number`,
    * `boolean` and `date`. You can define your own transforms by subclassing
    * [DS.Transform](/api/data/classes/DS.Transform.html).
    */
  @JSName("default")
  def default_string(`type`: string): ComputedProperty[String, String] = js.native
  @JSName("default")
  def default_string(`type`: string, options: AttrOptions[String]): ComputedProperty[String, String] = js.native
}

