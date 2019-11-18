package typingsSlinky.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterContentChecked extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed checking all of the directive's
    * content.
    */
  def ngAfterContentChecked(): Unit
}

object AfterContentChecked {
  @scala.inline
  def apply(ngAfterContentChecked: () => Unit): AfterContentChecked = {
    val __obj = js.Dynamic.literal(ngAfterContentChecked = js.Any.fromFunction0(ngAfterContentChecked))
  
    __obj.asInstanceOf[AfterContentChecked]
  }
}

