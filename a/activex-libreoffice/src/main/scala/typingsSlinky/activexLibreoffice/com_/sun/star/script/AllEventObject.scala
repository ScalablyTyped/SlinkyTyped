package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is a wrapper for an original event in a forwarding event.
  *
  * Usually the original event is the first argument in the array of arguments.
  */
@js.native
trait AllEventObject extends EventObject {
  /** The arguments of the original method. */
  var Arguments: SafeArray[_] = js.native
  /**
    * A helper value for the implementation that can be used arbitrarily.
    *
    * This field reflects the third parameter of the method {@link XAllListenerAdapterService.createAllListerAdapter()} .
    */
  var Helper: js.Any = js.native
  /** contains the type of the original listener. */
  var ListenerType: `type` = js.native
  /** The original method name on which the event was fired. */
  var MethodName: String = js.native
}

object AllEventObject {
  @scala.inline
  def apply(
    Arguments: SafeArray[_],
    Helper: js.Any,
    ListenerType: `type`,
    MethodName: String,
    Source: XInterface
  ): AllEventObject = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Helper = Helper.asInstanceOf[js.Any], ListenerType = ListenerType.asInstanceOf[js.Any], MethodName = MethodName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllEventObject]
  }
  @scala.inline
  implicit class AllEventObjectOps[Self <: AllEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: SafeArray[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelper(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Helper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenerType(value: `type`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListenerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MethodName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

