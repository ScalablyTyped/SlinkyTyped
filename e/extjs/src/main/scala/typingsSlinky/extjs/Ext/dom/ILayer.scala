package typingsSlinky.extjs.Ext.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayer
  extends typingsSlinky.extjs.Ext.IElement {
  /** [Config Option] (String) */
  var cls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var dh: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var hideMode: js.UndefOr[String] = js.native
  /** [Method] overridden Element method
  		* @param x Object
  		* @param y Object
  		* @param width Object
  		* @param height Object
  		* @param animate Object
  		* @param duration Object
  		* @param callback Object
  		* @param easing Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setBounds")
  var setBounds_ILayer: js.UndefOr[
    js.Function8[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[js.Any], 
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      IElement
    ]
  ] = js.native
  /** [Method] overridden Element method
  		* @param h Object
  		* @param animate Object
  		* @param duration Object
  		* @param callback Object
  		* @param easing Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setHeight")
  var setHeight_ILayer: js.UndefOr[
    js.Function5[
      /* h */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      IElement
    ]
  ] = js.native
  /** [Method] Sets the element s left and top positions directly using CSS style Defined in override Ext dom Element_position
  		* @param left Object
  		* @param top Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setLeftTop")
  var setLeftTop_ILayer: js.UndefOr[
    js.Function2[/* left */ js.UndefOr[js.Any], /* top */ js.UndefOr[js.Any], IElement]
  ] = js.native
  /** [Method] overridden Element method
  		* @param left Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setLeft")
  var setLeft_ILayer: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] overridden Element method
  		* @param w Object
  		* @param h Object
  		* @param animate Object
  		* @param duration Object
  		* @param callback Object
  		* @param easing Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setSize")
  var setSize_ILayer: js.UndefOr[
    js.Function6[
      /* w */ js.UndefOr[js.Any], 
      /* h */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      IElement
    ]
  ] = js.native
  /** [Method] Sets the element s top position directly using CSS style instead of setY
  		* @param top Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setTop")
  var setTop_ILayer: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], IElement]] = js.native
  /** [Method] overridden Element method
  		* @param visible Object
  		* @param animate Object
  		* @param duration Object
  		* @param callback Object
  		* @param easing Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setVisible")
  var setVisible_ILayer: js.UndefOr[
    js.Function5[
      /* visible */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      IElement
    ]
  ] = js.native
  /** [Method] overridden Element method
  		* @param w Object
  		* @param animate Object
  		* @param duration Object
  		* @param callback Object
  		* @param easing Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setWidth")
  var setWidth_ILayer: js.UndefOr[
    js.Function5[
      /* w */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* duration */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[js.Any], 
      IElement
    ]
  ] = js.native
  /** [Method] Sets the z index of this layer and adjusts any shadow and shim z indexes
  		* @param zindex Number The new z-index to set
  		* @returns Ext.Layer The Layer
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[Double], this.type]] = js.native
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var shim: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var useDisplay: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var visibilityCls: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var zindex: js.UndefOr[Double] = js.native
}

object ILayer {
  @scala.inline
  def apply(): ILayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayer]
  }
  @scala.inline
  implicit class ILayerOps[Self <: ILayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(js.undefined)
        ret
    }
    @scala.inline
    def withDh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dh")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBounds(
      value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], /* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withoutSetBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(
      value: (/* h */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLeft(value: /* left */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLeftTop(value: (/* left */ js.UndefOr[js.Any], /* top */ js.UndefOr[js.Any]) => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeftTop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetLeftTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeftTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(
      value: (/* w */ js.UndefOr[js.Any], /* h */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTop(value: /* top */ js.UndefOr[js.Any] => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVisible(
      value: (/* visible */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSetVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(
      value: (/* w */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* duration */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* easing */ js.UndefOr[js.Any]) => IElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetZIndex(value: /* zindex */ js.UndefOr[Double] => ILayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withShim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shim")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibilityCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilityCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibilityCls")(js.undefined)
        ret
    }
    @scala.inline
    def withZindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(js.undefined)
        ret
    }
  }
  
}

