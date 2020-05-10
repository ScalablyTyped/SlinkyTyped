package typingsSlinky.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleOptions[EmittedType /* <: js.Array[_] */] extends Options[EmittedType] {
  /**
  		The number of times the event needs to be emitted before the promise resolves.
  		*/
  val count: Double = js.native
  /**
  		Whether to resolve the promise immediately. Emitting one of the `rejectionEvents` won't throw an error.
  		__Note__: The returned array will be mutated when an event is emitted.
  		@example
  		```
  		import pEvent = require('p-event');
  		const emitter = new EventEmitter();
  		const promise = pEvent.multiple(emitter, 'hello', {
  			resolveImmediately: true,
  			count: Infinity
  		});
  		const result = await promise;
  		console.log(result);
  		//=> []
  		emitter.emit('hello', 'Jack');
  		console.log(result);
  		//=> ['Jack']
  		emitter.emit('hello', 'Mark');
  		console.log(result);
  		//=> ['Jack', 'Mark']
  		// Stops listening
  		emitter.emit('error', new Error('😿'));
  		emitter.emit('hello', 'John');
  		console.log(result);
  		//=> ['Jack', 'Mark']
  		```
  		*/
  val resolveImmediately: js.UndefOr[Boolean] = js.native
}

object MultipleOptions {
  @scala.inline
  def apply[EmittedType](count: Double): MultipleOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOptions[EmittedType]]
  }
  @scala.inline
  implicit class MultipleOptionsOps[Self[emittedtype] <: MultipleOptions[emittedtype], EmittedType] (val x: Self[EmittedType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EmittedType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EmittedType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EmittedType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EmittedType] with Other]
    @scala.inline
    def withCount(value: Double): Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveImmediately(value: Boolean): Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveImmediately: Self[EmittedType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveImmediately")(js.undefined)
        ret
    }
  }
  
}

