package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.util.IHashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractManager extends IBase {
  /** [Property] (Ext.util.HashMap) */
  var all: js.UndefOr[IHashMap] = js.native
  /** [Method] Creates and returns an instance of whatever this manager manages based on the supplied type and config object
  		* @param config Object The config object
  		* @param defaultType String If no type is discovered in the config object, we fall back to this type
  		* @returns Object The instance of whatever this manager is managing
  		*/
  var create: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String], _]
  ] = js.native
  /** [Method] Executes the specified function once for each item in the collection
  		* @param fn Function The function to execute.
  		* @param scope Object The scope to execute in. Defaults to this.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns an item by id
  		* @param id String The id of the item
  		* @returns Object The item, undefined if not found.
  		*/
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.native
  /** [Method] Gets the number of items in the collection
  		* @returns Number The number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Checks if an item type is registered
  		* @param type String The mnemonic string by which the class may be looked up
  		* @returns Boolean Whether the type is registered.
  		*/
  var isRegistered: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], Boolean]] = js.native
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
  		* @param id String The item id
  		* @param fn Function The callback function. Called with a single parameter, the item.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
  		*/
  var onAvailable: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Registers an item to be managed
  		* @param item Object The item to register
  		*/
  var register: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Registers a new item constructor keyed by a type key
  		* @param type String The mnemonic string by which the class may be looked up.
  		* @param cls Function The new instance class.
  		*/
  var registerType: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Unregisters an item by removing it from this manager
  		* @param item Object The item to unregister
  		*/
  var unregister: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstractManager {
  @scala.inline
  def apply(): IAbstractManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractManager]
  }
  @scala.inline
  implicit class IAbstractManagerOps[Self <: IAbstractManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: IHashMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: (/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: /* id */ js.UndefOr[java.lang.String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRegistered(value: /* type */ js.UndefOr[java.lang.String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegistered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsRegistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRegistered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAvailable(
      value: (/* id */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAvailable")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: /* item */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterType(value: (/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRegisterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerType")(js.undefined)
        ret
    }
    @scala.inline
    def withUnregister(value: /* item */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnregister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unregister")(js.undefined)
        ret
    }
  }
  
}

