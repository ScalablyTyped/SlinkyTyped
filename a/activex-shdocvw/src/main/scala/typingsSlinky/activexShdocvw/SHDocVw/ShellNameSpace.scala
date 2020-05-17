package typingsSlinky.activexShdocvw.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellNameSpace extends js.Object {
  var Columns: String = js.native
  /** number of view types */
  val CountViewTypes: Double = js.native
  var Depth: Double = js.native
  /** options  */
  var EnumOptions: Double = js.native
  var Flags: Double = js.native
  var Mode: Double = js.native
  /** get the root item */
  var Root: js.Any = js.native
  @JSName("SHDocVw.ShellNameSpace_typekey")
  var SHDocVwDotShellNameSpace_typekey: ShellNameSpace = js.native
  /** get the selected item */
  var SelectedItem: js.Any = js.native
  /** Query to see if subscriptions are enabled */
  val SubscriptionsEnabled: Boolean = js.native
  var TVFlags: Double = js.native
  /** method CreateSubscriptionForSelection */
  def CreateSubscriptionForSelection(): Boolean = js.native
  /** method DeleteSubscriptionForSelection */
  def DeleteSubscriptionForSelection(): Boolean = js.native
  /** expands item specified depth */
  def Expand(var_0: js.Any, iDepth: Double): Unit = js.native
  /** method Export */
  def Export(): Unit = js.native
  /** method Import */
  def Import(): Unit = js.native
  /** method InvokeContextMenuCommand */
  def InvokeContextMenuCommand(strCommand: String): Unit = js.native
  /** method MoveSelectionDown */
  def MoveSelectionDown(): Unit = js.native
  /** method MoveSelectionTo */
  def MoveSelectionTo(): Unit = js.native
  /** method MoveSelectionUp */
  def MoveSelectionUp(): Unit = js.native
  /** method NewFolder */
  def NewFolder(): Unit = js.native
  /** method ResetSort */
  def ResetSort(): Unit = js.native
  /** collection of selected items */
  def SelectedItems(): js.Any = js.native
  /** old, use put_Root() instead */
  def SetRoot(bstrFullPath: String): Unit = js.native
  /** set view type */
  def SetViewType(iType: Double): Unit = js.native
  /** method Synchronize */
  def Synchronize(): Unit = js.native
  /** unselects all items */
  def UnselectAll(): Unit = js.native
}

object ShellNameSpace {
  @scala.inline
  def apply(
    Columns: String,
    CountViewTypes: Double,
    CreateSubscriptionForSelection: () => Boolean,
    DeleteSubscriptionForSelection: () => Boolean,
    Depth: Double,
    EnumOptions: Double,
    Expand: (js.Any, Double) => Unit,
    Export: () => Unit,
    Flags: Double,
    Import: () => Unit,
    InvokeContextMenuCommand: String => Unit,
    Mode: Double,
    MoveSelectionDown: () => Unit,
    MoveSelectionTo: () => Unit,
    MoveSelectionUp: () => Unit,
    NewFolder: () => Unit,
    ResetSort: () => Unit,
    Root: js.Any,
    SHDocVwDotShellNameSpace_typekey: ShellNameSpace,
    SelectedItem: js.Any,
    SelectedItems: () => js.Any,
    SetRoot: String => Unit,
    SetViewType: Double => Unit,
    SubscriptionsEnabled: Boolean,
    Synchronize: () => Unit,
    TVFlags: Double,
    UnselectAll: () => Unit
  ): ShellNameSpace = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], CountViewTypes = CountViewTypes.asInstanceOf[js.Any], CreateSubscriptionForSelection = js.Any.fromFunction0(CreateSubscriptionForSelection), DeleteSubscriptionForSelection = js.Any.fromFunction0(DeleteSubscriptionForSelection), Depth = Depth.asInstanceOf[js.Any], EnumOptions = EnumOptions.asInstanceOf[js.Any], Expand = js.Any.fromFunction2(Expand), Export = js.Any.fromFunction0(Export), Flags = Flags.asInstanceOf[js.Any], Import = js.Any.fromFunction0(Import), InvokeContextMenuCommand = js.Any.fromFunction1(InvokeContextMenuCommand), Mode = Mode.asInstanceOf[js.Any], MoveSelectionDown = js.Any.fromFunction0(MoveSelectionDown), MoveSelectionTo = js.Any.fromFunction0(MoveSelectionTo), MoveSelectionUp = js.Any.fromFunction0(MoveSelectionUp), NewFolder = js.Any.fromFunction0(NewFolder), ResetSort = js.Any.fromFunction0(ResetSort), Root = Root.asInstanceOf[js.Any], SelectedItem = SelectedItem.asInstanceOf[js.Any], SelectedItems = js.Any.fromFunction0(SelectedItems), SetRoot = js.Any.fromFunction1(SetRoot), SetViewType = js.Any.fromFunction1(SetViewType), SubscriptionsEnabled = SubscriptionsEnabled.asInstanceOf[js.Any], Synchronize = js.Any.fromFunction0(Synchronize), TVFlags = TVFlags.asInstanceOf[js.Any], UnselectAll = js.Any.fromFunction0(UnselectAll))
    __obj.updateDynamic("SHDocVw.ShellNameSpace_typekey")(SHDocVwDotShellNameSpace_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellNameSpace]
  }
  @scala.inline
  implicit class ShellNameSpaceOps[Self <: ShellNameSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountViewTypes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountViewTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateSubscriptionForSelection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateSubscriptionForSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteSubscriptionForSelection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteSubscriptionForSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnumOptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnumOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: (js.Any, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Export")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Import")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvokeContextMenuCommand(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvokeContextMenuCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveSelectionDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveSelectionDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveSelectionTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveSelectionTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveSelectionUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveSelectionUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewFolder(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewFolder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetSort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetSort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHDocVwDotShellNameSpace_typekey(value: ShellNameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHDocVw.ShellNameSpace_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItems(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetRoot(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetViewType(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetViewType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscriptionsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSynchronize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Synchronize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTVFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TVFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnselectAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnselectAll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

