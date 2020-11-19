package typingsSlinky.recompose

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#setproptypes
@JSImport("recompose/setPropTypes", JSImport.Namespace)
@js.native
object setPropTypesMod extends js.Object {
  
  def default[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ReactComponentClass[P], ReactComponentClass[P]] = js.native
}
