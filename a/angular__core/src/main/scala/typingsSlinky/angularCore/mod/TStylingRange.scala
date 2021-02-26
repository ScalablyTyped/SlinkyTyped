package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a branded number which contains previous and next index.
  *
  * When we come across styling instructions we need to store the `TStylingKey` in the correct
  * order so that we can re-concatenate the styling value in the desired priority.
  *
  * The insertion can happen either at the:
  * - end of template as in the case of coming across additional styling instruction in the template
  * - in front of the template in the case of coming across additional instruction in the
  *   `hostBindings`.
  *
  * We use `TStylingRange` to store the previous and next index into the `TData` where the template
  * bindings can be found.
  *
  * - bit 0 is used to mark that the previous index has a duplicate for current value.
  * - bit 1 is used to mark that the next index has a duplicate for the current value.
  * - bits 2-16 are used to encode the next/tail of the template.
  * - bits 17-32 are used to encode the previous/head of template.
  *
  * NODE: *duplicate* false implies that it is statically known that this binding will not collide
  * with other bindings and therefore there is no need to check other bindings. For example the
  * bindings in `<div [style.color]="exp" [style.width]="exp">` will never collide and will have
  * their bits set accordingly. Previous duplicate means that we may need to check previous if the
  * current binding is `null`. Next duplicate means that we may need to check next bindings if the
  * current binding is not `null`.
  *
  * NOTE: `0` has special significance and represents `null` as in no additional pointer.
  */
@js.native
trait TStylingRange extends StObject {
  
  var __brand__ : typingsSlinky.angularCore.angularCoreStrings.TStylingRange = js.native
}
object TStylingRange {
  
  @scala.inline
  def apply(__brand__ : typingsSlinky.angularCore.angularCoreStrings.TStylingRange): TStylingRange = {
    val __obj = js.Dynamic.literal(__brand__ = __brand__.asInstanceOf[js.Any])
    __obj.asInstanceOf[TStylingRange]
  }
  
  @scala.inline
  implicit class TStylingRangeMutableBuilder[Self <: TStylingRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__brand__(value: typingsSlinky.angularCore.angularCoreStrings.TStylingRange): Self = StObject.set(x, "__brand__", value.asInstanceOf[js.Any])
  }
}
