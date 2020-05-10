package typingsSlinky.fluxxor.mod

import typingsSlinky.fluxxor.TypeofReact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluxChildMixin extends js.Object {
  def getFlux(): Flux = js.native
}

@JSImport("fluxxor", "FluxChildMixin")
@js.native
object FluxChildMixin extends js.Object {
  def apply(react: TypeofReact): FluxChildMixin = js.native
}

