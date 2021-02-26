package typingsSlinky.awsSdkBuildTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object customizationMod {
  
  type ConfigurationDefinition = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdkBuildTypes.customizationMod.ConfigurationPropertyDefinition]
  
  type CustomizationProvider = js.Function2[
    /* model */ typingsSlinky.awsSdkBuildTypes.treeModelMod.TreeModel, 
    /* target */ typingsSlinky.awsSdkBuildTypes.customizationMod.RuntimeTarget, 
    typingsSlinky.awsSdkBuildTypes.customizationMod.ServiceCustomizationDefinition
  ]
}
