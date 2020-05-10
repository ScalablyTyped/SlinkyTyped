package typingsSlinky.extjs.Ext.state

import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProvider extends IObservable {
  /** [Method] Clears a value from the state
  		* @param name String The key name
  		*/
  var clear: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Decodes a string previously encoded with encodeValue
  		* @param value String The value to decode
  		* @returns Object The decoded value
  		*/
  var decodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], _]] = js.native
  /** [Method] Encodes a value including type information
  		* @param value Object The value to encode
  		* @returns String The encoded value
  		*/
  var encodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Returns the current value for a key
  		* @param name String The key name
  		* @param defaultValue Object A default value to return if the key's value is not found
  		* @returns Object The state data
  		*/
  var get: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* defaultValue */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Config Option] (String) */
  var prefix: js.UndefOr[String] = js.native
  /** [Method] Sets the value for a key
  		* @param name String The key name
  		* @param value Object The value to set
  		*/
  var set: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object IProvider {
  @scala.inline
  def apply(): IProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProvider]
  }
  @scala.inline
  implicit class IProviderOps[Self <: IProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: /* name */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodeValue(value: /* value */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDecodeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeValue(value: /* value */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: (/* name */ js.UndefOr[String], /* defaultValue */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
  }
  
}

