package typingsSlinky.activexLibreoffice.com_.sun.star.form.binding

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a source of string list entries
  *
  * The interface supports foreign components which actively retrieve list entries, as well as components which want to passively being notified of
  * changes in the list.
  * @see XListEntrySink
  */
@js.native
trait XListEntrySource extends XInterface {
  /** provides access to the entirety of all list entries */
  val AllListEntries: SafeArray[String] = js.native
  /** retrieves the number of entries in the list */
  val ListEntryCount: Double = js.native
  /**
    * adds a listener which will be notified about changes in the list reflected by the component.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def addListEntryListener(Listener: XListEntryListener): Unit = js.native
  /** provides access to the entirety of all list entries */
  def getAllListEntries(): SafeArray[String] = js.native
  /**
    * provides access to a single list entry
    * @see getListEntryCount
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position does not denote a valid index in the list
    */
  def getListEntry(Position: Double): String = js.native
  /** retrieves the number of entries in the list */
  def getListEntryCount(): Double = js.native
  /**
    * revokes the given listener from the list of components which will be notified about changes in the entry list.
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def removeListEntryListener(Listener: XListEntryListener): Unit = js.native
}

object XListEntrySource {
  @scala.inline
  def apply(
    AllListEntries: SafeArray[String],
    ListEntryCount: Double,
    acquire: () => Unit,
    addListEntryListener: XListEntryListener => Unit,
    getAllListEntries: () => SafeArray[String],
    getListEntry: Double => String,
    getListEntryCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeListEntryListener: XListEntryListener => Unit
  ): XListEntrySource = {
    val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addListEntryListener = js.Any.fromFunction1(addListEntryListener), getAllListEntries = js.Any.fromFunction0(getAllListEntries), getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = js.Any.fromFunction0(getListEntryCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListEntryListener = js.Any.fromFunction1(removeListEntryListener))
    __obj.asInstanceOf[XListEntrySource]
  }
  @scala.inline
  implicit class XListEntrySourceOps[Self <: XListEntrySource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllListEntries(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllListEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListEntryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListEntryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddListEntryListener(value: XListEntryListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListEntryListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllListEntries(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllListEntries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetListEntry(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListEntry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetListEntryCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListEntryCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveListEntryListener(value: XListEntryListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListEntryListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

