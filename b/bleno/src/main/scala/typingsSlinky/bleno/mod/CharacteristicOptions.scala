package typingsSlinky.bleno.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacteristicOptions extends js.Object {
  var descriptors: js.UndefOr[js.Array[Descriptor] | Null] = js.native
  var onIndicate: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onNotify: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onReadRequest: js.UndefOr[
    (js.Function2[
      /* offset */ Double, 
      /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit], 
      Unit
    ]) | Null
  ] = js.native
  var onSubscribe: js.UndefOr[
    (js.Function2[/* maxValueSize */ Double, /* updateValueCallback */ js.Any, Unit]) | Null
  ] = js.native
  var onUnsubscribe: js.UndefOr[js.Function0[Unit] | Null] = js.native
  var onWriteRequest: js.UndefOr[
    (js.Function4[
      /* data */ Buffer, 
      /* offset */ Double, 
      /* withoutResponse */ Boolean, 
      /* callback */ js.Function1[/* result */ Double, Unit], 
      Unit
    ]) | Null
  ] = js.native
  var properties: js.UndefOr[js.Array[Property] | Null] = js.native
  var secure: js.UndefOr[js.Array[Property] | Null] = js.native
  var uuid: String = js.native
  var value: js.UndefOr[Buffer | Null] = js.native
}

object CharacteristicOptions {
  @scala.inline
  def apply(uuid: String): CharacteristicOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicOptions]
  }
  @scala.inline
  implicit class CharacteristicOptionsOps[Self <: CharacteristicOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptors(value: js.Array[Descriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(null)
        ret
    }
    @scala.inline
    def withOnIndicate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndicate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnIndicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndicate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIndicateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndicate")(null)
        ret
    }
    @scala.inline
    def withOnNotify(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotify")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotify")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNotifyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotify")(null)
        ret
    }
    @scala.inline
    def withOnReadRequest(
      value: (/* offset */ Double, /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReadRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReadRequestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadRequest")(null)
        ret
    }
    @scala.inline
    def withOnSubscribe(value: (/* maxValueSize */ Double, /* updateValueCallback */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubscribeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(null)
        ret
    }
    @scala.inline
    def withOnUnsubscribe(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsubscribe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnsubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsubscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnsubscribeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsubscribe")(null)
        ret
    }
    @scala.inline
    def withOnWriteRequest(
      value: (/* data */ Buffer, /* offset */ Double, /* withoutResponse */ Boolean, /* callback */ js.Function1[/* result */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWriteRequest")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnWriteRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWriteRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWriteRequestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWriteRequest")(null)
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertiesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(null)
        ret
    }
    @scala.inline
    def withSecure(value: js.Array[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(null)
        ret
    }
    @scala.inline
    def withValue(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

