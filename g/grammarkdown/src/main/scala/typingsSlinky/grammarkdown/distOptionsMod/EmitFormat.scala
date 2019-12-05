package typingsSlinky.grammarkdown.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmitFormat extends js.Object

@JSImport("grammarkdown/dist/options", "EmitFormat")
@js.native
object EmitFormat extends js.Object {
  @js.native
  sealed trait ecmarkup extends EmitFormat
  
  @js.native
  sealed trait html extends EmitFormat
  
  @js.native
  sealed trait markdown extends EmitFormat
  
  /* 2 */ val ecmarkup: typingsSlinky.grammarkdown.distOptionsMod.EmitFormat.ecmarkup with Double = js.native
  /* 1 */ val html: typingsSlinky.grammarkdown.distOptionsMod.EmitFormat.html with Double = js.native
  /* 0 */ val markdown: typingsSlinky.grammarkdown.distOptionsMod.EmitFormat.markdown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitFormat with Double] = js.native
}

