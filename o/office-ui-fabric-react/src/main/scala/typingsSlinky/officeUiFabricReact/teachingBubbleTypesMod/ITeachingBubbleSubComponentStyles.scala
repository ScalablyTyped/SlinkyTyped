package typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod

import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITeachingBubbleSubComponentStyles extends js.Object {
  /** Refers to the callout that hosts the TeachingBubble. */
  var callout: IStyleFunctionOrObject[_, _] = js.native
}

object ITeachingBubbleSubComponentStyles {
  @scala.inline
  def apply(callout: IStyleFunctionOrObject[_, _]): ITeachingBubbleSubComponentStyles = {
    val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleSubComponentStyles]
  }
  @scala.inline
  implicit class ITeachingBubbleSubComponentStylesOps[Self <: ITeachingBubbleSubComponentStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutFunction1(value: _ => Partial[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCallout(value: IStyleFunctionOrObject[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

