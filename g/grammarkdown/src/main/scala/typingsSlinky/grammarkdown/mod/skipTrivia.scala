package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.nodesMod.CommentTrivia
import typingsSlinky.grammarkdown.nodesMod.HtmlTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "skipTrivia")
@js.native
object skipTrivia extends js.Object {
  def apply(text: String, pos: Double, end: Double): Double = js.native
  def apply(
    text: String,
    pos: Double,
    end: Double,
    htmlTrivia: js.UndefOr[scala.Nothing],
    commentTrivia: js.Array[CommentTrivia]
  ): Double = js.native
  def apply(text: String, pos: Double, end: Double, htmlTrivia: js.Array[HtmlTrivia]): Double = js.native
  def apply(
    text: String,
    pos: Double,
    end: Double,
    htmlTrivia: js.Array[HtmlTrivia],
    commentTrivia: js.Array[CommentTrivia]
  ): Double = js.native
}

