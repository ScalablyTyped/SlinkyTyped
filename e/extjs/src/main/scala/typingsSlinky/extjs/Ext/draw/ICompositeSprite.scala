package typingsSlinky.extjs.Ext.draw

import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ @js.native
trait ICompositeSprite extends IMixedCollection {
  /** [Method] Adds class to all sprites
  		* @param cls String CSS class name
  		*/
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Performs custom animation on this object
  		* @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
  		* @returns Object this
  		*/
  var animate: js.UndefOr[js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])] = js.native
  /** [Method] Destroys this CompositeSprite  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the group bounding box
  		* @returns Object an object with x, y, width, and height properties.
  		*/
  var getBBox: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Hides all sprites
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.CompositeSprite this
  		*/
  var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Method] Inserts an item at the specified index in the collection
  		* @param index Object
  		* @param key Object
  		* @param o Object
  		* @returns Object The item inserted or an array of items inserted.
  		*/
  @JSName("insert")
  var insert_ICompositeSprite: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Force redraw of all sprites  */
  var redraw: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Removes class from all sprites
  		* @param cls String CSS class name
  		*/
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Iterates through all sprites calling setAttributes on each one
  		* @param attrs Object Attributes to be changed on the sprite.
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.CompositeSprite this
  		*/
  var setAttributes: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Sets style for all sprites
  		* @param style String CSS Style definition.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Shows all sprites
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.CompositeSprite this
  		*/
  var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.native
}

object ICompositeSprite {
  @scala.inline
  def apply(): ICompositeSprite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeSprite]
  }
  @scala.inline
  implicit class ICompositeSpriteOps[Self <: ICompositeSprite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCls(value: /* cls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCls")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateFunction1(value: /* config */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimate(value: js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
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
    def withGetActiveAnimation(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBBox(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.undefined)
        ret
    }
    @scala.inline
    def withHasActiveFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasActiveFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasActiveFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasActiveFx")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: /* redraw */ js.UndefOr[Boolean] => ICompositeSprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(
      value: (/* index */ js.UndefOr[js.Any], /* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withRedraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCls(value: /* cls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSequenceFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceFx")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributes(value: (/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean]) => ICompositeSprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStyle(value: /* style */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: /* redraw */ js.UndefOr[Boolean] => ICompositeSprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAnimation(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withStopFx(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopFx")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSyncFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFx")(js.undefined)
        ret
    }
  }
  
}

