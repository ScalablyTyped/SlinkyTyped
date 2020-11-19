package typingsSlinky.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jss", "RuleList")
@js.native
class RuleList protected () extends js.Object {
  def this(options: RuleListOptions) = this()
  
  def add(name: String, decl: JssStyle): Rule = js.native
  def add(name: String, decl: JssStyle, options: RuleOptions): Rule = js.native
  
  def get(name: String): Rule = js.native
  
  def indexOf(rule: Rule): Double = js.native
  
  def process(): Unit = js.native
  
  def register(rule: Rule): Unit = js.native
  def register(rule: Rule, className: String): Unit = js.native
  
  def remove(rule: Rule): Unit = js.native
  
  def toString(options: ToCssOptions): String = js.native
  
  def unregister(rule: Rule): Unit = js.native
  
  def update(data: js.Object): Unit = js.native
  def update(name: String, data: js.Object): Unit = js.native
}
