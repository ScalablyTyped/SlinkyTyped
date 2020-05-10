package typingsSlinky.extjs.Ext.draw

import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.dd.IDragSource
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ @js.native
trait ISprite extends IObservable {
  /** [Method] Adds one or more CSS classes to the element
  		* @param className String/String[] The CSS class to add, or an array of classes
  		* @returns Ext.draw.Sprite this
  		*/
  var addCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Performs custom animation on this object
  		* @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
  		* @returns Object this
  		*/
  var animate: js.UndefOr[js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])] = js.native
  /** [Property] (Ext.dd.DragSource) */
  var dd: js.UndefOr[IDragSource] = js.native
  /** [Method] Removes the sprite and clears all listeners  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var draggable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var fill: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var font: js.UndefOr[String] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Retrieves the bounding box of the sprite
  		* @returns Object bbox
  		*/
  var getBBox: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String/String[]) */
  var group: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  /** [Method] Hides the sprite
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Property] (Boolean) */
  var isSprite: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var opacity: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var path: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var radiusX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var radiusY: js.UndefOr[Double] = js.native
  /** [Method] Redraws the sprite
  		* @returns Ext.draw.Sprite this
  		*/
  var redraw: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Removes the sprite
  		* @returns Boolean True if sprite was successfully removed. False when there was no surface to remove it from.
  		*/
  var remove: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Removes one or more CSS classes from the element
  		* @param className String/String[] The CSS class to remove, or an array of classes. Note this method is severly limited in VML.
  		* @returns Ext.draw.Sprite this
  		*/
  var removeCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Change the attributes of the sprite
  		* @param attrs Object attributes to be changed on the sprite.
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var setAttributes: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.draw.Sprite this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], this.type]
  ] = js.native
  /** [Method] Shows the sprite
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Config Option] (String) */
  var src: js.UndefOr[String] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Config Option] (String) */
  var stroke: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var strokewidth: js.UndefOr[Double] = js.native
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.native
}

object ISprite {
  @scala.inline
  def apply(): ISprite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISprite]
  }
  @scala.inline
  implicit class ISpriteOps[Self <: ISprite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCls(value: /* className */ js.UndefOr[js.Any] => ISprite): Self = {
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
    def withDd(value: IDragSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(js.undefined)
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
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
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
    def withGroup(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
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
    def withHide(value: /* redraw */ js.UndefOr[Boolean] => ISprite): Self = {
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
    def withIsSprite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSprite")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusX")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusY")(js.undefined)
        ret
    }
    @scala.inline
    def withRedraw(value: () => ISprite): Self = {
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
    def withRemove(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCls(value: /* className */ js.UndefOr[js.Any] => ISprite): Self = {
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
    def withSetAttributes(value: (/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[Boolean]) => ISprite): Self = {
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
    def withSetStyle(value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => ISprite): Self = {
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
    def withShow(value: /* redraw */ js.UndefOr[Boolean] => ISprite): Self = {
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
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
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
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokewidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokewidth")(js.undefined)
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
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

