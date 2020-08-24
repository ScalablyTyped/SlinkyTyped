package typingsSlinky.reactMathjax.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactMathjax.anon.Children
import typingsSlinky.reactMathjax.anon.Formula
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mathjax", "MathJax")
@js.native
object MathJax extends js.Object {
  type Node = ReactComponentClass[Formula]
  type Provider = ReactComponentClass[Children]
}

