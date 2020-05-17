package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables creation of redlines (change tracking). */
@js.native
trait XRedline extends js.Object {
  /**
    * @param RedlineType  Valid type names are:    Insert - marks an insertion    Delete - marks an deletion    Format - marks an attribute change    {@link T
    * @param RedlineProperties contains the following parameters [readonly, property] string RedlineAuthor; [readonly, property] {@link com.sun.star.util.Date
    */
  def makeRedline(RedlineType: String, RedlineProperties: PropertyValues): Unit = js.native
}

object XRedline {
  @scala.inline
  def apply(makeRedline: (String, PropertyValues) => Unit): XRedline = {
    val __obj = js.Dynamic.literal(makeRedline = js.Any.fromFunction2(makeRedline))
    __obj.asInstanceOf[XRedline]
  }
  @scala.inline
  implicit class XRedlineOps[Self <: XRedline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMakeRedline(value: (String, PropertyValues) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeRedline")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

