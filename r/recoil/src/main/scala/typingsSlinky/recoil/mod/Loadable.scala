package typingsSlinky.recoil.mod

import typingsSlinky.recoil.recoilStrings.hasError
import typingsSlinky.recoil.recoilStrings.hasValue
import typingsSlinky.recoil.recoilStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.recoil.anon.Contents[T]
  - typingsSlinky.recoil.anon.ReadonlystatehasErrorcont
  - typingsSlinky.recoil.anon.State[T]
*/
trait Loadable[T] extends js.Object

object Loadable {
  @scala.inline
  def Contents[T](contents: T, state: hasValue): Loadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loadable[T]]
  }
  @scala.inline
  def ReadonlystatehasErrorcont[T](contents: js.Error, state: hasError): Loadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loadable[T]]
  }
  @scala.inline
  def State[T](contents: LoadablePromise[T], state: loading): Loadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loadable[T]]
  }
}

