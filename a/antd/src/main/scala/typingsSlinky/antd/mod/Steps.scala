package typingsSlinky.antd.mod

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.antd.libStepsMod.StepProps
import typingsSlinky.antd.libStepsMod.StepsType
import typingsSlinky.react.mod.ClassicComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Steps extends Shortcut {
  
  @JSImport("antd", "Steps")
  @js.native
  val ^ : StepsType = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "Steps.Step")
  @js.native
  class Step protected ()
    extends ClassicComponent[StepProps, js.Object] {
    def this(props: StepProps) = this()
    def this(props: StepProps, context: js.Any) = this()
  }
  
  type _To = StepsType
  
  /* This means you don't have to write `^`, but can instead just say `Steps.foo` */
  override def _to: StepsType = ^
}
