package typingsSlinky.phosphorWidgets.menuMod.Menu

import typingsSlinky.phosphorCommands.mod.CommandRegistry.Dataset
import typingsSlinky.phosphorCommands.mod.CommandRegistry.IKeyBinding
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents a menu item.
  *
  * #### Notes
  * Item objects are created automatically by a menu.
  */
@js.native
trait IItem extends js.Object {
  /**
    * The arguments for the command.
    */
  val args: ReadonlyJSONObject = js.native
  /**
    * The display caption for the menu item.
    */
  val caption: String = js.native
  /**
    * The extra class name for the menu item.
    */
  val className: String = js.native
  /**
    * The command to execute when the item is triggered.
    */
  val command: String = js.native
  /**
    * The dataset for the menu item.
    */
  val dataset: Dataset = js.native
  /**
    * @deprecated Use `iconClass` instead.
    */
  val icon: String = js.native
  /**
    * The icon class for the menu item.
    */
  val iconClass: String = js.native
  /**
    * The icon label for the menu item.
    */
  val iconLabel: String = js.native
  /**
    * Whether the menu item is enabled.
    */
  val isEnabled: Boolean = js.native
  /**
    * Whether the menu item is toggled.
    */
  val isToggled: Boolean = js.native
  /**
    * Whether the menu item is visible.
    */
  val isVisible: Boolean = js.native
  /**
    * The key binding for the menu item.
    */
  val keyBinding: IKeyBinding | Null = js.native
  /**
    * The display label for the menu item.
    */
  val label: String = js.native
  /**
    * The mnemonic index for the menu item.
    */
  val mnemonic: Double = js.native
  /**
    * The submenu for a `'submenu'` type item.
    */
  val submenu: typingsSlinky.phosphorWidgets.menuMod.Menu | Null = js.native
  /**
    * The type of the menu item.
    */
  val `type`: ItemType = js.native
}

object IItem {
  @scala.inline
  def apply(
    args: ReadonlyJSONObject,
    caption: String,
    className: String,
    command: String,
    dataset: Dataset,
    icon: String,
    iconClass: String,
    iconLabel: String,
    isEnabled: Boolean,
    isToggled: Boolean,
    isVisible: Boolean,
    label: String,
    mnemonic: Double,
    `type`: ItemType
  ): IItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isToggled = isToggled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem]
  }
  @scala.inline
  implicit class IItemOps[Self <: IItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataset(value: Dataset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsToggled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToggled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMnemonic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mnemonic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyBinding(value: IKeyBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyBindingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBinding")(null)
        ret
    }
    @scala.inline
    def withSubmenu(value: typingsSlinky.phosphorWidgets.menuMod.Menu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmenuNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(null)
        ret
    }
  }
  
}

