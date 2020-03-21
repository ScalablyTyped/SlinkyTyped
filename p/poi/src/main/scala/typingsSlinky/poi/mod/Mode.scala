package typingsSlinky.poi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.poi.poiStrings.production
  - typingsSlinky.poi.poiStrings.development
  - typingsSlinky.poi.poiStrings.test
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typingsSlinky.poi.poiStrings.development = this.cast("development")
  @scala.inline
  def production: typingsSlinky.poi.poiStrings.production = this.cast("production")
  @scala.inline
  def test: typingsSlinky.poi.poiStrings.test = this.cast("test")
}

