package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewZoneChangeAccessor extends js.Object {
  /**
    * Create a new view zone.
    * @param zone Zone to create
    * @return A unique identifier to the view zone.
    */
  def addZone(zone: IViewZone): String = js.native
  /**
    * Change a zone's position.
    * The editor will rescan the `afterLineNumber` and `afterColumn` properties of a view zone.
    */
  def layoutZone(id: String): Unit = js.native
  /**
    * Remove a zone
    * @param id A unique identifier to the view zone, as returned by the `addZone` call.
    */
  def removeZone(id: String): Unit = js.native
}

object IViewZoneChangeAccessor {
  @scala.inline
  def apply(addZone: IViewZone => String, layoutZone: String => Unit, removeZone: String => Unit): IViewZoneChangeAccessor = {
    val __obj = js.Dynamic.literal(addZone = js.Any.fromFunction1(addZone), layoutZone = js.Any.fromFunction1(layoutZone), removeZone = js.Any.fromFunction1(removeZone))
    __obj.asInstanceOf[IViewZoneChangeAccessor]
  }
  @scala.inline
  implicit class IViewZoneChangeAccessorOps[Self <: IViewZoneChangeAccessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddZone(value: IViewZone => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addZone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLayoutZone(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutZone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveZone(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeZone")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

