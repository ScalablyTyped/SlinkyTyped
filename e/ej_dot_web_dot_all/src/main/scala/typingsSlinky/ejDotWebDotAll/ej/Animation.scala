package typingsSlinky.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.Animation")
@js.native
object Animation extends js.Object {
  @js.native
  sealed trait Fade extends Animation
  
  @js.native
  sealed trait None extends Animation
  
  @js.native
  sealed trait Slide extends Animation
  
  /* 0 */ val Fade: typingsSlinky.ejDotWebDotAll.ej.Animation.Fade with Double = js.native
  /* 1 */ val None: typingsSlinky.ejDotWebDotAll.ej.Animation.None with Double = js.native
  /* 2 */ val Slide: typingsSlinky.ejDotWebDotAll.ej.Animation.Slide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Animation with Double] = js.native
}

