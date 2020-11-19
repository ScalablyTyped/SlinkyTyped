package typingsSlinky.nock.mod

import typingsSlinky.nock.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Back_ extends js.Object {
  
  def apply(fixtureName: String): js.Promise[Context] = js.native
  def apply(fixtureName: String, nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]): Unit = js.native
  def apply(fixtureName: String, options: BackOptions): js.Promise[Context] = js.native
  def apply(
    fixtureName: String,
    options: BackOptions,
    nockedFn: js.Function1[/* nockDone */ js.Function0[Unit], Unit]
  ): Unit = js.native
  
  var currentMode: BackMode = js.native
  
  var fixtures: String = js.native
  
  def setMode(mode: BackMode): Unit = js.native
}
