package typingsSlinky.ky.mod

import org.scalajs.dom.experimental.Response
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import typingsSlinky.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePromise extends Promise[Response] {
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def formData(): js.Promise[FormData] = js.native
  // TODO: Use `json<T extends JSONValue>(): Promise<T>;` when it's fixed in TS.
  // See https://github.com/microsoft/TypeScript/issues/15300 and https://github.com/sindresorhus/ky/pull/80
  /**
  	Get the response body as JSON.
  	@example
  	```
  	import ky from 'ky';
  	const parsed = await ky(…).json();
  	```
  	@example
  	```
  	import ky from 'ky';
  	interface Result {
  		value: number;
  	}
  	const result = await ky(…).json<Result>();
  	```
  	*/
  def json[T](): js.Promise[T] = js.native
  def text(): js.Promise[String] = js.native
}

