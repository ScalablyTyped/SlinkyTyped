package typingsSlinky.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[EmittedType /* <: js.Array[_] */] extends js.Object {
  /**
  		Filter function for accepting an event.
  		@example
  		```
  		import pEvent = require('p-event');
  		import emitter from './some-event-emitter';
  		(async () => {
  			const result = await pEvent(emitter, '🦄', value => value > 3);
  			// Do something with first 🦄 event with a value greater than 3
  		})();
  		```
  		*/
  val filter: js.UndefOr[FilterFunction[EmittedType]] = js.native
  /**
  		By default, the promisified function will only return the first argument from the event callback, which works fine for most APIs. This option can be useful for APIs that return multiple arguments in the callback. Turning this on will make it return an array of all arguments from the callback, instead of just the first argument. This also applies to rejections.
  		@default false
  		@example
  		```
  		import pEvent = require('p-event');
  		import emitter from './some-event-emitter';
  		(async () => {
  			const [foo, bar] = await pEvent(emitter, 'finish', {multiArgs: true});
  		})();
  		```
  		*/
  val multiArgs: js.UndefOr[Boolean] = js.native
  /**
  		Events that will reject the promise.
  		@default ['error']
  		*/
  val rejectionEvents: js.UndefOr[js.Array[String | js.Symbol]] = js.native
  /**
  		Time in milliseconds before timing out.
  		@default Infinity
  		*/
  val timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply[EmittedType](): Options[EmittedType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[EmittedType]]
  }
  @scala.inline
  implicit class OptionsOps[Self[emittedtype] <: Options[emittedtype], EmittedType] (val x: Self[EmittedType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EmittedType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EmittedType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EmittedType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EmittedType] with Other]
    @scala.inline
    def withFilter(value: EmittedType => Boolean): Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiArgs(value: Boolean): Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiArgs: Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectionEvents(value: js.Array[String | js.Symbol]): Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectionEvents: Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectionEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

