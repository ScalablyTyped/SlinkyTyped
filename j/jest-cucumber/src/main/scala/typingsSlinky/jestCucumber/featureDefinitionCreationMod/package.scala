package typingsSlinky.jestCucumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object featureDefinitionCreationMod {
  
  type DefineScenarioFunction = js.Function3[
    /* scenarioTitle */ java.lang.String, 
    /* stepsDefinitionCallback */ typingsSlinky.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackFunction, 
    /* timeout */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  type DefineScenarioFunctionWithAliases = typingsSlinky.jestCucumber.featureDefinitionCreationMod.DefineScenarioFunction with typingsSlinky.jestCucumber.anon.Concurrent
  
  type DefineStepFunction = js.Function2[
    /* stepMatcher */ java.lang.String | js.RegExp, 
    /* stepDefinitionCallback */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Any
  ]
  
  type ScenariosDefinitionCallbackFunction = js.Function1[
    /* defineScenario */ typingsSlinky.jestCucumber.featureDefinitionCreationMod.DefineScenarioFunctionWithAliases, 
    scala.Unit
  ]
  
  type StepsDefinitionCallbackFunction = js.Function1[
    /* options */ typingsSlinky.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackOptions, 
    scala.Unit
  ]
}
