package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBase extends IClass {
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  var callOverridden: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  var callParent: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  var callSuper: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  var getInitialConfig: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], _]] = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  var initConfig: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Property] (Ext.Class) */
  var self: js.UndefOr[IClass] = js.native
}

object IBase {
  @scala.inline
  def apply(): IBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBase]
  }
  @scala.inline
  implicit class IBaseOps[Self <: IBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallOverridden(value: /* args */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOverridden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallOverridden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOverridden")(js.undefined)
        ret
    }
    @scala.inline
    def withCallParent(value: /* args */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callParent")(js.undefined)
        ret
    }
    @scala.inline
    def withCallSuper(value: /* args */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSuper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallSuper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSuper")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInitialConfig(value: /* name */ js.UndefOr[java.lang.String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetInitialConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withInitConfig(value: /* config */ js.UndefOr[js.Any] => IBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSelf(value: IClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(js.undefined)
        ret
    }
  }
  
}

