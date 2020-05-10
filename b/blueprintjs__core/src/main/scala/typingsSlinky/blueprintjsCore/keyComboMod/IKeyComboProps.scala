package typingsSlinky.blueprintjsCore.keyComboMod

import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyComboProps extends IProps {
  /** The key combo to display, such as `"cmd + s"`. */
  var combo: String = js.native
  /**
    * Whether to render in a minimal style.
    * If `false`, each key in the combo will be rendered inside a `<kbd>` tag.
    * If `true`, only the icon or short name of a key will be rendered with no wrapper styles.
    * @default false
    */
  var minimal: js.UndefOr[Boolean] = js.native
}

object IKeyComboProps {
  @scala.inline
  def apply(combo: String): IKeyComboProps = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyComboProps]
  }
  @scala.inline
  implicit class IKeyComboPropsOps[Self <: IKeyComboProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCombo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(js.undefined)
        ret
    }
  }
  
}

