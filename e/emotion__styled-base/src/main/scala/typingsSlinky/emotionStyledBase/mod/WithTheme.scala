package typingsSlinky.emotionStyledBase.mod

import typingsSlinky.emotionStyledBase.anon.ThemeExclude
import typingsSlinky.emotionStyledBase.anon.ThemeT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - P with typingsSlinky.emotionStyledBase.anon.ThemeT[T]
  - P with typingsSlinky.emotionStyledBase.anon.ThemeExclude
*/
trait WithTheme[P, T] extends js.Object

object WithTheme {
  @scala.inline
  implicit def apply[P, T](value: P with ThemeT[T] with ThemeExclude): WithTheme[P, T] = value.asInstanceOf[WithTheme[P, T]]
}

