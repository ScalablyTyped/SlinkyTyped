package typingsSlinky.camljs.mod

import typingsSlinky.camljs.anon.Avg
import typingsSlinky.camljs.anon.Count
import typingsSlinky.camljs.anon.Max
import typingsSlinky.camljs.anon.Min
import typingsSlinky.camljs.anon.Stdev
import typingsSlinky.camljs.anon.Sum
import typingsSlinky.camljs.anon.Var
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.camljs.anon.Count
  - typingsSlinky.camljs.anon.Sum
  - typingsSlinky.camljs.anon.Avg
  - typingsSlinky.camljs.anon.Max
  - typingsSlinky.camljs.anon.Min
  - typingsSlinky.camljs.anon.Stdev
  - typingsSlinky.camljs.anon.Var
*/
trait Aggregation extends ViewField

object Aggregation {
  @scala.inline
  implicit def apply(value: Avg): Aggregation = value.asInstanceOf[Aggregation]
  @scala.inline
  implicit def apply(value: Count): Aggregation = value.asInstanceOf[Aggregation]
  @scala.inline
  implicit def apply(value: Max): Aggregation = value.asInstanceOf[Aggregation]
  @scala.inline
  implicit def apply(value: Min): Aggregation = value.asInstanceOf[Aggregation]
  @scala.inline
  implicit def apply(value: Stdev): Aggregation = value.asInstanceOf[Aggregation]
  @scala.inline
  implicit def apply(value: Sum): Aggregation = value.asInstanceOf[Aggregation]
  @scala.inline
  implicit def apply(value: Var): Aggregation = value.asInstanceOf[Aggregation]
}

