package typingsSlinky.cucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def After(code: typingsSlinky.cucumber.mod.HookCode): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("After")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def After(options: java.lang.String, code: typingsSlinky.cucumber.mod.HookCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("After")(options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def After(options: typingsSlinky.cucumber.mod.HookOptions, code: typingsSlinky.cucumber.mod.HookCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("After")(options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def AfterAll(code: typingsSlinky.cucumber.mod.GlobalHookCode): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("AfterAll")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def AfterAll(options: java.lang.String, code: typingsSlinky.cucumber.mod.GlobalHookCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("AfterAll")(options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def AfterAll(options: typingsSlinky.cucumber.mod.HookOptions, code: typingsSlinky.cucumber.mod.GlobalHookCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("AfterAll")(options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def Before(code: typingsSlinky.cucumber.mod.HookCode): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Before")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def Before(options: java.lang.String, code: typingsSlinky.cucumber.mod.HookCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Before")(options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def Before(options: typingsSlinky.cucumber.mod.HookOptions, code: typingsSlinky.cucumber.mod.HookCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Before")(options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def BeforeAll(code: typingsSlinky.cucumber.mod.GlobalHookCode): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("BeforeAll")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def BeforeAll(options: java.lang.String, code: typingsSlinky.cucumber.mod.GlobalHookCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("BeforeAll")(options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def BeforeAll(options: typingsSlinky.cucumber.mod.HookOptions, code: typingsSlinky.cucumber.mod.GlobalHookCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("BeforeAll")(options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  type EventHook = js.Function2[
    /* event */ typingsSlinky.cucumber.mod.events.Event, 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  
  @scala.inline
  def Given(pattern: java.lang.String, code: typingsSlinky.cucumber.mod.StepDefinitionCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Given")(pattern.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def Given(
    pattern: java.lang.String,
    options: typingsSlinky.cucumber.mod.StepDefinitionOptions,
    code: typingsSlinky.cucumber.mod.StepDefinitionCode
  ): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Given")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def Given(pattern: js.RegExp, code: typingsSlinky.cucumber.mod.StepDefinitionCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Given")(pattern.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def Given(
    pattern: js.RegExp,
    options: typingsSlinky.cucumber.mod.StepDefinitionOptions,
    code: typingsSlinky.cucumber.mod.StepDefinitionCode
  ): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Given")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  
  @scala.inline
  def Listener(): typingsSlinky.cucumber.mod.EventListener = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Listener")().asInstanceOf[typingsSlinky.cucumber.mod.EventListener]
  
  type StepDefinitionCode = js.ThisFunction1[/* this */ typingsSlinky.cucumber.mod.World, /* repeated */ js.Any, js.Any]
  
  type SupportCodeConsumer = js.Function1[
    /* stepDefinitions */ typingsSlinky.cucumber.mod.StepDefinitions with typingsSlinky.cucumber.mod.Hooks, 
    scala.Unit
  ]
  
  @scala.inline
  def Then(pattern: java.lang.String, code: typingsSlinky.cucumber.mod.StepDefinitionCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Then")(pattern.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def Then(
    pattern: java.lang.String,
    options: typingsSlinky.cucumber.mod.StepDefinitionOptions,
    code: typingsSlinky.cucumber.mod.StepDefinitionCode
  ): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Then")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def Then(pattern: js.RegExp, code: typingsSlinky.cucumber.mod.StepDefinitionCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Then")(pattern.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def Then(
    pattern: js.RegExp,
    options: typingsSlinky.cucumber.mod.StepDefinitionOptions,
    code: typingsSlinky.cucumber.mod.StepDefinitionCode
  ): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Then")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def When(pattern: java.lang.String, code: typingsSlinky.cucumber.mod.StepDefinitionCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("When")(pattern.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def When(
    pattern: java.lang.String,
    options: typingsSlinky.cucumber.mod.StepDefinitionOptions,
    code: typingsSlinky.cucumber.mod.StepDefinitionCode
  ): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("When")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def When(pattern: js.RegExp, code: typingsSlinky.cucumber.mod.StepDefinitionCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("When")(pattern.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def When(
    pattern: js.RegExp,
    options: typingsSlinky.cucumber.mod.StepDefinitionOptions,
    code: typingsSlinky.cucumber.mod.StepDefinitionCode
  ): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("When")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  type World = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def clearSupportCodeFns(): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clearSupportCodeFns")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def defineParameterType(transform: typingsSlinky.cucumber.mod.Transform): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineParameterType")(transform.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defineStep(pattern: java.lang.String, code: typingsSlinky.cucumber.mod.StepDefinitionCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineStep")(pattern.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def defineStep(
    pattern: java.lang.String,
    options: typingsSlinky.cucumber.mod.StepDefinitionOptions,
    code: typingsSlinky.cucumber.mod.StepDefinitionCode
  ): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineStep")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def defineStep(pattern: js.RegExp, code: typingsSlinky.cucumber.mod.StepDefinitionCode): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineStep")(pattern.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def defineStep(
    pattern: js.RegExp,
    options: typingsSlinky.cucumber.mod.StepDefinitionOptions,
    code: typingsSlinky.cucumber.mod.StepDefinitionCode
  ): scala.Unit = (typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineStep")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defineSupportCode(consumer: typingsSlinky.cucumber.mod.SupportCodeConsumer): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineSupportCode")(consumer.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getSupportCodeFns(): js.Array[typingsSlinky.cucumber.mod.SupportCodeConsumer] = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSupportCodeFns")().asInstanceOf[js.Array[typingsSlinky.cucumber.mod.SupportCodeConsumer]]
  
  @scala.inline
  def setDefaultTimeout(time: scala.Double): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTimeout")(time.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setDefinitionFunctionWrapper(fn: js.Function1[/* fn */ js.Function0[scala.Unit], js.Function1[/* repeated */ _, _]]): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDefinitionFunctionWrapper")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setDefinitionFunctionWrapper(
    fn: js.Function2[
      /* fn */ js.Function0[scala.Unit], 
      /* options */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      js.Function1[/* repeated */ _, _]
    ]
  ): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDefinitionFunctionWrapper")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setWorldConstructor(world: js.Object): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setWorldConstructor")(world.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setWorldConstructor(
    world: js.ThisFunction1[
      /* this */ typingsSlinky.cucumber.mod.World, 
      /* init */ typingsSlinky.cucumber.anon.Attach, 
      scala.Unit
    ]
  ): scala.Unit = typingsSlinky.cucumber.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setWorldConstructor")(world.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
