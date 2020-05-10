package typingsSlinky.braftEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HooksType extends js.Object {
  var `change-block-type`: js.UndefOr[HookFunc] = js.native
  var `deselect-medias`: js.UndefOr[HookFunc] = js.native
  var `exec-editor-command`: js.UndefOr[HookFunc] = js.native
  var `insert-emoji`: js.UndefOr[HookFunc] = js.native
  var `insert-medias`: js.UndefOr[HookFunc] = js.native
  var `open-braft-finder`: js.UndefOr[HookFunc] = js.native
  var `remove-medias`: js.UndefOr[HookFunc] = js.native
  var `select-files`: js.UndefOr[HookFunc] = js.native
  var `select-medias`: js.UndefOr[HookFunc] = js.native
  var `set-image-alignment`: js.UndefOr[HookFunc] = js.native
  var `set-image-float`: js.UndefOr[HookFunc] = js.native
  var `set-image-link`: js.UndefOr[HookFunc] = js.native
  var `set-image-link-target`: js.UndefOr[HookFunc] = js.native
  var `set-image-size`: js.UndefOr[HookFunc] = js.native
  var `toggle-font-family`: js.UndefOr[HookFunc] = js.native
  var `toggle-font-size`: js.UndefOr[HookFunc] = js.native
  var `toggle-inline-style`: js.UndefOr[HookFunc] = js.native
  var `toggle-letter-spacing`: js.UndefOr[HookFunc] = js.native
  var `toggle-line-height`: js.UndefOr[HookFunc] = js.native
  var `toggle-link`: js.UndefOr[HookFunc] = js.native
  var `toggle-text-alignment`: js.UndefOr[HookFunc] = js.native
  var `toggle-text-background-color`: js.UndefOr[HookFunc] = js.native
  var `toggle-text-color`: js.UndefOr[HookFunc] = js.native
}

object HooksType {
  @scala.inline
  def apply(): HooksType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HooksType]
  }
  @scala.inline
  implicit class HooksTypeOps[Self <: HooksType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withChange-block-type`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change-block-type")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutChange-block-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change-block-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withDeselect-medias`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect-medias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutDeselect-medias`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect-medias")(js.undefined)
        ret
    }
    @scala.inline
    def `withExec-editor-command`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec-editor-command")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutExec-editor-command`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec-editor-command")(js.undefined)
        ret
    }
    @scala.inline
    def `withInsert-emoji`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert-emoji")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutInsert-emoji`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert-emoji")(js.undefined)
        ret
    }
    @scala.inline
    def `withInsert-medias`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert-medias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutInsert-medias`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert-medias")(js.undefined)
        ret
    }
    @scala.inline
    def `withOpen-braft-finder`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open-braft-finder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutOpen-braft-finder`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open-braft-finder")(js.undefined)
        ret
    }
    @scala.inline
    def `withRemove-medias`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove-medias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutRemove-medias`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove-medias")(js.undefined)
        ret
    }
    @scala.inline
    def `withSelect-files`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select-files")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutSelect-files`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select-files")(js.undefined)
        ret
    }
    @scala.inline
    def `withSelect-medias`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select-medias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutSelect-medias`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select-medias")(js.undefined)
        ret
    }
    @scala.inline
    def `withSet-image-alignment`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-alignment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutSet-image-alignment`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-alignment")(js.undefined)
        ret
    }
    @scala.inline
    def `withSet-image-float`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-float")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutSet-image-float`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-float")(js.undefined)
        ret
    }
    @scala.inline
    def `withSet-image-link`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-link")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutSet-image-link`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-link")(js.undefined)
        ret
    }
    @scala.inline
    def `withSet-image-link-target`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-link-target")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutSet-image-link-target`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-link-target")(js.undefined)
        ret
    }
    @scala.inline
    def `withSet-image-size`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutSet-image-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set-image-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withToggle-font-family`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-font-family")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutToggle-font-family`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-font-family")(js.undefined)
        ret
    }
    @scala.inline
    def `withToggle-font-size`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-font-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutToggle-font-size`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-font-size")(js.undefined)
        ret
    }
    @scala.inline
    def `withToggle-inline-style`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-inline-style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutToggle-inline-style`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-inline-style")(js.undefined)
        ret
    }
    @scala.inline
    def `withToggle-letter-spacing`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-letter-spacing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutToggle-letter-spacing`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-letter-spacing")(js.undefined)
        ret
    }
    @scala.inline
    def `withToggle-line-height`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-line-height")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutToggle-line-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-line-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withToggle-link`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-link")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutToggle-link`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-link")(js.undefined)
        ret
    }
    @scala.inline
    def `withToggle-text-alignment`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-text-alignment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutToggle-text-alignment`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-text-alignment")(js.undefined)
        ret
    }
    @scala.inline
    def `withToggle-text-background-color`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-text-background-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutToggle-text-background-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-text-background-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withToggle-text-color`(value: /* any */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-text-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutToggle-text-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle-text-color")(js.undefined)
        ret
    }
  }
  
}

