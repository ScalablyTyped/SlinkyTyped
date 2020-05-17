package typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces

import typingsSlinky.inversifyRestifyUtils.anon.Path
import typingsSlinky.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
  - typingsSlinky.inversifyRestifyUtils.anon.Path
  - typingsSlinky.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg
*/
trait RouteOptions extends js.Object

object RouteOptions {
  @scala.inline
  implicit def apply(value: Path): RouteOptions = value.asInstanceOf[RouteOptions]
  @scala.inline
  implicit def apply(value: StrOrRegex): RouteOptions = value.asInstanceOf[RouteOptions]
  @scala.inline
  implicit def apply(value: optionsObjectpathStrOrReg): RouteOptions = value.asInstanceOf[RouteOptions]
}

