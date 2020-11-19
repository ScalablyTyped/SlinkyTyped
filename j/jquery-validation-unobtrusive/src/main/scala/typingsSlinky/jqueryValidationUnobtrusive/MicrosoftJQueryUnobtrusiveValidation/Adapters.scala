package typingsSlinky.jqueryValidationUnobtrusive.MicrosoftJQueryUnobtrusiveValidation

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapters extends Array[Adapter] {
  
  def add(adapterName: String, fn: js.Function): Adapters = js.native
  def add(adapterName: String, params: js.Array[String], fn: js.Function): Adapters = js.native
  
  def addBool(adapterName: String): Adapters = js.native
  def addBool(adapterName: String, ruleName: String): Adapters = js.native
  
  def addMethod(
    adapterName: String,
    fn: js.Function3[/* value */ String, /* element */ Element, /* params */ js.Any, _]
  ): Adapters = js.native
  
  def addMinMax(adapterName: String, minRuleName: String, maxRuleName: String, minMaxRuleName: String): Adapters = js.native
  def addMinMax(
    adapterName: String,
    minRuleName: String,
    maxRuleName: String,
    minMaxRuleName: String,
    minAttribute: js.UndefOr[scala.Nothing],
    maxAttribute: String
  ): Adapters = js.native
  def addMinMax(
    adapterName: String,
    minRuleName: String,
    maxRuleName: String,
    minMaxRuleName: String,
    minAttribute: String
  ): Adapters = js.native
  def addMinMax(
    adapterName: String,
    minRuleName: String,
    maxRuleName: String,
    minMaxRuleName: String,
    minAttribute: String,
    maxAttribute: String
  ): Adapters = js.native
  
  def addSingleVal(adapterName: String, attribute: String, ruleName: String): Adapters = js.native
  def addSingleVal(adapterName: String, ruleName: String): Adapters = js.native
}
