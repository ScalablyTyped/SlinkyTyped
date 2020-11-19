package typingsSlinky.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.anon.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait filterRulesGroup extends js.Object {
  
  def add(rule: rule, priority: Double, options: ruleOptions): Unit = js.native
  
  def addMany(rules: js.Array[StringDictionary[_]], priority: Double, options: ruleOptions): Unit = js.native
  
  def exec(currentValue: String): node | fragment | String = js.native
  def exec(currentValue: fragment): node | fragment | String = js.native
  def exec(currentValue: node): node | fragment | String = js.native
  
  def execOnName(currentName: String): String = js.native
  
  def findIndex(priority: Double): Double = js.native
  
  var rules: js.Array[Option] = js.native
}
