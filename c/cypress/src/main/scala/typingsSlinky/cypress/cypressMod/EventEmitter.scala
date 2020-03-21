package typingsSlinky.cypress.cypressMod

import typingsSlinky.cypress.cyBluebirdMod.BluebirdStatic
import typingsSlinky.cypress.cypressMod.Cypress.cy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter
  extends typingsSlinky.eventemitter2.mod.EventEmitter2 {
  def emitMap(eventName: String, args: js.Array[_]): js.Array[js.Function1[/* repeated */ _, _]] = js.native
  def emitThen(eventName: String, args: js.Array[_]): BluebirdStatic = js.native
  def proxyTo(cy: cy): Null = js.native
}

