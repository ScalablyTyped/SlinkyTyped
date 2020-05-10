package typingsSlinky.extjs.Ext.draw.engine

import typingsSlinky.extjs.Ext.draw.ISprite
import typingsSlinky.extjs.Ext.draw.ISurface
import typingsSlinky.extjs.Ext.util.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISvg extends ISurface {
  /** [Method] Insert or move a given sprite s element to the correct place in the DOM list for its zIndex
  		* @param sprite Ext.draw.Sprite
  		*/
  var applyZIndex: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
  /** [Method] Get the region for the surface s canvas area
  		* @returns Ext.util.Region
  		*/
  var getRegion: js.UndefOr[js.Function0[IRegion]] = js.native
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param sprite Ext.draw.Sprite The sprite to look into.
  		* @param className String The CSS class to check for
  		* @returns Boolean True if the class exists, else false
  		*/
  var hasCls: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* className */ js.UndefOr[String], Boolean]
  ] = js.native
  /** [Method] Sets the size of the surface
  		* @param width Object
  		* @param height Object
  		*/
  @JSName("setSize")
  var setSize_ISvg: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Changes the text in the sprite element
  		* @param sprite Object
  		* @param textString Object
  		*/
  @JSName("setText")
  var setText_ISvg: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* textString */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object ISvg {
  @scala.inline
  def apply(): ISvg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISvg]
  }
  @scala.inline
  implicit class ISvgOps[Self <: ISvg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyZIndex(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyZIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRegion(value: () => IRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCls(value: (/* sprite */ js.UndefOr[ISprite], /* className */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCls")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHasCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetText(value: (/* sprite */ js.UndefOr[js.Any], /* textString */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.undefined)
        ret
    }
  }
  
}

