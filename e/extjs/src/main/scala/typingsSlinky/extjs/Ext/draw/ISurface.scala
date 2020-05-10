package typingsSlinky.extjs.Ext.draw

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurface extends IObservable {
  /** [Method] Adds a Sprite to the surface
  		* @param args Ext.draw.Sprite[]/Ext.draw.Sprite... One or more Sprite objects or configs.
  		* @returns Ext.draw.Sprite[]/Ext.draw.Sprite The sprites added.
  		*/
  var add: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Adds one or more CSS classes to the element
  		* @param sprite Object The sprite to add the class to.
  		* @param className String/String[] The CSS class to add, or an array of classes
  		*/
  var addCls: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Adds a gradient definition to the Surface
  		* @param gradient Object A gradient config.
  		*/
  var addGradient: js.UndefOr[js.Function1[/* gradient */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Destroys the surface  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns a new group or an existent group associated with the current surface
  		* @param id String The unique identifier of the group.
  		* @returns Object The Ext.draw.CompositeSprite.
  		*/
  var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], _]] = js.native
  /** [Method] Retrieves the id of this component  */
  var getId: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  /** [Config Option] (Ext.draw.Sprite[]) */
  var items: js.UndefOr[Array] = js.native
  /** [Method] Removes a given sprite from the surface optionally destroying the sprite in the process
  		* @param sprite Ext.draw.Sprite
  		* @param destroySprite Boolean
  		*/
  var remove: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Removes all sprites from the surface optionally destroying the sprites in the process
  		* @param destroySprites Boolean Whether to destroy all sprites when removing them.
  		*/
  var removeAll: js.UndefOr[js.Function1[/* destroySprites */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Removes one or more CSS classes from the element
  		* @param sprite Object The sprite to remove the class from.
  		* @param className String/String[] The CSS class to remove, or an array of classes
  		*/
  var removeCls: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the size of the surface
  		* @param w Number The new width of the canvas.
  		* @param h Number The new height of the canvas.
  		*/
  var setSize: js.UndefOr[js.Function2[/* w */ js.UndefOr[Double], /* h */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets CSS style attributes to an element
  		* @param sprite Object The sprite to add, or an array of classes to
  		* @param styles Object An Object with CSS styles.
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Changes the text in the sprite element
  		* @param sprite Object The Sprite to change the text.
  		* @param text String The new text to be set.
  		*/
  var setText: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
}

object ISurface {
  @scala.inline
  def apply(): ISurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISurface]
  }
  @scala.inline
  implicit class ISurfaceOps[Self <: ISurface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* args */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAddCls(value: (/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCls")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCls")(js.undefined)
        ret
    }
    @scala.inline
    def withAddGradient(value: /* gradient */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addGradient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroup(value: /* id */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withGetId(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAll(value: /* destroySprites */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCls(value: (/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCls")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: (/* w */ js.UndefOr[Double], /* h */ js.UndefOr[Double]) => Unit): Self = {
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
    def withSetStyle(value: (/* sprite */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetText(value: (/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[String]) => Unit): Self = {
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

