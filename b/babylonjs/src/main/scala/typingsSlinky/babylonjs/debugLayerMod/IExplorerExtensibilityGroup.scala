package typingsSlinky.babylonjs.debugLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExplorerExtensibilityGroup extends js.Object {
  /**
    * Gets the list of options added to a type
    */
  var entries: js.Array[IExplorerExtensibilityOption] = js.native
  /**
    * Defines a predicate to test if a given type mut be extended
    */
  def predicate(entity: js.Any): Boolean = js.native
}

object IExplorerExtensibilityGroup {
  @scala.inline
  def apply(entries: js.Array[IExplorerExtensibilityOption], predicate: js.Any => Boolean): IExplorerExtensibilityGroup = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
    __obj.asInstanceOf[IExplorerExtensibilityGroup]
  }
  @scala.inline
  implicit class IExplorerExtensibilityGroupOps[Self <: IExplorerExtensibilityGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[IExplorerExtensibilityOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredicate(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

