package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents something that can be filtered using an {@link XSheetFilterDescriptor} .
  * @see com.sun.star.sheet.XSheetFilterableEx
  */
@js.native
trait XSheetFilterable extends XInterface {
  /**
    * creates a filter descriptor.
    * @param bEmpty if set to `TRUE` , creates an empty filter descriptor. If set to `FALSE` , fills the filter descriptor with previous settings of the curre
    */
  def createFilterDescriptor(bEmpty: Boolean): XSheetFilterDescriptor = js.native
  /**
    * performs a filter operation, using the settings of the passed filter descriptor.
    * @param xDescriptor the settings for the filter operation.
    */
  def filter(xDescriptor: XSheetFilterDescriptor): Unit = js.native
}

object XSheetFilterable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createFilterDescriptor: Boolean => XSheetFilterDescriptor,
    filter: XSheetFilterDescriptor => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetFilterable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createFilterDescriptor = js.Any.fromFunction1(createFilterDescriptor), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetFilterable]
  }
  @scala.inline
  implicit class XSheetFilterableOps[Self <: XSheetFilterable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFilterDescriptor(value: Boolean => XSheetFilterDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFilterDescriptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(value: XSheetFilterDescriptor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

