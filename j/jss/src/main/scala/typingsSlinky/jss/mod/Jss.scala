package typingsSlinky.jss.mod

import typingsSlinky.jss.anon.PartialJssOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jss extends js.Object {
  
  def createRule(style: JssStyle): Rule = js.native
  def createRule(style: JssStyle, options: RuleFactoryOptions): Rule = js.native
  def createRule[Name /* <: String */](name: Name, style: JssStyle): Rule = js.native
  def createRule[Name /* <: String */](name: Name, style: JssStyle, options: RuleFactoryOptions): Rule = js.native
  
  def createStyleSheet[Name /* <: String | Double | js.Symbol */](styles: Partial[Styles[Name]]): StyleSheet[Name] = js.native
  def createStyleSheet[Name /* <: String | Double | js.Symbol */](styles: Partial[Styles[Name]], options: StyleSheetFactoryOptions): StyleSheet[Name] = js.native
  
  def removeStyleSheet(sheet: StyleSheet[String | Double | js.Symbol]): this.type = js.native
  
  def setup(): this.type = js.native
  def setup(options: PartialJssOptions): this.type = js.native
  
  def use(plugins: Plugin*): this.type = js.native
}
