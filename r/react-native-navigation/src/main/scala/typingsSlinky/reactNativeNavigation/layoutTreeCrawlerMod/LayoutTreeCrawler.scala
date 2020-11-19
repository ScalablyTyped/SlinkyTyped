package typingsSlinky.reactNativeNavigation.layoutTreeCrawlerMod

import typingsSlinky.reactNativeNavigation.commandNameMod.CommandName
import typingsSlinky.reactNativeNavigation.optionsProcessorMod.OptionsProcessor
import typingsSlinky.reactNativeNavigation.storeMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/commands/LayoutTreeCrawler", "LayoutTreeCrawler")
@js.native
class LayoutTreeCrawler protected () extends js.Object {
  def this(store: Store, optionsProcessor: OptionsProcessor) = this()
  
  var applyStaticOptions: js.Any = js.native
  
  var assertComponentDataName: js.Any = js.native
  
  def crawl(node: LayoutNode, commandName: CommandName): Unit = js.native
  
  var handleComponent: js.Any = js.native
  
  var isComponentWithOptions: js.Any = js.native
  
  val optionsProcessor: js.Any = js.native
  
  var savePropsToStore: js.Any = js.native
  
  var staticOptionsIfPossible: js.Any = js.native
  
  val store: Store = js.native
}
