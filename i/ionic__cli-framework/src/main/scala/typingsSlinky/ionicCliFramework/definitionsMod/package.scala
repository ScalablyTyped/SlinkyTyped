package typingsSlinky.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionsMod {
  type CommandLineInputs = js.Array[java.lang.String]
  type CommandMapGetter[C /* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Function0[js.Promise[C]]
  type CommandPathItem[C /* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Tuple2[java.lang.String, C | N]
  type HydratedCommandMetadata[C /* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */] = M with (typingsSlinky.ionicCliFramework.anon.Aliases[C, N, M, I, O])
  type HydratedCommandMetadataOption[O /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */] = typingsSlinky.std.Required[O]
  type ICommandMap[C /* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */] = typingsSlinky.ionicUtilsObject.mod.AliasedMap[
    java.lang.String, 
    typingsSlinky.ionicCliFramework.definitionsMod.CommandMapGetter[C, N, M, I, O]
  ]
  type INamespaceMap[C /* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */] = typingsSlinky.ionicUtilsObject.mod.AliasedMap[
    java.lang.String, 
    typingsSlinky.ionicCliFramework.definitionsMod.NamespaceMapGetter[C, N, M, I, O]
  ]
  type NamespaceMapGetter[C /* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */, I /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */, O /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Function0[js.Promise[N]]
  type NamespaceMetadata = typingsSlinky.ionicCliFramework.definitionsMod.Metadata
  type Validator = js.Function2[
    /* input */ js.UndefOr[java.lang.String], 
    /* key */ js.UndefOr[java.lang.String], 
    typingsSlinky.ionicCliFramework.ionicCliFrameworkBooleans.`true` | java.lang.String
  ]
}
