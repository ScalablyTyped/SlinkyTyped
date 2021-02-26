package typingsSlinky.emberData

import typingsSlinky.ember.mod.default.ComputedProperty
import typingsSlinky.emberData.emberDataStrings.boolean
import typingsSlinky.emberData.emberDataStrings.date
import typingsSlinky.emberData.emberDataStrings.number
import typingsSlinky.emberData.emberDataStrings.string
import typingsSlinky.emberData.mod.DS.AttrOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attrMod {
  
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default(): ComputedProperty[_, _] = js.native
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default(options: AttrOptions[_]): ComputedProperty[_, _] = js.native
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default(target: js.Any, propertyKey: String): Unit = js.native
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default_boolean(`type`: boolean): ComputedProperty[Boolean, Boolean] = js.native
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default_boolean(`type`: boolean, options: AttrOptions[Boolean]): ComputedProperty[Boolean, Boolean] = js.native
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default_date(`type`: date): ComputedProperty[js.Date, js.Date] = js.native
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default_date(`type`: date, options: AttrOptions[js.Date]): ComputedProperty[js.Date, js.Date] = js.native
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default_number(`type`: number): ComputedProperty[Double, Double] = js.native
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default_number(`type`: number, options: AttrOptions[Double]): ComputedProperty[Double, Double] = js.native
  /**
    * `DS.attr` defines an attribute on a [DS.Model](/api/data/classes/DS.Model.html).
    * By default, attributes are passed through as-is, however you can specify an
    * optional type to have the value automatically transformed.
    * Ember Data ships with four basic transform types: `string`, `number`,
    * `boolean` and `date`. You can define your own transforms by subclassing
    * [DS.Transform](/api/data/classes/DS.Transform.html).
    */
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default_string(`type`: string): ComputedProperty[String, String] = js.native
  @JSImport("ember-data/attr", JSImport.Default)
  @js.native
  def default_string(`type`: string, options: AttrOptions[String]): ComputedProperty[String, String] = js.native
}
