package typingsSlinky.chaiEnzyme.mod

import slinky.core.ReactComponentClass
import typingsSlinky.cheerio.Cheerio
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.enzyme.mod.ShallowWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.enzyme.mod.ShallowWrapper[js.Any, js.Any, typingsSlinky.react.mod.Component[js.Object, js.Object, js.Any]]
  - typingsSlinky.cheerio.Cheerio
  - typingsSlinky.enzyme.mod.ReactWrapper[js.Any, js.Any, typingsSlinky.react.mod.Component[js.Object, js.Object, js.Any]]
*/
trait DebugWrapper extends js.Object

object DebugWrapper {
  @scala.inline
  implicit def apply(value: Cheerio): DebugWrapper = value.asInstanceOf[DebugWrapper]
  @scala.inline
  implicit def apply(value: ReactWrapper[js.Any, js.Any, ReactComponentClass[js.Object]]): DebugWrapper = value.asInstanceOf[DebugWrapper]
  @scala.inline
  implicit def apply(value: ShallowWrapper[js.Any, js.Any, ReactComponentClass[js.Object]]): DebugWrapper = value.asInstanceOf[DebugWrapper]
}

