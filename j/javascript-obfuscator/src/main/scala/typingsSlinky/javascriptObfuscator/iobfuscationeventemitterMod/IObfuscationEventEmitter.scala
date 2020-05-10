package typingsSlinky.javascriptObfuscator.iobfuscationeventemitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObfuscationEventEmitter extends js.Object {
  /**
    * @param {ObfuscationEvent} event
    * @param args
    * @returns {boolean}
    */
  def emit(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
    args: js.Any*
  ): Boolean = js.native
  /**
    * @param event
    * @param listener
    * @returns this
    */
  def on(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
    listener: js.Function
  ): this.type = js.native
  /**
    * @param event
    * @param listener
    * @returns this
    */
  def once(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
    listener: js.Function
  ): this.type = js.native
}

object IObfuscationEventEmitter {
  @scala.inline
  def apply(
    emit: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, /* repeated */ js.Any) => Boolean,
    on: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => IObfuscationEventEmitter,
    once: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => IObfuscationEventEmitter
  ): IObfuscationEventEmitter = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[IObfuscationEventEmitter]
  }
  @scala.inline
  implicit class IObfuscationEventEmitterOps[Self <: IObfuscationEventEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, /* repeated */ js.Any) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOn(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => IObfuscationEventEmitter
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnce(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => IObfuscationEventEmitter
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

