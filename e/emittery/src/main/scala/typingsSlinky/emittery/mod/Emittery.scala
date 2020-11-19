package typingsSlinky.emittery.mod

import typingsSlinky.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emittery extends js.Object {
  
  /**
  	Get an async iterator which buffers a tuple of an event name and data each time an event is emitted.
  	Call `return()` on the iterator to remove the subscription.
  	In the same way as for `events`, you can subscribe by using the `for await` statement.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery();
  	const iterator = emitter.anyEvent();
  	emitter.emit('🦄', '🌈1'); // Buffered
  	emitter.emit('🌟', '🌈2'); // Buffered
  	iterator.next()
  		.then(({value, done}) => {
  			// done is false
  			// value is ['🦄', '🌈1']
  			return iterator.next();
  		})
  		.then(({value, done}) => {
  			// done is false
  			// value is ['🌟', '🌈2']
  			// revoke subscription
  			return iterator.return();
  		})
  		.then(({done}) => {
  			// done is true
  		});
  	```
  	*/
  def anyEvent(): AsyncIterableIterator[_] = js.native
  
  /**
  	Bind the given `methodNames`, or all `Emittery` methods if `methodNames` is not defined, into the `target` object.
  	@example
  	```
  	import Emittery = require('emittery');
  	const object = {};
  	new Emittery().bindMethods(object);
  	object.emit('event');
  	```
  	*/
  def bindMethods(target: js.Object): Unit = js.native
  def bindMethods(target: js.Object, methodNames: js.Array[String]): Unit = js.native
  
  /**
  	Clear all event listeners on the instance.
  	If `eventName` is given, only the listeners for that event are cleared.
  	*/
  def clearListeners(): Unit = js.native
  def clearListeners(eventName: EventNames): Unit = js.native
  
  /**
  	Trigger an event asynchronously, optionally with some data. Listeners are called in the order they were added, but executed concurrently.
  	@returns A promise that resolves when all the event listeners are done. *Done* meaning executed if synchronous or resolved when an async/promise-returning function. You usually wouldn't want to wait for this, but you could for example catch possible errors. If any of the listeners throw/reject, the returned promise will be rejected with the error, but the other listeners will not be affected.
  	*/
  def emit(eventName: EventName): js.Promise[Unit] = js.native
  def emit(eventName: EventName, eventData: js.Any): js.Promise[Unit] = js.native
  
  /**
  	Same as `emit()`, but it waits for each listener to resolve before triggering the next one. This can be useful if your events depend on each other. Although ideally they should not. Prefer `emit()` whenever possible.
  	If any of the listeners throw/reject, the returned promise will be rejected with the error and the remaining listeners will *not* be called.
  	@returns A promise that resolves when all the event listeners are done.
  	*/
  def emitSerial(eventName: EventName): js.Promise[Unit] = js.native
  def emitSerial(eventName: EventName, eventData: js.Any): js.Promise[Unit] = js.native
  
  /**
  	Get an async iterator which buffers data each time an event is emitted.
  	Call `return()` on the iterator to remove the subscription.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery();
  	const iterator = emitter.events('🦄');
  	emitter.emit('🦄', '🌈1'); // Buffered
  	emitter.emit('🦄', '🌈2'); // Buffered
  	iterator
  		.next()
  		.then(({value, done}) => {
  			// done === false
  			// value === '🌈1'
  			return iterator.next();
  		})
  		.then(({value, done}) => {
  			// done === false
  			// value === '🌈2'
  			// Revoke subscription
  			return iterator.return();
  		})
  		.then(({done}) => {
  			// done === true
  		});
  	```
  	In practice you would usually consume the events using the [for await](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of) statement. In that case, to revoke the subscription simply break the loop.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery();
  	const iterator = emitter.events('🦄');
  	emitter.emit('🦄', '🌈1'); // Buffered
  	emitter.emit('🦄', '🌈2'); // Buffered
  	// In an async context.
  	for await (const data of iterator) {
  		if (data === '🌈2') {
  			break; // Revoke the subscription when we see the value `🌈2`.
  		}
  	}
  	```
  	It accepts multiple event names.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery();
  	const iterator = emitter.events(['🦄', '🦊']);
  	emitter.emit('🦄', '🌈1'); // Buffered
  	emitter.emit('🦊', '🌈2'); // Buffered
  	iterator
  		.next()
  		.then(({value, done}) => {
  			// done === false
  			// value === '🌈1'
  			return iterator.next();
  		})
  		.then(({value, done}) => {
  			// done === false
  			// value === '🌈2'
  			// Revoke subscription
  			return iterator.return();
  		})
  		.then(({done}) => {
  			// done === true
  		});
  	```
  	*/
  def events(eventName: EventNames): AsyncIterableIterator[_] = js.native
  
  /**
  	The number of listeners for the `eventName` or all events if not specified.
  	*/
  def listenerCount(): Double = js.native
  def listenerCount(eventName: EventNames): Double = js.native
  
  /**
  	Remove one or more event subscriptions.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery();
  	const listener = data => console.log(data);
  	(async () => {
  		emitter.on(['🦄', '🐶', '🦊'], listener);
  		await emitter.emit('🦄', 'a');
  		await emitter.emit('🐶', 'b');
  		await emitter.emit('🦊', 'c');
  		emitter.off('🦄', listener);
  		emitter.off(['🐶', '🦊'], listener);
  		await emitter.emit('🦄', 'a'); // nothing happens
  		await emitter.emit('🐶', 'b'); // nothing happens
  		await emitter.emit('🦊', 'c'); // nothing happens
  	})();
  	```
  	*/
  def off(eventName: EventNames, listener: js.Function1[/* eventData */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  /**
  	Remove an `onAny` subscription.
  	*/
  def offAny(listener: js.Function2[/* eventName */ EventName, /* eventData */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  /**
  	Subscribe to one or more events.
  	Using the same listener multiple times for the same event will result in only one method call per emitted event.
  	@returns An unsubscribe method.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery();
  	emitter.on('🦄', data => {
  		console.log(data);
  	});
  	emitter.on(['🦄', '🐶'], data => {
  		console.log(data);
  	});
  	emitter.emit('🦄', '🌈'); // log => '🌈' x2
  	emitter.emit('🐶', '🍖'); // log => '🍖'
  	```
  	*/
  def on(
    eventName: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Emittery.listenerAdded */ js.Any,
    listener: js.Function1[/* eventData */ ListenerChangedData, Unit]
  ): UnsubscribeFn = js.native
  def on(eventName: EventNames, listener: js.Function1[/* eventData */ js.UndefOr[js.Any], Unit]): UnsubscribeFn = js.native
  
  /**
  	Subscribe to be notified about any event.
  	@returns A method to unsubscribe.
  	*/
  def onAny(listener: js.Function2[/* eventName */ EventName, /* eventData */ js.UndefOr[js.Any], _]): UnsubscribeFn = js.native
  
  /**
  	Subscribe to one or more events only once. It will be unsubscribed after the first
  	event.
  	@returns The event data when `eventName` is emitted.
  	@example
  	```
  	import Emittery = require('emittery');
  	const emitter = new Emittery();
  	emitter.once('🦄').then(data => {
  		console.log(data);
  		//=> '🌈'
  	});
  	emitter.once(['🦄', '🐶']).then(data => {
  		console.log(data);
  	});
  	emitter.emit('🦄', '🌈'); // Logs `🌈` twice
  	emitter.emit('🐶', '🍖'); // Nothing happens
  	```
  	*/
  def once(
    eventName: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Emittery.listenerAdded */ js.Any
  ): js.Promise[ListenerChangedData] = js.native
  def once(eventName: EventNames): js.Promise[_] = js.native
}
