package typingsSlinky.dropboxChooser.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dropboxChooser.dropboxChooserStrings.fit
  - typingsSlinky.dropboxChooser.dropboxChooserStrings.crop
  - typingsSlinky.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow
*/
trait ChooserFileMode extends js.Object

object ChooserFileMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crop: typingsSlinky.dropboxChooser.dropboxChooserStrings.crop = this.cast("crop")
  @scala.inline
  def fit: typingsSlinky.dropboxChooser.dropboxChooserStrings.fit = this.cast("fit")
  @scala.inline
  def fit_one_and_overflow: typingsSlinky.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow = this.cast("fit_one_and_overflow")
}

