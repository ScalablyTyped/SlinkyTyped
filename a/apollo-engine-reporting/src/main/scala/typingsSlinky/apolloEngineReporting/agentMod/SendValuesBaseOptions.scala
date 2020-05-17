package typingsSlinky.apolloEngineReporting.agentMod

import typingsSlinky.apolloEngineReporting.anon.All
import typingsSlinky.apolloEngineReporting.anon.ExceptNames
import typingsSlinky.apolloEngineReporting.anon.None
import typingsSlinky.apolloEngineReporting.anon.OnlyNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloEngineReporting.anon.OnlyNames
  - typingsSlinky.apolloEngineReporting.anon.ExceptNames
  - typingsSlinky.apolloEngineReporting.anon.All
  - typingsSlinky.apolloEngineReporting.anon.None
*/
trait SendValuesBaseOptions extends VariableValueOptions

object SendValuesBaseOptions {
  @scala.inline
  implicit def apply(value: All): SendValuesBaseOptions = value.asInstanceOf[SendValuesBaseOptions]
  @scala.inline
  implicit def apply(value: ExceptNames): SendValuesBaseOptions = value.asInstanceOf[SendValuesBaseOptions]
  @scala.inline
  implicit def apply(value: None): SendValuesBaseOptions = value.asInstanceOf[SendValuesBaseOptions]
  @scala.inline
  implicit def apply(value: OnlyNames): SendValuesBaseOptions = value.asInstanceOf[SendValuesBaseOptions]
}

