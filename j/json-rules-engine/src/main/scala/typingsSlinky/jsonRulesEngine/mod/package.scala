package typingsSlinky.jsonRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DynamicFactCallback[T] = js.Function2[
    /* params */ typingsSlinky.std.Record[java.lang.String, js.Any], 
    /* almanac */ typingsSlinky.jsonRulesEngine.mod.Almanac, 
    T
  ]
  type EventHandler = js.Function3[
    /* event */ typingsSlinky.jsonRulesEngine.mod.Event, 
    /* almanac */ typingsSlinky.jsonRulesEngine.mod.Almanac, 
    /* ruleResult */ typingsSlinky.jsonRulesEngine.mod.RuleResult, 
    scala.Unit
  ]
  type OperatorEvaluator[A, B] = js.Function2[/* factValue */ A, /* compareToValue */ B, scala.Boolean]
}
