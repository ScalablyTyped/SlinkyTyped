package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextItem extends IBase {
  /** [Method] Queue the addition of a class name or array of class names to this ContextItem s target when next flushed
  		* @param newCls Object
  		*/
  var addCls: js.UndefOr[js.Function1[/* newCls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Registers a layout in the block list for the given property
  		* @param layout Ext.layout.Layout
  		* @param propName String The property name that blocked the layout (e.g., 'width').
  		*/
  var block: js.UndefOr[
    js.Function2[/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] clears the margin cache so that marginInfo get re read from the dom on the next call to getMarginInfo  This is neede  */
  var clearMarginCache: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Registers a layout in the DOM block list for the given property
  		* @param layout Ext.layout.Layout
  		* @param propName String The property name that blocked the layout (e.g., 'width').
  		*/
  var domBlock: js.UndefOr[
    js.Function2[/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Flushes any updates in the dirty collection to the DOM  */
  var flush: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the border information for the element as an object with left top right and bottom properties holding border s
  		* @returns Object
  		*/
  var getBorderInfo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns a ClassList like object to buffer access to this item s element s classes  */
  var getClassList: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets a property of this object if it is correct in the DOM
  		* @param propName String The property name (e.g., 'width').
  		* @returns Object The property value or undefined if not yet set or is dirty.
  		*/
  var getDomProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns the context item for an owned element
  		* @param nameOrEl String/Ext.dom.Element The element or the name of an owned element
  		* @param owner Ext.layout.container.Container/Ext.Component The owner of the named element if the passed "nameOrEl" parameter is a String. Defaults to this ContextItem's "target" property. For more details on owned elements see childEls and renderSelectors
  		* @returns Ext.layout.ContextItem
  		*/
  var getEl: js.UndefOr[
    js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Gets the frame information for the element as an object with left top right and bottom properties holding border
  		* @returns Object
  		*/
  var getFrameInfo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the margin information for the element as an object with left top right and bottom properties holding margin s
  		* @returns Object
  		*/
  var getMarginInfo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the padding information for the element as an object with left top right and bottom properties holding padding
  		* @returns Object
  		*/
  var getPaddingInfo: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets a property of this object
  		* @param propName String The property name that blocked the layout (e.g., 'width').
  		* @returns Object The property value or undefined if not yet set.
  		*/
  var getProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns a style for this item
  		* @param styleName String The CSS style name.
  		* @returns Object The value of the DOM style (parsed as necessary).
  		*/
  var getStyle: js.UndefOr[js.Function1[/* styleName */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns styles for this item
  		* @param styleNames String[] The CSS style names.
  		* @param altNames String[] The alternate names for the returned styles. If given, these names must correspond one-for-one to the styleNames.
  		* @returns Object The values of the DOM styles (parsed as necessary).
  		*/
  var getStyles: js.UndefOr[
    js.Function2[/* styleNames */ js.UndefOr[Array], /* altNames */ js.UndefOr[Array], _]
  ] = js.native
  /** [Method] Returns true if the given property is correct in the DOM
  		* @param propName String The property name (e.g., 'width').
  		* @returns Boolean
  		*/
  var hasDomProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Returns true if the given property has been set
  		* @param propName String The property name (e.g., 'width').
  		* @returns Boolean
  		*/
  var hasProp: js.UndefOr[js.Function1[/* propName */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Invalidates the component associated with this item
  		* @param options Object An object describing how to handle the invalidation.
  		*/
  var invalidate: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Recovers a property value from the last computation and restores its value and dirty state
  		* @param propName String The name of the property to recover.
  		* @param oldProps Object The old "props" object from which to recover values.
  		* @param oldDirty Object The old "dirty" object from which to recover state.
  		*/
  var recoverProp: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[String], 
      /* oldProps */ js.UndefOr[js.Any], 
      /* oldDirty */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Queue the removal of a class name or array of class names from this ContextItem s target when next flushed
  		* @param removeCls Object
  		*/
  var removeCls: js.UndefOr[js.Function1[/* removeCls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes a cached ContextItem that was created using getEl
  		* @param nameOrEl String/Ext.dom.Element The element or the name of an owned element
  		* @param owner Ext.layout.container.Container/Ext.Component The owner of the named element if the passed "nameOrEl" parameter is a String. Defaults to this ContextItem's "target" property.
  		*/
  var removeEl: js.UndefOr[
    js.Function2[/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Queue the setting of a DOM attribute on this ContextItem s target when next flushed
  		* @param name Object
  		* @param value Object
  		*/
  var setAttribute: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the contentHeight property
  		* @param height Object
  		* @param measured Object
  		*/
  var setContentHeight: js.UndefOr[
    js.Function2[/* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the contentWidth and contentHeight properties
  		* @param width Object
  		* @param height Object
  		* @param measured Object
  		*/
  var setContentSize: js.UndefOr[
    js.Function3[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* measured */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the contentWidth property
  		* @param width Object
  		* @param measured Object
  		*/
  var setContentWidth: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the height and constrains the height to min maxHeight range
  		* @param height Number The height.
  		* @param dirty Boolean Specifies if the value is currently in the DOM. A value of false indicates that the value is already in the DOM.
  		* @returns Number The actual height after constraining.
  		*/
  var setHeight: js.UndefOr[
    js.Function2[/* height */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean], Double]
  ] = js.native
  /** [Method] Sets a property value
  		* @param propName String The property name (e.g., 'width').
  		* @param value Object The new value of the property.
  		* @param dirty Boolean Optionally specifies if the value is currently in the DOM (default is true which indicates the value is not in the DOM and must be flushed at some point).
  		* @returns Number 1 if this call specified the property value, 0 if not.
  		*/
  var setProp: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* dirty */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  /** [Method] Sets the height and constrains the width to min maxWidth range
  		* @param width Number The width.
  		* @param dirty Boolean Specifies if the value is currently in the DOM. A value of false indicates that the value is already in the DOM.
  		* @returns Number The actual width after constraining.
  		*/
  var setWidth: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean], Double]
  ] = js.native
  /** [Property] (Object) */
  var state: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var wrapsComponent: js.UndefOr[Boolean] = js.native
}

object IContextItem {
  @scala.inline
  def apply(): IContextItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextItem]
  }
  @scala.inline
  implicit class IContextItemOps[Self <: IContextItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCls(value: /* newCls */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withBlock(value: (/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withClearMarginCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMarginCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearMarginCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearMarginCache")(js.undefined)
        ret
    }
    @scala.inline
    def withDomBlock(value: (/* layout */ js.UndefOr[ILayout], /* propName */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domBlock")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDomBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBorderInfo(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBorderInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBorderInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBorderInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClassList(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetClassList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassList")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDomProp(value: /* propName */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDomProp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDomProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDomProp")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEl(value: (/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any]) => IContextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFrameInfo(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrameInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFrameInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrameInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMarginInfo(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarginInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMarginInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarginInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPaddingInfo(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPaddingInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPaddingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPaddingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProp(value: /* propName */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProp")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyle(value: /* styleName */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyles(value: (/* styleNames */ js.UndefOr[Array], /* altNames */ js.UndefOr[Array]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyles")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDomProp(value: /* propName */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDomProp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasDomProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDomProp")(js.undefined)
        ret
    }
    @scala.inline
    def withHasProp(value: /* propName */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasProp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasProp")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidate(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInvalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.undefined)
        ret
    }
    @scala.inline
    def withRecoverProp(
      value: (/* propName */ js.UndefOr[String], /* oldProps */ js.UndefOr[js.Any], /* oldDirty */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoverProp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRecoverProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoverProp")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCls(value: /* removeCls */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withRemoveEl(value: (/* nameOrEl */ js.UndefOr[js.Any], /* owner */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttribute(value: (/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withSetContentHeight(value: (/* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentHeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetContentHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetContentSize(
      value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentSize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetContentSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetContentWidth(value: (/* width */ js.UndefOr[js.Any], /* measured */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentWidth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetContentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: (/* height */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProp(
      value: (/* propName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* dirty */ js.UndefOr[Boolean]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProp")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(value: (/* width */ js.UndefOr[Double], /* dirty */ js.UndefOr[Boolean]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapsComponent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapsComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapsComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapsComponent")(js.undefined)
        ret
    }
  }
  
}

