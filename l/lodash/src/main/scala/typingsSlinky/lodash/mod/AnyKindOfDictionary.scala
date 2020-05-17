package typingsSlinky.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Crazy typedef needed get _.omit to work properly with Dictionary and NumericDictionary
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lodash.mod.Dictionary[js.UndefOr[js.Object | scala.Null]]
  - typingsSlinky.lodash.mod.NumericDictionary[js.UndefOr[js.Object | scala.Null]]
*/
trait AnyKindOfDictionary extends js.Object

object AnyKindOfDictionary {
  @scala.inline
  implicit def apply(value: Dictionary[js.UndefOr[js.Object | Null]]): AnyKindOfDictionary = value.asInstanceOf[AnyKindOfDictionary]
  @scala.inline
  implicit def apply(value: NumericDictionary[js.UndefOr[js.Object | Null]]): AnyKindOfDictionary = value.asInstanceOf[AnyKindOfDictionary]
}

