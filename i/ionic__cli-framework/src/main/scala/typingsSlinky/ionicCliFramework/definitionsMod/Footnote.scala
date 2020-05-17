package typingsSlinky.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCliFramework.definitionsMod.TextFootnote
  - typingsSlinky.ionicCliFramework.definitionsMod.LinkFootnote
*/
trait Footnote extends js.Object

object Footnote {
  @scala.inline
  implicit def apply(value: LinkFootnote): Footnote = value.asInstanceOf[Footnote]
  @scala.inline
  implicit def apply(value: TextFootnote): Footnote = value.asInstanceOf[Footnote]
}

