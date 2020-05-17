package typingsSlinky.immutabilityHelper.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.immutabilityHelper.anon.Add
import typingsSlinky.immutabilityHelper.anon.Remove
import typingsSlinky.immutabilityHelper.anon.SetV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.immutabilityHelper.anon.Add[K, V]
  - typingsSlinky.immutabilityHelper.anon.Remove[K]
  - org.scalablytyped.runtime.StringDictionary[typingsSlinky.immutabilityHelper.anon.SetV[V]]
*/
trait MapSpec[K, V]
  extends Spec[js.Any, js.Any]

object MapSpec {
  @scala.inline
  implicit def apply[K, V](value: Add[K, V]): MapSpec[K, V] = value.asInstanceOf[MapSpec[K, V]]
  @scala.inline
  implicit def apply[K, V](value: Remove[K]): MapSpec[K, V] = value.asInstanceOf[MapSpec[K, V]]
  @scala.inline
  implicit def apply[K, V](value: StringDictionary[SetV[V]]): MapSpec[K, V] = value.asInstanceOf[MapSpec[K, V]]
}

