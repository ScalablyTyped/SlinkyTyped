package typingsSlinky.awsCryptoIe11Detection.cryptoOperationMod

import org.scalajs.dom.raw.Event
import typingsSlinky.awsCryptoIe11Detection.keyMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoOperation extends js.Object {
  val algorithm: String = js.native
  val key: Key = js.native
  val result: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  def abort(): Unit = js.native
  def finish(): Unit = js.native
  def onabort(event: Event): Unit = js.native
  def oncomplete(event: Event): Unit = js.native
  def onerror(event: Event): Unit = js.native
  def onprogress(event: Event): Unit = js.native
  def process(buffer: js.typedarray.ArrayBufferView): Unit = js.native
}

object CryptoOperation {
  @scala.inline
  def apply(
    abort: () => Unit,
    algorithm: String,
    finish: () => Unit,
    key: Key,
    onabort: Event => Unit,
    oncomplete: Event => Unit,
    onerror: Event => Unit,
    onprogress: Event => Unit,
    process: js.typedarray.ArrayBufferView => Unit
  ): CryptoOperation = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), algorithm = algorithm.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), key = key.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort), oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror), onprogress = js.Any.fromFunction1(onprogress), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[CryptoOperation]
  }
  @scala.inline
  implicit class CryptoOperationOps[Self <: CryptoOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinish(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnabort(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOncomplete(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncomplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnerror(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnprogress(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProcess(value: js.typedarray.ArrayBufferView => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResult(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

