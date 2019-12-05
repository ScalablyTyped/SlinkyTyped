package typingsSlinky.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
  import typingsSlinky.ionic.Anon_Images
  import typingsSlinky.ionic.Anon_Req
  import typingsSlinky.ionic.ionicStrings.`ssl-commands`
  import typingsSlinky.ionic.ionicStrings.custom
  import typingsSlinky.ionic.ionicStrings.guard
  import typingsSlinky.ionic.ionicStrings.ionic1
  import typingsSlinky.ionic.ionicStrings.max
  import typingsSlinky.ionic.ionicStrings.reqgen
  import typingsSlinky.ionic.ionicStrings.state
  import typingsSlinky.std.Pick

  type APIResponseData = js.Object | js.Array[js.Object] | String
  type CommandInstanceInfo = typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandInstanceInfo[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
  type CustomBuildOptions = BuildOptions[custom]
  type CustomServeOptions = ServeOptions
  type FeatureId = `ssl-commands`
  type HookContext = BaseHookContext with HookInput
  type HookFn = js.Function1[/* ctx */ HookContext, js.Promise[Unit]]
  type HydratedCommandMetadata = CommandMetadata with (typingsSlinky.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadata[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption])
  type Ionic1BuildOptions = BuildOptions[ionic1]
  type LogFn = js.Function1[/* msg */ String, Unit]
  type NamespaceLocateResult = typingsSlinky.atIonicCliDashFramework.definitionsMod.NamespaceLocateResult[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
  type OAuthIdentity = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ A in ionic.ionic/definitions.AssociationType ]:? ionic.ionic/definitions.OAuthIdentityDetails}
    */ typingsSlinky.ionic.ionicStrings.OAuthIdentity with js.Any
  type PackageVersions = StringDictionary[String]
  type PaginateArgs[T /* <: Response[js.Array[js.Object]] */] = Pick[PaginatorDeps[T, PaginatorState], reqgen | guard | state | max]
  type PaginatorGuard[T /* <: Response[js.Array[js.Object]] */] = js.Function1[/* res */ APIResponseSuccess, /* is T */ Boolean]
  type PaginatorRequestGenerator = js.Function0[js.Promise[Anon_Req]]
  type ResourcesConfig = StringDictionary[ResourcesPlatform]
  type ResourcesPlatform = StringDictionary[Anon_Images]
  type SuperAgentRequest = typingsSlinky.superagent.superagentMod.SuperAgentRequest
}
