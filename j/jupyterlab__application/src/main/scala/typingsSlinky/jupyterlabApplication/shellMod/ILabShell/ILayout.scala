package typingsSlinky.jupyterlabApplication.shellMod.ILabShell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of the application's user interface layout.
  */
@js.native
trait ILayout extends js.Object {
  /**
    * Indicates whether fetched session restore data was actually retrieved
    * from the state database or whether it is a fresh blank slate.
    *
    * #### Notes
    * This attribute is only relevant when the layout data is retrieved via a
    * `fetch` call. If it is set when being passed into `save`, it will be
    * ignored.
    */
  val fresh: js.UndefOr[Boolean] = js.native
  /**
    * The left area of the user interface.
    */
  val leftArea: ISideArea | Null = js.native
  /**
    * The main area of the user interface.
    */
  val mainArea: IMainArea | Null = js.native
  /**
    * The right area of the user interface.
    */
  val rightArea: ISideArea | Null = js.native
}

object ILayout {
  @scala.inline
  def apply(): ILayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayout]
  }
  @scala.inline
  implicit class ILayoutOps[Self <: ILayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fresh")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftArea(value: ISideArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftAreaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArea")(null)
        ret
    }
    @scala.inline
    def withMainArea(value: IMainArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainAreaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainArea")(null)
        ret
    }
    @scala.inline
    def withRightArea(value: ISideArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightAreaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightArea")(null)
        ret
    }
  }
  
}

