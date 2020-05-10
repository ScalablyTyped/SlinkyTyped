package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 29. */
@js.native
trait InterfaceDescriptor extends js.Object {
  /**
    * The interface alternate setting number.
    * @default 0
    */
  var alternateSetting: integer = js.native
  /** Description of the interface */
  var description: js.UndefOr[String] = js.native
  /** Available endpoints. */
  var endpoints: js.Array[EndpointDescriptor] = js.native
  /**
    * Extra descriptor data associated with this interface.
    * @since Chrome 39.
    */
  var extra_data: js.typedarray.ArrayBuffer = js.native
  /** The USB interface class. */
  var interfaceClass: integer = js.native
  /** The interface number */
  var interfaceNumber: integer = js.native
  /** The USB interface protocol. */
  var interfaceProtocol: integer = js.native
  /** The USB interface sub-class. */
  var interfaceSubclass: integer = js.native
}

object InterfaceDescriptor {
  @scala.inline
  def apply(
    alternateSetting: integer,
    endpoints: js.Array[EndpointDescriptor],
    extra_data: js.typedarray.ArrayBuffer,
    interfaceClass: integer,
    interfaceNumber: integer,
    interfaceProtocol: integer,
    interfaceSubclass: integer
  ): InterfaceDescriptor = {
    val __obj = js.Dynamic.literal(alternateSetting = alternateSetting.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], interfaceClass = interfaceClass.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any], interfaceProtocol = interfaceProtocol.asInstanceOf[js.Any], interfaceSubclass = interfaceSubclass.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDescriptor]
  }
  @scala.inline
  implicit class InterfaceDescriptorOps[Self <: InterfaceDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateSetting(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoints(value: js.Array[EndpointDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra_data(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceClass(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceNumber(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceProtocol(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaceSubclass(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceSubclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

