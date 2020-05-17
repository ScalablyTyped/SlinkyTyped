package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the basic operations for a tab controller model. */
@js.native
trait XTabControllerModel extends XInterface {
  /** returns the control models. */
  var ControlModels: SafeArray[XControlModel] = js.native
  /** returns whether the control models are grouped together. */
  var GroupControl: Boolean = js.native
  /** returns the number of control model groups. */
  val GroupCount: Double = js.native
  /** returns the control models. */
  def getControlModels(): SafeArray[XControlModel] = js.native
  /** returns a control model group. */
  def getGroup(nGroup: Double, Group: js.Array[SeqEquiv[XControlModel]], Name: js.Array[String]): Unit = js.native
  /** returns a control model group by name. */
  def getGroupByName(Name: String, Group: js.Array[SeqEquiv[XControlModel]]): Unit = js.native
  /** returns whether the control models are grouped together. */
  def getGroupControl(): Boolean = js.native
  /** returns the number of control model groups. */
  def getGroupCount(): Double = js.native
  /** sets the control models. */
  def setControlModels(Controls: SeqEquiv[XControlModel]): Unit = js.native
  /** sets a control model group. */
  def setGroup(Group: SeqEquiv[XControlModel], GroupName: String): Unit = js.native
  /** determines if the control models are grouped together. */
  def setGroupControl(GroupControl: Boolean): Unit = js.native
}

object XTabControllerModel {
  @scala.inline
  def apply(
    ControlModels: SafeArray[XControlModel],
    GroupControl: Boolean,
    GroupCount: Double,
    acquire: () => Unit,
    getControlModels: () => SafeArray[XControlModel],
    getGroup: (Double, js.Array[SeqEquiv[XControlModel]], js.Array[String]) => Unit,
    getGroupByName: (String, js.Array[SeqEquiv[XControlModel]]) => Unit,
    getGroupControl: () => Boolean,
    getGroupCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setControlModels: SeqEquiv[XControlModel] => Unit,
    setGroup: (SeqEquiv[XControlModel], String) => Unit,
    setGroupControl: Boolean => Unit
  ): XTabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels.asInstanceOf[js.Any], GroupControl = GroupControl.asInstanceOf[js.Any], GroupCount = GroupCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getControlModels = js.Any.fromFunction0(getControlModels), getGroup = js.Any.fromFunction3(getGroup), getGroupByName = js.Any.fromFunction2(getGroupByName), getGroupControl = js.Any.fromFunction0(getGroupControl), getGroupCount = js.Any.fromFunction0(getGroupCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControlModels = js.Any.fromFunction1(setControlModels), setGroup = js.Any.fromFunction2(setGroup), setGroupControl = js.Any.fromFunction1(setGroupControl))
    __obj.asInstanceOf[XTabControllerModel]
  }
  @scala.inline
  implicit class XTabControllerModelOps[Self <: XTabControllerModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlModels(value: SafeArray[XControlModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetControlModels(value: () => SafeArray[XControlModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControlModels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroup(value: (Double, js.Array[SeqEquiv[XControlModel]], js.Array[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroup")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetGroupByName(value: (String, js.Array[SeqEquiv[XControlModel]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupByName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetGroupControl(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroupCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetControlModels(value: SeqEquiv[XControlModel] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControlModels")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGroup(value: (SeqEquiv[XControlModel], String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetGroupControl(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupControl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

