package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNativeNavigation.assetResolverMod.AssetService
import typingsSlinky.reactNativeNavigation.colorServiceMod.ColorService
import typingsSlinky.reactNativeNavigation.commandNameMod.CommandName
import typingsSlinky.reactNativeNavigation.deprecationsMod.Deprecations
import typingsSlinky.reactNativeNavigation.optionProcessorsStoreMod.OptionProcessorsStore
import typingsSlinky.reactNativeNavigation.optionsMod.Options
import typingsSlinky.reactNativeNavigation.storeMod.Store
import typingsSlinky.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/commands/OptionsProcessor", JSImport.Namespace)
@js.native
object optionsProcessorMod extends js.Object {
  @js.native
  class OptionsProcessor protected () extends js.Object {
    def this(
      store: Store,
      uniqueIdProvider: UniqueIdProvider,
      optionProcessorsRegistry: OptionProcessorsStore,
      colorService: ColorService,
      assetService: AssetService,
      deprecations: Deprecations
    ) = this()
    var assetService: js.Any = js.native
    var colorService: js.Any = js.native
    var deprecations: js.Any = js.native
    var optionProcessorsRegistry: js.Any = js.native
    var processButtonsPassProps: js.Any = js.native
    var processColor: js.Any = js.native
    var processComponent: js.Any = js.native
    var processImage: js.Any = js.native
    var processObject: js.Any = js.native
    var processWithRegisteredProcessor: js.Any = js.native
    var resolveObjectPath: js.Any = js.native
    var store: js.Any = js.native
    var uniqueIdProvider: js.Any = js.native
    def processDefaultOptions(options: Options, commandName: CommandName): Unit = js.native
    def processOptions(options: Options, commandName: CommandName): Unit = js.native
  }
  
}

