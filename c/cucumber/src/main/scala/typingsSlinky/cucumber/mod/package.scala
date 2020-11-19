package typingsSlinky.cucumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventHook = js.Function2[
    /* event */ typingsSlinky.cucumber.mod.events.Event, 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  
  type GlobalHookCode = js.Function1[
    /* callback */ js.UndefOr[typingsSlinky.cucumber.mod.CallbackStepDefinition], 
    scala.Unit
  ]
  
  type HookCode = js.ThisFunction2[
    /* this */ typingsSlinky.cucumber.mod.World, 
    /* scenario */ typingsSlinky.cucumber.mod.HookScenarioResult, 
    /* callback */ js.UndefOr[typingsSlinky.cucumber.mod.CallbackStepDefinition], 
    scala.Unit
  ]
  
  type StepDefinitionCode = js.ThisFunction1[/* this */ typingsSlinky.cucumber.mod.World, /* repeated */ js.Any, js.Any]
  
  type SupportCodeConsumer = js.Function1[
    /* stepDefinitions */ typingsSlinky.cucumber.mod.StepDefinitions with typingsSlinky.cucumber.mod.Hooks, 
    scala.Unit
  ]
  
  type World = org.scalablytyped.runtime.StringDictionary[js.Any]
}
