package typingsSlinky.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object definitionsMod {
  
  type APIResponseData = js.Object | js.Array[js.Object] | java.lang.String
  
  type CommandInstanceInfo = typingsSlinky.ionicCliFramework.definitionsMod.CommandInstanceInfo[
    typingsSlinky.ionic.definitionsMod.ICommand, 
    typingsSlinky.ionic.definitionsMod.INamespace, 
    typingsSlinky.ionic.definitionsMod.CommandMetadata, 
    typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput, 
    typingsSlinky.ionic.definitionsMod.CommandMetadataOption
  ]
  
  type CustomBuildOptions = typingsSlinky.ionic.definitionsMod.BuildOptions[typingsSlinky.ionic.ionicStrings.custom]
  
  type CustomServeOptions = typingsSlinky.ionic.definitionsMod.ServeOptions
  
  type FeatureId = typingsSlinky.ionic.ionicStrings.`ssl-commands`
  
  type HookContext = typingsSlinky.ionic.definitionsMod.BaseHookContext with typingsSlinky.ionic.definitionsMod.HookInput
  
  type HookFn = js.Function1[/* ctx */ typingsSlinky.ionic.definitionsMod.HookContext, js.Promise[scala.Unit]]
  
  type HydratedCommandMetadata = typingsSlinky.ionic.definitionsMod.CommandMetadata with (typingsSlinky.ionicCliFramework.definitionsMod.HydratedCommandMetadata[
    typingsSlinky.ionic.definitionsMod.ICommand, 
    typingsSlinky.ionic.definitionsMod.INamespace, 
    typingsSlinky.ionic.definitionsMod.CommandMetadata, 
    typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput, 
    typingsSlinky.ionic.definitionsMod.CommandMetadataOption
  ])
  
  type Ionic1BuildOptions = typingsSlinky.ionic.definitionsMod.BuildOptions[typingsSlinky.ionic.ionicStrings.ionic1]
  
  type LogFn = js.Function1[/* msg */ java.lang.String, scala.Unit]
  
  type NamespaceLocateResult = typingsSlinky.ionicCliFramework.definitionsMod.NamespaceLocateResult[
    typingsSlinky.ionic.definitionsMod.ICommand, 
    typingsSlinky.ionic.definitionsMod.INamespace, 
    typingsSlinky.ionic.definitionsMod.CommandMetadata, 
    typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput, 
    typingsSlinky.ionic.definitionsMod.CommandMetadataOption
  ]
  
  type PackageVersions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type PaginatorGuard[T /* <: typingsSlinky.ionic.definitionsMod.Response[js.Array[js.Object]] */] = js.Function1[
    /* res */ typingsSlinky.ionic.definitionsMod.APIResponseSuccess, 
    /* is T */ scala.Boolean
  ]
  
  type PaginatorRequestGenerator = js.Function0[js.Promise[typingsSlinky.ionic.anon.Req]]
  
  type ResourcesConfig = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ionic.definitionsMod.ResourcesPlatform]
  
  type ResourcesPlatform = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ionic.anon.Images]
  
  type SuperAgentRequest = typingsSlinky.superagent.mod.SuperAgentRequest
}
