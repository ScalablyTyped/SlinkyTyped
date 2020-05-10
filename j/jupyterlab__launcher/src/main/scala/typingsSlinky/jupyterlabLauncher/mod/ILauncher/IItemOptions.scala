package typingsSlinky.jupyterlabLauncher.mod.ILauncher

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a launcher item.
  */
@js.native
trait IItemOptions extends js.Object {
  /**
    * The arguments given to the command for
    * creating the launcher item.
    *
    * ### Notes
    * The launcher will also add the current working
    * directory of the filebrowser in the `cwd` field
    * of the args, which a command may use to create
    * the activity with respect to the right directory.
    */
  var args: js.UndefOr[ReadonlyJSONObject] = js.native
  /**
    * The category for the launcher item.
    *
    * The default value is the an empty string.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The command ID for the launcher item.
    *
    * #### Notes
    * If the command's `execute` method returns a `Widget` or
    * a promise that resolves with a `Widget`, then that widget will
    * replace the launcher in the same location of the application
    * shell. If the `execute` method does something else
    * (i.e., create a modal dialog), then the launcher will not be
    * disposed.
    */
  var command: String = js.native
  /**
    * For items that have a kernel associated with them, the URL of the kernel
    * icon.
    *
    * This is not a CSS class, but the URL that points to the icon in the kernel
    * spec.
    */
  var kernelIconUrl: js.UndefOr[String] = js.native
  /**
    * The rank for the launcher item.
    *
    * The rank is used when ordering launcher items for display. After grouping
    * into categories, items are sorted in the following order:
    *   1. Rank (lower is better)
    *   3. Display Name (locale order)
    *
    * The default rank is `Infinity`.
    */
  var rank: js.UndefOr[Double] = js.native
}

object IItemOptions {
  @scala.inline
  def apply(command: String): IItemOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemOptions]
  }
  @scala.inline
  implicit class IItemOptionsOps[Self <: IItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelIconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
  }
  
}

