package typingsSlinky.bleno.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Characteristic extends js.Object {
  val RESULT_ATTR_NOT_LONG: Double = js.native
  val RESULT_INVALID_ATTRIBUTE_LENGTH: Double = js.native
  val RESULT_INVALID_OFFSET: Double = js.native
  val RESULT_SUCCESS: Double = js.native
  val RESULT_UNLIKELY_ERROR: Double = js.native
  var descriptors: js.Array[Descriptor] = js.native
  var properties: js.Array[Property] = js.native
  var secure: js.Array[Property] = js.native
  var uuid: String = js.native
  var value: Buffer | Null = js.native
  def onIndicate(): Unit = js.native
  def onNotify(): Unit = js.native
  def onReadRequest(offset: Double, callback: js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]): Unit = js.native
  def onSubscribe(maxValueSize: Double, updateValueCallback: js.Any): Unit = js.native
  def onUnsubscribe(): Unit = js.native
  def onWriteRequest(
    data: Buffer,
    offset: Double,
    withoutResponse: Boolean,
    callback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
}

object Characteristic {
  @scala.inline
  def apply(
    RESULT_ATTR_NOT_LONG: Double,
    RESULT_INVALID_ATTRIBUTE_LENGTH: Double,
    RESULT_INVALID_OFFSET: Double,
    RESULT_SUCCESS: Double,
    RESULT_UNLIKELY_ERROR: Double,
    descriptors: js.Array[Descriptor],
    onIndicate: () => Unit,
    onNotify: () => Unit,
    onReadRequest: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit,
    onSubscribe: (Double, js.Any) => Unit,
    onUnsubscribe: () => Unit,
    onWriteRequest: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Unit,
    properties: js.Array[Property],
    secure: js.Array[Property],
    uuid: String
  ): Characteristic = {
    val __obj = js.Dynamic.literal(RESULT_ATTR_NOT_LONG = RESULT_ATTR_NOT_LONG.asInstanceOf[js.Any], RESULT_INVALID_ATTRIBUTE_LENGTH = RESULT_INVALID_ATTRIBUTE_LENGTH.asInstanceOf[js.Any], RESULT_INVALID_OFFSET = RESULT_INVALID_OFFSET.asInstanceOf[js.Any], RESULT_SUCCESS = RESULT_SUCCESS.asInstanceOf[js.Any], RESULT_UNLIKELY_ERROR = RESULT_UNLIKELY_ERROR.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], onIndicate = js.Any.fromFunction0(onIndicate), onNotify = js.Any.fromFunction0(onNotify), onReadRequest = js.Any.fromFunction2(onReadRequest), onSubscribe = js.Any.fromFunction2(onSubscribe), onUnsubscribe = js.Any.fromFunction0(onUnsubscribe), onWriteRequest = js.Any.fromFunction4(onWriteRequest), properties = properties.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
  @scala.inline
  implicit class CharacteristicOps[Self <: Characteristic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRESULT_ATTR_NOT_LONG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESULT_ATTR_NOT_LONG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESULT_INVALID_ATTRIBUTE_LENGTH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESULT_INVALID_ATTRIBUTE_LENGTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESULT_INVALID_OFFSET(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESULT_INVALID_OFFSET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESULT_SUCCESS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESULT_SUCCESS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESULT_UNLIKELY_ERROR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESULT_UNLIKELY_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptors(value: js.Array[Descriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnIndicate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndicate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnNotify(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNotify")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnReadRequest(value: (Double, js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSubscribe(value: (Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnUnsubscribe(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsubscribe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnWriteRequest(value: (Buffer, Double, Boolean, js.Function1[/* result */ Double, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWriteRequest")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure(value: js.Array[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
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

