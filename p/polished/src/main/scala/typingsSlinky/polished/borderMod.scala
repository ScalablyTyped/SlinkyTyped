package typingsSlinky.polished

import typingsSlinky.polished.sideKeywordMod.SideKeyword
import typingsSlinky.polished.styleMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("polished/lib/shorthands/border", JSImport.Namespace)
@js.native
object borderMod extends js.Object {
  
  def default(sideKeyword: String, values: (String | Double)*): Styles = js.native
  def default(sideKeyword: Double, values: (String | Double)*): Styles = js.native
  def default(sideKeyword: SideKeyword, values: (String | Double)*): Styles = js.native
}
