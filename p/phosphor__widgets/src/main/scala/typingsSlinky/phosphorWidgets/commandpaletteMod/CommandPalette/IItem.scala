package typingsSlinky.phosphorWidgets.commandpaletteMod.CommandPalette

import typingsSlinky.phosphorCommands.mod.CommandRegistry.Dataset
import typingsSlinky.phosphorCommands.mod.CommandRegistry.IKeyBinding
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents an item in a command palette.
  *
  * #### Notes
  * Item objects are created automatically by a command palette.
  */
@js.native
trait IItem extends js.Object {
  /**
    * The arguments for the command.
    */
  val args: ReadonlyJSONObject = js.native
  /**
    * The display caption for the command item.
    */
  val caption: String = js.native
  /**
    * The category for the command item.
    */
  val category: String = js.native
  /**
    * The extra class name for the command item.
    */
  val className: String = js.native
  /**
    * The command to execute when the item is triggered.
    */
  val command: String = js.native
  /**
    * The dataset for the command item.
    */
  val dataset: Dataset = js.native
  /**
    * The icon class for the command item.
    */
  val iconClass: String = js.native
  /**
    * The icon label for the command item.
    */
  val iconLabel: String = js.native
  /**
    * Whether the command item is enabled.
    */
  val isEnabled: Boolean = js.native
  /**
    * Whether the command item is toggled.
    */
  val isToggled: Boolean = js.native
  /**
    * Whether the command item is visible.
    */
  val isVisible: Boolean = js.native
  /**
    * The key binding for the command item.
    */
  val keyBinding: IKeyBinding | Null = js.native
  /**
    * The display label for the command item.
    */
  val label: String = js.native
  /**
    * The rank for the command item.
    */
  val rank: Double = js.native
}

object IItem {
  @scala.inline
  def apply(
    args: ReadonlyJSONObject,
    caption: String,
    category: String,
    className: String,
    command: String,
    dataset: Dataset,
    iconClass: String,
    iconLabel: String,
    isEnabled: Boolean,
    isToggled: Boolean,
    isVisible: Boolean,
    label: String,
    rank: Double
  ): IItem = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isToggled = isToggled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
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
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
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
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
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
  }
  
}

