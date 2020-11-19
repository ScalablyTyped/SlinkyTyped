package typingsSlinky.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object clientMod {
  
  type ConfigApplicator[FullConfiguration] = js.Function2[
    /* config */ FullConfiguration, 
    /* clientMiddlewareStack */ typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[js.Any, js.Any, js.Any], 
    scala.Unit
  ]
  
  type ConfigurationDefinition[Configuration /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, ResolvedConfiguration /* <: Configuration */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof Configuration ]: @aws-sdk/types.@aws-sdk/types/build/client.ConfigurationPropertyDefinition<Configuration[P], ResolvedConfiguration[P], Configuration, ResolvedConfiguration>}
    */ typingsSlinky.awsSdkTypes.awsSdkTypesStrings.ConfigurationDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
}
