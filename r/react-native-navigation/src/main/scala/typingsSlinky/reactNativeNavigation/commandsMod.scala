package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typingsSlinky.reactNativeNavigation.layoutMod.Layout
import typingsSlinky.reactNativeNavigation.layoutMod.LayoutRoot
import typingsSlinky.reactNativeNavigation.layoutProcessorMod.LayoutProcessor
import typingsSlinky.reactNativeNavigation.layoutTreeCrawlerMod.LayoutTreeCrawler
import typingsSlinky.reactNativeNavigation.layoutTreeParserMod.LayoutTreeParser
import typingsSlinky.reactNativeNavigation.nativeCommandsSenderMod.NativeCommandsSender
import typingsSlinky.reactNativeNavigation.optionsMod.Options
import typingsSlinky.reactNativeNavigation.optionsProcessorMod.OptionsProcessor
import typingsSlinky.reactNativeNavigation.storeMod.Store
import typingsSlinky.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMod {
  
  @JSImport("react-native-navigation/lib/dist/commands/Commands", "Commands")
  @js.native
  class Commands protected () extends StObject {
    def this(
      store: Store,
      nativeCommandsSender: NativeCommandsSender,
      layoutTreeParser: LayoutTreeParser,
      layoutTreeCrawler: LayoutTreeCrawler,
      commandsObserver: CommandsObserver,
      uniqueIdProvider: UniqueIdProvider,
      optionsProcessor: OptionsProcessor,
      layoutProcessor: LayoutProcessor
    ) = this()
    
    val commandsObserver: js.Any = js.native
    
    def dismissAllModals(): js.Promise[_] = js.native
    def dismissAllModals(mergeOptions: Options): js.Promise[_] = js.native
    
    def dismissModal(componentId: String): js.Promise[_] = js.native
    def dismissModal(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    
    def dismissOverlay(componentId: String): js.Promise[_] = js.native
    
    def getLaunchArgs(): js.Promise[_] = js.native
    
    val layoutProcessor: js.Any = js.native
    
    val layoutTreeCrawler: js.Any = js.native
    
    val layoutTreeParser: js.Any = js.native
    
    def mergeOptions(componentId: String, options: Options): Unit = js.native
    
    val nativeCommandsSender: js.Any = js.native
    
    val optionsProcessor: js.Any = js.native
    
    def pop(componentId: String): js.Promise[_] = js.native
    def pop(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    
    def popTo(componentId: String): js.Promise[_] = js.native
    def popTo(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    
    def popToRoot(componentId: String): js.Promise[_] = js.native
    def popToRoot(componentId: String, mergeOptions: Options): js.Promise[_] = js.native
    
    def push(componentId: String, simpleApi: Layout[js.Object]): js.Promise[_] = js.native
    
    def setDefaultOptions(options: Options): Unit = js.native
    
    def setRoot(simpleApi: LayoutRoot): js.Promise[_] = js.native
    
    def setStackRoot(componentId: String, children: js.Array[Layout[js.Object]]): js.Promise[_] = js.native
    
    def showModal(layout: Layout[js.Object]): js.Promise[_] = js.native
    
    def showOverlay(simpleApi: Layout[js.Object]): js.Promise[_] = js.native
    
    val store: js.Any = js.native
    
    val uniqueIdProvider: js.Any = js.native
    
    def updateProps(componentId: String, props: js.Object): Unit = js.native
  }
}
