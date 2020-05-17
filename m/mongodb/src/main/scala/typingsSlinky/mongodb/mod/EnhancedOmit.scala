package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TypeScript Omit (Exclude to be specific) does not work for objects with an "any" indexed type
/* Rewritten from type alias, can be one of: 
  - // T has indexed type e.g. { _id: string; [k: string]: any; } or it is "any"
typingsSlinky.mongodb.mod.Omit[T, K]
  - T
*/
trait EnhancedOmit[T, K] extends js.Object

object EnhancedOmit {
  @scala.inline
  implicit def apply[T, K](value: // T has indexed type e.g. { _id: string; [k: string]: any; } or it is "any"
  Omit[T, K]): EnhancedOmit[T, K] = value.asInstanceOf[EnhancedOmit[T, K]]
  @scala.inline
  implicit def apply[T, K](value: T): EnhancedOmit[T, K] = value.asInstanceOf[EnhancedOmit[T, K]]
}

