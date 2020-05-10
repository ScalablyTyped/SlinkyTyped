package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProtoElement extends IBase {
  /** [Method] Adds class to the element
  		* @param cls String One or more classnames separated with spaces.
  		* @returns Ext.util.ProtoElement this
  		*/
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], this.type]] = js.native
  /** [Property] (String) */
  var clsProp: js.UndefOr[String] = js.native
  /** [Method] Indicates that the current state of the object has been flushed to the DOM so we need to track any subsequent changes */
  var flush: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] True if the element has given class
  		* @param cls String
  		* @returns Boolean
  		*/
  var hasCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Removes class from the element
  		* @param cls String One or more classnames separated with spaces.
  		* @returns Ext.util.ProtoElement this
  		*/
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], this.type]] = js.native
  /** [Property] (String) */
  var removedProp: js.UndefOr[String] = js.native
  /** [Method] Adds styles to the element
  		* @param prop String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property.
  		* @returns Ext.util.ProtoElement this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* prop */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], this.type]
  ] = js.native
  /** [Property] (Boolean) */
  var styleIsText: js.UndefOr[Boolean] = js.native
  /** [Property] (String) */
  var styleProp: js.UndefOr[String] = js.native
  /** [Method] Writes style and class properties to given object
  		* @param to Object
  		* @returns Object to
  		*/
  var writeTo: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], _]] = js.native
}

object IProtoElement {
  @scala.inline
  def apply(): IProtoElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProtoElement]
  }
  @scala.inline
  implicit class IProtoElementOps[Self <: IProtoElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCls(value: /* cls */ js.UndefOr[String] => IProtoElement): Self = {
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
    def withClsProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clsProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClsProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clsProp")(js.undefined)
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
    def withHasCls(value: /* cls */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCls(value: /* cls */ js.UndefOr[String] => IProtoElement): Self = {
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
    def withRemovedProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovedProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedProp")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStyle(value: (/* prop */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => IProtoElement): Self = {
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
    def withStyleIsText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleIsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleIsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleIsText")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleProp")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteTo(value: /* to */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWriteTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTo")(js.undefined)
        ret
    }
  }
  
}

