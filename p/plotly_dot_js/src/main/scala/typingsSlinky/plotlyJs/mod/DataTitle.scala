package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.PartialFont
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom right`
import typingsSlinky.plotlyJs.plotlyJsStrings.`middle center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top center`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top left`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top right`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTitle extends js.Object {
  var font: PartialFont
  var position: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  var text: String
}

object DataTitle {
  @scala.inline
  def apply(
    font: PartialFont,
    position: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`),
    text: String
  ): DataTitle = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataTitle]
  }
}

