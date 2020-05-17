package typingsSlinky.minecraftScriptingTypesClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Absorbsinput extends js.Object {
  /**
    * If true, input will not be passed down to any other screens underneath
    */
  var absorbs_input: js.UndefOr[Boolean] = js.native
  /**
    * If true, the screen will always accept and process input for as long as it is in the stack, even if other custom UI screens appear on top of it
    */
  var always_accepts_input: js.UndefOr[Boolean] = js.native
  /**
    * If true, this screen will be rendered even if another screen is on top of it and will render over them, including the HUD
    */
  var force_render_below: js.UndefOr[Boolean] = js.native
  /**
    * If true, the screen will be treated as the pause menu and the pause menu won't be allowed to show on top of this screen
    */
  var is_showing_menu: js.UndefOr[Boolean] = js.native
  /**
    * If true, the game will continue to be rendered underneath this screen
    */
  var render_game_behind: js.UndefOr[Boolean] = js.native
  /**
    * If true, this screen will only be rendered if it is the screen at the top of the stack
    */
  var render_only_when_topmost: js.UndefOr[Boolean] = js.native
  /**
    * If true, the screen will capture the mouse pointer and limit its movement to the UI screen
    */
  var should_steal_mouse: js.UndefOr[Boolean] = js.native
}

object Absorbsinput {
  @scala.inline
  def apply(): Absorbsinput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Absorbsinput]
  }
  @scala.inline
  implicit class AbsorbsinputOps[Self <: Absorbsinput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsorbs_input(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absorbs_input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsorbs_input: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absorbs_input")(js.undefined)
        ret
    }
    @scala.inline
    def withAlways_accepts_input(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always_accepts_input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlways_accepts_input: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always_accepts_input")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_render_below(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_render_below")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_render_below: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_render_below")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_showing_menu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_showing_menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_showing_menu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_showing_menu")(js.undefined)
        ret
    }
    @scala.inline
    def withRender_game_behind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_game_behind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender_game_behind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_game_behind")(js.undefined)
        ret
    }
    @scala.inline
    def withRender_only_when_topmost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_only_when_topmost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender_only_when_topmost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_only_when_topmost")(js.undefined)
        ret
    }
    @scala.inline
    def withShould_steal_mouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_steal_mouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShould_steal_mouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_steal_mouse")(js.undefined)
        ret
    }
  }
  
}

