package typingsSlinky.jimpPng.mod

import typingsSlinky.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNGClass extends js.Object {
  
  var _colorType: Double = js.native
  
  var _deflateLevel: Double = js.native
  
  var _deflateStrategy: Double = js.native
  
  var _filterType: Double = js.native
  
  def colorType(s: Double): this.type = js.native
  def colorType(s: Double, cb: ImageCallback[this.type]): this.type = js.native
  
  def deflateLevel(l: Double): this.type = js.native
  def deflateLevel(l: Double, cb: ImageCallback[this.type]): this.type = js.native
  
  def deflateStrategy(s: Double): this.type = js.native
  def deflateStrategy(s: Double, cb: ImageCallback[this.type]): this.type = js.native
  
  def filterType(f: Double): this.type = js.native
  def filterType(f: Double, cb: ImageCallback[this.type]): this.type = js.native
}
