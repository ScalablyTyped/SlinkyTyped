package typingsSlinky.jsonDashRulesDashEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashRulesDashEngineMod {
  import typingsSlinky.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.conditions
  import typingsSlinky.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.event
  import typingsSlinky.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.name
  import typingsSlinky.jsonDashRulesDashEngine.jsonDashRulesDashEngineStrings.priority
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Record
  import typingsSlinky.std.Required

  type DynamicFactCallback[T] = js.Function2[/* params */ Record[String, js.Any], /* almanac */ Almanac, T]
  type EventHandler = js.Function3[/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult, Unit]
  type OperatorEvaluator[A, B] = js.Function2[/* factValue */ A, /* compareToValue */ B, Boolean]
  type RuleSerializable = Pick[Required[RuleProperties], conditions | event | name | priority]
}
